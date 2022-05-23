package com.softura.insurence.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        int totalUsers= 10;
        String[] names = new String[totalUsers];
        int[] ages = new int[totalUsers];
        int[] premium = new int[totalUsers];
        int totalPremiumCovered = 0;

        try{

            for (int i=0; i <= totalUsers-1; i++) {

                if (i>0)
                    namesList.add(names[i-1]);

                Scanner input =new Scanner(System.in);

                System.out.print("Enter Name- ");
                names[i] = input.nextLine();
                UserDetailsException.validateName(names[i],namesList);
                //System.out.println(namesList);
                System.out.print("Enter Age- ");
                ages[i] = input.nextInt();
                UserDetailsException.validateAge(ages[i]);
                System.out.println("Enter Premium- Monthly(12),Quarterly(4),Bi Annual(2),Annual(1)- ");
                premium[i] = input.nextInt();
                UserDetailsException.validatePremium(premium[i]);
                if(i<=4)
                totalPremiumCovered += premium[i];

            }//for


            //add only first 5 users
            System.out.println("Total Premium Covered : "+totalPremiumCovered);

        }//try
        catch(InvalidAgeException ex){


            System.out.println(ex.getMessage());
            System.out.println("Total Premium Covered : "+totalPremiumCovered);
        }
        catch (InvalidNameException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Total Premium Covered : "+totalPremiumCovered);

        }
        catch (InvalidPremiumException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Total Premium Covered : "+totalPremiumCovered);

        }




    }
}