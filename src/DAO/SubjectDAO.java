/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Subject;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author tungoc
 */
public class SubjectDAO implements ISubjectDAO {
     Session session = HibernateUtil.getSessionFactory().openSession(); 
     
     @Override
    public Subject Create(Subject subject){
        
        try{
            //Create session factory object
            Session session = HibernateUtil.getSessionFactory().openSession();
            //getting session object from session
            session.beginTransaction();
            session.save(subject);
            session.getTransaction().commit();
            session.close();
            
            return subject;
        }
        catch(HibernateException ex){
           ex.printStackTrace();
           return null;
        }
    }
     @Override
    public List<Subject> GetAll(){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Subject> listSubject = session.createCriteria(Subject.class).list();
            session.getTransaction().commit();
            session.close();
            return listSubject;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Subject GetSubject(String name) {
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Subject subject = (Subject)session.createQuery("from Subject where Name = '" + name +"'").uniqueResult();
            session.getTransaction().commit();
            session.close();
            return subject;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }
}
