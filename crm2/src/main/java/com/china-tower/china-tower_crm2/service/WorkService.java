package com.china-tower.china-tower_crm2.service;

 

import com.china-tower.china-tower_crm2.model.Contract;
import com.china-tower.china-tower_crm2.model.Work;

/**
 * ���������
 * @author ������ 
 * @date 2019��7��2��
 */
public interface WorkService {

	 /**
	  * ����
	  * @param work
	  */ 
	public void seeHouse(Work work);
	
	/**
	 * ¼�붩��
	 * @param contract
	 */ 
	public void addContract(Contract contract);
	
	/**
	 * ������ѯ
	 * @return
	 */ 
	public Contract selectContract();
}
