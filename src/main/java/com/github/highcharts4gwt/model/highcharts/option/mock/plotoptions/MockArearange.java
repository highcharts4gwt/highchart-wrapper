
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Arearange;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.Tooltip;

public class MockArearange
    implements Arearange
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
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
    private States states;
    private String step;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private boolean trackByArea;
    private double turboThreshold;
    private boolean visible;
    private String zoneAxis;
    private ArrayNumber zones;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockArearange allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockArearange animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockArearange color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockArearange connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockArearange cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockArearange cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockArearange dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockArearange dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockArearange enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addArearangeAfterAnimateHandler(ArearangeAfterAnimateHandler handler) {
    }

    public void addArearangeCheckboxClickHandler(ArearangeCheckboxClickHandler handler) {
    }

    public void addArearangeClickHandler(ArearangeClickHandler handler) {
    }

    public void addArearangeHideHandler(ArearangeHideHandler handler) {
    }

    public void addArearangeLegendItemClickHandler(ArearangeLegendItemClickHandler handler) {
    }

    public void addArearangeMouseOutHandler(ArearangeMouseOutHandler handler) {
    }

    public void addArearangeMouseOverHandler(ArearangeMouseOverHandler handler) {
    }

    public void addArearangeShowHandler(ArearangeShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockArearange fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double fillOpacity() {
        return fillOpacity;
    }

    public MockArearange fillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockArearange lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockArearange lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockArearange linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockArearange negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockArearange negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockArearange point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockArearange pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockArearange pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockArearange pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockArearange pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockArearange pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockArearange selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockArearange shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockArearange shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockArearange showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockArearange showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockArearange states(States states) {
        this.states = states;
        return this;
    }

    public String step() {
        return step;
    }

    public MockArearange step(String step) {
        this.step = step;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockArearange stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockArearange tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockArearange trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockArearange turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockArearange visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockArearange zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockArearange zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

}
