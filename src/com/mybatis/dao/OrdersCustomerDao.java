package com.mybatis.dao;

import java.util.List;

import com.mybatis.entity.Orders;

public interface OrdersCustomerDao {
	
	public List<Orders> findOrderList();
	
}
