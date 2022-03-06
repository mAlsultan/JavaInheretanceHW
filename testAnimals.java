
public class testAnimals {

	public static void main(String[] args) {
		Cat kitten = new Cat();
		System.out.println("Default cat eats: ");
		kitten.printCat();
		System.out.println();
		
		String[] a = {"Cat food", "fish", "milk"};
		kitten.setEats(a);
		
		System.out.println("young cat eats: ");
		kitten.printCat();
		System.out.println();
		
		String[] x = {"milk", "cats food"};
		Cat BabyKitten = new Cat(x);
		
		System.out.println("Baby cat eats: ");
		BabyKitten.printCat();
	}
}