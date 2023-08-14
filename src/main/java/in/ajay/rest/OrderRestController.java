package in.ajay.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ajay.binding.Order;
import in.ajay.service.OrderService;

@RestController
public class OrderRestController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/order")
	public String createOrder(@RequestBody Order order) {
		String msg = orderService.addMsg(order);
		return msg;
	}
}
