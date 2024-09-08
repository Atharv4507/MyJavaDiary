package Abstraction;

abstract public class Bird {
    abstract void fly();
    abstract void eat();
}
class Egale extends Bird{

    @Override
    void fly() {
        System.out.println("Yes, Fly Heigh in the Sky");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

}
class GoldenEagle extends Egale{
    void eat(){
        System.out.println("They eat in high mountains");
    }
}
class narrowEagle extends Egale{
    void eat(){
        System.out.println("They eat in ocenes");
    }
}
