public class NumberNew {
    private double number;

    public NumberNew() {
        setValue(0);
    }

    public NumberNew(double n) {
        setValue(n);
    }

    public void setValue(double n) {
        number = n;
    }

    public double getValue() {
        return (number);
    }

    public String toString() {
        return (Double.toString(getValue()));
    }

    public void add(double n) {
        setValue(getValue() + n);
    }

    public void subtract(double n) {
        setValue(getValue() - n);
    }

    public void multiply(double n) {
        setValue(getValue() * n);
    }

    public void divide(double n) {
        setValue(getValue() / n);
    }

    public void mod(double n){
        setValue( getValue() % n);
    }

    public void power(double n){
        setValue(Math.pow(getValue(),n));
    }
    public void sqr(double n){
        setValue(Math.sqrt(n));
    }
}