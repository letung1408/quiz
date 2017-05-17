/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.IUserDAO;
import DAO.SubjectDAO;
import DAO.UserAccountDAO;
import Entities.UserAccount;
import java.util.List;

/**
 *
 * @author tungoc
 */
public class UserAccountService implements IUserAccountService{

 
      private static final IUserDAO repository = new UserAccountDAO();
    
    public UserAccount Create(UserAccount subject){
        return repository.Create(subject);
    }
    
    public List<UserAccount> GetAll(){
       return repository.GetAll();
    }

    public UserAccount GetSubject(String name) {
            return repository.GetUserAccount(name);

    }

    @Override
    public UserAccount GetUserAccount(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
