/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.Constants;
import Entities.UserAccount;
import java.io.PrintStream;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author trojan
 */
public class UserAccountDAO implements IUserDAO{
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    /**
     * Check User Login
     * @param user
     * @param pass
     * @return true is success
     */
    public String login(String user, String pass) {
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("from UserAccount where username = :username and password = :password");
            query.setParameter("username", user);
            query.setParameter("password", pass);
            UserAccount acc = (UserAccount) query.uniqueResult();
            session.flush();
            session.getTransaction().commit();
            if (acc != null) {
                if(Constants.ADMINISTRATOR.equals(acc.getRole().getName())){
                    return Constants.ADMINISTRATOR;
                }
                else if(Constants.TEACHER.equals(acc.getRole().getName())){
                    return Constants.TEACHER;
                }
                else if(Constants.MINISTRY.equals(acc.getRole().getName())){
                    return Constants.MINISTRY;
                }
                else if(Constants.STUDENT.equals(acc.getRole().getName())){
                    return Constants.STUDENT;
                }
                
            }
        } catch (HibernateException e) {            
            e.printStackTrace();
            return null;
        }               
        return null;
        
    }
    public UserAccount Create(UserAccount useraccount){
        
        try{
            //Create session factory object
            Session session = HibernateUtil.getSessionFactory().openSession();
            //getting session object from session
            session.beginTransaction();
            session.save(useraccount);
            session.getTransaction().commit();
            session.close();
            
            return useraccount;
        }
        catch(HibernateException ex){
           ex.printStackTrace();
           return null;
        }
    }

    public List<UserAccount> GetAll(){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<UserAccount> listSubject = session.createCriteria(UserAccount.class).list();
            session.getTransaction().commit();
            session.close();
            return listSubject;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }
     public UserAccount GetUserAccount(String name) {
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            UserAccount subject = (UserAccount)session.createQuery("from Subject where Name = '" + name +"'").uniqueResult();
            session.getTransaction().commit();
            session.close();
            return subject;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
