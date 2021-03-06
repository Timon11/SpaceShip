package spaceShip;

import java.util.InputMismatchException;
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
			ship = new Ship("Millennium Falcon");	
		}
		
		System.out.print(gui.draw("Start"));
		if(input.nextLine().equals("start")) {
			mainConsole();
		}
	}
	
	void mainConsole() {
		System.out.print(gui.draw("Menu"));
		try {		
			switch(input.nextInt()) {
				case 1:
					//finish fire command
					gunControl(getNrOfGun(getTypeOfGun()));
					break;
				case 2:
					//draw shields menu
					shieldControl(getTypeOfShield());
					break;
				case 3:
					//draw engine menu
					engineControl(ship.engine);
					break;
				case 4:
					//draw hyperDrive menu
					hyperDriveControl(ship.hyperDrive);
					break;
				case 5:
					//draw energy grid menu
					energyGridControl(ship.energyGrid);
					break;
				case 6:
					//exit
					System.out.print(gui.draw("Exit"));
					System.exit(0);
					break;
				default:
					//restart
					throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			mainConsole();
		}
	}
	
	Gun[] getTypeOfGun(){
		System.out.print(gui.draw(ship.gun));
		try {
			switch(input.nextInt()) {
			case 1:
				return ship.laserGuns;
			case 2:
				return ship.mechanicalGuns;
			case 6:
				mainConsole();
				return null;
			default:
				throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			return getTypeOfGun();
		}
	}
	
	Gun getNrOfGun(Gun[] typeOfGun) {
		System.out.print(gui.draw(typeOfGun));
		try {
			int myChoice = input.nextInt();
			if(myChoice <= typeOfGun.length) {
				return (typeOfGun[(myChoice-1)]);
			}
			else if(myChoice == 6){
				gunControl(getNrOfGun(getTypeOfGun()));
				return null;
			}
			else {
				throw new InputMismatchException();
			}
		}catch (InputMismatchException e) {
			ExceptionHandler(e);
			return getNrOfGun(typeOfGun);
		}
	}
	
	void gunControl(Gun gun){
		System.out.printf(gui.draw(gun));
		try {
			switch(input.nextInt()) {
			case 1:
				try {
					System.out.println(gun.fireGun());
					gunControl(gun);
				}catch(OutOfEnergyException e) {
					ExceptionHandler(e);
					gunControl(gun);
				}catch(OutOfBulletsException e) {
					ExceptionHandler(e);
					gunControl(gun);
				}
				break;
			case 2:
				try {
					if(gun instanceof LaserGun) {
						((LaserGun)gun).chargeEnergy();
						gunControl(gun);
					}else if(gun instanceof MechanicalGun) {
						((MechanicalGun)gun).reloadMag();
						gunControl(gun);
					}
				}catch(FullOnEnergyException e) {
					ExceptionHandler(e);
					gunControl(gun);					
				}catch(FullOnBulletsException f) {
					ExceptionHandler(f);
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
				throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			gunControl(gun);
		}
	}


	Shield getTypeOfShield() {			
		System.out.print(gui.draw(ship.shield));
		try {
			switch(input.nextInt()) {
			case 1:
				return ship.energyShield;
			case 2:
				return ship.metalShield;
			case 6:
				mainConsole();
				return null;
			default:
				throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			return getTypeOfShield();	
		}
	}
	
	void shieldControl(Shield shield) {	
		System.out.print(gui.draw(shield));
		try {
			if(input.nextInt() == 6) {
				shieldControl(getTypeOfShield());
			}else {
				throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			shieldControl(shield);
		}
	}
	
	void engineControl(Engine engine){		//ENGINE
		System.out.print(gui.draw(engine));
		try {
			switch(input.nextInt()) {
			case 1:
				engine.Run();
				engineControl(engine);
				break;
			case 6:	//Return
				mainConsole();
				break;
			default:
				throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			engineControl(engine);
		}
	}
	
	void hyperDriveControl(HyperDrive hyperDrive) {	//HYPERDRIVE
		System.out.print(gui.draw(hyperDrive));
		try {
			switch(input.nextInt()) {
			case 1:
				try {
					System.out.println(hyperDrive.makeHyperJump());
					hyperDriveControl(hyperDrive);
				}catch (OutOfEnergyException e) {
					ExceptionHandler(e);
					hyperDriveControl(hyperDrive);
				}
				break;
			case 2:
				try {
					hyperDrive.chargeEnergy();
					hyperDriveControl(hyperDrive);
				}catch(FullOnEnergyException e){
					ExceptionHandler(e);
					hyperDriveControl(hyperDrive);
				}
				break;
			case 6:	//Return
				mainConsole();
				break;
			default:
				throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			hyperDriveControl(hyperDrive);
		}
	}
	
	void energyGridControl(EnergyGrid energyGrid) {
		System.out.print(gui.draw(energyGrid));
		try {
			if(input.nextInt() == 6) {
				mainConsole();
			}else {
				throw new InputMismatchException();
			}
		}catch(InputMismatchException e) {
			ExceptionHandler(e);
			energyGridControl(energyGrid);
		}
	}
	
	void ExceptionHandler(Exception e) {
		System.out.printf(gui.draw(e));
		input.nextLine();
		input.nextLine();
	}
}