
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesLine;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Tooltip;


/**
 * <p>A <code>line</code> series. If the <a href="#series<line>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.line">plotOptions.line</a>.</p>
 * 
 */
public class MockSeriesLine
    implements SeriesLine
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

    public MockSeriesLine allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesLine animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesLine color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectEnds() {
        return connectEnds;
    }

    public MockSeriesLine connectEnds(boolean connectEnds) {
        this.connectEnds = connectEnds;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockSeriesLine connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesLine cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesLine cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeriesLine dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesLine dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesLine dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesLine dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesLine enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesLineAfterAnimateHandler(SeriesLineAfterAnimateHandler handler) {
    }

    public void addSeriesLineCheckboxClickHandler(SeriesLineCheckboxClickHandler handler) {
    }

    public void addSeriesLineClickHandler(SeriesLineClickHandler handler) {
    }

    public void addSeriesLineHideHandler(SeriesLineHideHandler handler) {
    }

    public void addSeriesLineLegendItemClickHandler(SeriesLineLegendItemClickHandler handler) {
    }

    public void addSeriesLineMouseOutHandler(SeriesLineMouseOutHandler handler) {
    }

    public void addSeriesLineMouseOverHandler(SeriesLineMouseOverHandler handler) {
    }

    public void addSeriesLineShowHandler(SeriesLineShowHandler handler) {
    }

    public String id() {
        return id;
    }

    public MockSeriesLine id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesLine index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesLine keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesLine legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesLine lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesLine linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockSeriesLine marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesLine name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesLine negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesLine point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesLine pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesLine pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesLine pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesLine pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesLine pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesLine selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesLine shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesLine shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesLine showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesLine showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stack() {
        return stack;
    }

    public MockSeriesLine stack(String stack) {
        this.stack = stack;
        return this;
    }

    public String stacking() {
        return stacking;
    }

    public MockSeriesLine stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesLine states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockSeriesLine step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesLine stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeriesLine threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesLine tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesLine turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesLine type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesLine visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesLine xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesLine xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesLine yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesLine yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesLine zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesLine zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesLine zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesLine setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesLine setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
