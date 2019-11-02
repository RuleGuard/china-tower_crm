package com.china-tower.china-tower_crm2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.china-tower.china-tower_crm2.model.House;

/**
 * 房源管理数据层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface HouseMapper {
	
	/**
	 * 录入房源
	 * @param house
	 */
	@Insert("insert  into ")
	public void addHouse(House house);
	
	/**
	 * 编辑房源
	 * @param house
	 */
	@Update("")
	public void editHouse(House house);
	
	/**
	 * 查询所有房源
	 */
	@Select("select * from house")
	public void selectAllHouse();
	
	/**
	 * 查询指定房源
	 */
	public void selectByXX();
	
	
	@Insert("insert into collect values(xxx.nextval,{user.name},{house.id,{#time},{house.state})")
	public void collectHouse();
	
	
	
	
	
	
	
}
