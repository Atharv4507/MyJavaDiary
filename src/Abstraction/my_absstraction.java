package Abstraction;

abstract public class my_absstraction {
    private String s1 = "abc";
    final int a =10;
    final int b=10;
    my_absstraction(String s1){
        this.s1 = s1;
    }
    my_absstraction(){
        System.out.println("Default Constructor");
    }
    final void m1(){
        System.out.println("m1 method");
    }
    
    void m2(){
        int a = 30;
        int c = 40;
        System.out.println(a+c+" m2 method");
        System.out.println(s1);
    }
    abstract void m3();

    
}
class Inner extends my_absstraction{
    // my_absstraction m = new my_absstraction("Hello");
    // my_absstraction m1 = new my_absstraction(s1);
    int a = 20;
    void m3(){
        
    }
    
}
