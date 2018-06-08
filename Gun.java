package spaceShip;

public abstract class Gun{
	void showStatus() {
		
	}
	void fireGun() {
		
	}
}

class LaserGun extends Gun{
//	try {
		//shoot
//	}catch(OutOfEnergyException e) {
		//reload	
//	}
}

class OldSchoolGun extends Gun{
	
}

class OutOfEnergyException extends Exception {}