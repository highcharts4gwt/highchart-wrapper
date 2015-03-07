
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Areaspline;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.Tooltip;

public class MockAreaspline
    implements Areaspline
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

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockAreaspline allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockAreaspline animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockAreaspline color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectEnds() {
        return connectEnds;
    }

    public MockAreaspline connectEnds(boolean connectEnds) {
        this.connectEnds = connectEnds;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockAreaspline connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockAreaspline cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockAreaspline cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockAreaspline dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockAreaspline dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockAreaspline enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addAreasplineAfterAnimateHandler(AreasplineAfterAnimateHandler handler) {
    }

    public void addAreasplineCheckboxClickHandler(AreasplineCheckboxClickHandler handler) {
    }

    public void addAreasplineClickHandler(AreasplineClickHandler handler) {
    }

    public void addAreasplineHideHandler(AreasplineHideHandler handler) {
    }

    public void addAreasplineLegendItemClickHandler(AreasplineLegendItemClickHandler handler) {
    }

    public void addAreasplineMouseOutHandler(AreasplineMouseOutHandler handler) {
    }

    public void addAreasplineMouseOverHandler(AreasplineMouseOverHandler handler) {
    }

    public void addAreasplineShowHandler(AreasplineShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockAreaspline fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double fillOpacity() {
        return fillOpacity;
    }

    public MockAreaspline fillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockAreaspline lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockAreaspline lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockAreaspline linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockAreaspline marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockAreaspline negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockAreaspline negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockAreaspline point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockAreaspline pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockAreaspline pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockAreaspline pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockAreaspline pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockAreaspline pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockAreaspline selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockAreaspline shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockAreaspline shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockAreaspline showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockAreaspline showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stacking() {
        return stacking;
    }

    public MockAreaspline stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States states() {
        return states;
    }

    public MockAreaspline states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockAreaspline step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockAreaspline stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockAreaspline threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockAreaspline tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockAreaspline trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockAreaspline turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockAreaspline visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockAreaspline zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockAreaspline zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockAreaspline setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
