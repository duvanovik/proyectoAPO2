package model;

public class Game {
	private String title;
	private String genre;
	private int year;
	private boolean played;
	public Game(String title, String genre, int year, boolean played) {
		super();
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.played = played;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public int getYear() {
		return year;
	}
	public boolean isPlayed() {
		return played;
	}
	
	
}
