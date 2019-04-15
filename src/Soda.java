/**
 * Soda Class
 * 
 * @author Bret Wilson
 * @version 1.0
 * @since 2019-04-14
 */
public class Soda extends VendableItem {

	private String name;
	private Double price;

	// Constructors
	public Soda() { this("", 0.0); }
	
	public Soda(String name, Double price) {
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

	public Soda clone() {
		return new Soda(this.name, this.price);
	}
}