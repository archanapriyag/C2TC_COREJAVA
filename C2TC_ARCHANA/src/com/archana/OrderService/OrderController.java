package com.archana.OrderService;

public class OrderController {
	@Autowired
    private OrderService orderService;
    
    @GetMapping
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
    
    @PostMapping("/place")
    public String placeOrder(@RequestBody Order order) {
        orderService.placeOrder(order);
        return "Order placed successfully";
}
}
