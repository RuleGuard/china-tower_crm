package com.china-tower.china-tower_crm2.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.china-tower.china-tower_crm2.model.Users;
import com.china-tower.china-tower_crm2.service.UserService;

/**
 * 用户管理控制器
 * 
 * @author 刘光岳
 * @date 2019年7月2日
 * http://39.103.136.213/
 * liuyang@china-tower.com
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 用户登录
	 * @param name
	 * @param pwd
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginCheck(
			@RequestParam(value = "name") String name, 
			@RequestParam(value = "pwd") String pwd,
			HttpSession session,
			Model model) {
		String view = null;
		Users user = userService.loging(name, pwd);
		System.out.println("到达UserController.LoginCheck，用户：" + name);
		session.setAttribute("uname", name);
		if (user.getUlevel() == 3) {
			view = "admin";
		} else if (user.getUlevel() == 2) {
			view = "areaManager";
		} else if (user.getUlevel() == 1) {
			view = "storeManager";
		} else if (user.getUlevel() == 0) {
			view = "index";
		}
		return view;
	}

	/**
	 * 查询所有用户
	 * @param moudel
	 * @return
	 */
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public String selectAll(Model moudel) { 
		List<Users> list = userService.selectAllUsers();
		moudel.addAttribute("list", list);
		System.out.println(list.size());
		return "allUsers"; 
	}
	/**
	 * 添加用户跳转添加信息界面
	 * @param moudel
	 * @return
	 */
	@RequestMapping(value="/addUser",method = RequestMethod.GET)
	public String addUser(Model moudel){
		
		return "addUser";
		 
	}
	
	/**
	 * 添加用户
	 * @param request
	 * @param user
	 * @param moudel
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/addUs",method = RequestMethod.POST)
	public String addUs(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "pwd") String pwd,
			@RequestParam(value = "tel") String tel,
			@RequestParam(value = "idcard") String idcard,
			@RequestParam(value = "store") int store,
			@RequestParam(value = "ulevel") int ulevel,
			Users user,Model moudel) throws IOException{ 
		System.out.println(name+":"+pwd+":"+tel+":"+idcard+":"+store+":"+ulevel);
		user.setName(name);
		user.setPwd(pwd);
		user.setTel(tel);
		user.setIdcard(idcard);
		user.setStore(store);
		user.setUlevel(ulevel); 
		user.setUlevel(ulevel); 
		int row = userService.addUser(user);
		if(row>=1){
			return "redirect:/selectAll";
		}else{
			return "error";
		}
		 
	}
	
	/**
	 * 修改密码
	 * @param session
	 * @param model
	 */
	@RequestMapping(value="/modifyPwd",method=RequestMethod.POST)
	public String modifyPwd(
			@RequestParam(value = "pwd") String pwd,
			@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password){
		 
		System.out.println(name+"pwd:"+pwd+"pass:"+password);
		int row =userService.modifyPwd(pwd,name,password);
		if(row>=1){
			return "login";
		}else{
			return "error";
		}
		
	}
	
	/**
	 * 编辑用户
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/editUser/{id}",method=RequestMethod.GET)
	public String editUser(@PathVariable("id") int id,Model model){
		Users user = userService.selectById(id);
		System.out.println(id);
		System.out.println(user.getTel());
		model.addAttribute("user",user);
		return "editUser";
	}
	
	@RequestMapping(value="/editUs",method=RequestMethod.POST)
	public String editUs(HttpServletRequest request,Users user){
		user.setName(request.getParameter("name"));
		user.setTel(request.getParameter("tel"));
		user.setIdcard(request.getParameter("idcard"));
		user.setStore(Integer.parseInt(request.getParameter("store")));
		user.setState(Integer.parseInt(request.getParameter("state")));
		user.setUlevel(Integer.parseInt(request.getParameter("ulevel")));
		userService.editUser(user); 
		return "redirect:/selectAll";
		
	}
	
	
	
	
	/**
	 * 退出
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value="/exit",method=RequestMethod.GET)
	public void exitLogin(
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) throws IOException{ 
		request.getSession().invalidate();
		response.setHeader("Pragma","No-cache");    
		response.setHeader("Cache-Control","no-cache ");    
		response.setDateHeader("Expires", -10);
		response.sendRedirect("/china-tower_crm2"); 
	}
	
}
