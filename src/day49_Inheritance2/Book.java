 package day49_Inheritance2;

public class Book {
	private String title;
	private String type;
	private String author;
	private double price;
	@Override
	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", author=" + author + ", price=" + price + "]";
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
