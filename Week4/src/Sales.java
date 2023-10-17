//Activity A

public class Sales {
    public static void main(String[] args) {
        salesComission(50000.00, 10);
    }

    public static void salesComission(double salesAmount, double cPercent) {
        double comission = (cPercent/100) * salesAmount;
        System.out.println("For sales: " + salesAmount);
        System.out.println("& comission : " + cPercent);
        System.out.printf("The comission is: " + comission);

    }
}
