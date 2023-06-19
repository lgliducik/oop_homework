package Calculator;

public class Complex {
    double realPart;
    double imagePart;
    public Complex(double realPart, double imagePart) {
        this.realPart = realPart;
        this.imagePart = imagePart;
    }

    @Override
    public String toString() {
        return String.format("(%.3f+i*%.3f)", realPart, imagePart);
    }
}
