package Abstraction;
public class Home {
    public static void main(String[] args) {
        // my_absstraction a = new my_absstraction();
        // a.m1();
        // a.m2();
        GoldenEagle e =new GoldenEagle();
        narrowEagle n = new narrowEagle();
        e.eat();
        e.fly();
        n.eat();
        n.fly();

    }
}
/**
 * InnerHome
 */

