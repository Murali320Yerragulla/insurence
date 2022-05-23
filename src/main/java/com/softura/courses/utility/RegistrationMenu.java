package com.softura.courses.utility;

import java.util.*;

public class RegistrationMenu {

    public static void main(String[] args) {

        //creating list for courses to store
        List<Map<String,Object>> courseRegistrations = new ArrayList<>();



        CoursesImpl course= new CoursesImpl();
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter the number of the choice you want to choose:\n" +
                        "1. To register for a course\n" +
                        "2. To deregister for a course\n" +
                        "3. To list the courses offered\n" +
                        "4. To list the employees registered for a specific course"
        );
        int enteredOption = input.nextInt();

        boolean notExit = true;
        do
        {



            if(enteredOption == 1)
                //To register for a course
                course.register(courseRegistrations);

            if(enteredOption == 2)
            {
                //deRegistering for course
                boolean deRegistered = course.deRegister(courseRegistrations);
                System.out.println("deRegistered"+deRegistered);
                if (deRegistered)
                    System.out.println("Successfully DeRegistered Employee");
            }
            if(enteredOption == 3) {
                // to list the courses offered
                List<String> coursesList = course.getCoursesOffered();
                for (String name : coursesList)
                    System.out.println(name);
            }

            if(enteredOption == 4) {
                //To list the employees registered for a specific course.
                Scanner input3 = new Scanner(System.in);
                System.out.println("Enter name of the course");
                String courseName = input3.nextLine();

                List<String> employeeList = course.getEmployeeRegisteredForCourse(courseName, courseRegistrations);
                for (String name : employeeList)
                    System.out.println(name);
            }

            System.out.println("Do you want to terminate? y/n");
            Scanner input4 = new Scanner(System.in);
            String exited = input4.nextLine();

            if (exited.equals("y"))
                notExit = false;
            else
            {
                Scanner inputEnd = new Scanner(System.in);
                System.out.println(
                        "Enter the number of the choice you want to choose:\n" +
                                "1. To register for a course\n" +
                                "2. To deregister for a course\n" +
                                "3. To list the courses offered\n" +
                                "4. To list the employees registered for a specific course"
                );
               int  finalEnteredOption = inputEnd.nextInt();
               System.out.println("final "+finalEnteredOption);
               enteredOption = finalEnteredOption;
            }




        }//while
        while (notExit);








    }



}
