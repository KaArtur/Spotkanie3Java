public class Calculate {

    static int add (int a, int b) {
        return a + b ;
    }

    static int add (int a, int b, int c) {
        return a + b + c;
    }

    static double add (double a, double b) {
        return a + b ;
    }
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        int result = calc.add(1,2);
        int result2 = calc.add(1,2,3);
        double result3 = calc.add(1.2,2.2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
