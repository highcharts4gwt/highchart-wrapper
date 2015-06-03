
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesBubble;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Tooltip;


/**
 * <p>A <code>bubble</code> series. If the <a href="#series<bubble>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.bubble">plotOptions.bubble</a>.</p>
 * 
 */
public class MockSeriesBubble
    implements SeriesBubble
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private Array<Data> dataAsArrayObject;
    private DataLabels dataLabels;
    private boolean displayNegative;
    private boolean enableMouseTracking;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private double lineWidth;
    private String linkedTo;
    private Marker marker;
    private String maxSize;
    private String minSize;
    private String name;
    private String negativeColor;
    private Point point;
    private double pointInterval;
    private String pointIntervalUnit;
    private double pointStart;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showCheckbox;
    private boolean showInLegend;
    private String sizeBy;
    private States states;
    private boolean stickyTracking;
    private double threshold;
    private Tooltip tooltip;
    private String type;
    private boolean visible;
    private double xAxisAsNumber;
    private String xAxisAsString;
    private double yAxisAsNumber;
    private String yAxisAsString;
    private double zIndex;
    private double zMax;
    private double zMin;
    private double zThreshold;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockSeriesBubble allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesBubble animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesBubble color(String color) {
        this.color = color;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesBubble cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesBubble cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeriesBubble dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesBubble dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesBubble dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean displayNegative() {
        return displayNegative;
    }

    public MockSeriesBubble displayNegative(boolean displayNegative) {
        this.displayNegative = displayNegative;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesBubble enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addAfterAnimateHandler(AfterAnimateHandler handler) {
    }

    public void addCheckboxClickHandler(CheckboxClickHandler handler) {
    }

    public void addClickHandler(ClickHandler handler) {
    }

    public void addHideHandler(HideHandler handler) {
    }

    public void addLegendItemClickHandler(LegendItemClickHandler handler) {
    }

    public void addMouseOutHandler(MouseOutHandler handler) {
    }

    public void addMouseOverHandler(MouseOverHandler handler) {
    }

    public void addShowHandler(ShowHandler handler) {
    }

    public String id() {
        return id;
    }

    public MockSeriesBubble id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesBubble index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesBubble keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesBubble legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesBubble lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesBubble linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockSeriesBubble marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String maxSize() {
        return maxSize;
    }

    public MockSeriesBubble maxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public String minSize() {
        return minSize;
    }

    public MockSeriesBubble minSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesBubble name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesBubble negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesBubble point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesBubble pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesBubble pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesBubble pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesBubble selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesBubble shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesBubble shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesBubble showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesBubble showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String sizeBy() {
        return sizeBy;
    }

    public MockSeriesBubble sizeBy(String sizeBy) {
        this.sizeBy = sizeBy;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesBubble states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesBubble stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeriesBubble threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesBubble tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesBubble type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesBubble visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesBubble xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesBubble xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesBubble yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesBubble yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesBubble zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public double zMax() {
        return zMax;
    }

    public MockSeriesBubble zMax(double zMax) {
        this.zMax = zMax;
        return this;
    }

    public double zMin() {
        return zMin;
    }

    public MockSeriesBubble zMin(double zMin) {
        this.zMin = zMin;
        return this;
    }

    public double zThreshold() {
        return zThreshold;
    }

    public MockSeriesBubble zThreshold(double zThreshold) {
        this.zThreshold = zThreshold;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesBubble zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesBubble zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesBubble setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesBubble setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
