
package com.github.highcharts4gwt.model.highcharts.mock.legend;

import com.github.highcharts4gwt.model.highcharts.api.legend.Navigation;

public class MockNavigation
    implements Navigation
{

    private String activeColor;
    private boolean animationAsBoolean;
    private String animationAsJsonString;
    private double arrowSize;
    private String inactiveColor;
    private String style;

    public String activeColor() {
        return activeColor;
    }

    public MockNavigation activeColor(String activeColor) {
        this.activeColor = activeColor;
        return this;
    }

    public boolean animationAsBoolean() {
        return animationAsBoolean;
    }

    public MockNavigation animationAsBoolean(boolean animationAsBoolean) {
        this.animationAsBoolean = animationAsBoolean;
        return this;
    }

    public String animationAsJsonString() {
        return animationAsJsonString;
    }

    public MockNavigation animationAsJsonString(String animationAsJsonString) {
        this.animationAsJsonString = animationAsJsonString;
        return this;
    }

    public double arrowSize() {
        return arrowSize;
    }

    public MockNavigation arrowSize(double arrowSize) {
        this.arrowSize = arrowSize;
        return this;
    }

    public String inactiveColor() {
        return inactiveColor;
    }

    public MockNavigation inactiveColor(String inactiveColor) {
        this.inactiveColor = inactiveColor;
        return this;
    }

    public String style() {
        return style;
    }

    public MockNavigation style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

}
