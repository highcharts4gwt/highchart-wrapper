
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;

public class MockDrilldown
    implements Drilldown
{

    private String activeAxisLabelStyle;
    private String activeDataLabelStyle;
    private boolean animationAsBoolean;
    private String animationAsJsonString;
    private DrillUpButton drillUpButton;

    public String activeAxisLabelStyle() {
        return activeAxisLabelStyle;
    }

    public MockDrilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString) {
        this.activeAxisLabelStyle = activeAxisLabelStyleAsJsonString;
        return this;
    }

    public String activeDataLabelStyle() {
        return activeDataLabelStyle;
    }

    public MockDrilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString) {
        this.activeDataLabelStyle = activeDataLabelStyleAsJsonString;
        return this;
    }

    public boolean animationAsBoolean() {
        return animationAsBoolean;
    }

    public MockDrilldown animationAsBoolean(boolean animationAsBoolean) {
        this.animationAsBoolean = animationAsBoolean;
        return this;
    }

    public String animationAsJsonString() {
        return animationAsJsonString;
    }

    public MockDrilldown animationAsJsonString(String animationAsJsonString) {
        this.animationAsJsonString = animationAsJsonString;
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