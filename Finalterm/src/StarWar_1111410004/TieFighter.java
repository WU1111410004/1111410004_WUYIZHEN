package StarWar_1111410004;

import java.util.Arrays;

public class TieFighter extends AirCraft {
	private String [] Shield ;
	private double [] ShieldPower= {1000,1000,1000};
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[] shield) {
		Shield = shield;
	}
	public double[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
		if((this.ShieldPower.length >1000)||(this.ShieldPower.length < 0))
			return ;
	}
	@Override
	public void Weapon() {
		System.out.printf("SFS L-s1 型雷射加農炮","SFS L-s1 型雷射加農炮");
	}
	@Override
	public String toString() {
		return "XWing(反抗軍使用)"+super.toString()+"Shield ="+Arrays.toString(Shield)+"ShieldPower ="+Arrays.toString(ShieldPower);
	}
}
