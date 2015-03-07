
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Pie;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.Tooltip;

public class MockPie
    implements Pie
{

    private boolean allowPointSelect;
    private boolean animation;
    private String borderColor;
    private double borderWidth;
    private ArrayString centerAsArrayString;
    private ArrayNumber centerAsArrayNumber;
    private ArrayString colors;
    private String cursor;
    private DataLabels dataLabels;
    private double depth;
    private boolean enableMouseTracking;
    private double endAngle;
    private boolean ignoreHiddenPoint;
    private String innerSizeAsString;
    private double innerSizeAsNumber;
    private String linkedTo;
    private double minSize;
    private Point point;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showInLegend;
    private String sizeAsString;
    private double sizeAsNumber;
    private double slicedOffset;
    private double startAngle;
    private States states;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private boolean visible;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockPie allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockPie animation(boolean animation) {
        this.animation = animation;
        return this;
    }

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

    public String cursor() {
        return cursor;
    }

    public MockPie cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockPie dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockPie depth(double depth) {
        this.depth = depth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockPie enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
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

    public String linkedTo() {
        return linkedTo;
    }

    public MockPie linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minSize() {
        return minSize;
    }

    public MockPie minSize(double minSize) {
        this.minSize = minSize;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockPie point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockPie selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockPie shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockPie shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockPie showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
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

    public States states() {
        return states;
    }

    public MockPie states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockPie stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockPie tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockPie visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockPie zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockPie zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPie setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
