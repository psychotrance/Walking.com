package com.walking.counterAggregation.service;

import com.walking.counterAggregation.creator.CounterCreator;

public class CounterService {
    CounterCreator[] counterServices;
    int index = 0;
    int length = 5;
    CounterCreator find;

    public CounterService(CounterCreator... o) {
        counterServices = new CounterCreator[length];
        for (CounterCreator counters : o) {
            counterServices[index] = counters;
            this.index++;
        }
    }

    public void setArray(CounterCreator x) {
        counterServices[index++] = x;
    }

    public CounterCreator[] getArray() {
        return counterServices;
    }

    public CounterCreator getCounter(String name) {
        for (CounterCreator find : counterServices) {
            if (find.NAME.equals(name)) return find;
        }
        return null;
    }

    public void setIncrement(String name) {
        for (CounterCreator find : counterServices) {
            getCounter(name);
            find.setIncrease(1);
        }
    }

    public void setIncrement(String name, int increaseValue) {
        for (CounterCreator find : counterServices) {
            if (find.NAME != name)
                continue;
            find.setIncrease(increaseValue);
        }
    }

    public void reloadCounter(String name) {
    }
}