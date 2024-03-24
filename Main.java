public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(6, 5);
        ComplexNumber num2 = new ComplexNumber(2, 3);

        ComplexCalculator calculator = new BasicComplexCalculator();

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber division = calculator.divide(num1, num2);

        System.out.println("Сумма: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Произведение: " + product.getReal() + " + " + product.getImaginary() + "i");
        System.out.println("Деление: " + division.getReal() + " + " + division.getImaginary() + "i");
    }
} 