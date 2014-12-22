
package com.github.highcharts4gwt.model.highcharts.mock.yaxis;

import com.github.highcharts4gwt.model.highcharts.api.yaxis.StackLabels;

public class MockStackLabels
    implements StackLabels
{

    private String align;
    private boolean enabled;
    private String format;
    private double rotation;
    private String style;
    private String textAlign;
    private boolean useHTML;
    private String verticalAlign;
    private double x;
    private double y;

    public String align() {
        return align;
    }

    public MockStackLabels align(String align) {
        this.align = align;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockStackLabels enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String format() {
        return format;
    }

    public MockStackLabels format(String format) {
        this.format = format;
        return this;
    }

    public double rotation() {
        return rotation;
    }

    public MockStackLabels rotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public String style() {
        return style;
    }

    public MockStackLabels style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String textAlign() {
        return textAlign;
    }

    public MockStackLabels textAlign(String textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockStackLabels useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockStackLabels verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double x() {
        return x;
    }

    public MockStackLabels x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockStackLabels y(double y) {
        this.y = y;
        return this;
    }

}
