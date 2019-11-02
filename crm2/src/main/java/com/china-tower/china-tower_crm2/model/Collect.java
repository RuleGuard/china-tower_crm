package com.china-tower.china-tower_crm2.model;

/**
 * 收藏类
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public class Collect {

	/**
	 * 标识id
	 */
	private int id;

	/**
	 * 业务员
	 */
	private Users salesman;

	/**
	 * 房源
	 */
	private House house;

	/**
	 * 时间
	 */
	private String time;

	/**
	 * 状态
	 */
	private int state;

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

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

}
