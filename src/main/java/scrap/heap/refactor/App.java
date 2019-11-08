package scrap.heap.refactor;

import scrap.heap.refactor.dto.BalloonDto;
import scrap.heap.refactor.dto.CakeDto;
import scrap.heap.refactor.dto.OrderDto;
import scrap.heap.refactor.manager.OrderManager;

public class App {
	public String getGreeting() {
		return "Hello world.";
	}

	// Load data into data transfer objects, send data ot order service and output
	// status. In real world data may come as a json object, if so do json to java
	// object conversion.
	// create order manager to perform order logic.
	// create services to order cake and to order balloons
	public static void main(String[] args) {
		OrderManager orderManager = new OrderManager();

		// Place birthday party orders

		// order 1 - use builder pattern
		BalloonDto balloon1 = BalloonDto.builder().color("red").material("mylar").number("4").build();
		CakeDto cake1 = CakeDto.builder().flavor("chocolate").frostingFlavor("chocolate").shape("circle").size("large")
				.color("brown").build();
		OrderDto order1 = OrderDto.builder().cake(cake1).balloon(balloon1).build();

		System.out.println("order results no. 1 status: " + orderManager.order(order1));

		// order 2
		BalloonDto balloon2 = BalloonDto.builder().color("blue").material("latex").number("7").build();
		CakeDto cake2 = CakeDto.builder().flavor("Vanilla").frostingFlavor("chocolate").shape("square").size("med")
				.color("brown").build();
		OrderDto order2 = OrderDto.builder().cake(cake2).balloon(balloon2).build();

		System.out.println("order results no. 2 status: " + orderManager.order(order2));

		// order 3
		BalloonDto balloon3 = BalloonDto.builder().color("yellow").material("mylar").number("4").build();
		CakeDto cake3 = CakeDto.builder().flavor("Vanilla").frostingFlavor("vanilla").shape("square").size("small")
				.color("yellow").build();
		OrderDto order3 = OrderDto.builder().cake(cake3).balloon(balloon3).build();

		System.out.println("order results no. 3 status: " + orderManager.order(order3));

	}

}
