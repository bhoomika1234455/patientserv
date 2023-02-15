package dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Cool;

import javassist.tools.reflect.Sample;

public class Demo {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


// public void insert(Cool c1)
// {
//	 entityTransaction.begin();
//	 entityManager.persist(c1);
//	 entityTransaction.commit();
// }
// public void update(int pid ,long phno)
// {
//	 Cool e1=entityManager.find(Cool.class,pid);
//	 
//	 e1.setPhno(phno);
//	
//	 entityTransaction.begin();
//	 entityManager.merge(e1);
//	 entityTransaction.commit();
//			 
// }
//public void delete(int pid){
//	
//	Cool  e2=entityManager.find(Cool.class,pid);
//	if (e2 != null) {
//	entityTransaction.begin();
//	 entityManager.remove(e2);
//	 entityTransaction.commit();
//	 
//	}
//
//else {
//	System.out.println("data is not present");
//
//	
//}
public void fetch(int pid){
	Cool e3=entityManager.find(Cool.class,pid);
	if (e3 != null) {
		System.out.println(e3);
		}
	
	else {
		System.out.println("data is not present");
	
	
	}
}}