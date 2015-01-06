
package com.github.highcharts4gwt.model.highcharts.option.mock.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.plotbands.Label;

public class MockPlotBand
    implements PlotBand
{

    private String borderColor;
    private double borderWidth;
    private String color;
    private double from;
    private String id;
    private double innerRadiusAsNumber;
    private String innerRadiusAsString;
    private Label label;
    private double outerRadiusAsNumber;
    private String outerRadiusAsString;
    private double thicknessAsNumber;
    private String thicknessAsString;
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

    public Label label() {
        return label;
    }

    public MockPlotBand label(Label label) {
        this.label = label;
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
