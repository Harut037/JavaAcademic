package abstract_class_and_interface.homework_5;

public class Main {
    public static void main(String[] args) {
        abstract_class_and_interface.homework_5.Child1 child1 = new Child1();
        abstract_class_and_interface.homework_5.Child2 child2 = new Child2();
        child1.enable();
        child2.enable();
        child1.disable();
        System.out.println("-----------------");
        child1.enable();
        child2.enable();

    }
}
