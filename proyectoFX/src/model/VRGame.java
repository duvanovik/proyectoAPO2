package model;

public class VRGame extends Game{
	private String technology;
	
	public VRGame(String title, String genre, int year, boolean played, String technology) {
		super(title, genre, year, played);
		this.technology = technology;
	}

	public String getTechnology() {
		return technology;
	}
	
}
