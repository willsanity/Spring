package constructor.injection;

public class State {

	City city;
	String stateName;
	
	
	
	public State(City city, String stateName){
		this.city=city;
		this.stateName=stateName;
	
	}
	
	
	
	
	@Override
	public String toString() {
		
		return stateName+ " "+city ;
	}
	
}
