
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Scatter;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.Tooltip;

public class MockScatter
    implements Scatter
{

    private boolean allowPointSelect;
    private boolean animation;
    private String color;
    private double cropThreshold;
    private String cursor;
    private String dashStyle;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
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

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockScatter allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockScatter animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockScatter color(String color) {
        this.color = color;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockScatter cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockScatter cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockScatter dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockScatter dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockScatter enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addScatterAfterAnimateHandler(ScatterAfterAnimateHandler handler) {
    }

    public void addScatterCheckboxClickHandler(ScatterCheckboxClickHandler handler) {
    }

    public void addScatterClickHandler(ScatterClickHandler handler) {
    }

    public void addScatterHideHandler(ScatterHideHandler handler) {
    }

    public void addScatterLegendItemClickHandler(ScatterLegendItemClickHandler handler) {
    }

    public void addScatterMouseOutHandler(ScatterMouseOutHandler handler) {
    }

    public void addScatterMouseOverHandler(ScatterMouseOverHandler handler) {
    }

    public void addScatterShowHandler(ScatterShowHandler handler) {
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockScatter lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockScatter linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockScatter marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockScatter negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockScatter point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockScatter pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockScatter pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockScatter pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockScatter selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockScatter shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockScatter shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockScatter showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockScatter showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockScatter states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockScatter stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockScatter threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockScatter tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockScatter turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockScatter visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockScatter zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockScatter zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

}
