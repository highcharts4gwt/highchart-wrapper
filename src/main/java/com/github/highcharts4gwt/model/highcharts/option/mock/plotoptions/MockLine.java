
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Line;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.Tooltip;


/**
 * 
 */
public class MockLine
    implements Line
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
    private ArrayString keys;
    private double lineWidth;
    private String linkedTo;
    private Marker marker;
    private String negativeColor;
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
    private double turboThreshold;
    private boolean visible;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockLine allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockLine animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockLine color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectEnds() {
        return connectEnds;
    }

    public MockLine connectEnds(boolean connectEnds) {
        this.connectEnds = connectEnds;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockLine connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockLine cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockLine cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockLine dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockLine dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockLine enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addLineAfterAnimateHandler(LineAfterAnimateHandler handler) {
    }

    public void addLineCheckboxClickHandler(LineCheckboxClickHandler handler) {
    }

    public void addLineClickHandler(LineClickHandler handler) {
    }

    public void addLineHideHandler(LineHideHandler handler) {
    }

    public void addLineLegendItemClickHandler(LineLegendItemClickHandler handler) {
    }

    public void addLineMouseOutHandler(LineMouseOutHandler handler) {
    }

    public void addLineMouseOverHandler(LineMouseOverHandler handler) {
    }

    public void addLineShowHandler(LineShowHandler handler) {
    }

    public ArrayString keys() {
        return keys;
    }

    public MockLine keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockLine lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockLine linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockLine marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockLine negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockLine point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockLine pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockLine pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockLine pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockLine pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockLine pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockLine selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockLine shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockLine shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockLine showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockLine showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stacking() {
        return stacking;
    }

    public MockLine stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States states() {
        return states;
    }

    public MockLine states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockLine step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockLine stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockLine threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockLine tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockLine turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockLine visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockLine zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockLine zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockLine setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockLine setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
