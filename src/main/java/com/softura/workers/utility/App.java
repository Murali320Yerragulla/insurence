package com.softura.workers.utility;

import com.softura.insurence.utility.UserDetailsException;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter Name - ");
       String name = input.nextLine();

        System.out.print("Enter Employee type : ");
        String type = input.nextLine();

        System.out.print("Enter Salary Rate - ");
        int rate = input.nextInt();

        int totalPay = 0;
       if ("D".equals(type))
       {
           System.out.print("Enter No of days worked - ");
           int days = input.nextInt();
           DailyWorker daily = new DailyWorker(name,rate);
           totalPay = daily.pay(days);

       }
       else {
           SalariedWorker salariedWorker = new SalariedWorker(name,rate);
           totalPay = salariedWorker.pay(0);
       }

    System.out.println("Salary paid : "+totalPay);
    }
}
