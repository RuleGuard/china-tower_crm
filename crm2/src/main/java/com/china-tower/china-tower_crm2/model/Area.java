package com.china-tower.china-tower_crm2.model;

/**
 * 区域实体类
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public class Area {

	/**
	 * 标识 id
	 */
	private int id;

	/**
	 * 区域名
	 */
	private String name;

	/**
	 * 区域经理
	 */
	private Users manager;

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

}
