package com.softura.courses.utility;

import com.softura.insurence.utility.UserDetailsException;

import java.util.*;

public class CoursesImpl extends  Courses{



    @Override
    //public List<Map<String,Object>> register(List<Map<String,Object>> courses) {
    public List<Map<String,Object>> register(List<Map<String,Object>> courses) {
            Map course = new HashMap();

        boolean canContinue = true;
        while (canContinue){

            Scanner input =new Scanner(System.in);

            System.out.print("Enter Employee Name - ");
             String employeeName = input.nextLine();


            boolean employeeAlreadyRegistered = false;

            //checking registered employee
            for (Map<String,Object> map : courses) {
                String tempName = (String) map.get("empName");

                System.out.println("tempName"+tempName);
                System.out.println("employeeName"+employeeName);
                System.out.println(tempName.equals(employeeName));

                if (tempName.equals(employeeName))
                {
                    System.out.println("Employee already registered!!!");
                    employeeAlreadyRegistered = true;
                    break;
                }

            }//for

            course.put("empName",employeeName);

            if (employeeAlreadyRegistered)
                continue;

            System.out.print("Enter Course Name - ");
           String courseName = input.nextLine();
            course.put("courseName",courseName);

            System.out.print("Enter course fee - ");
            int fee = input.nextInt();
            course.put("fee",fee);

            Scanner input2 =new Scanner(System.in);
            System.out.print("Enter Course mode - ");
            String mode = input2.nextLine();
            course.put("mode",mode);

            System.out.print("Enter Duration - ");
            String duration = input2.nextLine();
            course.put("duration",duration);

            courses.add(course);
            System.out.println("Successfully registered the Employee.");
            System.out.print("Do you want to add one more employee? y/n ");
            String canWeContinue = input2.nextLine();

            if ("n".equalsIgnoreCase(canWeContinue))
                canContinue = false;
        }//while


        return courses;
    }

    @Override
    public boolean deRegister(List<Map<String,Object>> courses) {
        boolean exit = true;

        while (exit)
        {
            System.out.println("Enter Name of employee to DeRegister");
            Scanner input5 = new Scanner(System.in);
            String  deRegisterName = input5.nextLine();
            for (Map<String,Object> course : courses) {
                String name = (String) course.get("empName");
                if (deRegisterName.equals(name))
                {
                    courses.remove(course);
                    return true;
                }
            }


        }//while loop

        return false;

    }

    @Override
    public List<String> getCoursesOffered() {
        return Arrays.asList("Java", "Python", "JavaScript","React","Angular");
    }

    @Override
    public List<String> getEmployeeRegisteredForCourse(String course,List<Map<String,Object>> courses) {

        List<String> employeeRegisteredCourse = new ArrayList<>();
        for (Map<String,Object> map :  courses) {
            if(map.get("courseName") != null)
            {
                String courseName = (String) map.get("courseName");
                if(courseName.equals(course))
                {
                  //  System.out.println(map.get("empName"));
                    employeeRegisteredCourse.add((String) map.get("empName"));

                }
            }

        }
        return employeeRegisteredCourse;
    }
}
