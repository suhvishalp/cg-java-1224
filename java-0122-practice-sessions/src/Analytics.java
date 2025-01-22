import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Analytics {

	private IAnalyticsStore store;
	private int k;
	private Queue<ActionEnum> actionQueue;
	private int totalNumberOfActionsLogged;
	private Map<ActionEnum, Integer> map;
	
	public Analytics (IAnalyticsStore analyticsStore, int k) {
		this.store = analyticsStore;
		this.k = k;
		this.actionQueue = new LinkedList<>();
		this.map = new HashMap<>();
	}
	
	public void registerAction (ActionEnum action) {
		this.actionQueue.offer(action);
		totalNumberOfActionsLogged++;
		
		this.map.put(action, map.getOrDefault(action, 0)+1);
		
		if(actionQueue.size() == this.k) {
			store.storeActions(actionQueue);
			actionQueue.clear();
		}
		
	}
	
	public int getTotalNumberOfLoggedActions(){
		return totalNumberOfActionsLogged;
	}
	
	public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
		return actionQueue.size();
	}
	
	public List<ActionEnum> getMostFrequentlyUsedActions(){
		
		List<ActionEnum> sortedActions = new ArrayList<>();
		
		Set<Map.Entry<ActionEnum, Integer>> entryset =  map.entrySet();
		
		for(Map.Entry<ActionEnum, Integer> entry: entryset) {
			if(entry.getValue()>1) {
				sortedActions.add(entry.getKey());
			}
		}
		
		sortedActions.sort((e1, e2) -> e1.name().compareTo(e2.name()));
		return sortedActions;
	}
}
