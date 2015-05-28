
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Errorbar;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.Tooltip;


/**
 * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
 * 
 */
public class MockErrorbar
    implements Errorbar
{

    private boolean allowPointSelect;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private String cursor;
    private double depth;
    private String edgeColor;
    private double edgeWidth;
    private boolean enableMouseTracking;
    private double groupZPadding;
    private ArrayString keys;
    private double lineWidth;
    private String linkedTo;
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
    private boolean visible;
    private String whiskerColor;
    private double whiskerLengthAsNumber;
    private String whiskerLengthAsString;
    private double whiskerWidth;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockErrorbar allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String color() {
        return color;
    }

    public MockErrorbar color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockErrorbar colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockErrorbar colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockErrorbar cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockErrorbar depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockErrorbar edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockErrorbar edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockErrorbar enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addErrorbarAfterAnimateHandler(ErrorbarAfterAnimateHandler handler) {
    }

    public void addErrorbarCheckboxClickHandler(ErrorbarCheckboxClickHandler handler) {
    }

    public void addErrorbarClickHandler(ErrorbarClickHandler handler) {
    }

    public void addErrorbarHideHandler(ErrorbarHideHandler handler) {
    }

    public void addErrorbarLegendItemClickHandler(ErrorbarLegendItemClickHandler handler) {
    }

    public void addErrorbarMouseOutHandler(ErrorbarMouseOutHandler handler) {
    }

    public void addErrorbarMouseOverHandler(ErrorbarMouseOverHandler handler) {
    }

    public void addErrorbarShowHandler(ErrorbarShowHandler handler) {
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockErrorbar groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockErrorbar keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockErrorbar lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockErrorbar linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockErrorbar negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockErrorbar point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockErrorbar pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockErrorbar pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockErrorbar pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockErrorbar pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockErrorbar pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockErrorbar pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockErrorbar pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockErrorbar pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockErrorbar selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public States states() {
        return states;
    }

    public MockErrorbar states(States states) {
        this.states = states;
        return this;
    }

    public String stemColor() {
        return stemColor;
    }

    public MockErrorbar stemColor(String stemColor) {
        this.stemColor = stemColor;
        return this;
    }

    public String stemDashStyle() {
        return stemDashStyle;
    }

    public MockErrorbar stemDashStyle(String stemDashStyle) {
        this.stemDashStyle = stemDashStyle;
        return this;
    }

    public double stemWidth() {
        return stemWidth;
    }

    public MockErrorbar stemWidth(double stemWidth) {
        this.stemWidth = stemWidth;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockErrorbar stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockErrorbar tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockErrorbar turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockErrorbar visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String whiskerColor() {
        return whiskerColor;
    }

    public MockErrorbar whiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
        return this;
    }

    public double whiskerLengthAsNumber() {
        return whiskerLengthAsNumber;
    }

    public MockErrorbar whiskerLengthAsNumber(double whiskerLengthAsNumber) {
        this.whiskerLengthAsNumber = whiskerLengthAsNumber;
        return this;
    }

    public String whiskerLengthAsString() {
        return whiskerLengthAsString;
    }

    public MockErrorbar whiskerLengthAsString(String whiskerLengthAsString) {
        this.whiskerLengthAsString = whiskerLengthAsString;
        return this;
    }

    public double whiskerWidth() {
        return whiskerWidth;
    }

    public MockErrorbar whiskerWidth(double whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockErrorbar zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockErrorbar zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockErrorbar setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockErrorbar setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
