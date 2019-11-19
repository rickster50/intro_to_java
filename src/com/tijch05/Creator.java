package com.tijch05;

public class Creator {

    public static void main(String[] args){
        CreationDemonstrator c2 = new CreationDemonstrator();
        CreationDemonstrator c1 = new CreationDemonstrator();
        CreationDemonstrator c3 = new CreationDemonstrator();

        c1.setName("Richard");
        c1.setId(42);

        c2.setName("Syed");
        c2.setId(7);

//2f2c9b19
//2f2c9b19



        System.out.println(c2.getName());
        System.out.println(c1.getName());
        System.out.println(c1.getId());
        System.out.println(c2.setName("Junyi"));
        System.out.println(c1);

    }
}
