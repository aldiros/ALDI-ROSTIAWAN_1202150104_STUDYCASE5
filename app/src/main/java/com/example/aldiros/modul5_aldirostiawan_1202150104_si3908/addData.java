package com.example.aldiros.modul5_aldirostiawan_1202150104_si3908;

/**
 * Created by aldiros on 25/03/2018.
 */

public class addData {
    //deklarasi variable
    String todo, desc, prior;

    //konstruktor
    public addData(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}

