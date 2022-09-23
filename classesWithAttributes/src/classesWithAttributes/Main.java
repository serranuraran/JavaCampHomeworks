package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product1 = new Product(1, "Laptop", "Asus Laptop", 15000, 10, "Siyah");

		Product product = new Product();
		product.setId(2);
		product.setName("Mouse");
		product.setDescription("Asus Mouse");
		product.setPrice(150);
		product.setStockAmount(100);
		product.setRenk("Siyah");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());

	}
}