package spaceShip;

public class Engine implements RepairAble{
		
	void Run() {
		EnergyGrid.getCharged(20);
	}
	
	public void repair() {
		
	}
}
