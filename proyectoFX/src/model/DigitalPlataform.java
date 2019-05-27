
package model;

import java.util.ArrayList;
import java.util.Collection;

import exceptions.BlankException;
import exceptions.RepeatedBookException;
import exceptions.RepeatedMagazineException;
import exceptions.RepeatedUserException;

public class DigitalPlataform {
	private String name;
	
	private VideoGame firstVideoGame;
	private VideoGame lastVideoGame;
	
	private ArrayList<User> users;
	
	private Book rootBook;
	
	private Magazine rootMagazine;
	
	private VRGame first;
	
	public DigitalPlataform(String name) {

		this.name = name;

		firstVideoGame = lastVideoGame = null;
		
		users = new ArrayList<User>();
		
		rootBook = null;
		
		rootMagazine = null;
		
		first = null;
		
		addVideogame("Gta Circulito", "Lucha", 2007, false, 123);
		addVideogame("Reboticos", "Aventura", 2010, false, 456);
		addVideogame("Pacman", "Estrategia", 2015, false, 789);

	}
	public void addVideogame(String title, String genre, int year, boolean played, int id) {
		if(firstVideoGame == null) {
			firstVideoGame = new VideoGame(title, genre, year, played, id);
			lastVideoGame = firstVideoGame;
		}
		else {
			VideoGame vd = new VideoGame(title, genre, year, played, id);
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
	
	public void addBook(String title, String editorial, String author, String publicationDate, String isbn, boolean readed) throws RepeatedBookException {
		Book b = new Book(title, editorial, author, publicationDate, isbn, readed);
		if(rootBook == null)
			rootBook = b;
		else
			rootBook.add(b);
	}
    public Book searchBook( String title )
    {
    	return rootBook == null ? null : rootBook.search( title );
    }
    public Collection getListBooks( )
    {
        if( rootBook == null )
            return null;
        else
        {
            Collection resp = new ArrayList( );
            rootBook.inorden( resp );
            return resp;
        }
    }
	public void addMagazine(String title, String editorial, String author, String publicationDate, int id) throws RepeatedMagazineException {
		Magazine mg = new Magazine(title, editorial, author, publicationDate, id);
		if(rootMagazine == null)
			rootMagazine = mg;
		else
			rootMagazine.add(mg);
	}
    public Magazine searchMagazine( String title )
    {
    	return rootMagazine == null ? null : rootMagazine.search( title );
    }
    
    public Collection getListMagazine( )
    {
        if( rootMagazine == null )
            return null;
        else
        {
            Collection resp = new ArrayList( );
            rootMagazine.inorden( resp );
            return resp;
        }
    }
    public VRGame locateLast() {
    	VRGame act = first;
    	if(act != null) {
    		while(act.getNext() != null) {
    			act = act.getNext();
    		}
    	}
    	return act;
    }
    public void addAtTheEnd(VRGame vr) {
    	if(first == null)
    		first = vr;
    	else {
    		VRGame v = locateLast();
    		v.insertAfter(vr);
    	}
    }
}
