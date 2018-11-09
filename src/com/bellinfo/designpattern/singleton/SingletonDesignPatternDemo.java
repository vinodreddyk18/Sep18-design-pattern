package com.bellinfo.designpattern.singleton;

public class SingletonDesignPatternDemo {
    public static void main(String[] args) {

        Connection c = Connection.getInstance();
        c.a = 20;
        System.out.println(c.a);

        Connection c1 = Connection.getInstance();
        System.out.println(c1.a);

    }
}

class Connection {

    int a = 0;

    private static Connection con;

    private Connection(){

    }

    public static synchronized Connection getInstance(){
        if(con == null){
            con = new Connection();
        }
        return con;
    }
}