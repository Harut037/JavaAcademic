package inheritance.homework1;

import java.security.Permission;

public class Child extends Parent {
    public static void main(String[] args) {
        Child ch = new Child();

//        1. Create a class Parent which includes the method showMessage() print “Hello Parent class ”.
//        Create a class Child which inherits from Parent and  override showMessage() print “Hello Child class”.
//        Print both messages using only one object.
        ch.showMessage();
    }

    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("Hello Child class");
    }
}
