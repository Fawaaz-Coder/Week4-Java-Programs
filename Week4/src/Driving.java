public class Driving {
    public static void main(String[] args) {
        final int LEGAL_DRIVING_AGE = 16;
        int age = 14;

        while(age < LEGAL_DRIVING_AGE){
            System.out.println("You can not drive");
            System.out.println("Please wait till you are " + LEGAL_DRIVING_AGE + "!");
            age++;
        }
        System.out.println("You can drive!");
        System.out.println("Please get a driving license");
    }
}
