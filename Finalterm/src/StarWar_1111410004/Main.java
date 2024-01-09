package StarWar_1111410004;

public class Main {

	public static void main(String[] args) {
		var Tie01 = new TieFighter();
		Tie01.setManufacturer("賽納爾艦隊系統（Sienar Fleet Systems）");
		Tie01.setModel("雙離子引擎生產線星際戰鬥機（Twin Ion Engine Line Starfighter）");
		Tie01.setLength(6.3);
		Tie01.setAirSpeed(1200);
		Tie01.setSpaceSpeed("4100G");
		Tie01.setStdandardEngine("SFS P-s4 雙離子引擎");
		Tie01.setHyperSpaceEngine("無");
		var Xwing01 = new TieFighter();
		Xwing01.setManufacturer("");
		Xwing01.setModel("Incom Corporation T65B X-Wing Space 65B X-Wing Space");
		Xwing01.setLength(12.5);
		Xwing01.setAirSpeed(1050);
		Xwing01.setSpaceSpeed("100MGL");
		Xwing01.setStdandardEngine("80MGLTR300-H 之超空間飛行引擎");
		Xwing01.setHyperSpaceEngine("Class 1 Koensayr");
		
		Tie01.toString();
		Xwing01.toString();
	}

}
