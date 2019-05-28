package model;

public class Song {
	private String artist;
	private String album;
	private String genre;
	private int year;
	private boolean listened;
	public Song(String artist, String album, String genre, int year, boolean listened) {
		super();
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.year = year;
		this.listened = listened;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getGenre() {
		return genre;
	}
	public int getYear() {
		return year;
	}
	public boolean isListened() {
		return listened;
	}
	
}
