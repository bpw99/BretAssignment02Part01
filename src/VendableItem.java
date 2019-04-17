
public class VendableItem implements Cloneable {
  private String name;
  private Double price;

  // Constructors
  public VendableItem() { this("",0.0); }
  public VendableItem(String name, Double price) {
    this.name = name;
    this.price = price;
  }
  // ---
  public String getName() { return(name); };
  public Double getPrice() {return(price); };

  public void setName(String name) { this.name = name; };
  public void setPrice(Double price) { this.price = price; };

  public VendableItem clone() {
    return(new VendableItem(this.name, this.price));
  }
}