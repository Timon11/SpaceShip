package spaceShip;

import java.util.Scanner;

public class MainControlPanel {
	public static void main(String [] args) {
		MainControlPanel MCP = new MainControlPanel();
		MCP.mainConsole();
	}
	
	Scanner input = new Scanner(System.in);		
	GUI gui = new GUI();
	Ship ship = new Ship();
	
	void mainConsole() {
		System.out.print(gui.draw("Start"));
		if(input.nextLine().equals("start")) {
			System.out.print(gui.draw("Menu"));
		}
		
		switch(input.nextInt()) {
			case 1:
				//TODO: draw guns menu
				System.out.print(gui.draw(ship.oldSchoolGun));
				break;
			case 2:
				//TODO: draw shields menu
				System.out.print(gui.draw(ship.metalShield));
				break;
			case 3:
				//TODO: draw engine menu
				System.out.print(gui.draw(ship.engine));
				break;
			case 4:
				//TODO: draw hyperDrive menu
				System.out.print(gui.draw(ship.hyperDrive));
				break;
			case 5:
				//TODO: draw energy grid menu
				System.out.print(gui.draw(ship.energyGrid));
				break;
			case 6:
				//TODO: exit
				break;
			default:
				//TODO: restart
				break;
		}
	}

}
