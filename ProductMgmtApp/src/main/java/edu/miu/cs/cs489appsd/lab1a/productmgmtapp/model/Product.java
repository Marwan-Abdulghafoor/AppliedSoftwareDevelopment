package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

public class Product {
    private long productId;
    private String name;
    private String dateSupplied;
    private int quantityInStock;
    private String unitPrice;

    public Product() {
    }

    public Product(long productId, String name, String dateSupplied, int quantityInStock, String unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Product(long productId, String name, String dateSupplied) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(String dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", dateSupplied='" + dateSupplied + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", unitPrice='" + unitPrice + '\'' +
                '}';
    }
}
