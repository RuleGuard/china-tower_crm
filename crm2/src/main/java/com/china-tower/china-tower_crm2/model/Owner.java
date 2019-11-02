package com.china-tower.china-tower_crm2.model;

/**
 * 房东类
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public class Owner {

	/**
	 * 标识
	 */
	private int id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 联系方式
	 */
	private String tel;

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
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel
	 *            the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

}
