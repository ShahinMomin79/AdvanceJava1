package com.techno.DesignPatterns.Builder;

public class MobileBuilder {
	
private  String CName;
private  double price;
private	int memory;
private	int version;
private	int ram;
private	String Color;
private	int front_cam;
private	int screen_size;


public MobileBuilder setCName(String cName) {
	CName = cName;
	return this;
}

public MobileBuilder setPrice(double price) {
	this.price = price;
	return this;
}

public MobileBuilder setMemory(int memory) {
	this.memory = memory;
	return this;
}

public MobileBuilder setVersion(int version) {
	this.version = version;
	return this;
}

public MobileBuilder setRam(int ram) {
	this.ram = ram;
	return this;
}

public MobileBuilder setColor(String color) {
	Color = color;
	return this;
}

public MobileBuilder setFront_cam(int front_cam) {
	this.front_cam = front_cam;
	return this;
}

public MobileBuilder setScreen_size(int screen_size) {
	this.screen_size = screen_size;
	return this;
}

public Mobile getMobile() {
	Mobile mobile=new Mobile(this.CName, this.price, this.memory, this.version, this.ram, this.Color, this.front_cam, this.screen_size);
	return mobile;
}

}
