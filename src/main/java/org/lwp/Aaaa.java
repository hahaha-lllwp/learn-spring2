package org.lwp;

public class Aaaa {
//    /*final*/ static void get(){
//        System.out.println("aaa");
//    }
    int i = 0;

}

class Bbb extends Aaaa{


    static void get(){
        System.out.println("bbb");
    }
}
class Test{
    public static void main(String[] args) {
        Bbb.get();
    }
}
