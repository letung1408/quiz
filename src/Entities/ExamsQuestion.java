package Entities;
// Generated May 13, 2017 5:10:37 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ExamsQuestion generated by hbm2java
 */
public class ExamsQuestion  implements java.io.Serializable {


     private int id;
     private Exam exam;
     private Question question;
     private Set studentExams = new HashSet(0);

    public ExamsQuestion() {
    }

	
    public ExamsQuestion(int id) {
        this.id = id;
    }
    public ExamsQuestion(int id, Exam exam, Question question, Set studentExams) {
       this.id = id;
       this.exam = exam;
       this.question = question;
       this.studentExams = studentExams;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Exam getExam() {
        return this.exam;
    }
    
    public void setExam(Exam exam) {
        this.exam = exam;
    }
    public Question getQuestion() {
        return this.question;
    }
    
    public void setQuestion(Question question) {
        this.question = question;
    }
    public Set getStudentExams() {
        return this.studentExams;
    }
    
    public void setStudentExams(Set studentExams) {
        this.studentExams = studentExams;
    }




}


