
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPolygon;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Tooltip;


/**
 * <p>A <code>polygon</code> series. If the <a href="#series<polygon>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.polygon">plotOptions.polygon</a>.</p>
 * 
 */
public class MockSeriesPolygon
    implements SeriesPolygon
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private Array<Data> dataAsArrayObject;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private double lineWidth;
    private String linkedTo;
    private Marker marker;
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

    public MockSeriesPolygon allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesPolygon animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesPolygon color(String color) {
        this.color = color;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesPolygon cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesPolygon cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeriesPolygon dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesPolygon dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesPolygon dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesPolygon enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesPolygonAfterAnimateHandler(SeriesPolygonAfterAnimateHandler handler) {
    }

    public void addSeriesPolygonCheckboxClickHandler(SeriesPolygonCheckboxClickHandler handler) {
    }

    public void addSeriesPolygonClickHandler(SeriesPolygonClickHandler handler) {
    }

    public void addSeriesPolygonHideHandler(SeriesPolygonHideHandler handler) {
    }

    public void addSeriesPolygonLegendItemClickHandler(SeriesPolygonLegendItemClickHandler handler) {
    }

    public void addSeriesPolygonMouseOutHandler(SeriesPolygonMouseOutHandler handler) {
    }

    public void addSeriesPolygonMouseOverHandler(SeriesPolygonMouseOverHandler handler) {
    }

    public void addSeriesPolygonShowHandler(SeriesPolygonShowHandler handler) {
    }

    public String id() {
        return id;
    }

    public MockSeriesPolygon id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesPolygon index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesPolygon keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesPolygon legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesPolygon lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesPolygon linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockSeriesPolygon marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesPolygon name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesPolygon negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesPolygon point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesPolygon pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesPolygon pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesPolygon pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesPolygon selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesPolygon shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesPolygon shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesPolygon showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesPolygon showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesPolygon states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesPolygon stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeriesPolygon threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesPolygon tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesPolygon turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesPolygon type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesPolygon visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesPolygon xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesPolygon xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesPolygon yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesPolygon yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesPolygon zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesPolygon zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesPolygon zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesPolygon setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesPolygon setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
