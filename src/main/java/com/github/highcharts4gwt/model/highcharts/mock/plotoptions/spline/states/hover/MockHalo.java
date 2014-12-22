
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.spline.states.hover;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.states.hover.Halo;

public class MockHalo
    implements Halo
{

    private String attributes;
    private double opacity;
    private double size;

    public String attributes() {
        return attributes;
    }

    public MockHalo attributes(String attributesAsJsonString) {
        this.attributes = attributesAsJsonString;
        return this;
    }

    public double opacity() {
        return opacity;
    }

    public MockHalo opacity(double opacity) {
        this.opacity = opacity;
        return this;
    }

    public double size() {
        return size;
    }

    public MockHalo size(double size) {
        this.size = size;
        return this;
    }

}