package com.china-tower.china-tower_crm2.model;

/**
 * 房源类
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public class House {

	/**
	 * 标识
	 */
	private int id;

	/**
	 * 房东
	 */
	private Owner owner;

	/**
	 * 业务员
	 */
	private Users salesman;

	/**
	 * 所属店铺
	 */
	private Store store;

	/**
	 * 所在街道
	 */
	private String street;

	/**
	 * 所在小区
	 */
	private String community;

	/**
	 * 详细地址
	 */
	private String address;

	/**
	 * 户型
	 */
	private int type;

	/**
	 * 面积
	 */
	private String hsize;

	/**
	 * 装修
	 */
	private String decoration;

	/**
	 * 价格
	 */
	private int price;

	/**
	 * 设施
	 */
	private String facility;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 房源状态
	 */
	private String state;

	/**
	 * 录入时间
	 */
	private String time;

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
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
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
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}

	/**
	 * @param store
	 *            the store to set
	 */
	public void setStore(Store store) {
		this.store = store;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the community
	 */
	public String getCommunity() {
		return community;
	}

	/**
	 * @param community
	 *            the community to set
	 */
	public void setCommunity(String community) {
		this.community = community;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the hsize
	 */
	public String getHsize() {
		return hsize;
	}

	/**
	 * @param hsize
	 *            the hsize to set
	 */
	public void setHsize(String hsize) {
		this.hsize = hsize;
	}

	/**
	 * @return the decoration
	 */
	public String getDecoration() {
		return decoration;
	}

	/**
	 * @param decoration
	 *            the decoration to set
	 */
	public void setDecoration(String decoration) {
		this.decoration = decoration;
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
	 * @return the facility
	 */
	public String getFacility() {
		return facility;
	}

	/**
	 * @param facility
	 *            the facility to set
	 */
	public void setFacility(String facility) {
		this.facility = facility;
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

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

}
