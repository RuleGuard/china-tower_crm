package com.china-tower.china-tower_crm2.service; 

import com.china-tower.china-tower_crm2.model.House;

/**
 * 房源管理服务层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface HouseService {

	/**
	 * 录入房源
	 * @param house
	 */
	public void addHouse(House house);
	
	/**
	 * 编辑房源
	 * @param house
	 */ 
	public void editHouse(House house);
	
	/**
	 * 查询所有房源
	 */ 
	public void selectAllHouse();
	
	/**
	 * 查询指定房源
	 */
	public void selectByXX();
	
	/**
	 * 收藏房源
	 */
	public void collectHouse();
	
}
