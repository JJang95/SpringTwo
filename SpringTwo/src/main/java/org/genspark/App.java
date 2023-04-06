package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.getId() + " " + student.getName() + " " + student.getPhones() + " " + student.getAddress());
    }
    }
}
