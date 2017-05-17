/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.UserAccount;
import java.util.List;
/**
 *
 * @author tungoc
 */
public interface IUserDAO {
    public UserAccount Create(UserAccount subject);
    public List<UserAccount> GetAll();
    public UserAccount GetUserAccount(String name);
}
