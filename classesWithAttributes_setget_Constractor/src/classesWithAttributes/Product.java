package classesWithAttributes;

public class Product {
	public Product(int id,String name,String description,double price,int stockAmount,String renk) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
	}
  private int id;
  private String name;
  private String description;
  private double price;
  private int stockAmount;
  private String renk;
  private String kod;
  public int getId() {
	  return id;
  }
  public void setId(int id) {
	  this.id=id;
  }
private String getName() {
	return name;
}
private void setName(String name) {
	this.name = name;
}
private String getDescription() {
	return description;
}
private void setDescription(String description) {
	this.description = description;
}
private double getPrice() {
	return price;
}
private void setPrice(double price) {
	this.price = price;
}
private int getStockAmount() {
	return stockAmount;
}
private void setStockAmount(int stockAmount) {
	this.stockAmount = stockAmount;
}
private String getRenk() {
	return renk;
}
private void setRenk(String renk) {
	this.renk = renk;
}
private String getKod() {
	return this.name.substring(0,1)+id;
}
private void setKod(String kod) {
	this.kod = kod;
}
}
