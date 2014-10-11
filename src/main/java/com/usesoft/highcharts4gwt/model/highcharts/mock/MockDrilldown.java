
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.Drilldown;
import com.usesoft.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;

public class MockDrilldown
    implements Drilldown
{

    private String activeAxisLabelStyle;
    private String activeDataLabelStyle;
    private DrillUpButton drillUpButton;

    public String activeAxisLabelStyle() {
        return activeAxisLabelStyle;
    }

    public MockDrilldown activeAxisLabelStyle(String activeAxisLabelStyle) {
        this.activeAxisLabelStyle = activeAxisLabelStyle;
        return this;
    }

    public String activeDataLabelStyle() {
        return activeDataLabelStyle;
    }

    public MockDrilldown activeDataLabelStyle(String activeDataLabelStyle) {
        this.activeDataLabelStyle = activeDataLabelStyle;
        return this;
    }

    public DrillUpButton drillUpButton() {
        return drillUpButton;
    }

    public MockDrilldown drillUpButton(DrillUpButton drillUpButton) {
        this.drillUpButton = drillUpButton;
        return this;
    }

}
