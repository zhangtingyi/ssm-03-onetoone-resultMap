package com.mybatis.entity;

import java.util.Date;

public class Orders {
	private int id;
	private int c_id;
	private int number;
	private Date createtime;
	private String note;
	private Customer customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", c_id=" + c_id + ", number=" + number + ", createtime=" + createtime + ", note="
				+ note + ", customer=" + customer + "]";
	}
	
}
