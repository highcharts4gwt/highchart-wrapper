
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesAreaspline;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Tooltip;


/**
 * <p>A <code>areaspline</code> series. If the <a href="#series<areaspline>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.areaspline">plotOptions.areaspline</a>.</p>
 * 
 */
public class MockSeriesAreaspline
    implements SeriesAreaspline
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private boolean connectEnds;
    private boolean connectNulls;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private Array<Data> dataAsArrayObject;
    private ArrayNumber dataAsArrayNumber;
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
    private Marker marker;
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
    private String stack;
    private String stacking;
    private States states;
    private String step;
    private boolean stickyTracking;
    private double threshold;
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

    public MockSeriesAreaspline allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesAreaspline animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesAreaspline color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectEnds() {
        return connectEnds;
    }

    public MockSeriesAreaspline connectEnds(boolean connectEnds) {
        this.connectEnds = connectEnds;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockSeriesAreaspline connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesAreaspline cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesAreaspline cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeriesAreaspline dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesAreaspline dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesAreaspline dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesAreaspline dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesAreaspline enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesAreasplineAfterAnimateHandler(SeriesAreasplineAfterAnimateHandler handler) {
    }

    public void addSeriesAreasplineCheckboxClickHandler(SeriesAreasplineCheckboxClickHandler handler) {
    }

    public void addSeriesAreasplineClickHandler(SeriesAreasplineClickHandler handler) {
    }

    public void addSeriesAreasplineHideHandler(SeriesAreasplineHideHandler handler) {
    }

    public void addSeriesAreasplineLegendItemClickHandler(SeriesAreasplineLegendItemClickHandler handler) {
    }

    public void addSeriesAreasplineMouseOutHandler(SeriesAreasplineMouseOutHandler handler) {
    }

    public void addSeriesAreasplineMouseOverHandler(SeriesAreasplineMouseOverHandler handler) {
    }

    public void addSeriesAreasplineShowHandler(SeriesAreasplineShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockSeriesAreaspline fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double fillOpacity() {
        return fillOpacity;
    }

    public MockSeriesAreaspline fillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesAreaspline id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesAreaspline index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesAreaspline keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesAreaspline legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockSeriesAreaspline lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesAreaspline lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesAreaspline linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockSeriesAreaspline marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesAreaspline name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesAreaspline negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockSeriesAreaspline negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesAreaspline point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesAreaspline pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesAreaspline pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesAreaspline pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesAreaspline pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesAreaspline pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesAreaspline selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesAreaspline shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesAreaspline shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesAreaspline showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesAreaspline showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stack() {
        return stack;
    }

    public MockSeriesAreaspline stack(String stack) {
        this.stack = stack;
        return this;
    }

    public String stacking() {
        return stacking;
    }

    public MockSeriesAreaspline stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesAreaspline states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockSeriesAreaspline step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesAreaspline stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeriesAreaspline threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesAreaspline tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockSeriesAreaspline trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesAreaspline turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesAreaspline type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesAreaspline visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesAreaspline xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesAreaspline xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesAreaspline yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesAreaspline yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesAreaspline zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesAreaspline zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesAreaspline zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesAreaspline setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesAreaspline setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
