/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author bsoule
 */
public class CourseCreate {
    public static void main(String[] args){
        
        Courses course1 = new AdvancedJavaCourse("Summer Java 2", "1234");
        Courses course2 = new IntroJavaCourse("Noob Java 1", "1634");
        Courses course3 = new IntroToProgrammingCourse("Noob Programming 1", "9861");
        
        //While the benefit of having/using Abstraction helps keep the rigitity of the program overall much lower, 
        //It is not nearly as specific in being able to define certain methods (ones not implemeted in all classes)
        //Which is where an interface is better, since you can define where certain methods are used, however 
        //the vaugeness of an Abstract superclass helps simplify the overall code and prevents repitition.
        
    }
    
}
