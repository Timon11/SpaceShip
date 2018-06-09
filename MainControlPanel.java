package spaceShip;

import java.util.Scanner;

public class MainControlPanel {
	public static void main(String [] args){
		MainControlPanel MCP = new MainControlPanel();
		
		MCP.startConsole();

	}
	
	Scanner input = new Scanner(System.in);		
	GUI gui;
	Ship ship;
	
	void startConsole() {
		{
			gui = new GUI();
			ship = new Ship();	
		}
		System.out.print(gui.draw("Start"));
		if(input.nextLine().equals("start")) {
			mainConsole();
		}
	}
	
	void mainConsole() {
		System.out.print(gui.draw("Menu"));
				
		switch(input.nextInt()) {
			case 1:
				//TODO: finish fire command
				gunControl(getNrOfGun(getTypeOfGun()));
				break;
			case 2:
				//TODO: draw shields menu
				shieldControl(getTypeOfShield());
				break;
			case 3:
				//TODO: draw engine menu
				engineControl(ship.engine);
				break;
			case 4:
				//TODO: draw hyperDrive menu
				hyperDriveControl(ship.hyperDrive);
				break;
			case 5:
				//TODO: draw energy grid menu
				energyGridControl(ship.energyGrid);
				break;
			case 6:
				//TODO: exit
				System.out.print(gui.draw("Exit"));
				break;
			default:
				//TODO: restart
				break;
		}
	}
	
	Gun[] getTypeOfGun(){
		System.out.print(gui.draw(ship.gun));
		switch(input.nextInt()) {
		case 1:
			return ship.laserGuns;
		case 2:
			return ship.mechanicalGuns;
		case 6:
			mainConsole();
			return null;
		default:
			//TODO: integrate exception
			return getTypeOfGun();	
		}
	}
	
	Gun getNrOfGun(Gun[] typeOfGun) {
		System.out.print(gui.draw(typeOfGun));
		
		int myChoice = input.nextInt();
		if(myChoice <= typeOfGun.length) {
			return (typeOfGun[(myChoice-1)]);
		}
		else if(myChoice == 6){
			gunControl(getNrOfGun(getTypeOfGun()));
			return null;
		}
		else {
			return getNrOfGun(typeOfGun);
		}
	}
	
	void gunControl(Gun gun) {
		System.out.printf(gui.draw(gun));
		switch(input.nextInt()) {
		case 1:
			//TODO: fire the gun if there is enough energy/bullets, if not, throw exception
			System.out.println(gun.fireGun());
			gunControl(gun);
			break;
		case 2:
			if(gun instanceof LaserGun) {
				((LaserGun)gun).chargeEnergy();
				gunControl(gun);
			}else if(gun instanceof MechanicalGun) {
				//TODO: implement reload function for mechanical gun

				gunControl(gun);
			}
			break;
		case 6:	//Return
			if(gun instanceof LaserGun) {
				gunControl(getNrOfGun(ship.laserGuns));
			}else if(gun instanceof MechanicalGun) {
				gunControl(getNrOfGun(ship.mechanicalGuns));
			}
			break;
		default:
			//TODO: throw wronginputexception
			gunControl(gun);
			break;
		}
	}

	Shield getTypeOfShield() {			
		System.out.print(gui.draw(ship.shield));
		switch(input.nextInt()) {
		case 1:
			return ship.energyShield;
		case 2:
			return ship.metalShield;
		case 6:
			mainConsole();
			return null;
		default:
			//TODO: integrate exception
			return getTypeOfShield();	
		}
	}
	
	void shieldControl(Shield shield) {	
		System.out.print(gui.draw(shield));
		if(input.nextInt() == 6) {
			shieldControl(getTypeOfShield());
		}else {
			//TODO: THrow exception
			shieldControl(shield);
		}
	}
	
	void engineControl(Engine engine) {		//ENGINE
		System.out.print(gui.draw(engine));
		switch(input.nextInt()) {
		case 1:
			engine.Run();
			engineControl(engine);
			break;
		case 2:
			//TODO: implement second engine function
			engineControl(engine);
			break;
		case 6:	//Return
			mainConsole();
			break;
		default:
			//TODO: THrow wronginputexception
			engineControl(engine);
			break;
		}
	}
	
	void hyperDriveControl(HyperDrive hyperDrive) {	//HYPERDRIVE
		System.out.print(gui.draw(hyperDrive));
		
		switch(input.nextInt()) {
		case 1:
			System.out.println(hyperDrive.makeHyperJump());
			hyperDriveControl(hyperDrive);
			break;
		case 2:
			//TODO: implement second hyperdrive function
			hyperDrive.chargeEnergy();
			hyperDriveControl(hyperDrive);
			break;
		case 6:	//Return
			mainConsole();
			break;
		default:
			//TODO: THrow wronginputexception
			hyperDriveControl(hyperDrive);
			break;
		}
	}
	
	void energyGridControl(EnergyGrid energyGrid) {
		System.out.print(gui.draw(energyGrid));
		if(input.nextInt() == 6) {
			mainConsole();
		}else if(input.nextInt() == 1) {
			System.out.println(energyGrid.getCurrentEnergy());
		}else {
			//TODO: THrow wronginputexception
			energyGridControl(energyGrid);
		}
	}
	
}

class InvalidInputException extends Exception {}
