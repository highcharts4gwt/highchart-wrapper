
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline.states.hover;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.states.hover.Halo;

public class MockHalo
    implements Halo
{

    private String attributes;
    private Number opacity;
    private Number size;

    public String attributes() {
        return attributes;
    }

    public MockHalo attributes(String attributes) {
        this.attributes = attributes;
        return this;
    }

    public Number opacity() {
        return opacity;
    }

    public MockHalo opacity(Number opacity) {
        this.opacity = opacity;
        return this;
    }

    public Number size() {
        return size;
    }

    public MockHalo size(Number size) {
        this.size = size;
        return this;
    }

}
