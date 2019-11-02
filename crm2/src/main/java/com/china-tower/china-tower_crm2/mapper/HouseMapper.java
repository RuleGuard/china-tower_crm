package com.china-tower.china-tower_crm2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.china-tower.china-tower_crm2.model.House;

/**
 * ��Դ�������ݲ�
 * @author ������ 
 * @date 2019��7��2��
 */
public interface HouseMapper {
	
	/**
	 * ¼�뷿Դ
	 * @param house
	 */
	@Insert("insert  into ")
	public void addHouse(House house);
	
	/**
	 * �༭��Դ
	 * @param house
	 */
	@Update("")
	public void editHouse(House house);
	
	/**
	 * ��ѯ���з�Դ
	 */
	@Select("select * from house")
	public void selectAllHouse();
	
	/**
	 * ��ѯָ����Դ
	 */
	public void selectByXX();
	
	
	@Insert("insert into collect values(xxx.nextval,{user.name},{house.id,{#time},{house.state})")
	public void collectHouse();
	
	
	
	
	
	
	
}
