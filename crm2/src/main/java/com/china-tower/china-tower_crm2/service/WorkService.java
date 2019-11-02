package com.china-tower.china-tower_crm2.service;

 

import com.china-tower.china-tower_crm2.model.Contract;
import com.china-tower.china-tower_crm2.model.Work;

/**
 * 工作服务层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface WorkService {

	 /**
	  * 看房
	  * @param work
	  */ 
	public void seeHouse(Work work);
	
	/**
	 * 录入订单
	 * @param contract
	 */ 
	public void addContract(Contract contract);
	
	/**
	 * 订单查询
	 * @return
	 */ 
	public Contract selectContract();
}
