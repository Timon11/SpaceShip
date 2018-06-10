package spaceShip;

interface EnergyCapsule {
	
	int getEnergyLevel();
	int getMaxEnergy();
	void chargeEnergy()throws FullOnEnergyException;
}

class FullOnEnergyException extends Exception {}

class OutOfEnergyException extends Exception {}