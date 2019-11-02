package com.china-tower.china-tower_crm2.model;

/**
 * 店铺类
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public class Store {

	/**
	 * 标识
	 */
	private int id;

	/**
	 * 店铺名称
	 */
	private String name;

	/**
	 * 所在区域
	 */
	private Area area;

	/**
	 * 所在街道
	 */
	private String street;

	/**
	 * 店长
	 */
	private Users manager;

	/**
	 * 详细地址
	 */
	private String address;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the area
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(Area area) {
		this.area = area;
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
	 * @return the manager
	 */
	public Users getManager() {
		return manager;
	}

	/**
	 * @param manager
	 *            the manager to set
	 */
	public void setManager(Users manager) {
		this.manager = manager;
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

}
