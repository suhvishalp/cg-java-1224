
public enum TrafficLight {

	RED("Stop"),
	YELLOW("Slow Down"),
	GREEN("Go");
	
	private final String action;
	
	TrafficLight(String action){
		this.action = action;
	}
	
	public String getAction() {
		return action;
	}
}
