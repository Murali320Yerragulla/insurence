package com.softura.workers.utility;

public  class Worker {
    String name;
    int salaryRate;

    public Worker(String name,int salaryRate)
    {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public int pay(int hours){
        return 0;
    }
}
