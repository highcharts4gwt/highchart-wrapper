
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.DataLabels;

public class MockDataLabels
    extends com.github.highcharts4gwt.model.highcharts.mock.plotoptions.series.MockDataLabels
    implements DataLabels
{

    private double xHigh;
    private double xLow;
    private double yHigh;
    private double yLow;

    public double xHigh() {
        return xHigh;
    }

    public MockDataLabels xHigh(double xHigh) {
        this.xHigh = xHigh;
        return this;
    }

    public double xLow() {
        return xLow;
    }

    public MockDataLabels xLow(double xLow) {
        this.xLow = xLow;
        return this;
    }

    public double yHigh() {
        return yHigh;
    }

    public MockDataLabels yHigh(double yHigh) {
        this.yHigh = yHigh;
        return this;
    }

    public double yLow() {
        return yLow;
    }

    public MockDataLabels yLow(double yLow) {
        this.yLow = yLow;
        return this;
    }

}
