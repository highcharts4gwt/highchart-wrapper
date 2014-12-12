
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockColumn
    extends MockSeries
    implements Column
{

    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private boolean colorByPoint;
    private ArrayString colors;
    private double depth;
    private String edgeColor;
    private double edgeWidth;
    private double groupPadding;
    private double groupZPadding;
    private boolean grouping;
    private double minPointLength;
    private double pointPadding;
    private double pointRange;
    private double pointWidth;

    public String borderColor() {
        return borderColor;
    }

    public MockColumn borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockColumn borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockColumn borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockColumn colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockColumn colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockColumn depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockColumn edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockColumn edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public void addColumnAfterAnimateHandler(ColumnAfterAnimateHandler handler) {
    }

    public void addColumnCheckboxClickHandler(ColumnCheckboxClickHandler handler) {
    }

    public void addColumnClickHandler(ColumnClickHandler handler) {
    }

    public void addColumnHideHandler(ColumnHideHandler handler) {
    }

    public void addColumnLegendItemClickHandler(ColumnLegendItemClickHandler handler) {
    }

    public void addColumnMouseOutHandler(ColumnMouseOutHandler handler) {
    }

    public void addColumnMouseOverHandler(ColumnMouseOverHandler handler) {
    }

    public void addColumnShowHandler(ColumnShowHandler handler) {
    }

    public double groupPadding() {
        return groupPadding;
    }

    public MockColumn groupPadding(double groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockColumn groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public boolean grouping() {
        return grouping;
    }

    public MockColumn grouping(boolean grouping) {
        this.grouping = grouping;
        return this;
    }

    public double minPointLength() {
        return minPointLength;
    }

    public MockColumn minPointLength(double minPointLength) {
        this.minPointLength = minPointLength;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockColumn pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockColumn pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockColumn pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

}
