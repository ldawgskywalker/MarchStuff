
public class Airport {
	private String code;
	//CONSTRUCTOR
	public Airport(String c){
		//checks if correct length
		if(c.length()==3)
			code = c;
	}
	//GETTERS AND SETTERS
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	//END OF GETTERS AND SETTERS
	
	
}
