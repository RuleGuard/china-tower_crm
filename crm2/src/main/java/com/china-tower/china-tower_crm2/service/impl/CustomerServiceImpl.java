package com.china-tower.china-tower_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.china-tower.china-tower_crm2.model.Customer;
import com.china-tower.china-tower_crm2.mapper.CustomerMapper;

/**
 * 客户管理服务层实现类
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public class CustomerServiceImpl implements CustomerMapper {

	@Autowired
	private CustomerMapper customerMapper;

	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerMapper.addCustomer(customer);

	}

	@Override
	public void editCustomer(Customer customer) {
		customerMapper.editCustomer(customer);

	}

	@Override
	public void blackList() {
		customerMapper.blackList();

	}

}
