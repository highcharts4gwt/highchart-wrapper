
package com.usesoft.highcharts4gwt.model.highcharts.mock.xaxis;

import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.PlotBand;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.plotbands.Label;

public class MockPlotBand
    implements PlotBand
{

    private String borderColor;
    private Number borderWidth;
    private String color;
    private String events;
    private Number from;
    private String id;
    private Label label;
    private Number to;
    private Number zIndex;

    public String borderColor() {
        return borderColor;
    }

    public MockPlotBand borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Number borderWidth() {
        return borderWidth;
    }

    public MockPlotBand borderWidth(Number borderWidth) {
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

    public Number from() {
        return from;
    }

    public MockPlotBand from(Number from) {
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

    public Number to() {
        return to;
    }

    public MockPlotBand to(Number to) {
        this.to = to;
        return this;
    }

    public Number zIndex() {
        return zIndex;
    }

    public MockPlotBand zIndex(Number zIndex) {
        this.zIndex = zIndex;
        return this;
    }

}
