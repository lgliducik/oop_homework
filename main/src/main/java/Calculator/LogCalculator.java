package Calculator;

public class LogCalculator implements Calculable{
    private Calculator calculator;
    Logger logger;
    public LogCalculator(Calculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }
    @Override
    public Complex sum(Complex arg1, Complex arg2) {
        Complex result = calculator.sum(arg1, arg2);
        logger.writeLog( arg1 + "+" + arg2 + "=" + result);
        return result;
    }
    @Override
    public Complex minus(Complex arg1, Complex arg2) {
        Complex result = calculator.minus(arg1, arg2);
        logger.writeLog( arg1 + "-" + arg2 + "=" + result);
        return result;
    }
    @Override
    public Complex multi(Complex arg1, Complex arg2) {
        Complex result = calculator.multi(arg1, arg2);
        logger.writeLog(arg1 + "*" + arg2 + "=" + result);
        return result;
    }

    @Override
    public Complex division(Complex arg1, Complex arg2) {
        Complex result = calculator.division(arg1, arg2);
        logger.writeLog(arg1 + "/" + arg2 + "=" + result);
        return result;
    }
}
