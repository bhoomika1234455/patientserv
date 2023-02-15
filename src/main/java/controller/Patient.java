package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Demo;
import dto.Cool;
@WebServlet("/a16")
public class Patient extends HttpServlet {

	
////	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s1=req.getParameter("pid");
		int id=Integer.parseInt(s1);
		
		String  s2=req.getParameter("PBG");
		
		String  s3=req.getParameter("phno");
		Long s4=Long.parseLong(s3);
		
	
		Cool c1=new Cool();
		c1.setPid(id);
		c1.setPBG(s2);
		c1.setPhno(s4);
		
	
	
	    Demo d1=new Demo();
		//d1.insert(c1);
		//d1.update(id ,s4);
		
		
	}
	
}
