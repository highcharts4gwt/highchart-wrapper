
package com.github.highcharts4gwt.model.highcharts.option.mock.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Break;

public class MockBreak
    implements Break
{

    private double breakSize;
    private double from;
    private double repeat;
    private double to;

    public double breakSize() {
        return breakSize;
    }

    public MockBreak breakSize(double breakSize) {
        this.breakSize = breakSize;
        return this;
    }

    public double from() {
        return from;
    }

    public MockBreak from(double from) {
        this.from = from;
        return this;
    }

    public double repeat() {
        return repeat;
    }

    public MockBreak repeat(double repeat) {
        this.repeat = repeat;
        return this;
    }

    public double to() {
        return to;
    }

    public MockBreak to(double to) {
        this.to = to;
        return this;
    }

}
