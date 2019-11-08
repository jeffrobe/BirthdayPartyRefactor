package scrap.heap.refactor.service.impl;

import scrap.heap.refactor.dto.BalloonDto;
import scrap.heap.refactor.service.OrderBalloonService;

// perform all logic needed to order balloons, may include db query or REST call
public class OrderBalloonServiceImpl implements OrderBalloonService {

	@Override
	public boolean order(BalloonDto balloon) {

		// for the purposes of this exercise, pretend that this method adds a cake to
		// the order
		System.out.println("balloon ordered; " + balloon.toString());

		return true;
	}

}
