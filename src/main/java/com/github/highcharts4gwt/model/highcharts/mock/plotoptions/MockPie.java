
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Pie;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowHandler;
import com.github.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockPie
    extends MockSeries
    implements Pie
{

    private String borderColor;
    private double borderWidth;
    private ArrayString centerAsArrayString;
    private ArrayNumber centerAsArrayNumber;
    private ArrayString colors;
    private double depth;
    private double endAngle;
    private boolean ignoreHiddenPoint;
    private String innerSizeAsString;
    private double innerSizeAsNumber;
    private double minSize;
    private String sizeAsString;
    private double sizeAsNumber;
    private double slicedOffset;
    private double startAngle;

    public String borderColor() {
        return borderColor;
    }

    public MockPie borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockPie borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ArrayString centerAsArrayString() {
        return centerAsArrayString;
    }

    public MockPie centerAsArrayString(ArrayString centerAsArrayString) {
        this.centerAsArrayString = centerAsArrayString;
        return this;
    }

    public ArrayNumber centerAsArrayNumber() {
        return centerAsArrayNumber;
    }

    public MockPie centerAsArrayNumber(ArrayNumber centerAsArrayNumber) {
        this.centerAsArrayNumber = centerAsArrayNumber;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockPie colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockPie depth(double depth) {
        this.depth = depth;
        return this;
    }

    public double endAngle() {
        return endAngle;
    }

    public MockPie endAngle(double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public void addPieAfterAnimateHandler(PieAfterAnimateHandler handler) {
    }

    public void addPieCheckboxClickHandler(PieCheckboxClickHandler handler) {
    }

    public void addPieClickHandler(PieClickHandler handler) {
    }

    public void addPieHideHandler(PieHideHandler handler) {
    }

    public void addPieLegendItemClickHandler(PieLegendItemClickHandler handler) {
    }

    public void addPieMouseOutHandler(PieMouseOutHandler handler) {
    }

    public void addPieMouseOverHandler(PieMouseOverHandler handler) {
    }

    public void addPieShowHandler(PieShowHandler handler) {
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

    public double innerSizeAsNumber() {
        return innerSizeAsNumber;
    }

    public MockPie innerSizeAsNumber(double innerSizeAsNumber) {
        this.innerSizeAsNumber = innerSizeAsNumber;
        return this;
    }

    public double minSize() {
        return minSize;
    }

    public MockPie minSize(double minSize) {
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

    public double sizeAsNumber() {
        return sizeAsNumber;
    }

    public MockPie sizeAsNumber(double sizeAsNumber) {
        this.sizeAsNumber = sizeAsNumber;
        return this;
    }

    public double slicedOffset() {
        return slicedOffset;
    }

    public MockPie slicedOffset(double slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public double startAngle() {
        return startAngle;
    }

    public MockPie startAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

}