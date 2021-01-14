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
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Alin", 9);
        Student s2 = new Student("Diana", 10);
        Student s3 = new Student("George", 9);
        
        StudentsCatalog sc = new StudentsCatalog();
        sc.addStudent(s1);
        sc.addStudent(s2);
        sc.addStudent(s3);
        
        System.out.println("Avarage grade is "+sc.getAvarageGradeAllStudents()); 
       
    }
}
