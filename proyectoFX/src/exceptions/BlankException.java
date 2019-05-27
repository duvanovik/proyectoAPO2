package exceptions;

public class BlankException extends Exception{
	public BlankException() {
		super("You shoudn't put blank spaces");
	}
}
