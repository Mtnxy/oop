public class MyCalculator implements ZCalculator{

    @Override
    public double add2Number(double a, double b) {
        //double r =a+b;
        return a + b;
    }

    @Override
    public double sub2Number(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply2Number(double a, double b) {
        return a*b;
    }

    @Override
    public double divide2Number(double a, double b) {
        return a/b;
    }

    @Override
    public double power(double base, int powerNo) {
        return base;
    }
}
