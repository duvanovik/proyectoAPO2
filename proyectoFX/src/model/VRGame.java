package model;

public class VRGame extends Game{
	private int id;

	public VRGame(int id, String title, String genre, int year, boolean played) {
		super(id, title, genre, year, played);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
}
