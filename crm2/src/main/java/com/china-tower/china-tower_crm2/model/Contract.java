package com.china-tower.china-tower_crm2.model;

/**
 * ��ͬ��
 * 
 * @author ������
 * @date 2019��7��2��
 */
public class Contract {

	/**
	 * ��ʶ
	 */
	private int id;

	/**
	 * ҵ��Ա
	 */
	private Users salesman;
 
	/**
	 * �ͻ�
	 */
	private Customer customer;

	/**
	 * ��Դ
	 */
	private House house;

	/**
	 * ����
	 */
	private String longtime;

	/**
	 * �۸�
	 */
	private int price;

	/**
	 * ʱ��
	 */
	private String time;

	/**
	 * ��ע
	 */
	private String remark;// ��ע

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
