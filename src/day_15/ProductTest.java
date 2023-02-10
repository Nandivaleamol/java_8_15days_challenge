package day_15;

//Problem Statement 05:-
// 1. Get the list of  all the products that belongs to "Books" category and product price > 200 using java 8 Features.
// 2. Get the cheapest product of "Phone" category using java 8 features.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductTest {
    public static void main(String[] args) {

        Product p1 = new Product(101, "JAVA", "Books", 200);
        Product p2 = new Product(102, "SPRING", "Books", 250);
        Product p3 = new Product(103, "HTML", "Books",100 );
        Product p4 = new Product(104, "PYTHON", "Books", 300);
        Product p5 = new Product(105, "NOKIA", "Phone", 15000);
        Product p6 = new Product(106, "SAMSUNG", "Phone", 2000);
        Product p7 = new Product(107, "SERVLET JSP", "Books", 150);
        Product p8 = new Product(108, "HP","Laptop",50000);
        Product p9 = new Product(109, "Redmi","Phone",10000);

        List<Product> products = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);

        System.out.println("List of  all the products that belongs to \"Books\" category and product price > 200");

        List<Product> productList = products.stream()
                .filter(p -> p.getProductCategory().equalsIgnoreCase("Books")
                        && p.getPrice() > 200)
                .collect(Collectors.toList());
        System.out.println(productList);

        // cheapest phone
        System.out.println("*****The cheapest product of \"Phone\" category*****");
        Product cheapestPhone = products.stream().filter(p -> p.getProductCategory().equalsIgnoreCase("Phone"))
                .min((m1, m2) -> (int) (m1.getPrice() - m2.getPrice())).get();

        System.out.println(cheapestPhone);

    }
}
