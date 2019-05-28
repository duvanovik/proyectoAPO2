package threads;


import application.WindowController;

public class GameTwoThread extends Thread {

	private WindowController wc;
	
	public GameTwoThread(WindowController wc) {
		this.wc = wc;
	}
	public void run() {
		while(true) {
			wc.motionGame2();
			try {
				Thread.sleep(25);
			} catch (InterruptedException exc) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}