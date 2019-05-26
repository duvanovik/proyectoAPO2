package model;

public class VideoGame extends Game{
	private int score;
	private int x;
	private int y;
	public VideoGame(String title, String genre, int year, boolean played, int score, int x, int y) {
		super(title, genre, year, played);
		this.score = score;
		this.x = x;
		this.y = y;
	}
	public int getScore() {
		return score;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
}
