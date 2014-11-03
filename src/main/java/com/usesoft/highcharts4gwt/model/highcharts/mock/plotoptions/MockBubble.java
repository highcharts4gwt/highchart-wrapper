
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Bubble;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockScatter;

public class MockBubble
    extends MockScatter
    implements Bubble
{

    private boolean displayNegative;
    private String maxSize;
    private String minSize;
    private String sizeBy;
    private double zMax;
    private double zMin;
    private double zThreshold;

    public boolean displayNegative() {
        return displayNegative;
    }

    public MockBubble displayNegative(boolean displayNegative) {
        this.displayNegative = displayNegative;
        return this;
    }

    public String maxSize() {
        return maxSize;
    }

    public MockBubble maxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public String minSize() {
        return minSize;
    }

    public MockBubble minSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    public String sizeBy() {
        return sizeBy;
    }

    public MockBubble sizeBy(String sizeBy) {
        this.sizeBy = sizeBy;
        return this;
    }

    public double zMax() {
        return zMax;
    }

    public MockBubble zMax(double zMax) {
        this.zMax = zMax;
        return this;
    }

    public double zMin() {
        return zMin;
    }

    public MockBubble zMin(double zMin) {
        this.zMin = zMin;
        return this;
    }

    public double zThreshold() {
        return zThreshold;
    }

    public MockBubble zThreshold(double zThreshold) {
        this.zThreshold = zThreshold;
        return this;
    }

}
