package model;

public class VideoGame extends Game{
	private VideoGame previous;
	private VideoGame next;
	private int id;
	public VideoGame(String title, String genre, int year, boolean played, int id) {
		super(title, genre, year, played);
		this.id = id;
		previous = null;
		next = null;
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
	public int getId() {
		return id;
	}
	
	
}
