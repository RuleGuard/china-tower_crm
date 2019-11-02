package com.china-tower.china-tower_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.china-tower.china-tower_crm2.model.Contract;
import com.china-tower.china-tower_crm2.model.Work;
import com.china-tower.china-tower_crm2.service.WorkService;
import com.china-tower.china-tower_crm2.mapper.WorkMapper;

/**
 * ���������ʵ����
 * @author ������ 
 * @date 2019��7��2��
 */
public class WorkServiceImpl  implements WorkService{
	
	@Autowired
	private WorkMapper workMapper;
 
	public void setWorkMapper(WorkMapper workMapper) {
		this.workMapper = workMapper;
	}

	@Override
	public void seeHouse(Work work) { 
		workMapper.seeHouse(work);
		
	}

	@Override
	public void addContract(Contract contract) { 
		workMapper.addContract(contract);
	}

	@Override
	public Contract selectContract() { 
		return workMapper.selectContract();
	}
	
}
