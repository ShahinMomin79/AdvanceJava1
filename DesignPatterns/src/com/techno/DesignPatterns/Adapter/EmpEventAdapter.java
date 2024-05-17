package com.techno.DesignPatterns.Adapter;

public class EmpEventAdapter extends Employee implements Events {

	@Override
	public void LaboursDay() {
		
		EmpEventAdapter adapter=new EmpEventAdapter();
		adapter.setId(1);
		adapter.setName("shubham");
		adapter.setDesignation("Manager");
		
		System.out.println("on this occassion of labours day we are inviting our chief guest Mr."+adapter.getName()+ "  is "+adapter.getDesignation()+ " of our company");
		
		
	}
	
	public static void main(String[] args) {
		EmpEventAdapter adapter=new EmpEventAdapter();
		adapter.LaboursDay();
	}

}
