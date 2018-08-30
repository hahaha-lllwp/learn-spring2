package org.lwp.profilePackage;

public class People implements Cloneable{
    private String name;


    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public void sayMe(){
        System.out.println(name);
    }

}
