
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesAreasplinerange;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Tooltip;


/**
 * <p>A <code>areasplinerange</code> series. If the <a href="#series<areasplinerange>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.areasplinerange">plotOptions.areasplinerange</a>.</p>
 * 
 */
public class MockSeriesAreasplinerange
    implements SeriesAreasplinerange
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

    public MockSeriesAreasplinerange allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesAreasplinerange animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesAreasplinerange color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockSeriesAreasplinerange connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesAreasplinerange cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesAreasplinerange cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeriesAreasplinerange dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesAreasplinerange dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesAreasplinerange dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesAreasplinerange enableMouseTracking(boolean enableMouseTracking) {
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

    public String fillColor() {
        return fillColor;
    }

    public MockSeriesAreasplinerange fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double fillOpacity() {
        return fillOpacity;
    }

    public MockSeriesAreasplinerange fillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesAreasplinerange id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesAreasplinerange index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesAreasplinerange keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesAreasplinerange legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockSeriesAreasplinerange lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesAreasplinerange lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesAreasplinerange linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesAreasplinerange name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesAreasplinerange negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockSeriesAreasplinerange negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesAreasplinerange point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesAreasplinerange pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesAreasplinerange pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesAreasplinerange pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesAreasplinerange pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesAreasplinerange pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesAreasplinerange selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesAreasplinerange shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesAreasplinerange shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesAreasplinerange showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesAreasplinerange showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesAreasplinerange states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockSeriesAreasplinerange step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesAreasplinerange stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesAreasplinerange tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockSeriesAreasplinerange trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesAreasplinerange turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesAreasplinerange type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesAreasplinerange visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesAreasplinerange xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesAreasplinerange xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesAreasplinerange yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesAreasplinerange yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesAreasplinerange zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesAreasplinerange zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesAreasplinerange zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesAreasplinerange setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesAreasplinerange setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
