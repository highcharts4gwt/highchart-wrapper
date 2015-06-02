
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesArearange;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.Tooltip;


/**
 * <p>A <code>arearange</code> series. If the <a href="#series<arearange>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.arearange">plotOptions.arearange</a>.</p>
 * 
 */
public class MockSeriesArearange
    implements SeriesArearange
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private boolean connectNulls;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private Array<Data> dataAsArrayObject;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private String fillColor;
    private double fillOpacity;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private String lineColor;
    private double lineWidth;
    private String linkedTo;
    private String name;
    private String negativeColor;
    private String negativeFillColor;
    private Point point;
    private double pointInterval;
    private String pointIntervalUnit;
    private String pointPlacementAsString;
    private double pointPlacementAsNumber;
    private double pointStart;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private String step;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private boolean trackByArea;
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

    public MockSeriesArearange allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesArearange animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesArearange color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockSeriesArearange connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesArearange cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesArearange cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeriesArearange dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesArearange dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesArearange dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesArearange enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesArearangeAfterAnimateHandler(SeriesArearangeAfterAnimateHandler handler) {
    }

    public void addSeriesArearangeCheckboxClickHandler(SeriesArearangeCheckboxClickHandler handler) {
    }

    public void addSeriesArearangeClickHandler(SeriesArearangeClickHandler handler) {
    }

    public void addSeriesArearangeHideHandler(SeriesArearangeHideHandler handler) {
    }

    public void addSeriesArearangeLegendItemClickHandler(SeriesArearangeLegendItemClickHandler handler) {
    }

    public void addSeriesArearangeMouseOutHandler(SeriesArearangeMouseOutHandler handler) {
    }

    public void addSeriesArearangeMouseOverHandler(SeriesArearangeMouseOverHandler handler) {
    }

    public void addSeriesArearangeShowHandler(SeriesArearangeShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockSeriesArearange fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double fillOpacity() {
        return fillOpacity;
    }

    public MockSeriesArearange fillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesArearange id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesArearange index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesArearange keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesArearange legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockSeriesArearange lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesArearange lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesArearange linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesArearange name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesArearange negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockSeriesArearange negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesArearange point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesArearange pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesArearange pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesArearange pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesArearange pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesArearange pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesArearange selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesArearange shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesArearange shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesArearange showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesArearange showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesArearange states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockSeriesArearange step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesArearange stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesArearange tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockSeriesArearange trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesArearange turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesArearange type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesArearange visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesArearange xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesArearange xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesArearange yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesArearange yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesArearange zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesArearange zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesArearange zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesArearange setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesArearange setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
