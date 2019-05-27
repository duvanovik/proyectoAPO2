package model;

public class VideoGame extends Game{
	private VideoGame previous;
	private VideoGame next;
	private int x;
	private int y;
	public VideoGame(int id, String title, String genre, int year, boolean played, int x, int y) {
		super(id, title, genre, year, played);
		this.x = x;
		this.y = y;
	}
	public void setX(int dx) {
		this.x = dx;
	}
	public void setY(int dy) {
		this.y = dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void mover() {
		setX(getX() + 5);
	}
	
	public void setPrevious(VideoGame previous) {

		this.previous = previous;

	}
	public void setNext(VideoGame next) {

		this.next = next;

	}
	public VideoGame getPrevious() {

		return previous;

	}
	public VideoGame getNext() {

		return next;

	}
	
	
}
