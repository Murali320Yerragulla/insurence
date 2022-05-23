package com.softura.insurence.utility;

import java.util.List;

// class representing custom exception
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

class InvalidNameException extends Exception{
    // constructor methode
    public InvalidNameException (String str)
    {
        // calling the parent exception
        super(str);
    }

}

class InvalidPremiumException extends Exception {
    public InvalidPremiumException(String str) {

            super(str);

    }
}

// class that uses custom exception InvalidAgeException
public class UserDetailsException
{

    static void validateName(String name, List<String> names) throws InvalidNameException{

        if(names.contains(name)){
            throw new InvalidNameException("Name already exists "+name);
        }

    }

    // method to check the age
    static void validateAge(int age) throws InvalidAgeException{
        if(age <18 || age>60){

            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid "+age);
        }
        else {
            System.out.println("Eligible");
        }
    }

    // methode to check the premium
    static void validatePremium(int premium) throws InvalidPremiumException {

        if(premium != 1 && premium != 2 && premium != 4 && premium != 12){

            throw new InvalidPremiumException("Premium not existed "+ premium);

        }

    }
}
