package spaceShip;

public abstract class Shield{

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
	
	String getHit() {
		if(myEnergyLevel > minEnergy) {
			myEnergyLevel -= energyModulation;
			return "Bzzt";
		}else {
			//TODO: Throw out of energy exception
			return "shield out of energy";
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

class MetalShield extends Shield implements RepairAble{
	public void repair() {
		
	}
}