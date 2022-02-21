package resources;

public enum PlaceApi {
	addplace("/maps/api/place/add/json"),
	deleteplace("/maps/api/place/delete/json"),
	getplace("/maps/api/place/get/json");
	
	private String uri;
	
	PlaceApi(String uri){
		this.uri=uri;
	}
	
	public String getApi() {
		return this.uri;
	}
	
}
