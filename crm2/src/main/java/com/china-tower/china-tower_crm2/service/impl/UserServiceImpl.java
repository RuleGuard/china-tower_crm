package com.china-tower.china-tower_crm2.service.impl;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china-tower.china-tower_crm2.model.Users;
import com.china-tower.china-tower_crm2.service.UserService;
import com.china-tower.china-tower_crm2.mapper.UserMapper;

/**
 * �û�����ӿ�ʵ����
 * 
 * @author ������
 * @date 2019��7��2��
 * http://39.103.136.213/
 * liuyang@china-tower.com
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	/**
	 * �����û����ݲ�
	 */
	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public Users loging(String name, String pwd) {
		
		return userMapper.loging(name, pwd);
	}

	@Override
	public int addUser(Users user) {  
		return userMapper.addUser(user);
	}

	@Override
	public void editUser(Users user) {
		userMapper.editUser(user);
	}

	@Override
	public int modifyPwd(String pwd,String name,String password) {
		return userMapper.modifyPwd(pwd,name,password);
	}

	@Override
	public List<Users> selectAllUsers() {
		return userMapper.selectAllUsers();
		
	}
	
	@Override
	public Users selectById(int id){
		return userMapper.selectById(id);
		
	}

}
