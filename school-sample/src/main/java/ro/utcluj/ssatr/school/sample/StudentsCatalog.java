/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.school.sample;

/**
 *
 * @author mihai.hulea
 */
public class StudentsCatalog {
    Student[] list = new Student[10];
    
    void addStudent(Student s){
        for(int i=0;i<list.length;i++){
           if(list[i]==null){
               list[i] = s;
               System.out.println("New student added.");
               return;
           }           
       }
       System.out.println("No empty position found.");
    }
    
    double getAvarageGradeAllStudents(){
        double a = 0;
        int k = 0;
        for(Student s: list){
            if(s!=null){
                a+=s.getGrade();
                k++;
            }
        }
        return a/k;        
    }
    
    int getGradeByName(String studentName){
        for(Student s: list){
            if(s!=null && s.getName().equals(studentName))
                return s.getGrade();
        }
        return -1;
    }
    
}
