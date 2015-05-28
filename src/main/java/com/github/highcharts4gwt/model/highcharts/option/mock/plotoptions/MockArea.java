
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Area;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.Tooltip;


/**
 * 
 */
public class MockArea
    implements Area
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private boolean connectEnds;
    private boolean connectNulls;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private String fillColor;
    private double fillOpacity;
    private ArrayString keys;
    private String lineColor;
    private double lineWidth;
    private String linkedTo;
    private Marker marker;
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
    private String stacking;
    private States states;
    private String step;
    private boolean stickyTracking;
    private double threshold;
    private Tooltip tooltip;
    private boolean trackByArea;
    private double turboThreshold;
    private boolean visible;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockArea allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockArea animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockArea color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectEnds() {
        return connectEnds;
    }

    public MockArea connectEnds(boolean connectEnds) {
        this.connectEnds = connectEnds;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockArea connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockArea cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockArea cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockArea dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockArea dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockArea enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addAreaAfterAnimateHandler(AreaAfterAnimateHandler handler) {
    }

    public void addAreaCheckboxClickHandler(AreaCheckboxClickHandler handler) {
    }

    public void addAreaClickHandler(AreaClickHandler handler) {
    }

    public void addAreaHideHandler(AreaHideHandler handler) {
    }

    public void addAreaLegendItemClickHandler(AreaLegendItemClickHandler handler) {
    }

    public void addAreaMouseOutHandler(AreaMouseOutHandler handler) {
    }

    public void addAreaMouseOverHandler(AreaMouseOverHandler handler) {
    }

    public void addAreaShowHandler(AreaShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockArea fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double fillOpacity() {
        return fillOpacity;
    }

    public MockArea fillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockArea keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockArea lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockArea lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockArea linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockArea marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockArea negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockArea negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockArea point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockArea pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockArea pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockArea pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockArea pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockArea pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockArea selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockArea shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockArea shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockArea showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockArea showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stacking() {
        return stacking;
    }

    public MockArea stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States states() {
        return states;
    }

    public MockArea states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockArea step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockArea stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockArea threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockArea tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockArea trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockArea turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockArea visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockArea zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockArea zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockArea setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockArea setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
