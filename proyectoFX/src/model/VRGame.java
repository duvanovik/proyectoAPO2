package model;

public class VRGame extends Game{
	private int id;

	public VRGame(String title, String genre, int year, boolean played, int id) {
		super(title, genre, year, played);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
}
