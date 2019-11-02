package com.china-tower.china-tower_crm2.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Insert; 
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.china-tower.china-tower_crm2.model.Users;

/**
 * �û����ݲ�
 * 
 * @author ������
 * @date 2019��7��2��
 * http://39.103.136.213/
 * liuyang@china-tower.com
 */
public interface UserMapper {

	/**
	 * �û���¼
	 * 
	 * @param name
	 *            �û���
	 * @param pwd
	 *            �û�����
	 * @return �û���Ϣ
	 */
	@Select("select * from users where name=#{name} and pwd=#{pwd}")
	public Users loging(@Param("name") String name, @Param("pwd") String pwd);

	/**
	 * ��ѯ�����û�
	 */
	@Select("select * from users")
	public List<Users> selectAllUsers();
	
	/**
	 * ����û�
	 * 
	 * @param Ҫ��ӵ��û�
	 */ 
	@Insert("insert into users values(id,#{user.name},#{user.pwd},#{user.tel},#{user.idcard},#{user.store},state,#{user.ulevel})")
	public int addUser(@Param("user") Users user);

	/**
	 * �༭�û�
	 * 
	 * @param users
	 *            Ҫ�༭���û�
	 */
	@Update("update users set tel=#{user.tel},idcard=#{user.idcard},"
	+ "store=#{user.store},state=#{user.state},ulevel=#{user.ulevel} where name=#{user.name}")
	public void editUser(Users user);

	/**
	 * �޸�����
	 * 
	 * @param users
	 *            �޸ĵ��û�
	 */
	@Update("update users set pwd=#{pwd} where name=#{name} and pwd=#{password}")
	public int modifyPwd(@Param("pwd")String pwd,@Param("name") String name,@Param("password")String password);
	 
	/**
	 * ͨ��id��ѯ�û���Ϣ
	 * @param id
	 * @return
	 */
	@Select("select * from users where id=#{id}")
	public Users selectById(@Param("id")int id);
	
}
