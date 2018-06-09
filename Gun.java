package spaceShip;

public abstract class Gun{
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
	private final static int magSize = 20;
	
	private int bulletsInMag = 20;
	private int serialNr;
	
	MechanicalGun(int serialNr){
		this.serialNr = serialNr;
	}
	
	public int getSerialNr(){
		return serialNr;
	}
	
	public int getBulletsInMag() {
		return bulletsInMag;
	}
	
	public int getMagSize() {
		return magSize;
	}
	
	String fireGun() {
		if(bulletsInMag > 0) {
			bulletsInMag -= 1;
			return "bang bang";
		}else {
			//TODO: Throw out of bullets exception
			return "out of bullets";
		}
	}
	
	public void reloadMag() {
		if(bulletsInMag != magSize) {
			bulletsInMag += EnergyGrid.chargeOther(magSize - bulletsInMag);
		}else {
			//TODO: throw full on bullets exception
		}
	}
		
	public void repair() {
		
	}
}

class OutOfEnergyException extends Exception {}