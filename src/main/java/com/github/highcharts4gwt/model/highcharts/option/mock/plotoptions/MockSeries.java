
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.Tooltip;


/**
 * <p>General options for all series types.</p>
 * 
 */
public class MockSeries
    implements Series
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

    public MockSeries allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeries animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeries color(String color) {
        this.color = color;
        return this;
    }

    public boolean connectEnds() {
        return connectEnds;
    }

    public MockSeries connectEnds(boolean connectEnds) {
        this.connectEnds = connectEnds;
        return this;
    }

    public boolean connectNulls() {
        return connectNulls;
    }

    public MockSeries connectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeries cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeries cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockSeries dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeries dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeries enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesAfterAnimateHandler(SeriesAfterAnimateHandler handler) {
    }

    public void addSeriesCheckboxClickHandler(SeriesCheckboxClickHandler handler) {
    }

    public void addSeriesClickHandler(SeriesClickHandler handler) {
    }

    public void addSeriesHideHandler(SeriesHideHandler handler) {
    }

    public void addSeriesLegendItemClickHandler(SeriesLegendItemClickHandler handler) {
    }

    public void addSeriesMouseOutHandler(SeriesMouseOutHandler handler) {
    }

    public void addSeriesMouseOverHandler(SeriesMouseOverHandler handler) {
    }

    public void addSeriesShowHandler(SeriesShowHandler handler) {
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeries keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSeries lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeries linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockSeries marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockSeries negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeries point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockSeries pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockSeries pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockSeries pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockSeries pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockSeries pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeries selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeries shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeries shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeries showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeries showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String stacking() {
        return stacking;
    }

    public MockSeries stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeries states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeries stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockSeries threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeries tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeries turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeries visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeries zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeries zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeries setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeries setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
