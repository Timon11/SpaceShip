package spaceShip;

public class EnergyGrid{
	private static int currentEnergy = 10;
	private final static int maxEnergy = 20;
	private final static int minEnergy = 0;
	
		public static int getCurrentEnergy() {
		return currentEnergy;
	}
	
	public static void getCharged(int amount) {
		currentEnergy += amount;
		if(currentEnergy > maxEnergy) {
			currentEnergy = maxEnergy;
		}else if(currentEnergy < minEnergy) {
			//TODO: throw out of energy exception
		}
	}
	
	public static int chargeOther(int amount) {
		if(!((currentEnergy - amount) < minEnergy)) {
			currentEnergy -= amount;
			return amount;
		}else {
			//throw not enough energy exception
			int energyLeft = currentEnergy;
			currentEnergy = minEnergy;
			return energyLeft;
		}
	}
}
