package exceptions;

public class RepeatedBookException extends Exception{
	public RepeatedBookException(String title) {
		super("Book repeated with title: " + title);
	}
}
