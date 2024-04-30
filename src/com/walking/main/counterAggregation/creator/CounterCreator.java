package com.walking.main.counterAggregation.creator;

public class CounterCreator {
    public final String NAME;
    public final String UNIT_OF_MEASUREMENT;
    private int counter;

    public CounterCreator(String NAME, String UNIT_OF_MEASUREMENT) {
        this.NAME = NAME;
        this.UNIT_OF_MEASUREMENT = UNIT_OF_MEASUREMENT;
        counter = 0;
    }
    public void setIncrease(int number) {
        this.counter += number;
        if (counter < 0) {
            this.counter = 0;
        }
    }
    public String getInfo() {
        return NAME + ": " + counter + UNIT_OF_MEASUREMENT;
    }
}