
package com.usesoft.highcharts4gwt.model.highcharts.mock.drilldown;

import com.usesoft.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;

public class MockDrillUpButton
    implements DrillUpButton
{

    private String position;
    private String relativeTo;
    private String theme;

    public String position() {
        return position;
    }

    public MockDrillUpButton position(String position) {
        this.position = position;
        return this;
    }

    public String relativeTo() {
        return relativeTo;
    }

    public MockDrillUpButton relativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    public String theme() {
        return theme;
    }

    public MockDrillUpButton theme(String theme) {
        this.theme = theme;
        return this;
    }

}
