package com.china-tower.china-tower_crm2.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * ҵ���������ݲ�
 * @author ������ 
 * @date 2019��7��2��
 */
public interface ChartMapper {
	
	/**
	 * ¼�뷿Դ��ѯ
	 */
	@Select("select xxx from house where salesman={#user}  and time in xx")
	public void addHouseRecoder();
	
	
	/**
	 * ��ɶ���
	 */
	@Select("select xxx from  ")
	public void ContractRecoder();
	
	/**
	 * �ͻ���ѯ���Լ��ģ�
	 */
	@Select("select xxx from  ")
	public void addCustomerRecoder();
	
	/**
	 * ������¼
	 */
	@Select("select xxx from ")
	public void seeHouseRecoder();
	
}
