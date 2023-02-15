package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Demo;
@WebServlet("/fet")
public class fetch1  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	
		String s1=req.getParameter("pid");
		int id=Integer.parseInt(s1);
      String  s2=req.getParameter("PBG");
		
		String  s3=req.getParameter("phno");
		Long s4=Long.parseLong(s3);
		
		Demo d3=new Demo();
		d3.fetch(id);
		 
//		resp.getWriter().print(id);
//		resp.getWriter().print("PBG");
//		resp.getWriter().print("phno");
		
		
		
		
	}
	
}
