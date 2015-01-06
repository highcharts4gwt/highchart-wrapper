
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Waterfall;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallShowHandler;

public class MockWaterfall
    implements Waterfall
{

    private boolean allowPointSelect;
    private boolean animation;
    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private String cursor;
    private String dashStyle;
    private DataLabels dataLabels;
    private double depth;
    private String edgeColor;
    private double edgeWidth;
    private boolean enableMouseTracking;
    private double groupPadding;
    private double groupZPadding;
    private boolean grouping;
    private String lineColor;
    private String linkedTo;
    private double minPointLength;
    private Point point;
    private double pointInterval;
    private double pointPadding;
    private String pointPlacementAsString;
    private double pointPlacementAsNumber;
    private double pointRange;
    private double pointStart;
    private double pointWidth;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private boolean stickyTracking;
    private double threshold;
    private Tooltip tooltip;
    private String upColor;
    private boolean visible;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockWaterfall allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockWaterfall animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockWaterfall borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockWaterfall borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockWaterfall borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockWaterfall color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockWaterfall colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockWaterfall colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockWaterfall cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockWaterfall dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockWaterfall dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockWaterfall depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockWaterfall edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockWaterfall edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockWaterfall enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addWaterfallAfterAnimateHandler(WaterfallAfterAnimateHandler handler) {
    }

    public void addWaterfallCheckboxClickHandler(WaterfallCheckboxClickHandler handler) {
    }

    public void addWaterfallClickHandler(WaterfallClickHandler handler) {
    }

    public void addWaterfallHideHandler(WaterfallHideHandler handler) {
    }

    public void addWaterfallLegendItemClickHandler(WaterfallLegendItemClickHandler handler) {
    }

    public void addWaterfallMouseOutHandler(WaterfallMouseOutHandler handler) {
    }

    public void addWaterfallMouseOverHandler(WaterfallMouseOverHandler handler) {
    }

    public void addWaterfallShowHandler(WaterfallShowHandler handler) {
    }

    public double groupPadding() {
        return groupPadding;
    }

    public MockWaterfall groupPadding(double groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockWaterfall groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public boolean grouping() {
        return grouping;
    }

    public MockWaterfall grouping(boolean grouping) {
        this.grouping = grouping;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockWaterfall lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockWaterfall linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minPointLength() {
        return minPointLength;
    }

    public MockWaterfall minPointLength(double minPointLength) {
        this.minPointLength = minPointLength;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockWaterfall point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockWaterfall pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockWaterfall pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockWaterfall pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockWaterfall pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockWaterfall pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockWaterfall pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockWaterfall pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockWaterfall selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockWaterfall shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockWaterfall shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockWaterfall showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockWaterfall showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockWaterfall states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockWaterfall stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockWaterfall threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockWaterfall tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String upColor() {
        return upColor;
    }

    public MockWaterfall upColor(String upColor) {
        this.upColor = upColor;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockWaterfall visible(boolean visible) {
        this.visible = visible;
        return this;
    }

}
