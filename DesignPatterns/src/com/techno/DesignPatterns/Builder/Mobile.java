package com.techno.DesignPatterns.Builder;

public class Mobile {
	
	String CName;
	double price;
	int memory;
	int version;
	int ram;
	String Color;
	int front_cam;
	int screen_size;
	
	public Mobile(String cName, double price, int memory, int version, int ram, String color, int front_cam,
			int screen_size) {
		
		CName = cName;
		this.price = price;
		this.memory = memory;
		this.version = version;
		this.ram = ram;
		Color = color;
		this.front_cam = front_cam;
		this.screen_size = screen_size;
	}

	@Override
	public String toString() {
		return "Mobile [CName=" + CName + ", price=" + price + ", memory=" + memory + ", version=" + version + ", ram="
				+ ram + ", Color=" + Color + ", front_cam=" + front_cam + ", screen_size=" + screen_size + "]";
	}
	
	
	
	

}
