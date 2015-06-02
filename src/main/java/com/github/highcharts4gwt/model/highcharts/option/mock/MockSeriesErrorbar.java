
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesErrorbar;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.States;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Tooltip;


/**
 * <p>A <code>errorbar</code> series. If the <a href="#series<errorbar>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.errorbar">plotOptions.errorbar</a>.</p>
 * 
 */
public class MockSeriesErrorbar
    implements SeriesErrorbar
{

    private boolean allowPointSelect;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private String cursor;
    private Array<Data> dataAsArrayObject;
    private double depth;
    private String edgeColor;
    private double edgeWidth;
    private boolean enableMouseTracking;
    private double groupZPadding;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private double lineWidth;
    private String linkedTo;
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
    private States states;
    private String stemColor;
    private String stemDashStyle;
    private double stemWidth;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private double turboThreshold;
    private String type;
    private boolean visible;
    private String whiskerColor;
    private double whiskerLengthAsNumber;
    private String whiskerLengthAsString;
    private double whiskerWidth;
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

    public MockSeriesErrorbar allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesErrorbar color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockSeriesErrorbar colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesErrorbar colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesErrorbar cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesErrorbar dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockSeriesErrorbar depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockSeriesErrorbar edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockSeriesErrorbar edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesErrorbar enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesErrorbarAfterAnimateHandler(SeriesErrorbarAfterAnimateHandler handler) {
    }

    public void addSeriesErrorbarCheckboxClickHandler(SeriesErrorbarCheckboxClickHandler handler) {
    }

    public void addSeriesErrorbarClickHandler(SeriesErrorbarClickHandler handler) {
    }

    public void addSeriesErrorbarHideHandler(SeriesErrorbarHideHandler handler) {
    }

    public void addSeriesErrorbarLegendItemClickHandler(SeriesErrorbarLegendItemClickHandler handler) {
    }

    public void addSeriesErrorbarMouseOutHandler(SeriesErrorbarMouseOutHandler handler) {
    }

    public void addSeriesErrorbarMouseOverHandler(SeriesErrorbarMouseOverHandler handler) {
    }

    public void addSeriesErrorbarShowHandler(SeriesErrorbarShowHandler handler) {
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockSeriesErrorbar groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesErrorbar id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesErrorbar index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesErrorbar keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesErrorbar legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesErrorbar lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesErrorbar linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesErrorbar name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesErrorbar negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesErrorbar point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesErrorbar pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesErrorbar pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockSeriesErrorbar pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesErrorbar pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesErrorbar pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockSeriesErrorbar pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesErrorbar pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockSeriesErrorbar pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesErrorbar selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesErrorbar states(States states) {
        this.states = states;
        return this;
    }

    public String stemColor() {
        return stemColor;
    }

    public MockSeriesErrorbar stemColor(String stemColor) {
        this.stemColor = stemColor;
        return this;
    }

    public String stemDashStyle() {
        return stemDashStyle;
    }

    public MockSeriesErrorbar stemDashStyle(String stemDashStyle) {
        this.stemDashStyle = stemDashStyle;
        return this;
    }

    public double stemWidth() {
        return stemWidth;
    }

    public MockSeriesErrorbar stemWidth(double stemWidth) {
        this.stemWidth = stemWidth;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesErrorbar stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesErrorbar tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesErrorbar turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesErrorbar type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesErrorbar visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String whiskerColor() {
        return whiskerColor;
    }

    public MockSeriesErrorbar whiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
        return this;
    }

    public double whiskerLengthAsNumber() {
        return whiskerLengthAsNumber;
    }

    public MockSeriesErrorbar whiskerLengthAsNumber(double whiskerLengthAsNumber) {
        this.whiskerLengthAsNumber = whiskerLengthAsNumber;
        return this;
    }

    public String whiskerLengthAsString() {
        return whiskerLengthAsString;
    }

    public MockSeriesErrorbar whiskerLengthAsString(String whiskerLengthAsString) {
        this.whiskerLengthAsString = whiskerLengthAsString;
        return this;
    }

    public double whiskerWidth() {
        return whiskerWidth;
    }

    public MockSeriesErrorbar whiskerWidth(double whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesErrorbar xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesErrorbar xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesErrorbar yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesErrorbar yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesErrorbar zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesErrorbar zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesErrorbar zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesErrorbar setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesErrorbar setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
