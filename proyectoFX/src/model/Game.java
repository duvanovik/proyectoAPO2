package model;

public class Game {
	private int id;
	private String title;
	private String genre;
	private int year;
	private boolean played;
	public Game(int id, String title, String genre, int year, boolean played) {
		super();
		this.id = id;
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
	public int getId() {
		return id;
	}
	
	
}
