package com.example.new_sample;

public class SampleActivity {
    int calc;
    String result;

    public SampleActivity(int calc, String result) {
        this.calc = calc;
        this.result = result;
    }

    public int getCalc() {
        return calc;
    }

    public void setCalc(int calc) {
        this.calc = calc;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
