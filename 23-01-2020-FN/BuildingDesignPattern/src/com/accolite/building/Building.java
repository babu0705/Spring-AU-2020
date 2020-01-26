package com.accolite.building;

public class Building {
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
		public Building(int windows, int doors, int rooms, int curtains, int parkingSlots, int swimmingPool, int garden,
				int electronicItems, int sofaset, int diningTableSets) {
			super();
			this.windows = windows;
			this.doors = doors;
			this.rooms = rooms;
			this.curtains = curtains;
			ParkingSlots = parkingSlots;
			SwimmingPool = swimmingPool;
			Garden = garden;
			ElectronicItems = electronicItems;
			Sofaset = sofaset;
			DiningTableSets = diningTableSets;
		}
		@Override
		public String toString() {
			return "Building [windows=" + windows + ", doors=" + doors + ", rooms=" + rooms + ", curtains=" + curtains
					+ ", ParkingSlots=" + ParkingSlots + ", SwimmingPool=" + SwimmingPool + ", Garden=" + Garden
					+ ", ElectronicItems=" + ElectronicItems + ", Sofaset=" + Sofaset + ", DiningTableSets="
					+ DiningTableSets + "]";
		}
		
				
		
	}

