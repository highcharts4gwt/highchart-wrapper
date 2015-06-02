
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesBoxplot;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Tooltip;


/**
 * <p>A <code>boxplot</code> series. If the <a href="#series<boxplot>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.boxplot">plotOptions.boxplot</a>.</p>
 * 
 */
public class MockSeriesBoxplot
    implements SeriesBoxplot
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
    private String fillColor;
    private double groupPadding;
    private double groupZPadding;
    private boolean grouping;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private double lineWidth;
    private String linkedTo;
    private String medianColor;
    private double medianWidth;
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
    private boolean showCheckbox;
    private boolean showInLegend;
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

    public MockSeriesBoxplot allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesBoxplot color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockSeriesBoxplot colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesBoxplot colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesBoxplot cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesBoxplot dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockSeriesBoxplot depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockSeriesBoxplot edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockSeriesBoxplot edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesBoxplot enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesBoxplotAfterAnimateHandler(SeriesBoxplotAfterAnimateHandler handler) {
    }

    public void addSeriesBoxplotCheckboxClickHandler(SeriesBoxplotCheckboxClickHandler handler) {
    }

    public void addSeriesBoxplotClickHandler(SeriesBoxplotClickHandler handler) {
    }

    public void addSeriesBoxplotHideHandler(SeriesBoxplotHideHandler handler) {
    }

    public void addSeriesBoxplotLegendItemClickHandler(SeriesBoxplotLegendItemClickHandler handler) {
    }

    public void addSeriesBoxplotMouseOutHandler(SeriesBoxplotMouseOutHandler handler) {
    }

    public void addSeriesBoxplotMouseOverHandler(SeriesBoxplotMouseOverHandler handler) {
    }

    public void addSeriesBoxplotShowHandler(SeriesBoxplotShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockSeriesBoxplot fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double groupPadding() {
        return groupPadding;
    }

    public MockSeriesBoxplot groupPadding(double groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockSeriesBoxplot groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public boolean grouping() {
        return grouping;
    }

    public MockSeriesBoxplot grouping(boolean grouping) {
        this.grouping = grouping;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesBoxplot id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesBoxplot index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesBoxplot keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesBoxplot legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeriesBoxplot lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesBoxplot linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String medianColor() {
        return medianColor;
    }

    public MockSeriesBoxplot medianColor(String medianColor) {
        this.medianColor = medianColor;
        return this;
    }

    public double medianWidth() {
        return medianWidth;
    }

    public MockSeriesBoxplot medianWidth(double medianWidth) {
        this.medianWidth = medianWidth;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesBoxplot name(String name) {
        this.name = name;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeriesBoxplot negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesBoxplot point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeriesBoxplot pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeriesBoxplot pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockSeriesBoxplot pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeriesBoxplot pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeriesBoxplot pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockSeriesBoxplot pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeriesBoxplot pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockSeriesBoxplot pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesBoxplot selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesBoxplot showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesBoxplot showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesBoxplot states(States states) {
        this.states = states;
        return this;
    }

    public String stemColor() {
        return stemColor;
    }

    public MockSeriesBoxplot stemColor(String stemColor) {
        this.stemColor = stemColor;
        return this;
    }

    public String stemDashStyle() {
        return stemDashStyle;
    }

    public MockSeriesBoxplot stemDashStyle(String stemDashStyle) {
        this.stemDashStyle = stemDashStyle;
        return this;
    }

    public double stemWidth() {
        return stemWidth;
    }

    public MockSeriesBoxplot stemWidth(double stemWidth) {
        this.stemWidth = stemWidth;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesBoxplot stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesBoxplot tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesBoxplot turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesBoxplot type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesBoxplot visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String whiskerColor() {
        return whiskerColor;
    }

    public MockSeriesBoxplot whiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
        return this;
    }

    public double whiskerLengthAsNumber() {
        return whiskerLengthAsNumber;
    }

    public MockSeriesBoxplot whiskerLengthAsNumber(double whiskerLengthAsNumber) {
        this.whiskerLengthAsNumber = whiskerLengthAsNumber;
        return this;
    }

    public String whiskerLengthAsString() {
        return whiskerLengthAsString;
    }

    public MockSeriesBoxplot whiskerLengthAsString(String whiskerLengthAsString) {
        this.whiskerLengthAsString = whiskerLengthAsString;
        return this;
    }

    public double whiskerWidth() {
        return whiskerWidth;
    }

    public MockSeriesBoxplot whiskerWidth(double whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesBoxplot xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesBoxplot xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesBoxplot yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesBoxplot yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesBoxplot zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesBoxplot zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesBoxplot zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesBoxplot setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesBoxplot setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
