
package model;

public class DigitalPlataform {
	private String name;
	private VideoGame firstVideoGame;
	private VideoGame lastVideoGame;
	public DigitalPlataform(String name) {

		this.name = name;

		firstVideoGame = lastVideoGame = null;
		
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
}
