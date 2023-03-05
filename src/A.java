public class A extends Marks{

    public static void main(String[] args) {
        A a = new A();
        a.marks(new int[]{100,80,90});
    }
double total;
    @Override
    public void marks(int[] array) {
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        System.out.println(total/array.length);
    }
}
