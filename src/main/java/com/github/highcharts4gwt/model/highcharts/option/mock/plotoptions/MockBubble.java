
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Bubble;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Tooltip;

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
    private double lineWidth;
    private String linkedTo;
    private Marker marker;
    private String maxSize;
    private String minSize;
    private String negativeColor;
    private Point point;
    private double pointInterval;
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

    public void addBubbleAfterAnimateHandler(BubbleAfterAnimateHandler handler) {
    }

    public void addBubbleCheckboxClickHandler(BubbleCheckboxClickHandler handler) {
    }

    public void addBubbleClickHandler(BubbleClickHandler handler) {
    }

    public void addBubbleHideHandler(BubbleHideHandler handler) {
    }

    public void addBubbleLegendItemClickHandler(BubbleLegendItemClickHandler handler) {
    }

    public void addBubbleMouseOutHandler(BubbleMouseOutHandler handler) {
    }

    public void addBubbleMouseOverHandler(BubbleMouseOverHandler handler) {
    }

    public void addBubbleShowHandler(BubbleShowHandler handler) {
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

}
