import java.util.Scanner;

public abstract class Product {
	
	private String productNo;
	private String productName;
	private String productManufacturer;
	private int productQuantity; 
	private double price;
	private boolean status;
	
	public Product() {
		
		productNo = "";
		productName = "";
		productManufacturer = ""; 
		productQuantity = 0;
		price = 0.0;
		status = true; 
	}
	
	public Product(String productNo, String productName, String productManufacturer, int productQuantity,
			double price, boolean status) {
		
		this.productNo = productNo;
		this.productName = productName;
		this.productManufacturer = productManufacturer;
		this.productQuantity = productQuantity;
		this.price = price;
		status = true;
	
		
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public double inventoryValue() {
		return price * productQuantity;
	}
	
	public static void addStock() {
		
		Scanner scanner = new Scanner(System.in);
		
		if(Product.isEmpty()) {
			
		}
	}

}
