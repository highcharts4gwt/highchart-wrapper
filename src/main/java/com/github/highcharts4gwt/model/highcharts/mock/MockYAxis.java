
package com.github.highcharts4gwt.model.highcharts.mock;

import com.github.highcharts4gwt.model.highcharts.api.YAxis;
import com.github.highcharts4gwt.model.highcharts.api.yaxis.StackLabels;
import com.github.highcharts4gwt.model.highcharts.api.yaxis.YAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.api.yaxis.YAxisSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.mock.MockXAxis;

public class MockYAxis
    extends MockXAxis
    implements YAxis
{

    private String gridLineInterpolation;
    private String maxColor;
    private String minColor;
    private boolean reversedStacks;
    private StackLabels stackLabels;

    public void addYAxisAfterSetExtremesHandler(YAxisAfterSetExtremesHandler handler) {
    }

    public void addYAxisSetExtremesHandler(YAxisSetExtremesHandler handler) {
    }

    public String gridLineInterpolation() {
        return gridLineInterpolation;
    }

    public MockYAxis gridLineInterpolation(String gridLineInterpolation) {
        this.gridLineInterpolation = gridLineInterpolation;
        return this;
    }

    public String maxColor() {
        return maxColor;
    }

    public MockYAxis maxColor(String maxColor) {
        this.maxColor = maxColor;
        return this;
    }

    public String minColor() {
        return minColor;
    }

    public MockYAxis minColor(String minColor) {
        this.minColor = minColor;
        return this;
    }

    public boolean reversedStacks() {
        return reversedStacks;
    }

    public MockYAxis reversedStacks(boolean reversedStacks) {
        this.reversedStacks = reversedStacks;
        return this;
    }

    public StackLabels stackLabels() {
        return stackLabels;
    }

    public MockYAxis stackLabels(StackLabels stackLabels) {
        this.stackLabels = stackLabels;
        return this;
    }

}