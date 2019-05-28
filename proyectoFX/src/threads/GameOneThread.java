package threads;

import application.WindowController;
import model.DigitalPlataform;
import model.VideoGame;

public class GameOneThread extends Thread {

	private WindowController wc;
	
	public GameOneThread(WindowController wc) {
		this.wc = wc;
	}
	public void run() {
		while(true) {
			wc.motionGame1();
			try {
				Thread.sleep(25);
			} catch (InterruptedException exc) {
				// TODO Auto-generated catch block
				exc.printStackTrace();
			}
		}
	}
}
