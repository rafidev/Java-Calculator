public class calc {
    private String whatCalc;
    private double num1;
    private double num2;
    private double outcome;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getOutcome() {
        return outcome;
    }

    public void setOutcome(double outcome) {
        this.outcome = outcome;
    }

    public String getWhatCalc() {
        return whatCalc;
    }

    public void setWhatCalc(String whatCalc) {
        this.whatCalc = whatCalc;
    }

    public void Main(){
        switch(whatCalc){
            case "+":
                summation();
                break;
            case "-":
                subtraction();
                break;
            case "*":
                multiplication();
                break;
            case "/":
                division();
                break;
        }
    }

    public void summation(){
        outcome = num1 + num2;
    }

    public void subtraction(){
        outcome = num1 - num2;
    }

    public void multiplication(){
        outcome = num1 * num2;
    }

    public void division(){
        outcome = num1 / num2;
    }

}
