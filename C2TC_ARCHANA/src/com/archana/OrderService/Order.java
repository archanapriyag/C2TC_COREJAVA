package com.archana.OrderService;
import jakarta.persistence.*;
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    
    @Column(name = "customer_name")
    private String customerName;
    
    @ElementCollection
    @Column(name = "product_name")
    private List<String> products;
    
    @Column(name = "total_amount")
    private double totalAmount;
    
    public Order() {}
    
    public Order(int orderId, String customerName, List<String> products, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.products = products;
        this.totalAmount = totalAmount;
    }
    
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    
    public List<String> getProducts() { return products; }
    public void setProducts(List<String> products) { this.products = products; }
    
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customerName=" + customerName + ", products=" + products + ", totalAmount=" + totalAmount + "]";
    }
}



