package spaceShip;

public class EnergyCapsule {
	final static int maxVolume = 50;
	private int currentVolume;
	
	void setCurrentVolume(int volume) {
		currentVolume = volume;
	}
	
	int getCurrentVolume() {
		return currentVolume;
	}
}
