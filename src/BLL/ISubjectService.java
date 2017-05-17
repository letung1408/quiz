/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entities.Subject;
import java.util.List;

/**
 *
 * @author tungoc
 */
public interface ISubjectService {
    public Subject Create(Subject subject);
    public List<Subject> GetAll();
    public Subject GetSubject(String name);
}
