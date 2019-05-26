package model;


public class Film {
	private int id;
	private String title;
	private String creator;
	private String genre;
	private int duration;
	private int year;
	private boolean viewed;
	public Film(int id, String title, String creator, String genre, int duration, int year, boolean viewed) {
		super();
		this.id = id;
		this.title = title;
		this.creator = creator;
		this.genre = genre;
		this.duration = duration;
		this.year = year;
		this.viewed = viewed;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCreator() {
		return creator;
	}
	public String getGenre() {
		return genre;
	}
	public int getDuration() {
		return duration;
	}
	public int getYear() {
		return year;
	}
	public boolean isViewed() {
		return viewed;
	}
	
	

}
