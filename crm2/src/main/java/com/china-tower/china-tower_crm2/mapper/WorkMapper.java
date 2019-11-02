package com.china-tower.china-tower_crm2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.china-tower.china-tower_crm2.model.Contract;
import com.china-tower.china-tower_crm2.model.Work;

/**
 * 工作数据层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface WorkMapper {
	
	 /**
	  * 看房
	  * @param work
	  */
	@Insert("insert into work values()")
	public void seeHouse(Work work);
	
	/**
	 * 录入订单
	 * @param contract
	 */
	@Insert("insert into contract values()")
	public void addContract(Contract contract);
	
	/**
	 * 订单查询
	 * @return
	 */
	@Select("select * from Contract")
	public Contract selectContract();
}
