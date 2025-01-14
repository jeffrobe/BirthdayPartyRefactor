/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package scrap.heap.refactor;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import scrap.heap.refactor.dto.BalloonDto;
import scrap.heap.refactor.dto.CakeDto;
import scrap.heap.refactor.service.OrderBalloonService;
import scrap.heap.refactor.service.OrderCakeService;
import scrap.heap.refactor.service.impl.OrderBalloonServiceImpl;
import scrap.heap.refactor.service.impl.OrderCakeServiceImpl;

public class ServiceTest {
	@Test
	public void testBalloonService() {
		OrderBalloonService balloonService = new OrderBalloonServiceImpl();
		BalloonDto balloon = BalloonDto.builder().color("blue").material("latex").number("7").build();

		assertTrue(balloonService.order(balloon));
	}

	@Test
	public void testCakeService() {
		OrderCakeService cakeService = new OrderCakeServiceImpl();
		CakeDto cake = CakeDto.builder().flavor("chocolate").frostingFlavor("chocolate").shape("circle").size("large")
				.color("brown").build();

		assertTrue(cakeService.order(cake));
	}
}
