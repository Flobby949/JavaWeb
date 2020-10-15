package webclass.beans;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/10
 * @ClassName :
 */

public class CalculationWork {
    private double numberOne;
    private double numberTwo;
    private double resultNumber;
    private int cal;

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getResultNumber() {
        int a = getCal();
        if (a == 1){
            resultNumber = numberOne + numberTwo;
        } else if (a == 2){
            resultNumber = numberOne - numberTwo;
        } else if (a == 3){
            resultNumber = numberOne * numberTwo;
        } else {
            resultNumber = numberOne / numberTwo;
        }
        return resultNumber;
    }

    public void setResultNumber(double resultNumber) {
        this.resultNumber = resultNumber;
    }

}
