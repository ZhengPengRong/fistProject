package cn.itheima.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.itheima.pojo.User;
import cn.itheima.service.UserService;
import cn.itheima.vo.EchartData;
import cn.itheima.vo.Series;
import com.google.gson.Gson;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findUserByid")
	public User findUserById(int id) {
		User findUserById = userService.findUserById(id);
		return findUserById;
	}

	@RequestMapping("/findUserByName")
	public User findUserByUserName(String name) {
		User findUserById = userService.findUserByUserName(name);
		return findUserById;
	}

	@RequestMapping("/addUser")
	public void insertUser(User user) {
		userService.insertUser(user);
	}
	
	
	@RequestMapping(value="/detail", produces="text/html;charset=utf-8")
	@ResponseBody
	public String detail(Long id) throws Exception{
		User customer = new User();
		Gson gson = new Gson();
		gson.toJson(customer);
		String s="{\"result\":\"success\",\"msg\":\"成功\"}";
		return s;
	}
	
	@RequestMapping("/userList")
	public ModelAndView userList(){
		ModelAndView modelAndView = new ModelAndView();	
		ArrayList<User> findUserList = userService.findUserList();
		modelAndView.addObject("userList", findUserList);
		modelAndView.setViewName("userList");
		return modelAndView;
	}
	@RequestMapping("/monitor")
	public ModelAndView monitor(){
		ModelAndView modelAndView = new ModelAndView();		
		modelAndView.setViewName("monitor");
		return modelAndView;
	}
	
}
