package spaceShip;

public class GUI {
	String draw(Gun gun) {
		if(gun instanceof LaserGun) {
			return 	   (" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                     LASER GUN-0" + (((LaserGun)gun).getSerialNr() + 1)+"                       ||\n"
					+ 	"|| 1. Fire Laser                                          ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"|| 2. Charge Laser    -- --o   o-- --                     ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                      .............                     ||\n"
					+	"||       Energy Level > | "+	energyDisplay((LaserGun)gun) +"|           Return 6. ||\n"
					+	"||                      `````````````                     ||\n"
					+	" \\\\======================================================//\n");
		}else if(gun instanceof MechanicalGun) {
			return 	   (" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                MACHINE GUN-0" + (((MechanicalGun)gun).getSerialNr() + 1)+"                         ||\n"
					+ 	"|| 1. FIRE!!                                              ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"|| 2. BULLETS: 0      -- --o   o-- --                     ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                                                        ||\n"
					+	"||                                              Return 6. ||\n"
					+	"||                                                        ||\n"
					+	" \\\\======================================================//\n");
		}else {
			return (	" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                   GUN-CONTROL-CENTRE                   ||\n"
					+ 	"|| 1. Laser Guns                                          ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"|| 2. Machine Guns    -- --o   o-- --                     ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                                                        ||\n"
					+	"||                                              Return 6. ||\n"
					+	"||                                                        ||\n"
					+	" \\\\======================================================//\n");
		}
	}
	
	String draw(Gun[] gun) {
		if(gun[0] instanceof LaserGun) {
			return (	" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                       LASER GUNS                       ||\n"
					+ 	"|| 1. Laser Gun-01                        Laser Gun-04 4. ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"|| 2. Laser Gun-02    -- --o   o-- --     Laser Gun-05 5. ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                                                        ||\n"
					+	"|| 3. Laser Gun-03                              Return 6. ||\n"
					+	"||                                                        ||\n"
					+	" \\\\======================================================//\n");
		}else if(gun[0] instanceof MechanicalGun) {
			return (	" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                     MECHANICAL GUNS                    ||\n"
					+	"|| 1. Machine Gun-01                                      ||\n"
					+ 	"||                                                        ||\n"
					+	"||                            ___                         ||\n"
					+	"||                           /o|o\\OOOOOO                  ||\n"
					+	"|| 2. Machine Gun-02         \\_|_/                        ||\n"
					+	"||                          _/_|_\\_                       ||\n"
					+	"||                         /oo|O|oo\\                      ||\n"
					+	"||                                                        ||\n"
					+	"|| 3. Machine Gun-03                            Return 6. ||\n"
					+	"||                                                        ||\n"
					+	" \\\\======================================================//\n");
		}else {
			return (	" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||             CRITICAL ERROR! NO GUNS DETECTED           ||\n"
					+ 	"||                                                      . ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"||                    -- --o   o-- --                     ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                                                        ||\n"
					+	"||                                              Return 6. ||\n"
					+	"||                                                        ||\n"
					+	" \\\\======================================================//\n");
		}
	}
	
	String draw(Shield shield) {	
		if(shield instanceof EnergyShield) {
			return (	" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                     ENERGY SHIELD                      ||\n"
					+ 	"|| 1. Energy                                              ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"||                    -- --o   o-- --                     ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                 .......................                ||\n"
					+	"||  Energy Level > | "+ energyDisplay((EnergyShield)shield) +"|      Return 6. ||\n"
					+	"||                 ```````````````````````                ||\n"
					+	" \\\\======================================================//\n");
		}else if(shield instanceof MetalShield) {
			return (	" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                     METAL SHIELD                       ||\n"
					+ 	"|| 1. Hit Points                                          ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"||                    -- --o   o-- --                     ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                                                        ||\n"
					+	"||                                              Return 6. ||\n"
					+	"||                                                        ||\n"
					+	" \\\\======================================================//\n");
		}else {
			return (	" //======================================================\\\\\n"
					+ 	"||                                                        ||\n"
					+ 	"||                     SHIELD-CONTROL                     ||\n"
					+ 	"|| 1. Energy Shield                                       ||\n"
					+	"||                                                        ||\n"
					+	"||                           |                            ||\n"
					+	"||                         \\ o /                          ||\n"
					+	"|| 2. Metal Shield    -- --o   o-- --                     ||\n"
					+	"||                         / o \\                          ||\n"
					+	"||                           |                            ||\n"
					+	"||                                                        ||\n"
					+	"||                                              Return 6. ||\n"
					+	"||                                                        ||\n"
					+	" \\\\======================================================//\n");
		}
	}
	
	String draw(Engine engine) {		
		return (	" //======================================================\\\\\n"
				+ 	"||                                                        ||\n"
				+ 	"||                     ENGINE-CONTROL                     ||\n"
				+	"|| 1. Run Engine                                          ||\n"
				+ 	"||                                                        ||\n"
				+	"||                           |                            ||\n"
				+	"||                         \\ o /                          ||\n"
				+	"||                    -- --o   o-- --                     ||\n"
				+	"||                         / o \\                          ||\n"
				+	"||                           |                            ||\n"
				+	"||                                                        ||\n"
				+	"||                                              Return 6. ||\n"
				+	"||                                                        ||\n"
				+	" \\\\======================================================//\n");
	}
	
	String draw(HyperDrive hyperDrive) {		
		return (	" //======================================================\\\\\n"
				+ 	"||                                                        ||\n"
				+ 	"||                   HYPERDRIVE-CONTROL                   ||\n"
				+	"||                                                        ||\n"
				+ 	"|| 1. Use Hyperdrive                                      ||\n"
				+	"||                                                        ||\n"
				+	"|| 2. Charge Energy                                       ||\n"
				+	"||                      Energy Level                      ||\n"
				+	"||      ...........................................       ||\n"
				+	"||      | "+	energyDisplay(hyperDrive) +"|       ||\n"
				+	"||      ```````````````````````````````````````````       ||\n"
				+	"||                                              Return 6. ||\n"
				+	"||                                                        ||\n"
				+	" \\\\======================================================//\n");
	}
	
	String draw(EnergyGrid energyGrid) {		
		return (	" //======================================================\\\\\n"
				+ 	"||                                                        ||\n"
				+ 	"||                   ENERGY GRID DISPLAY                  ||\n"
				+ 	"||                                                        ||\n"
				+	"||                                                        ||\n"
				+	"||                     CURRENT ENERGY                     ||\n"
				+	"||      ...........................................       ||\n"
				+	"||      | "+	energyDisplay(energyGrid) +"|       ||\n"
				+	"||      ```````````````````````````````````````````       ||\n"
				+	"||                                                        ||\n"
				+	"||                                                        ||\n"
				+	"||                                              Return 6. ||\n"
				+	"||                                                        ||\n"
				+	" \\\\======================================================//\n");
	}
	
	StringBuilder energyDisplay(EnergyGrid energyGrid) {
		StringBuilder eDisplay = new StringBuilder();
		for(int i =0; i<energyGrid.getCurrentEnergy(); i++){
			eDisplay.append("# ");
		}
		for(int i = 0; i < (20-energyGrid.getCurrentEnergy()); i++) {
			eDisplay.append("  ");
		}
		return eDisplay;
	}
	
	StringBuilder energyDisplay(EnergyCapsule energyCapsule) {
		StringBuilder energyDisplay = new StringBuilder();
		for(int i =0; i<energyCapsule.getEnergyLevel(); i++){
			energyDisplay.append("# ");
		}
		for(int i = 0; i < (energyCapsule.getMaxEnergy() -energyCapsule.getEnergyLevel()); i++) {
			energyDisplay.append("  ");
		}
		return energyDisplay;
	}
		
	String draw(Exception e) {		
		return (	" //======================================================\\\\\n"
				+ 	"||                                                        ||\n"
				+ 	"||                PLEASE ENTER A VALID INPUT              ||\n"
				+ 	"||                                                        ||\n"
				+	"||                                                        ||\n"
				+	"||                           |                            ||\n"
				+	"||                         \\ o /                          ||\n"
				+	"||                    -- --o   o-- --                     ||\n"
				+	"||                         / o \\                          ||\n"
				+	"||                           |                            ||\n"
				+	"||                                                        ||\n"
				+	"||                 Press any key to return      Return 6. ||\n"
				+	"||                                                        ||\n"
				+	" \\\\======================================================//\n");
	}
	
	
	String draw(String s) {
		switch(s) {
			case "Start":
				return	(	" //======================================================\\\\\n"
						+ 	"||                                                        ||\n"
						+ 	"||                      SPACE-SHIP                        ||\n"
						+ 	"||                                                        ||\n"
						+	"||                                                        ||\n"
						+	"||                           |                            ||\n"
						+	"||                         \\ o /                          ||\n"
						+	"||                    -- --o   o-- --                     ||\n"
						+	"||                         / o \\                          ||\n"
						+	"||                           |                            ||\n"
						+	"||                                                        ||\n"
						+	"||                 TYPE \"start\" TO START                  ||\n"
						+	"||                                                        ||\n"
						+	" \\\\======================================================//\n");
			case "Menu":
				return (	" //======================================================\\\\\n"
						+	"||                                                        ||\n"
               			+ 	"||                        STATUS                          ||\n"
               			+ 	"|| 1.GUNS                                   HYPERDRIVE 4. ||\n"
               			+ 	"||                                                        ||\n"
               			+	"||                           |                            ||\n"
               			+	"||                         \\ o /                          ||\n"
               			+	"|| 2.SHIELDS          -- --o   o-- --      ENERGY GRID 5. ||\n"
               			+	"||                         / o \\                          ||\n"
               			+	"||                           |                            ||\n"
               			+	"||                                                        ||\n"
               			+	"|| 3.ENGINE                                       EXIT 6. ||\n"
               			+	"||                                                        ||\n"
               			+	" \\\\======================================================//\n");
			case "Exit":
				return	(	" //======================================================\\\\\n"
						+ 	"||                                                        ||\n"
						+ 	"||              ARE YOU SURE YOU WANT TO EXIT?            ||\n"
						+ 	"|| 1. Exit                                                ||\n"
						+	"||                                                        ||\n"
						+	"||                           |                            ||\n"
						+	"||                         \\ o /                          ||\n"
						+	"||                    -- --o   o-- --                     ||\n"
						+	"||                         / o \\                          ||\n"
						+	"||                           |                            ||\n"
						+	"||                                                        ||\n"
						+	"||                                              Return 6. ||\n"
						+	"||                                                        ||\n"
						+	" \\\\======================================================//\n");
			default:
				return "";
		}
	}
}
