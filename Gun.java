package spaceShip;

public abstract class Gun{
	void showStatus() {
		
	}
	abstract int getSerialNr();
	abstract String fireGun();
}

class LaserGun extends Gun implements EnergyCapsule{
	private final static int energyModulation = 1;
	private final static int minEnergy = 0;
	private final static int maxEnergy = 5;
	
	private int myEnergyLevel = 5;
	private int serialNr;
	
	LaserGun(int serialNr){
		this.serialNr = serialNr;
	}
	
	public int getSerialNr(){
		return serialNr;
	}
	
	public int getEnergyLevel() {
		return myEnergyLevel;
	}
	
	public int getMaxEnergy() {
		return maxEnergy;
	}
	
	String fireGun() {
		if(myEnergyLevel > minEnergy) {
			myEnergyLevel -= energyModulation;
			return "pew pew";
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

class MechanicalGun extends Gun implements RepairAble{
	MechanicalGun(int serialNr){
		this.serialNr = serialNr;
	}
	int amountOfBullets;
	
	void reloadGun() {
		
	}
	
	String fireGun() {
		return "Bang Bang";
	}
	private int serialNr;
	
	public int getSerialNr(){
		return serialNr;
	}
	
	public void repair() {
		
	}
}

class OutOfEnergyException extends Exception {}