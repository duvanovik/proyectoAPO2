package model;


public class Movie extends Film{
	private int timeViewed;
	public Movie(int id, String title, String creator, String genre, int duration, int year, boolean viewed,
			int timeViewed) {
		super(id, title, creator, genre, duration, year, viewed);
		this.timeViewed = timeViewed;
	}
	public int getTimeViewed() {
		return timeViewed;
	}
	
	
}
