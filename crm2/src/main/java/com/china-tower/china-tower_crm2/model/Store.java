package com.china-tower.china-tower_crm2.model;

/**
 * ������
 * 
 * @author ������
 * @date 2019��7��2��
 */
public class Store {

	/**
	 * ��ʶ
	 */
	private int id;

	/**
	 * ��������
	 */
	private String name;

	/**
	 * ��������
	 */
	private Area area;

	/**
	 * ���ڽֵ�
	 */
	private String street;

	/**
	 * �곤
	 */
	private Users manager;

	/**
	 * ��ϸ��ַ
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
