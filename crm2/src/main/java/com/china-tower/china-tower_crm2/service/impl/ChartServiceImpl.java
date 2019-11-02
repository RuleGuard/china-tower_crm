package com.china-tower.china-tower_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.china-tower.china-tower_crm2.service.ChartService;
import com.china-tower.china-tower_crm2.mapper.ChartMapper;

/**
 * ҵ����������
 * @author ������ 
 * @date 2019��7��2��
 */
public class ChartServiceImpl  implements ChartService{
	
	@Autowired
	private ChartMapper chartMapper; 
	public void setChartMapper(ChartMapper chartMapper) {
		this.chartMapper = chartMapper;
	}
	@Override
	public void addHouseRecoder() {
		 
		chartMapper.addHouseRecoder();
	}
	@Override
	public void ContractRecoder() { 
		chartMapper.ContractRecoder();
		
	}
	@Override
	public void addCustomerRecoder() { 
		chartMapper.addCustomerRecoder();
	}
	@Override
	public void seeHouseRecoder() { 
		chartMapper.seeHouseRecoder();
		
	}
	
}
