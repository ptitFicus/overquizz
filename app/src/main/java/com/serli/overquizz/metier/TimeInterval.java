package com.serli.overquizz.metier;

import java.io.Serializable;

public class TimeInterval implements Serializable{
    private int startYear;
    private int endYear;

    public TimeInterval(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "startYear=" + startYear +
                ", endYear=" + endYear +
                '}';
    }
}