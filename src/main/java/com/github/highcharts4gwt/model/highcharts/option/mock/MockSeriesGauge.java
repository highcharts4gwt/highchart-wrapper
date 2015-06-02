
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesGauge;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Dial;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Pivot;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Tooltip;


/**
 * <p>A <code>gauge</code> series. If the <a href="#series<gauge>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.gauge">plotOptions.gauge</a>.</p>
 * 
 */
public class MockSeriesGauge
    implements SeriesGauge
{

    private boolean animation;
    private String color;
    private String cursor;
    private Array<Data> dataAsArrayObject;
    private ArrayNumber dataAsArrayNumber;
    private DataLabels dataLabels;
    private Dial dial;
    private boolean enableMouseTracking;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private String linkedTo;
    private String name;
    private String negativeColor;
    private double overshoot;
    private Pivot pivot;
    private Point point;
    private boolean selected;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private boolean stickyTracking;
    private double threshold;
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

    public MockSeriesGauge animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesGauge color(String color) {
        this.color = color;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesGauge cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesGauge dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesGauge dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesGauge dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public Dial dial() {
        return dial;
    }

    public MockSeriesGauge dial(Dial dial) {
        this.dial = dial;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesGauge enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesGaugeAfterAnimateHandler(SeriesGaugeAfterAnimateHandler handler) {
    }

    public void addSeriesGaugeCheckboxClickHandler(SeriesGaugeCheckboxClickHandler handler) {
    }

    public void addSeriesGaugeClickHandler(SeriesGaugeClickHandler handler) {
    }

    public void addSeriesGaugeHideHandler(SeriesGaugeHideHandler handler) {
    }

    public void addSeriesGaugeLegendItemClickHandler(SeriesGaugeLegendItemClickHandler handler) {
    }

    public void addSeriesGaugeMouseOutHandler(SeriesGaugeMouseOutHandler handler) {
    }

    public void addSeriesGaugeMouseOverHandler(SeriesGaugeMouseOverHandler handler) {
    }

    public void addSeriesGaugeShowHandler(SeriesGaugeShowHandler handler) {
    }

    public String id() {
        return id;
    }

    public MockSeriesGauge id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesGauge index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesGauge keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesGauge legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesGauge linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesGauge name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesGauge negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public double overshoot() {
        return overshoot;
    }

    public MockSeriesGauge overshoot(double overshoot) {
        this.overshoot = overshoot;
        return this;
    }

    public Pivot pivot() {
        return pivot;
    }

    public MockSeriesGauge pivot(Pivot pivot) {
        this.pivot = pivot;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesGauge point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesGauge selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesGauge showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesGauge showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesGauge states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesGauge stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeriesGauge threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesGauge tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesGauge type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesGauge visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public boolean wrap() {
        return wrap;
    }

    public MockSeriesGauge wrap(boolean wrap) {
        this.wrap = wrap;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesGauge xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesGauge xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesGauge yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesGauge yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesGauge zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesGauge zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesGauge zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesGauge setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesGauge setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
