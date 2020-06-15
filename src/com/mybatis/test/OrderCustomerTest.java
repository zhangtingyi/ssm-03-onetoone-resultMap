package com.mybatis.test;

import java.util.List;

import org.junit.Test;

import com.mybatis.dao.OrdersCustomerDao;
import com.mybatis.dao.impl.OrdersCustomerDaoImpl;
import com.mybatis.entity.Orders;

public class OrderCustomerTest {
	
	@Test
	public void test() throws Exception {
		OrdersCustomerDao ordersdao = new OrdersCustomerDaoImpl();
		List<Orders> list = ordersdao.findOrderList();
		System.out.println(list);
	}
}

