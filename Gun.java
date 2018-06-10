package spaceShip;

public abstract class Gun{
	abstract int getSerialNr();
	abstract String fireGun()throws OutOfEnergyException, OutOfBulletsException;
}

class LaserGun extends Gun implements EnergyCapsule {
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
	
	String fireGun()throws OutOfEnergyException {
		if(myEnergyLevel > minEnergy) {
			myEnergyLevel -= energyModulation;
			return "pew pew";
		}else {
			//Throw out of energy exception
			throw new OutOfEnergyException();
		}
	}
	
	public void chargeEnergy() throws FullOnEnergyException{
		if(myEnergyLevel != maxEnergy) {
			myEnergyLevel += EnergyGrid.chargeOther(maxEnergy - myEnergyLevel);
		}else {
			//throw full on energy exception
			throw new FullOnEnergyException();
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
	
	String fireGun() throws OutOfBulletsException {
		if(bulletsInMag > 0) {
			bulletsInMag -= 1;
			return "bang bang";
		}else {
			//Throw out of bullets exception
			throw new OutOfBulletsException();
		}
	}
	
	public void reloadMag() throws FullOnBulletsException{
		if(bulletsInMag != magSize) {
			bulletsInMag += EnergyGrid.chargeOther(magSize - bulletsInMag);
		}else {
			//throw full on bullets exception
			throw new FullOnBulletsException();
		}
	}
		
	public void repair() {
		
	}
}

class OutOfBulletsException extends Exception{}
class FullOnBulletsException extends Exception{}