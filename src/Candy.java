/**
 * Candy Class
 * 
 * @author Bret Wilson
 * @version 1.0
 * @since 2019-04-14
 */
public class Candy extends VendableItem {

	private String name;
	private Double price;

	// Constructors
	public Candy() { this("", 0.0); }
	
	public Candy(String name, Double price) {
		setName(name);
		setPrice(price);
	}
	// -----
	// Name Methods
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }

	// Price Methods
	public void setPrice(Double price) { this.price = price; }
	public Double getPrice() { return price; }
	// ---

	public Candy clone() {
		return new Candy(this.name, this.price);
	}
}