package spaceShip;

public abstract class Shield{
	abstract String getHit() throws OutOfEnergyException;
}

class EnergyShield extends Shield implements EnergyCapsule{
	private final static int energyModulation = 1;
	private final static int minEnergy = 0;
	private final static int maxEnergy = 10;
	
	private int myEnergyLevel = 5;
	
	public int getEnergyLevel() {
		return myEnergyLevel;
	}
	
	public int getMaxEnergy() {
		return maxEnergy;
	}
	
	String getHit() throws OutOfEnergyException{
		if(myEnergyLevel > minEnergy) {
			myEnergyLevel -= energyModulation;
			return "Bzzt";
		}else {
			//Throw out of energy exception
			throw new OutOfEnergyException();
		}
	}
	
	public void chargeEnergy() throws FullOnEnergyException {
		if(myEnergyLevel != maxEnergy) {
			myEnergyLevel += EnergyGrid.chargeOther(maxEnergy - myEnergyLevel);
		}else {
			//throw full on energy exception
			throw new FullOnEnergyException();
		}
	}
}

class MetalShield extends Shield{
	
	String getHit() {
		return "Metal Shield Hit";
	}
}