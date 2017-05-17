/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.ExaminationDAO;
import DAO.IExaminationDAO;
import Entities.Examination;
import java.util.List;

/**
 *
 * @author tungoc
 */
public class ExaminationService implements IExaminationService{
    
    private static final IExaminationDAO repository = new ExaminationDAO();
    
    public Examination Create(Examination exam){
        return repository.Create(exam);
    }
    
    public List<Examination> GetAll(){
        return repository.GetAll();
    }

    public Examination GetExamination(String name) {
       
            return repository.GetExamination(name);
    }
}
