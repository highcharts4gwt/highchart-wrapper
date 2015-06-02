
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesSolidgauge;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Tooltip;


/**
 * <p>A <code>solidgauge</code> series. If the <a href="#series<solidgauge>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.solidgauge">plotOptions.solidgauge</a>.</p>
 * 
 */
public class MockSeriesSolidgauge
    implements SeriesSolidgauge
{

    private boolean animation;
    private String cursor;
    private Array<Data> dataAsArrayObject;
    private ArrayNumber dataAsArrayNumber;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private String name;
    private double overshoot;
    private Point point;
    private boolean selected;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private String type;
    private boolean visible;
    private boolean wrap;
    private double xAxisAsNumber;
    private String xAxisAsString;
    private double yAxisAsNumber;
    private String yAxisAsString;
    private double zIndex;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean animation() {
        return animation;
    }

    public MockSeriesSolidgauge animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesSolidgauge cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesSolidgauge dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesSolidgauge dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesSolidgauge dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesSolidgauge enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesSolidgaugeAfterAnimateHandler(SeriesSolidgaugeAfterAnimateHandler handler) {
    }

    public void addSeriesSolidgaugeCheckboxClickHandler(SeriesSolidgaugeCheckboxClickHandler handler) {
    }

    public void addSeriesSolidgaugeClickHandler(SeriesSolidgaugeClickHandler handler) {
    }

    public void addSeriesSolidgaugeHideHandler(SeriesSolidgaugeHideHandler handler) {
    }

    public void addSeriesSolidgaugeLegendItemClickHandler(SeriesSolidgaugeLegendItemClickHandler handler) {
    }

    public void addSeriesSolidgaugeMouseOutHandler(SeriesSolidgaugeMouseOutHandler handler) {
    }

    public void addSeriesSolidgaugeMouseOverHandler(SeriesSolidgaugeMouseOverHandler handler) {
    }

    public void addSeriesSolidgaugeShowHandler(SeriesSolidgaugeShowHandler handler) {
    }

    public String id() {
        return id;
    }

    public MockSeriesSolidgauge id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesSolidgauge index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesSolidgauge keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesSolidgauge legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesSolidgauge name(String name) {
        this.name = name;
        return this;
    }

    public double overshoot() {
        return overshoot;
    }

    public MockSeriesSolidgauge overshoot(double overshoot) {
        this.overshoot = overshoot;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesSolidgauge point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesSolidgauge selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesSolidgauge showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesSolidgauge showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesSolidgauge states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesSolidgauge stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesSolidgauge tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesSolidgauge type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesSolidgauge visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public boolean wrap() {
        return wrap;
    }

    public MockSeriesSolidgauge wrap(boolean wrap) {
        this.wrap = wrap;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesSolidgauge xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesSolidgauge xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesSolidgauge yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesSolidgauge yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesSolidgauge zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesSolidgauge zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesSolidgauge zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesSolidgauge setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesSolidgauge setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
