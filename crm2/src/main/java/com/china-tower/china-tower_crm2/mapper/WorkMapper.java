package com.china-tower.china-tower_crm2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.china-tower.china-tower_crm2.model.Contract;
import com.china-tower.china-tower_crm2.model.Work;

/**
 * �������ݲ�
 * @author ������ 
 * @date 2019��7��2��
 */
public interface WorkMapper {
	
	 /**
	  * ����
	  * @param work
	  */
	@Insert("insert into work values()")
	public void seeHouse(Work work);
	
	/**
	 * ¼�붩��
	 * @param contract
	 */
	@Insert("insert into contract values()")
	public void addContract(Contract contract);
	
	/**
	 * ������ѯ
	 * @return
	 */
	@Select("select * from Contract")
	public Contract selectContract();
}
