package model;


public class Chapter extends Movie{
	private int sessionNumber;

	public Chapter(int id, String title, String creator, String genre, int duration, int year, boolean viewed,
			int timeViewed, int sessionNumber) {
		super(id, title, creator, genre, duration, year, viewed, timeViewed);
		this.sessionNumber = sessionNumber;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}
	
}
