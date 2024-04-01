package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMgmtApp {
    public static void main(String[] args) {
        Product[] products = {new Product(3128874119l, "Banana", "2023-01-24", 124, "0.55"),
                new Product(2927458265l, "Apple", "2022-12-09", 18, "1.09"),
                new Product(9189927460l, "Carrot", "2023-03-31", 89, "2.99")};

        printProducts(products);
    }

    static void printProducts(Product[] products) {
        List<Product> productList = new ArrayList<>(List.of(products));
        Collections.sort(productList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        printJSON(productList);
        System.out.println("-------");
        printXML(productList);
        System.out.println("-------");
        printCSV(productList);

    }
    private static void printJSON(List<Product> productList) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(productList);
        System.out.println("Printed in JSON Format");
        System.out.println(json);
    }

    private static void printXML(List<Product> productList) {
        System.out.println("Printed in XML Format");
        System.out.println("<Products>");
        for (Product product : productList) {
            System.out.println("  <Product>");
            System.out.println("    <productId>" + product.getProductId() + "</productId>");
            System.out.println("    <name>" + product.getName() + "</name>");
            System.out.println("    <dateSupplied>" + product.getDateSupplied() + "</dateSupplied>");
            System.out.println("    <quantityInStock>" + product.getQuantityInStock() + "</quantityInStock>");
            System.out.println("    <unitPrice>" + product.getUnitPrice() + "</unitPrice>");
            System.out.println("  </Product>");
        }
        System.out.println("</Products>");
    }

    private static void printCSV(List<Product> productList) {
        System.out.println("Printed in CSV Format");
        for (Product product : productList) {
            System.out.println(product.getProductId() + "," +
                    product.getName() + "," +
                    product.getDateSupplied() + "," +
                    product.getQuantityInStock() + "," +
                    product.getUnitPrice());
        }
    }
}
