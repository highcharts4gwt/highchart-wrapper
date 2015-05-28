
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Polygon;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.Tooltip;


/**
 * A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
 * 
 */
public class MockPolygon
    implements Polygon
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private ArrayString keys;
    private double lineWidth;
    private String linkedTo;
    private Marker marker;
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
    private boolean visible;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockPolygon allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockPolygon animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockPolygon color(String color) {
        this.color = color;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockPolygon cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockPolygon cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockPolygon dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockPolygon dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockPolygon enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addPolygonAfterAnimateHandler(PolygonAfterAnimateHandler handler) {
    }

    public void addPolygonCheckboxClickHandler(PolygonCheckboxClickHandler handler) {
    }

    public void addPolygonClickHandler(PolygonClickHandler handler) {
    }

    public void addPolygonHideHandler(PolygonHideHandler handler) {
    }

    public void addPolygonLegendItemClickHandler(PolygonLegendItemClickHandler handler) {
    }

    public void addPolygonMouseOutHandler(PolygonMouseOutHandler handler) {
    }

    public void addPolygonMouseOverHandler(PolygonMouseOverHandler handler) {
    }

    public void addPolygonShowHandler(PolygonShowHandler handler) {
    }

    public ArrayString keys() {
        return keys;
    }

    public MockPolygon keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockPolygon lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockPolygon linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockPolygon marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockPolygon negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockPolygon point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockPolygon pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockPolygon pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockPolygon pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockPolygon selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockPolygon shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockPolygon shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockPolygon showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockPolygon showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockPolygon states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockPolygon stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockPolygon threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockPolygon tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockPolygon turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockPolygon visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockPolygon zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockPolygon zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPolygon setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockPolygon setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
