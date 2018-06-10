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
	
	String makeHyperJump() throws OutOfEnergyException{
		if(myEnergyLevel > minEnergy) {
			myEnergyLevel -= energyModulation;
			return "NEAAAAHWWW   -    plop";
		}else {
			//Throw out of energy exception
			throw new OutOfEnergyException();
		}
	}
		
	public void chargeEnergy() throws FullOnEnergyException{
		if(myEnergyLevel != maxEnergy) {
			myEnergyLevel += EnergyGrid.chargeOther(maxEnergy - myEnergyLevel);
		}else {
			//TODO: throw full on energy exception
			throw new FullOnEnergyException();
		}
	}
}
