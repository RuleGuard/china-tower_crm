package com.china-tower.china-tower_crm2.service; 

import com.china-tower.china-tower_crm2.model.House;

/**
 * ��Դ��������
 * @author ������ 
 * @date 2019��7��2��
 */
public interface HouseService {

	/**
	 * ¼�뷿Դ
	 * @param house
	 */
	public void addHouse(House house);
	
	/**
	 * �༭��Դ
	 * @param house
	 */ 
	public void editHouse(House house);
	
	/**
	 * ��ѯ���з�Դ
	 */ 
	public void selectAllHouse();
	
	/**
	 * ��ѯָ����Դ
	 */
	public void selectByXX();
	
	/**
	 * �ղط�Դ
	 */
	public void collectHouse();
	
}
