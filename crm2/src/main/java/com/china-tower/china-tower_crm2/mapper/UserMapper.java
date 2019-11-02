package com.china-tower.china-tower_crm2.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Insert; 
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.china-tower.china-tower_crm2.model.Users;

/**
 * 用户数据层
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 * http://39.103.136.213/
 * liuyang@china-tower.com
 */
public interface UserMapper {

	/**
	 * 用户登录
	 * 
	 * @param name
	 *            用户名
	 * @param pwd
	 *            用户密码
	 * @return 用户信息
	 */
	@Select("select * from users where name=#{name} and pwd=#{pwd}")
	public Users loging(@Param("name") String name, @Param("pwd") String pwd);

	/**
	 * 查询所有用户
	 */
	@Select("select * from users")
	public List<Users> selectAllUsers();
	
	/**
	 * 添加用户
	 * 
	 * @param 要添加的用户
	 */ 
	@Insert("insert into users values(id,#{user.name},#{user.pwd},#{user.tel},#{user.idcard},#{user.store},state,#{user.ulevel})")
	public int addUser(@Param("user") Users user);

	/**
	 * 编辑用户
	 * 
	 * @param users
	 *            要编辑的用户
	 */
	@Update("update users set tel=#{user.tel},idcard=#{user.idcard},"
	+ "store=#{user.store},state=#{user.state},ulevel=#{user.ulevel} where name=#{user.name}")
	public void editUser(Users user);

	/**
	 * 修改密码
	 * 
	 * @param users
	 *            修改的用户
	 */
	@Update("update users set pwd=#{pwd} where name=#{name} and pwd=#{password}")
	public int modifyPwd(@Param("pwd")String pwd,@Param("name") String name,@Param("password")String password);
	 
	/**
	 * 通过id查询用户信息
	 * @param id
	 * @return
	 */
	@Select("select * from users where id=#{id}")
	public Users selectById(@Param("id")int id);
	
}
