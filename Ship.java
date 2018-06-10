package spaceShip;

public class Ship {
	Gun[] laserGuns;
	Gun[] mechanicalGuns;
	Gun gun;
	Shield shield;
	Shield energyShield;
	Shield metalShield;
	Engine engine;
	HyperDrive hyperDrive;
	EnergyGrid energyGrid;
	
	Ship(){
		laserGuns = new LaserGun[5];
		for(int i = 0; i<laserGuns.length; i++) {
			laserGuns[i] = new LaserGun(i);
		}
		
		mechanicalGuns = new MechanicalGun[3];
		for(int i = 0; i<mechanicalGuns.length; i++) {
			mechanicalGuns[i] = new MechanicalGun(i);
		}
		
		energyShield = new EnergyShield();
		metalShield = new MetalShield();
		
		engine = new Engine();
		hyperDrive = new HyperDrive();
		energyGrid = new EnergyGrid();

	}
	Ship(String name){
		this();
	}
	
}
