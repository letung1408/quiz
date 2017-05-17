/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Subject;
import java.util.List;

/**
 *
 * @author tungoc
 */
public interface ISubjectDAO {
    public Subject Create(Subject subject);
    public List<Subject> GetAll();
    public Subject GetSubject(String name);
}
