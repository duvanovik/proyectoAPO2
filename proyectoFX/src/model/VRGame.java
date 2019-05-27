package model;

public class VRGame extends Game{
	private String technology;
	private VRGame next;
	public VRGame(String title, String genre, int year, boolean played, String technology) {
		super(title, genre, year, played);
		this.technology = technology;
		next = null;
	}

	public String getTechnology() {
		return technology;
	}

	public VRGame getNext() {
		return next;
	}

	public void setNext(VRGame next) {
		this.next = next;
	}
	public void insertAfter(VRGame vr) {
		vr.next = next;
		next = vr;
	}
	
}
