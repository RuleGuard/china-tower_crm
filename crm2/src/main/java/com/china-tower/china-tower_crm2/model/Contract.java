package com.china-tower.china-tower_crm2.model;

/**
 * 合同类
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public class Contract {

	/**
	 * 标识
	 */
	private int id;

	/**
	 * 业务员
	 */
	private Users salesman;
 
	/**
	 * 客户
	 */
	private Customer customer;

	/**
	 * 房源
	 */
	private House house;

	/**
	 * 租期
	 */
	private String longtime;

	/**
	 * 价格
	 */
	private int price;

	/**
	 * 时间
	 */
	private String time;

	/**
	 * 备注
	 */
	private String remark;// 备注

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the salesman
	 */
	public Users getSalesman() {
		return salesman;
	}

	/**
	 * @param salesman
	 *            the salesman to set
	 */
	public void setSalesman(Users salesman) {
		this.salesman = salesman;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}

	/**
	 * @param house
	 *            the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
	}

	/**
	 * @return the longtime
	 */
	public String getLongtime() {
		return longtime;
	}

	/**
	 * @param longtime
	 *            the longtime to set
	 */
	public void setLongtime(String longtime) {
		this.longtime = longtime;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *           the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
