package com.softura.workers.utility;


public class DailyWorker extends Worker {


    public DailyWorker(String name, int salaryRate) {
        super(name, salaryRate);
    }



    @Override
    public int pay(int days) {


        return this.salaryRate * days;

    }
}
