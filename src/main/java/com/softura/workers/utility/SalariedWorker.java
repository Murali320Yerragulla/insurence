package com.softura.workers.utility;

public class SalariedWorker extends Worker{

    public SalariedWorker(String name, int salaryRate) {
        super(name, salaryRate);
    }



    @Override
    public int pay(int hours) {

        return  40 * this.salaryRate;
    }
}
