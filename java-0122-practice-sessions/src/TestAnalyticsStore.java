import java.util.List;
import java.util.Queue;

public class TestAnalyticsStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IAnalyticsStore store =  new IAnalyticsStore() {
			
			@Override
			public void storeActions(Queue<ActionEnum> q) {
				// TODO Auto-generated method stub
				System.out.println(q);
			}
		};
		
		Analytics analytics = new Analytics(store, 3);
		
		analytics.registerAction(ActionEnum.FEATURE1BUTTON);
		analytics.registerAction(ActionEnum.FEATURE1BUTTON);
		System.out.println(analytics.getTotalNumberOfLoggedActions());
		analytics.registerAction(ActionEnum.FEATURE2BUTTON);
		analytics.registerAction(ActionEnum.FEATURE3BUTTON);

		System.out.println(analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore());
	
		analytics.registerAction(ActionEnum.FEATURE2BUTTON);

		List<ActionEnum> list = analytics.getMostFrequentlyUsedActions();
		System.out.println("most frequent :" + list);
	}

}
