package constructor.injection;

public class City {

	private String cityName;
	private int cityCode;
	
	City (String cityName, int cityCode) {
		this.cityName = cityName;
		this.cityCode=cityCode;
	}
	
	
	
	
	@Override
	public String toString() {
	
		return cityName + " " +cityCode;
	}
	
}
