package com.bellinfo.designpattern.mvc;

public class RegisterController {

    RegisterView view;
    Register model;

    RegisterController(Register reg, RegisterView regView){
        view = regView;
        model = reg;
    }

    public void setRegId(int id){
        model.setId(id);
    }

    public void setRegName(String name){
        model.setName(name);
    }

    public int getRegId(){
        return model.getId();
    }

    public String getRegName(){
        return model.getName();
    }

    public void updateView(){
        view.printRegisterDetails(model.getId(), model.getName());
    }
}
