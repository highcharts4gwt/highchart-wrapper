
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.bar.states.hover;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.states.hover.Halo;

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
