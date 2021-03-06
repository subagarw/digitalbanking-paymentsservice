package com.capg.paymentservices.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.paymentservices.dao.PaymentDao;
import com.capg.paymentservices.model.Biller;
import com.capg.paymentservices.model.Customer;
import com.capg.paymentservices.service.PaymentService;

@Component
@Service
public class PaymentServiceImpl implements PaymentService {

	static Logger logger = Logger.getLogger(PaymentServiceImpl.class);
	
	@Autowired
	PaymentDao paymentdao;
	

	public List<Biller> getBillers(Customer customer) {
		return paymentdao.findByCustomer(customer);
	}

}
