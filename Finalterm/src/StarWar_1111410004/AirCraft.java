package StarWar_1111410004;

import java.util.Arrays;

public class AirCraft {
	protected String Manufacturer;
	protected String Model;
	protected double Length;
	protected double AirSpeed;
	protected String SpaceSpeed;
	protected String StdandardEngine;
	protected String HyperSpaceEngine;
	protected String [] Weapon;
	protected double [] Weapon_power;
	protected int Passenger;

	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.Manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		this.Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		this.Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		this.AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		this.SpaceSpeed = spaceSpeed;
	}
	public String getStdandardEngine() {
		return StdandardEngine;
	}
	public void setStdandardEngine(String stdandardEngine) {
		this.StdandardEngine = stdandardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		this.HyperSpaceEngine = hyperSpaceEngine;
	}
	
	public void Weapon() {}
	public void Weapon_power() {}
	
	public String toString() {
		return "Manufacturer=" + Manufacturer + ", Model=" + Model + ", Length=" + Length + ", AirSpeed="
				+ AirSpeed + ", SpaceSpeed=" + SpaceSpeed + ", StdandardEngine=" + StdandardEngine
				+ ", HyperSpaceEngine=" + HyperSpaceEngine + ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power="
				+ Arrays.toString(Weapon_power) + ", Passenger=" + Passenger + "]";
	}
}
