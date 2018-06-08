package spaceShip;

public class Ship {
	Gun[] laserGun;
	Gun oldSchoolGun;
	Shield energyShield;
	Shield metalShield;
	Engine engine;
	HyperDrive hyperDrive;
	EnergyGrid energyGrid;
	Ship(){
		laserGun = new LaserGun[4];
		oldSchoolGun = new OldSchoolGun();
		energyShield = new EnergyShield();
		metalShield = new MetalShield();
		engine = new Engine();
		hyperDrive = new HyperDrive();
		energyGrid = new EnergyGrid();

	}
	
}
