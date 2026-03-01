class Product {
    private String productName;
    private double price;
void setProduct(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
double getPrice() {
        return price;
    }
String getProductName() {
        return productName;
    }
double calculateDiscount() {
        return 0;
    }
}
class Electronics extends Product {
    double calculateDiscount() {
        return getPrice() * 0.10;
    }
}
class Clothing extends Product {
    double calculateDiscount() {
        return getPrice() * 0.20;
    }
}
public class Store {
    public static void main(String[] args) {
        Electronics e = new Electronics();
        e.setProduct("Laptop", 50000);
     Clothing c = new Clothing();
        c.setProduct("Shirt", 2000);
     System.out.println("Electronics Discount: " + e.calculateDiscount());
        System.out.println("Clothing Discount: " + c.calculateDiscount());
    }
}