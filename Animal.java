public class Animal {
	private String[] eats = {"fish", "bird", "meat balls"};
	
	public Animal() {
		
	}
	
	public Animal(String[] x) {
		eats = x;
	}
	
	public String[] getEats() {
		
		return eats;
	}
	
	public void setEats(String[] x) {
		eats = x;
	}
}