package com.china-tower.china-tower_crm2.service;

 

import java.util.List; 

import com.china-tower.china-tower_crm2.model.Users;

/**
 * 用户服务接口
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 */
public interface UserService {
	
	/**
	 * 用户登录
	 * 
	 * @param name
	 *            用户名
	 * @param pwd
	 *            用户密码
	 * @return 用户信息
	 */
	public Users loging( String name, String pwd);

	/**
	 * 查询所有用户
	 */
	public List<Users> selectAllUsers();
	/**
	 * 添加用户
	 * 
	 * @param 要添加的用户
	 */
	public int addUser(Users user);

	/**
	 * 编辑用户
	 * 
	 * @param users
	 *            要编辑的用户
	 */
	public void editUser(Users user);
	
	/**
	 * 通过id查询用户信息
	 * @param id
	 * @return
	 */
	public Users selectById(int id);

	/**
	 * 修改密码
	 * 
	 * @param users
	 *            修改的用户
	 */
	public int modifyPwd(String pwd,String name,String password);
}
