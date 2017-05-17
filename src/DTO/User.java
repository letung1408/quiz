/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author tungoc
 */
public class User {

    /**
     * @return the _role
     */
  
    private int _id;
    private String _userName;
    private String _passWord;
    private String _firstName;
    private String _lastName;
    private String _role;
    
    private boolean _gender;
    private String _email;
    private String _address;
    private String _phone;
    private Date _birthDay;
    private int _subjectId;
    private int _specialitiesId;

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the _userName
     */
    public String getUserName() {
        return _userName;
    }

    /**
     * @param _userName the _userName to set
     */
    public void setUserName(String _userName) {
        this._userName = _userName;
    }

    /**
     * @return the _passWord
     */
    public String getPassWord() {
        return _passWord;
    }

    /**
     * @param _passWord the _passWord to set
     */
    public void setPassWord(String _passWord) {
        this._passWord = _passWord;
    }

    /**
     * @return the _firstName
     */
    public String getFirstName() {
        return _firstName;
    }

    /**
     * @param _firstName the _firstName to set
     */
    public void setFirstName(String _firstName) {
        this._firstName = _firstName;
    }

    /**
     * @return the _lastName
     */
    public String getLastName() {
        return _lastName;
    }

    /**
     * @param _lastName the _lastName to set
     */
    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    /**
     * @return the _roleId
     */
  

    /**
     * @return the _gender
     */
    public boolean isGender() {
        return _gender;
    }

    /**
     * @param _gender the _gender to set
     */
    public void setGender(boolean _gender) {
        this._gender = _gender;
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _email the _email to set
     */
    public void setEmail(String _email) {
        this._email = _email;
    }

    /**
     * @return the _address
     */
    public String getAddress() {
        return _address;
    }

    /**
     * @param _address the _address to set
     */
    public void setAddress(String _address) {
        this._address = _address;
    }

    /**
     * @return the _phone
     */
    public String getPhone() {
        return _phone;
    }

    /**
     * @param _phone the _phone to set
     */
    public void setPhone(String _phone) {
        this._phone = _phone;
    }

    /**
     * @return the _birthDay
     */
    public Date getBirthDay() {
        return _birthDay;
    }

    /**
     * @param _birthDay the _birthDay to set
     */
    public void setBirthDay(Date _birthDay) {
        this._birthDay = _birthDay;
    }

    /**
     * @return the _subjectId
     */
    public int getSubjectId() {
        return _subjectId;
    }

    /**
     * @param _subjectId the _subjectId to set
     */
    public void setSubjectId(int _subjectId) {
        this._subjectId = _subjectId;
    }

    /**
     * @return the _specialitiesId
     */
    public int getSpecialitiesId() {
        return _specialitiesId;
    }

    /**
     * @param _specialitiesId the _specialitiesId to set
     */
    public void setSpecialitiesId(int _specialitiesId) {
        this._specialitiesId = _specialitiesId;
    }
  public String getRole() {
        return _role;
    }

    /**
     * @param _role the _role to set
     */
    public void setRole(String _role) {
        this._role = _role;
    }
  
}
