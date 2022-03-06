public class Cat extends Animal{

	public Cat() {
		super();
	}
	
	public Cat(String[] x) {
		super(x);
	}
	
	public void printCat() {
		
		for(int i =0; i < getEats().length; i++) {
			System.out.println(getEats()[i]);
		}
	}
}