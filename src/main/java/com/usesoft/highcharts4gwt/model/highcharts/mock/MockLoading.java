
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.Loading;

public class MockLoading
    implements Loading
{

    private double hideDuration;
    private String labelStyle;
    private double showDuration;
    private String style;

    public double hideDuration() {
        return hideDuration;
    }

    public MockLoading hideDuration(double hideDuration) {
        this.hideDuration = hideDuration;
        return this;
    }

    public String labelStyle() {
        return labelStyle;
    }

    public MockLoading labelStyle(String labelStyleAsJsonString) {
        this.labelStyle = labelStyleAsJsonString;
        return this;
    }

    public double showDuration() {
        return showDuration;
    }

    public MockLoading showDuration(double showDuration) {
        this.showDuration = showDuration;
        return this;
    }

    public String style() {
        return style;
    }

    public MockLoading style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

}
