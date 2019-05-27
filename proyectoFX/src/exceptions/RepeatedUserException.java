package exceptions;

public class RepeatedUserException extends Exception{
	public RepeatedUserException(String name){
		super("User repeated. Error");
	}
}
