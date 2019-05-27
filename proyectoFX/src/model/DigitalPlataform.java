
package model;

import java.util.ArrayList;

import exceptions.BlankException;
import exceptions.RepeatedUserException;

public class DigitalPlataform {
	private String name;
	
	private VideoGame firstVideoGame;
	private VideoGame lastVideoGame;
	
	private ArrayList<User> users; 
	
	public DigitalPlataform(String name) {

		this.name = name;

		firstVideoGame = lastVideoGame = null;
		
		users = new ArrayList<User>();
		
		addVideogame(123, "Gta Circulito", "Lucha", 2007, false, 182,  158);
		addVideogame(125, "Reboticos", "Aventura", 2010, false, 182, 401);
		addVideogame(146, "Pacman", "Estrategia", 2015, false, 182, 654);

	}
	public void addVideogame(int id, String title, String genre, int year, boolean played, int x, int y) {
		if(firstVideoGame == null) {
			firstVideoGame = new VideoGame(id, title, genre, year, played, x, y);
			lastVideoGame = firstVideoGame;
		}
		else {
			VideoGame vd = new VideoGame(id, title, genre, year, played, x, y);
			vd.setPrevious(lastVideoGame);
			lastVideoGame.setNext(vd);
			lastVideoGame = vd;
		}
	}
	public String getName() {
		return name;
	}
	public VideoGame getFirstVideoGame() {
		return firstVideoGame;
	}
	public VideoGame getLastVideoGame() {
		return lastVideoGame;
	}
	public boolean alreadyExits(String nickname) {
		boolean exits = false;
		int start = 0;
		int end = users.size() - 1;
		while(start <= end && !exits) {
			int half = (start + end)/2;
			if(users.get(half).getNickname().equalsIgnoreCase(nickname))
				exits = true;
			else if(users.get(half).getNickname().compareToIgnoreCase(nickname) < 0)
				start = half + 1;
			else
				end = half + 1;
		}
		return exits;
	}
	public void addUser(String nickname, String password, String email) throws RepeatedUserException, BlankException {
		User other = new User(nickname, password, email);
		if(nickname.equals("") || password.equals("") || email.equals(""))
			throw new BlankException();
		if (alreadyExits(other.getNickname())) {

			throw new RepeatedUserException(other.getNickname());
		
		} else {

			users.add(other);
			orderUsers();

		}

	}
	public void orderUsers() {

		for (int i = 1; i < users.size() - 1; i++) {
        for (int j = 1; j>0  &&  users.get(j-1).compareTo(users.get(j))>0 ; j--) {
			User temp  = users.get(j);
            users.set(j, users.get(j-1));
            users.set(j-1, temp);
				}
		}

	}
	public boolean joinUser(String nickname, String password) throws BlankException{
		boolean login = false;
		if(nickname.equals("") && password.equals(""))
			throw new BlankException();
		for (int i = 0; i < users.size() && !login ; i++) {
			if(users.get(i).getNickname().equals(nickname) && users.get(i).getPassword().equals(password))
				login = true;
		}
		return login;
	}


}
