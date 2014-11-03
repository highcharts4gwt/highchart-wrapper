
package com.usesoft.highcharts4gwt.model.highcharts.mock.xaxis;

import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.PlotBand;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.plotbands.Label;

public class MockPlotBand
    implements PlotBand
{

    private String borderColor;
    private double borderWidth;
    private String color;
    private String events;
    private double from;
    private String id;
    private Label label;
    private double to;
    private double zIndex;

    public String borderColor() {
        return borderColor;
    }

    public MockPlotBand borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockPlotBand borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockPlotBand color(String color) {
        this.color = color;
        return this;
    }

    public String events() {
        return events;
    }

    public MockPlotBand events(String eventsAsJsonString) {
        this.events = eventsAsJsonString;
        return this;
    }

    public double from() {
        return from;
    }

    public MockPlotBand from(double from) {
        this.from = from;
        return this;
    }

    public String id() {
        return id;
    }

    public MockPlotBand id(String id) {
        this.id = id;
        return this;
    }

    public Label label() {
        return label;
    }

    public MockPlotBand label(Label label) {
        this.label = label;
        return this;
    }

    public double to() {
        return to;
    }

    public MockPlotBand to(double to) {
        this.to = to;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockPlotBand zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

}
