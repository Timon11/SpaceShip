package spaceShip;

public class HyperDrive implements EnergyCapsule{
	final static int energyModulation = 5;
	private final static int minEnergy = 0;
	private final static int maxEnergy = 20;
	
	private int myEnergyLevel = 10;
	
	public int getEnergyLevel() {
		return myEnergyLevel;
	}
	
	public int getMaxEnergy() {
		return maxEnergy;
	}
	
	String makeHyperJump() {
		if(myEnergyLevel > minEnergy) {
			myEnergyLevel -= energyModulation;
			return "NEAAAAHWWW   -    plop";
		}else {
			//TODO: Throw out of energy exception
			return "out of energy";
		}
	}
		
	public void chargeEnergy() {
		if(myEnergyLevel != maxEnergy) {
			myEnergyLevel += EnergyGrid.chargeOther(maxEnergy - myEnergyLevel);
		}else {
			//TODO: throw full on energy exception
		}
	}
}
