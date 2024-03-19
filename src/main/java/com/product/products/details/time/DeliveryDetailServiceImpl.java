package com.product.products.details.time;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DeliveryDetailServiceImpl implements DeliveryDetailService {

	@Autowired
	DeliveryDetailDao dao;

	@Override
	public DeliveryDetails addDeliveryDetails(DeliveryDetails deliveryDetails) {
		return dao.save(deliveryDetails);
	}

}
