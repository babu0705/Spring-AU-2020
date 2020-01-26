package com.accolite.building;

public class Builder {
	private int windows;
	private int doors;
	private int rooms;
	private int curtains;
	private int ParkingSlots;
	private int SwimmingPool;
	private int Garden;
	private int ElectronicItems;
	private int Sofaset;
	private int DiningTableSets;
	
	public Builder setWindows(int windows) {
		this.windows = windows;
		return this;

	}
	public Builder setDoors(int doors) {
		this.doors = doors;
		return this;

	}
	public Builder setRooms(int rooms) {
		this.rooms = rooms;
		return this;

	}
	
	public Builder setCurtains(int curtains) {
		this.curtains = curtains;
		return this;

	}
	
	public Builder setParkingSlots(int ParkingSlots) {
		this.ParkingSlots = ParkingSlots;
		return this;

	}
	public Builder setSwimmingPool(int SwimmingPool) {
		this.SwimmingPool = SwimmingPool;
		return this;
	}

	public Builder setGarden(int Garden) {
		this.Garden = Garden;
		return this;
	}
	
	public Builder setElectronicItems(int ElectronicItems) {
		this.ElectronicItems = ElectronicItems;
		return this;
	}
	
	public Builder setSofaset(int Sofaset) {
		this.Sofaset = Sofaset;
		return this;
	}
	
	public Builder setDiningTableSets(int DiningTableSets) {
		this.DiningTableSets = DiningTableSets;
		return this;
	}
	public Building Builders()
	{
		return new Building(this.windows, this.doors, this.rooms, this.curtains , this.ParkingSlots, this.SwimmingPool, this.Garden, this.ElectronicItems, this.Sofaset, this.DiningTableSets); 
	}
	

}
