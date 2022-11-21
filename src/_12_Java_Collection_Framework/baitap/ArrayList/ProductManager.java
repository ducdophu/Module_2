package _12_Java_Collection_Framework.baitap.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static List<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        products.add(new Product(1, "Eraser", 8.9));
        products.add(new Product(2, "Book", 9.6));
        products.add(new Product(3, "Pencil", 5.7));
        products.add(new Product(4, "Book", 7.9));
//        productManager.addProduct();
        productManager.updateProduct();
//        productManager.deleteProduct();
//        productManager.searchProductByName();
        //       productManager.sortByPrice();
    }

    void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("-------------");
    }

    public void addProduct() {
        int id = 0;
        try {
            System.out.print("Enter an ID of new product: ");
            id = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {

        }
        System.out.print("Enter a name of new product: ");
        String name = sc.nextLine();

        System.out.print("Enter a price of new product: ");
        double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(id, name, price);
        products.add(product);
    }

    public void updateProduct() {
        System.out.println("Enter an ID of product you want to update: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                check = true;
                System.out.println("Enter a new name of the product:");
                String name = sc.nextLine();
                products.get(i).setName(name);

                System.out.println("Enter a new price of the product:");
                double price = Double.parseDouble(sc.nextLine());
                products.get(i).setPrice(price);
                break;
            }
        }

        if (!check) {
            System.out.println("Invalid index, please try again!");
        }
    }

    public void deleteProduct() {
        System.out.println("Enter an ID of product you want to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean check = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                check = true;
                products.remove(i);
                break;
            }
        }

        if (!check) {
            System.out.println("Invalid index, please try again!");
        }
    }

    public void searchProductByName() {
        System.out.println("Enter a product's name you want to search: ");
        String name = sc.nextLine();
        boolean check = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                check = true;
                System.out.println(products.get(i));
                break;
            }
        }

        if (check == false) {
            System.out.println("Invalid name, please try again!");
        }
        System.out.println("-------------");
    }

    public void sortByPrice() {
        System.out.println("----- Sort product by cost -----");
        Collections.sort(products);
        displayProducts();

        products.sort(Collections.reverseOrder());
        displayProducts();
    }
}