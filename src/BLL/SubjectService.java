/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.ISubjectDAO;
import DAO.SubjectDAO;
import java.util.List;
import Entities.Subject;

/**
 *
 * @author tungoc
 */
public class SubjectService implements ISubjectService {
    
    private static final ISubjectDAO repository = new SubjectDAO();
    
    public Subject Create(Subject subject){
        return repository.Create(subject);
    }
    
    public List<Subject> GetAll(){
       return repository.GetAll();
    }

    public Subject GetSubject(String name) {
            return repository.GetSubject(name);

    }
}
