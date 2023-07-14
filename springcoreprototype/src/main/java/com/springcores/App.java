package com.springcores;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("prototype.xml");
        //here is working prototype 
		
		  TestStudent testStudent=context.getBean("testStudent",TestStudent.class);
		  System.out.println(testStudent.hashCode()); //here is working prototype
		 TestStudent testStudent1=context.getBean("testStudent",TestStudent.class);
		 System.out.println(testStudent1.hashCode()); //here is used to prototype
		 // object refrance to other other but singletone is working same refrance
		  //prototype key case ma object give refrence is different different
		         
		/*
		 * //here is started your configration.xml file used prototype TestTeacher
		 * testTeacher1=context.getBean("testTeacher",TestTeacher.class);
		 * System.out.println(testTeacher1); TestTeacher
		 * testTeacher2=context.getBean("testTeacher",TestTeacher.class);
		 * System.out.println(testTeacher2);
		 */
        
        
        
    }
}
