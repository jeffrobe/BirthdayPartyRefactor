package scrap.heap.refactor.service.impl;

import scrap.heap.refactor.dto.CakeDto;
import scrap.heap.refactor.service.OrderCakeService;

//perform all logic needed to order cake, may include db query or REST call
public class OrderCakeServiceImpl implements OrderCakeService {

	@Override
	public boolean order(CakeDto cake) {

		// for the purposes of this exercise, pretend that this method adds a cake to
		// the order
		System.out.println("cake ordered; " + cake.toString());

		return true;
	}

}
