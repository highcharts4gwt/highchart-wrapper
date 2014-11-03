
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.Pane;

public class MockPane
    implements Pane
{

    private String background;
    private double endAngle;
    private double sizeAsNumber;
    private String sizeAsString;
    private double startAngle;

    public String background() {
        return background;
    }

    public MockPane background(String backgroundAsJsonStringArray) {
        this.background = backgroundAsJsonStringArray;
        return this;
    }

    public double endAngle() {
        return endAngle;
    }

    public MockPane endAngle(double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public double sizeAsNumber() {
        return sizeAsNumber;
    }

    public MockPane sizeAsNumber(double sizeAsNumber) {
        this.sizeAsNumber = sizeAsNumber;
        return this;
    }

    public String sizeAsString() {
        return sizeAsString;
    }

    public MockPane sizeAsString(String sizeAsString) {
        this.sizeAsString = sizeAsString;
        return this;
    }

    public double startAngle() {
        return startAngle;
    }

    public MockPane startAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

}
