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
 * Title: ServletOne
 * Description: ������һ������
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: SessionExampleOne
 * @author fupengpeng
 * @date 2017��7��24�� ����3:29:04
 *
 */
//@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//����Session
		HttpSession session = request.getSession();  //getSession(),����session����һ��û��sessionʱ������һ��session
		//����session��������
		session.setAttribute("uname", "fupengpeng");
		session.setAttribute("age", "566");
		//����session���������ڣ�Ĭ��30min Ҳ�������ã�
		
		User user = new User();
		user.setAccount("100111111");
		user.setBirthday("15151515");
		session.setAttribute("yonghu01", user);
		
		out.println("����session������������");
		System.out.println("����session������������");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
