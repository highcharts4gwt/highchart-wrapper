
package com.usesoft.highcharts4gwt.model.highcharts.mock.yaxis;

import com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.PlotBand;

public class MockPlotBand
    extends com.usesoft.highcharts4gwt.model.highcharts.mock.xaxis.MockPlotBand
    implements PlotBand
{

    private double innerRadiusAsNumber;
    private String innerRadiusAsString;
    private double outerRadiusAsNumber;
    private String outerRadiusAsString;
    private double thicknessAsNumber;
    private String thicknessAsString;

    public double innerRadiusAsNumber() {
        return innerRadiusAsNumber;
    }

    public MockPlotBand innerRadiusAsNumber(double innerRadiusAsNumber) {
        this.innerRadiusAsNumber = innerRadiusAsNumber;
        return this;
    }

    public String innerRadiusAsString() {
        return innerRadiusAsString;
    }

    public MockPlotBand innerRadiusAsString(String innerRadiusAsString) {
        this.innerRadiusAsString = innerRadiusAsString;
        return this;
    }

    public double outerRadiusAsNumber() {
        return outerRadiusAsNumber;
    }

    public MockPlotBand outerRadiusAsNumber(double outerRadiusAsNumber) {
        this.outerRadiusAsNumber = outerRadiusAsNumber;
        return this;
    }

    public String outerRadiusAsString() {
        return outerRadiusAsString;
    }

    public MockPlotBand outerRadiusAsString(String outerRadiusAsString) {
        this.outerRadiusAsString = outerRadiusAsString;
        return this;
    }

    public double thicknessAsNumber() {
        return thicknessAsNumber;
    }

    public MockPlotBand thicknessAsNumber(double thicknessAsNumber) {
        this.thicknessAsNumber = thicknessAsNumber;
        return this;
    }

    public String thicknessAsString() {
        return thicknessAsString;
    }

    public MockPlotBand thicknessAsString(String thicknessAsString) {
        this.thicknessAsString = thicknessAsString;
        return this;
    }

}
