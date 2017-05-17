/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Examination;
import Entities.UserAccount;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author tungoc
 */
public class ExaminationDAO implements IExaminationDAO{
    
    @Override
    public Examination Create(Examination exam){
        
        try{
            //Create session factory object
            Session session = HibernateUtil.getSessionFactory().openSession();
            //getting session object from session
            session.beginTransaction();
            session.save(exam);
            session.getTransaction().commit();
            session.close();
            
            return exam;
        }
        catch(HibernateException ex){
           ex.printStackTrace();
           return null;
        }
    }
    
    @Override
    public List<Examination> GetAll(){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Examination> listExam = session.createCriteria(Examination.class).list();
            session.getTransaction().commit();
            session.close();
            return listExam;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Examination GetExamination(String name) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Examination examination = (Examination)session.createQuery("from Examination where Name = '"+ name +"'").uniqueResult();
            session.getTransaction().commit();
            session.close();
            return examination;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }
}
