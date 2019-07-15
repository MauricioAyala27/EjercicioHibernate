package Dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Estudiante;
import hibernateConfig.HibernateUtil;

public class EstudianteDao {
	
	 public void saveStudent(Estudiante st) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(st);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }
	    public List <Estudiante> getStudents() {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            return session.createQuery("from Estudiante", Estudiante.class).list();
	        }
	    }

}
