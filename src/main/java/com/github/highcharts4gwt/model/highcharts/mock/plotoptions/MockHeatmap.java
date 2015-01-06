
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Heatmap;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapShowHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.Tooltip;

public class MockHeatmap
    implements Heatmap
{

    private boolean allowPointSelect;
    private boolean animation;
    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private double colsize;
    private double cropThreshold;
    private String cursor;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private String linkedTo;
    private Point point;
    private double rowsize;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private double turboThreshold;
    private boolean visible;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockHeatmap allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockHeatmap animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockHeatmap borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockHeatmap borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockHeatmap borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockHeatmap color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockHeatmap colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockHeatmap colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public double colsize() {
        return colsize;
    }

    public MockHeatmap colsize(double colsize) {
        this.colsize = colsize;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockHeatmap cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockHeatmap cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockHeatmap dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockHeatmap enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addHeatmapAfterAnimateHandler(HeatmapAfterAnimateHandler handler) {
    }

    public void addHeatmapCheckboxClickHandler(HeatmapCheckboxClickHandler handler) {
    }

    public void addHeatmapClickHandler(HeatmapClickHandler handler) {
    }

    public void addHeatmapHideHandler(HeatmapHideHandler handler) {
    }

    public void addHeatmapLegendItemClickHandler(HeatmapLegendItemClickHandler handler) {
    }

    public void addHeatmapMouseOutHandler(HeatmapMouseOutHandler handler) {
    }

    public void addHeatmapMouseOverHandler(HeatmapMouseOverHandler handler) {
    }

    public void addHeatmapShowHandler(HeatmapShowHandler handler) {
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockHeatmap linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockHeatmap point(Point point) {
        this.point = point;
        return this;
    }

    public double rowsize() {
        return rowsize;
    }

    public MockHeatmap rowsize(double rowsize) {
        this.rowsize = rowsize;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockHeatmap selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockHeatmap shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockHeatmap shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockHeatmap showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockHeatmap showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockHeatmap states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockHeatmap stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockHeatmap tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockHeatmap turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockHeatmap visible(boolean visible) {
        this.visible = visible;
        return this;
    }

}
