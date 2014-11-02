
package com.usesoft.highcharts4gwt.model.highcharts.mock.yaxis;

import com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.PlotBand;

public class MockPlotBand
    extends com.usesoft.highcharts4gwt.model.highcharts.mock.xaxis.MockPlotBand
    implements PlotBand
{

    private Number innerRadiusAsNumber;
    private String innerRadiusAsString;
    private Number outerRadiusAsNumber;
    private String outerRadiusAsString;
    private Number thicknessAsNumber;
    private String thicknessAsString;

    public Number innerRadiusAsNumber() {
        return innerRadiusAsNumber;
    }

    public MockPlotBand innerRadiusAsNumber(Number innerRadiusAsNumber) {
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

    public Number outerRadiusAsNumber() {
        return outerRadiusAsNumber;
    }

    public MockPlotBand outerRadiusAsNumber(Number outerRadiusAsNumber) {
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

    public Number thicknessAsNumber() {
        return thicknessAsNumber;
    }

    public MockPlotBand thicknessAsNumber(Number thicknessAsNumber) {
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
