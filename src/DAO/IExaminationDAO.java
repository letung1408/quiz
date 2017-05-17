/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Examination;
import java.util.List;

/**
 *
 * @author tungoc
 */
public interface IExaminationDAO {
    public Examination Create(Examination exam);
    public List<Examination> GetAll();
    public Examination GetExamination(String name);
    
}
