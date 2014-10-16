
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.Loading;

public class MockLoading
    implements Loading
{

    private Number hideDuration;
    private String labelStyle;
    private Number showDuration;
    private String style;

    public Number hideDuration() {
        return hideDuration;
    }

    public MockLoading hideDuration(Number hideDuration) {
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

    public Number showDuration() {
        return showDuration;
    }

    public MockLoading showDuration(Number showDuration) {
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
