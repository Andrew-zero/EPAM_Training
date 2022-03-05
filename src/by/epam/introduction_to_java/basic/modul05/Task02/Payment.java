package by.epam.introduction_to_java.basic.modul05.Task02;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//        нескольких товаров.
public class Payment {

    private List<Product> productsList = new ArrayList<>();

    public Payment(){
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }


    public static class Product {

        private String title;
        private double price;

        public Product(String title, double price) {
            this.title = title;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 && Objects.equals(title, product.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, price);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "title='" + title + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(productsList, payment.productsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsList);
    }

    @Override
    public String toString() {
        return "Payment{" +
                ", productsList=" + productsList +
                '}';
    }
}
