
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesColumn;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.Tooltip;


/**
 * <p>A <code>column</code> series. If the <a href="#series<column>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.column">plotOptions.column</a>.</p>
 * 
 */
public class MockSeriesColumn
    implements SeriesColumn
{

    private boolean allowPointSelect;
    private boolean animation;
    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private double cropThreshold;
    private String cursor;
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
    private String linkedTo;
    private double minPointLength;
    private String name;
    private String negativeColor;
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
    private String stacking;
    private States states;
    private boolean stickyTracking;
    private double threshold;
    private Tooltip tooltip;
    private double turboThreshold;
    private String type;
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

    public MockSeriesColumn allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesColumn animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockSeriesColumn borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockSeriesColumn borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockSeriesColumn borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesColumn color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockSeriesColumn colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesColumn colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesColumn cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesColumn cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesColumn dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesColumn dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesColumn dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockSeriesColumn depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockSeriesColumn edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockSeriesColumn edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesColumn enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesColumnAfterAnimateHandler(SeriesColumnAfterAnimateHandler handler) {
    }

    public void addSeriesColumnCheckboxClickHandler(SeriesColumnCheckboxClickHandler handler) {
    }

    public void addSeriesColumnClickHandler(SeriesColumnClickHandler handler) {
    }

    public void addSeriesColumnHideHandler(SeriesColumnHideHandler handler) {
    }

    public void addSeriesColumnLegendItemClickHandler(SeriesColumnLegendItemClickHandler handler) {
    }

    public void addSeriesColumnMouseOutHandler(SeriesColumnMouseOutHandler handler) {
    }

    public void addSeriesColumnMouseOverHandler(SeriesColumnMouseOverHandler handler) {
    }

    public void addSeriesColumnShowHandler(SeriesColumnShowHandler handler) {
    }

    public double groupPadding() {
        return groupPadding;
    }

    public MockSeriesColumn groupPadding(double groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockSeriesColumn groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public boolean grouping() {
        return grouping;
    }

    public MockSeriesColumn grouping(boolean grouping) {
        this.grouping = grouping;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesColumn id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesColumn index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesColumn keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesColumn legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesColumn linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minPointLength() {
        return minPointLength;
    }

    public MockSeriesColumn minPointLength(double minPointLength) {
        this.minPointLength = minPointLength;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesColumn name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesColumn negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesColumn point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesColumn pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesColumn pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockSeriesColumn pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesColumn pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesColumn pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockSeriesColumn pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesColumn pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockSeriesColumn pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesColumn selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesColumn shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesColumn shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesColumn showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesColumn showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stack() {
        return stack;
    }

    public MockSeriesColumn stack(String stack) {
        this.stack = stack;
        return this;
    }

    public String stacking() {
        return stacking;
    }

    public MockSeriesColumn stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesColumn states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesColumn stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeriesColumn threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesColumn tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesColumn turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesColumn type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesColumn visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesColumn xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesColumn xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesColumn yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesColumn yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesColumn zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesColumn zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesColumn zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesColumn setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesColumn setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
