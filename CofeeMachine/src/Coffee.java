
public class Coffee {

	private String coffeeName;
	private double largePrice;
	private double mediumPrice;
	private double smallPrice;

	public static void greetingsInfo() {
		System.out.println("Welcome to N&I Cafe");
		System.out.println("Please Choose your Coffee");

	}

	public Coffee(String coffeeName) {
		super();
		this.coffeeName = coffeeName;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public double getLargePrice() {
		return largePrice;
	}

	public void setLargePrice(double largePrice) {
		this.largePrice = largePrice;
	}

	public double getMediumPrice() {
		return mediumPrice;
	}

	public void setMediumPrice(double mediumPrice) {
		this.mediumPrice = mediumPrice;
	}

	public double getSmallPrice() {
		return smallPrice;
	}

	public void setSmallPrice(double smallPrice) {
		this.smallPrice = smallPrice;
	}
}
