package com.struts2.entitiesBO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.struts2.entities.Libro;
import com.struts2.util.HibernateUtil;

public class LibroBO {

	public void insertar(Libro libro) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		session.save(libro);

		transaction.commit();
		session.close();

	}
	
	public List<Libro> consultaLibros(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Libro> hqlQuery = session.createQuery("FROM Libro");
		List<Libro> libros = hqlQuery.list();
		session.close();
		return libros;
		
	}
	
	public void eliminar(Libro libro) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.remove(libro);
		
		transaction.commit();
		session.close();
		
	}
	
	public void modifica(Libro libro) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(libro);
		transaction.commit();
		session.close();
		
	}

}
