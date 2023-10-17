public class Methods {
    public static void main(String[] args) {
//        square(5);
//        cube(2);
        product(10, 20);
    }

    public static void square(int inValue) {
        int sq = inValue * inValue;
        System.out.println("Square of " + inValue + " is \t" + sq);
    }

    public static void cube(int cvalue){
        int cube = cvalue * cvalue * cvalue;
        System.out.println("Cube of " +  cvalue + "is \t" + cube);
    }

    public static void product (int a, int b) {
        int product = a * b;
        System.out.println("The product is: " + product);
    }
}
