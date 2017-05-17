/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.UserAccountDAO;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author tungoc
 */
public class Authentication {
    String _salt = "123123";
    
    UserAccountDAO _user ;
    
    public Authentication(){
        _user = new UserAccountDAO();
    }
    
    public Authentication(String username){
//        _user = new UserAccountDAO();
    }
    
    public String checkLogin(String username, String password) {
        return _user.login(username, hashSHA512(password, _salt));
    }
    
    public static String hashSHA512(String passwordToHash, String salt) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt.getBytes("UTF-8"));
            byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        }
        return generatedPassword;
    }
   
}
