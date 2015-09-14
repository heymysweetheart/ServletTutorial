package com.creditease;

/**
 * Created by leo on 15/9/13.
 */
public class Caculator {
    private double first;
    private double second;
    private String operator;

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String caculate() {
        double result = 0.0;
        String exception = "";

        try {
            if ("+".equals(operator)) {
                result = first + second;
            }

            if ("-".equals(operator)) {
                result = first - second;
            }

            if ("*".equals(operator)) {
                result = first * second;
            }

            if ("/".equals(operator)) {
                result = first / second;
            }

            if ("sqrt".equals(operator)) {
                result = Math.sqrt(first);
            }

            if ("pow".equals(operator)) {
                result = Math.pow(first, 2);
            }
        } catch (Exception e) {
            exception = "有异常！";
        }

        return Double.toString(result) + exception;
    }
}
