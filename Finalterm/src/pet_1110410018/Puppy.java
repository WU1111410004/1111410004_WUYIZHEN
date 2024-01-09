package pet_1110410018;

public class Puppy {
	private String PuppyName;
	private String PuppyType;
	private String PuppyColor;
	private String PuppyGender;
	private static final String[] Citems= {"洗澡","修指","理毛","大美容","中美容"};
	private static final float[] Cprice= {600,200,300,1000,750};
		
	public String getPuppyName() {
		return PuppyName;
	}
	public void setPuppyName(String puppyName) {
		PuppyName = puppyName;
	}
	public String getPuppyType() {
		return PuppyType;
	}
	public void setPuppyType(String puppyType) {
		PuppyType = puppyType;
	}
	public String getPuppyColor() {
		return PuppyColor;
	}
	public void setPuppyColor(String puppyColor) {
		PuppyColor = puppyColor;
	}
	public String getPuppyGender() {
		return PuppyGender;
	}
	public void setPuppyGender(String puppyGender) {
		PuppyGender = puppyGender;
	}
	Puppy(){}
	Puppy(String PuppyName){
		setPuppyName(PuppyName);
	}
	Puppy(String PuppyName,String PuppyType,String PuppyColor){
		this(PuppyName);
		setPuppyType(PuppyType);
		setPuppyColor(PuppyColor);
	}
	
	public double check(double...array) {
		for(int i=0;i<array.length;i++) {
			if(array[i]>Citems.length-1 || array[i]<0) {
				return -1;
			}
		}
		System.out.printf("%s消費明細%n",getPuppyName());
		System.out.println("***********");
		double sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=Cprice[(int)array[i]];
			System.out.printf("0%d%s%d%n",i+1,Citems[(int)array[i]],(int)Cprice[(int)array[i]]);
		}
		System.out.println("***********");
		if(sum>1) {
			return sum;
		}else {
			return -1;
		}
	}
}
