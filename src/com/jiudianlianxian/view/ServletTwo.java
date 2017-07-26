package com.jiudianlianxian.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jiudianlianxian.domain.User;

/**
 * 
 * Title: ServletTwo
 * Description: 给此类一个描述
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: SessionExampleOne
 * @author fupengpeng
 * @date 2017年7月24日 下午4:22:44
 *
 */
//@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//访问Session
		HttpSession session = request.getSession();  //getSession(),访问session，第一次没有session时，创建一个session
//		//给该session设置属性
//		session.setAttribute("uname", "fupengpeng");
		//设置session的生命周期（默认30min 也可以设置）
		
		//获取
		String uname = (String) session.getAttribute("uname");
		System.out.println("session--uname = "+uname);
		
		User user = (User) session.getAttribute("yonghu01");
		out.println("yonghu01的信息时是："+user.getAccount()+"    "+user.getBirthday());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
