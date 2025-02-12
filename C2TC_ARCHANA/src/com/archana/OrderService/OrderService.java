package com.archana.OrderService;
public class OrderService {
private List<Order> orders = new ArrayList<>();
    
    public List<Order> getOrders() { return orders; }
    
    public void placeOrder(Order order) {
        orders.add(order);
    }

}
