
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Pie;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockPie
    extends MockSeries
    implements Pie
{

    private String borderColor;
    private Number borderWidth;
    private ArrayString center;
    private Number depth;
    private Number endAngle;
    private boolean ignoreHiddenPoint;
    private String innerSizeAsString;
    private Number innerSizeAsNumber;
    private Number minSize;
    private String sizeAsString;
    private Number sizeAsNumber;
    private Number slicedOffset;
    private Number startAngle;

    public String borderColor() {
        return borderColor;
    }

    public MockPie borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Number borderWidth() {
        return borderWidth;
    }

    public MockPie borderWidth(Number borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ArrayString center() {
        return center;
    }

    public MockPie center(ArrayString center) {
        this.center = center;
        return this;
    }

    public Number depth() {
        return depth;
    }

    public MockPie depth(Number depth) {
        this.depth = depth;
        return this;
    }

    public Number endAngle() {
        return endAngle;
    }

    public MockPie endAngle(Number endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public boolean ignoreHiddenPoint() {
        return ignoreHiddenPoint;
    }

    public MockPie ignoreHiddenPoint(boolean ignoreHiddenPoint) {
        this.ignoreHiddenPoint = ignoreHiddenPoint;
        return this;
    }

    public String innerSizeAsString() {
        return innerSizeAsString;
    }

    public MockPie innerSizeAsString(String innerSizeAsString) {
        this.innerSizeAsString = innerSizeAsString;
        return this;
    }

    public Number innerSizeAsNumber() {
        return innerSizeAsNumber;
    }

    public MockPie innerSizeAsNumber(Number innerSizeAsNumber) {
        this.innerSizeAsNumber = innerSizeAsNumber;
        return this;
    }

    public Number minSize() {
        return minSize;
    }

    public MockPie minSize(Number minSize) {
        this.minSize = minSize;
        return this;
    }

    public String sizeAsString() {
        return sizeAsString;
    }

    public MockPie sizeAsString(String sizeAsString) {
        this.sizeAsString = sizeAsString;
        return this;
    }

    public Number sizeAsNumber() {
        return sizeAsNumber;
    }

    public MockPie sizeAsNumber(Number sizeAsNumber) {
        this.sizeAsNumber = sizeAsNumber;
        return this;
    }

    public Number slicedOffset() {
        return slicedOffset;
    }

    public MockPie slicedOffset(Number slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public Number startAngle() {
        return startAngle;
    }

    public MockPie startAngle(Number startAngle) {
        this.startAngle = startAngle;
        return this;
    }

}
