package Entities;
// Generated May 13, 2017 5:10:37 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


     private int id;
     private String name;
     private String decription;
     private Set userAccounts = new HashSet(0);

    public Role() {
    }

	
    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Role(int id, String name, String decription, Set userAccounts) {
       this.id = id;
       this.name = name;
       this.decription = decription;
       this.userAccounts = userAccounts;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDecription() {
        return this.decription;
    }
    
    public void setDecription(String decription) {
        this.decription = decription;
    }
    public Set getUserAccounts() {
        return this.userAccounts;
    }
    
    public void setUserAccounts(Set userAccounts) {
        this.userAccounts = userAccounts;
    }




}


