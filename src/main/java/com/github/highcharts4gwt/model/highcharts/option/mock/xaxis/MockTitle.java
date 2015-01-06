
package com.github.highcharts4gwt.model.highcharts.option.mock.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Title;

public class MockTitle
    implements Title
{

    private String align;
    private String enabled;
    private double margin;
    private double offset;
    private double rotation;
    private String style;
    private String text;

    public String align() {
        return align;
    }

    public MockTitle align(String align) {
        this.align = align;
        return this;
    }

    public String enabled() {
        return enabled;
    }

    public MockTitle enabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    public double margin() {
        return margin;
    }

    public MockTitle margin(double margin) {
        this.margin = margin;
        return this;
    }

    public double offset() {
        return offset;
    }

    public MockTitle offset(double offset) {
        this.offset = offset;
        return this;
    }

    public double rotation() {
        return rotation;
    }

    public MockTitle rotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public String style() {
        return style;
    }

    public MockTitle style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String text() {
        return text;
    }

    public MockTitle text(String text) {
        this.text = text;
        return this;
    }

}
