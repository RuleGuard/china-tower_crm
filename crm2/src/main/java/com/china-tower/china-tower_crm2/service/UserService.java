package com.china-tower.china-tower_crm2.service;

 

import java.util.List; 

import com.china-tower.china-tower_crm2.model.Users;

/**
 * �û�����ӿ�
 * 
 * @author ������
 * @date 2019��7��2��
 */
public interface UserService {
	
	/**
	 * �û���¼
	 * 
	 * @param name
	 *            �û���
	 * @param pwd
	 *            �û�����
	 * @return �û���Ϣ
	 */
	public Users loging( String name, String pwd);

	/**
	 * ��ѯ�����û�
	 */
	public List<Users> selectAllUsers();
	/**
	 * ����û�
	 * 
	 * @param Ҫ��ӵ��û�
	 */
	public int addUser(Users user);

	/**
	 * �༭�û�
	 * 
	 * @param users
	 *            Ҫ�༭���û�
	 */
	public void editUser(Users user);
	
	/**
	 * ͨ��id��ѯ�û���Ϣ
	 * @param id
	 * @return
	 */
	public Users selectById(int id);

	/**
	 * �޸�����
	 * 
	 * @param users
	 *            �޸ĵ��û�
	 */
	public int modifyPwd(String pwd,String name,String password);
}
