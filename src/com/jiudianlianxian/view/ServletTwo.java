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
 * Description: ������һ������
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: SessionExampleOne
 * @author fupengpeng
 * @date 2017��7��24�� ����4:22:44
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
		
		//����Session
		HttpSession session = request.getSession();  //getSession(),����session����һ��û��sessionʱ������һ��session
//		//����session��������
//		session.setAttribute("uname", "fupengpeng");
		//����session���������ڣ�Ĭ��30min Ҳ�������ã�
		
		//��ȡ
		String uname = (String) session.getAttribute("uname");
		System.out.println("session--uname = "+uname);
		
		User user = (User) session.getAttribute("yonghu01");
		out.println("yonghu01����Ϣʱ�ǣ�"+user.getAccount()+"    "+user.getBirthday());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
