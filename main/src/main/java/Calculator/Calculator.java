package Calculator;

public final class Calculator implements Calculable {
    @Override
    public Complex sum(Complex a, Complex b) {
        Complex result = new Complex(a.realPart + b.realPart, a.imagePart + b.imagePart );
        return result;
    }
    @Override
    public Complex minus(Complex a, Complex b) {
        Complex result = new Complex(a.realPart - b.realPart, a.imagePart - b.imagePart );
        return result;
    }

    @Override
    public Complex multi(Complex a, Complex b) {
        double real = a.realPart * b.realPart - a.imagePart * b.imagePart;
        double image = a.realPart * b.imagePart + b.realPart * a.imagePart;
        Complex result = new Complex(real, image);
        return result;
    }

    @Override
    public Complex division(Complex a, Complex b) {
        double real = (a.realPart * b.realPart + a.imagePart * b.imagePart) / (b.realPart * b.realPart + b.imagePart * b.imagePart);
        double image = (b.realPart * a.imagePart - a.realPart * b.imagePart) / (b.realPart * b.realPart + b.imagePart * b.imagePart);
        return new Complex(real, image);
    }
}
