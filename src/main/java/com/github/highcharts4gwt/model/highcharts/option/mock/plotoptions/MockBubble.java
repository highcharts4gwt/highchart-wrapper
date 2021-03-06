
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Bubble;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Tooltip;


/**
 * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
 * 
 */
public class MockBubble
    implements Bubble
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private DataLabels dataLabels;
    private boolean displayNegative;
    private boolean enableMouseTracking;
    private ArrayString keys;
    private double lineWidth;
    private String linkedTo;
    private Marker marker;
    private String maxSize;
    private String minSize;
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
    private String sizeBy;
    private States states;
    private boolean stickyTracking;
    private double threshold;
    private Tooltip tooltip;
    private boolean visible;
    private double zMax;
    private double zMin;
    private double zThreshold;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockBubble allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockBubble animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockBubble color(String color) {
        this.color = color;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockBubble cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockBubble cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockBubble dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockBubble dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean displayNegative() {
        return displayNegative;
    }

    public MockBubble displayNegative(boolean displayNegative) {
        this.displayNegative = displayNegative;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockBubble enableMouseTracking(boolean enableMouseTracking) {
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

    public ArrayString keys() {
        return keys;
    }

    public MockBubble keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockBubble lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockBubble linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockBubble marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String maxSize() {
        return maxSize;
    }

    public MockBubble maxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public String minSize() {
        return minSize;
    }

    public MockBubble minSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockBubble negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockBubble point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockBubble pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockBubble pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockBubble pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockBubble selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockBubble shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockBubble shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockBubble showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockBubble showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String sizeBy() {
        return sizeBy;
    }

    public MockBubble sizeBy(String sizeBy) {
        this.sizeBy = sizeBy;
        return this;
    }

    public States states() {
        return states;
    }

    public MockBubble states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockBubble stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockBubble threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockBubble tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockBubble visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double zMax() {
        return zMax;
    }

    public MockBubble zMax(double zMax) {
        this.zMax = zMax;
        return this;
    }

    public double zMin() {
        return zMin;
    }

    public MockBubble zMin(double zMin) {
        this.zMin = zMin;
        return this;
    }

    public double zThreshold() {
        return zThreshold;
    }

    public MockBubble zThreshold(double zThreshold) {
        this.zThreshold = zThreshold;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockBubble zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockBubble zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockBubble setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockBubble setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
