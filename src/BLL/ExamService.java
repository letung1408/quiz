/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import DAO.ExamDAO;
import DAO.IExamDAO;
import Entities.Exam;
import java.util.List;

/**
 *
 * @author tungoc
 */
public class ExamService implements IExamService{
    IExamDAO repository = new ExamDAO();
    public Exam Create(Exam exam){
        return repository.Create(exam);
    }
    public List<Exam> GetAll(){
       return repository.GetAll();
}
}
