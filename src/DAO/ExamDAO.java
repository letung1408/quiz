/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Exam;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author tungoc
 */
public class ExamDAO implements IExamDAO{
    public Exam Create(Exam exam){
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
    public List<Exam> GetAll(){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Exam> listExam = session.createCriteria(Exam.class).list();
            session.getTransaction().commit();
            session.close();
            return listExam;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }
}
