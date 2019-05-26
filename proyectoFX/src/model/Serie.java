package model;


public class Serie extends Film{
	private int sessionQuantity;

	public Serie(int id, String title, String creator, String genre, int duration, int year, boolean viewed,
			int sessionQuantity) {
		super(id, title, creator, genre, duration, year, viewed);
		this.sessionQuantity = sessionQuantity;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}
	
	
}
