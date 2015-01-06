
package com.github.highcharts4gwt.model.highcharts.option.mock.chart;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.ResetZoomButton;

public class MockResetZoomButton
    implements ResetZoomButton
{

    private String position;
    private String relativeTo;
    private String theme;

    public String position() {
        return position;
    }

    public MockResetZoomButton position(String positionAsJsonString) {
        this.position = positionAsJsonString;
        return this;
    }

    public String relativeTo() {
        return relativeTo;
    }

    public MockResetZoomButton relativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    public String theme() {
        return theme;
    }

    public MockResetZoomButton theme(String themeAsJsonString) {
        this.theme = themeAsJsonString;
        return this;
    }

}
