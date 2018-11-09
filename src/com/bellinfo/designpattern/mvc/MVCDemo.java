package com.bellinfo.designpattern.mvc;

public class MVCDemo {
    public static void main(String[] args) {
        MVCDemo d = new MVCDemo();
        Register reg = d.getDetailsFromDatabase();
        RegisterView rv = new RegisterView();

        RegisterController controller = new RegisterController(reg, rv);
        controller.setRegName("Ram");
        controller.updateView();
    }

    Register getDetailsFromDatabase(){
        Register r = new Register();

        r.setName("Bob");
        r.setId(1);
        return r;
    }
}
