package oo.inheritance;

public class Child extends Parent {

    @Override
    public void displaySecret(){
        System.out.println("This is the secret of the child");
    }

    public void displaySecret2(){
        super.displaySecret();
        System.out.println("This is the second secret of the child");
    }
}
