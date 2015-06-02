
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesWaterfall;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.States;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Tooltip;


/**
 * <p>A <code>waterfall</code> series. If the <a href="#series<waterfall>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.waterfall">plotOptions.waterfall</a>.</p>
 * 
 */
public class MockSeriesWaterfall
    implements SeriesWaterfall
{

    private boolean allowPointSelect;
    private boolean animation;
    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private String cursor;
    private String dashStyle;
    private Array<Data> dataAsArrayObject;
    private ArrayNumber dataAsArrayNumber;
    private DataLabels dataLabels;
    private double depth;
    private String edgeColor;
    private double edgeWidth;
    private boolean enableMouseTracking;
    private double groupPadding;
    private double groupZPadding;
    private boolean grouping;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private String lineColor;
    private String linkedTo;
    private double minPointLength;
    private String name;
    private Point point;
    private double pointInterval;
    private String pointIntervalUnit;
    private double pointPadding;
    private String pointPlacementAsString;
    private double pointPlacementAsNumber;
    private double pointRange;
    private double pointStart;
    private double pointWidth;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showCheckbox;
    private boolean showInLegend;
    private String stack;
    private States states;
    private boolean stickyTracking;
    private double threshold;
    private Tooltip tooltip;
    private String type;
    private String upColor;
    private boolean visible;
    private double xAxisAsNumber;
    private String xAxisAsString;
    private double yAxisAsNumber;
    private String yAxisAsString;
    private double zIndex;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockSeriesWaterfall allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesWaterfall animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockSeriesWaterfall borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockSeriesWaterfall borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockSeriesWaterfall borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesWaterfall color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockSeriesWaterfall colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesWaterfall colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesWaterfall cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeriesWaterfall dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesWaterfall dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesWaterfall dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesWaterfall dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockSeriesWaterfall depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockSeriesWaterfall edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockSeriesWaterfall edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesWaterfall enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesWaterfallAfterAnimateHandler(SeriesWaterfallAfterAnimateHandler handler) {
    }

    public void addSeriesWaterfallCheckboxClickHandler(SeriesWaterfallCheckboxClickHandler handler) {
    }

    public void addSeriesWaterfallClickHandler(SeriesWaterfallClickHandler handler) {
    }

    public void addSeriesWaterfallHideHandler(SeriesWaterfallHideHandler handler) {
    }

    public void addSeriesWaterfallLegendItemClickHandler(SeriesWaterfallLegendItemClickHandler handler) {
    }

    public void addSeriesWaterfallMouseOutHandler(SeriesWaterfallMouseOutHandler handler) {
    }

    public void addSeriesWaterfallMouseOverHandler(SeriesWaterfallMouseOverHandler handler) {
    }

    public void addSeriesWaterfallShowHandler(SeriesWaterfallShowHandler handler) {
    }

    public double groupPadding() {
        return groupPadding;
    }

    public MockSeriesWaterfall groupPadding(double groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockSeriesWaterfall groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public boolean grouping() {
        return grouping;
    }

    public MockSeriesWaterfall grouping(boolean grouping) {
        this.grouping = grouping;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesWaterfall id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesWaterfall index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesWaterfall keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesWaterfall legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockSeriesWaterfall lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesWaterfall linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minPointLength() {
        return minPointLength;
    }

    public MockSeriesWaterfall minPointLength(double minPointLength) {
        this.minPointLength = minPointLength;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesWaterfall name(String name) {
        this.name = name;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesWaterfall point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesWaterfall pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesWaterfall pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockSeriesWaterfall pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesWaterfall pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesWaterfall pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockSeriesWaterfall pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesWaterfall pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockSeriesWaterfall pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesWaterfall selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesWaterfall shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesWaterfall shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesWaterfall showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesWaterfall showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stack() {
        return stack;
    }

    public MockSeriesWaterfall stack(String stack) {
        this.stack = stack;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesWaterfall states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesWaterfall stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeriesWaterfall threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesWaterfall tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesWaterfall type(String type) {
        this.type = type;
        return this;
    }

    public String upColor() {
        return upColor;
    }

    public MockSeriesWaterfall upColor(String upColor) {
        this.upColor = upColor;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesWaterfall visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesWaterfall xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesWaterfall xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesWaterfall yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesWaterfall yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesWaterfall zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesWaterfall zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesWaterfall zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesWaterfall setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesWaterfall setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
