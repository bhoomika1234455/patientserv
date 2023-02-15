package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Demo;
@WebServlet("/update")
public class update extends HttpServlet {
	
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	
		String s1=req.getParameter("pid");
		int id=Integer.parseInt(s1);
		
		
		
		String  s3=req.getParameter("phno");
		Long s4=Long.parseLong(s3);
		Demo d1=new Demo();
	    // d1.update(id,s4);
	     
//	
}
}