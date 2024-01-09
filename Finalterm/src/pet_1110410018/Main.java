package pet_1110410018;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Puppy MyDog = new Puppy("皮皮");
		Puppy MyCat = new Puppy("kitty","cat","Gray");
		
		System.out.printf("總金額為%d元%n%n",(int)MyDog.check(0,1));
		System.out.printf("總金額為%d元%n%n",(int)MyCat.check(0,1,3));
	}

}
