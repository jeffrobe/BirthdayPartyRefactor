package scrap.heap.refactor.manager;

import scrap.heap.refactor.dto.OrderDto;
import scrap.heap.refactor.service.OrderBalloonService;
import scrap.heap.refactor.service.OrderCakeService;
import scrap.heap.refactor.service.impl.OrderBalloonServiceImpl;
import scrap.heap.refactor.service.impl.OrderCakeServiceImpl;

// place the order, add failure/retry logic
public class OrderManager {
	private final OrderCakeService cakeService = new OrderCakeServiceImpl();
	private final OrderBalloonService balloonService = new OrderBalloonServiceImpl();

	public boolean order(OrderDto order) {
		boolean status = true;

		boolean balloonStatus = balloonService.order(order.getBalloon());
		boolean cakeStatus = cakeService.order(order.getCake());

		// add logic based on success/failure, rollback if needed
		if (!balloonStatus || !cakeStatus)
			status = false;
		return status;
	}

}
