import java.util.logging.Logger;
class BasicComplexCalculator implements ComplexCalculator {
    private static final Logger logger = Logger.getLogger(BasicComplexCalculator.class.getName());

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполняем сложение: " + a + " + " + b);
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполняем умножение: " + a + " * " + b);
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполняем деление: " + a + " / " + b);
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}