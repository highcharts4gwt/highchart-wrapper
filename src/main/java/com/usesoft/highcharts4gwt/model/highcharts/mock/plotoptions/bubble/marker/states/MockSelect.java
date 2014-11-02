
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.bubble.marker.states;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.marker.states.Select;

public class MockSelect
    implements Select
{

    private boolean enabled;
    private String fillColor;
    private String lineColor;
    private Number lineWidth;
    private Number radius;

    public boolean enabled() {
        return enabled;
    }

    public MockSelect enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String fillColor() {
        return fillColor;
    }

    public MockSelect fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockSelect lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Number lineWidth() {
        return lineWidth;
    }

    public MockSelect lineWidth(Number lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public Number radius() {
        return radius;
    }

    public MockSelect radius(Number radius) {
        this.radius = radius;
        return this;
    }

}
