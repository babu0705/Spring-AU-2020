package com.accolite.building;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder=new Builder();
		builder.setDoors(1);
		builder.setRooms(4);
		builder.setWindows(3);
		builder.setParkingSlots(2);
		builder.setSofaset(5);
		builder.setDiningTableSets(1);
		Building building=builder.Builders();
		System.out.println(building);

	}

}
