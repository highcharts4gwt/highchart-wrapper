
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Boxplot;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.Tooltip;

public class MockBoxplot
    implements Boxplot
{

    private boolean allowPointSelect;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private String cursor;
    private double depth;
    private String edgeColor;
    private double edgeWidth;
    private boolean enableMouseTracking;
    private String fillColor;
    private double groupPadding;
    private double groupZPadding;
    private boolean grouping;
    private double lineWidth;
    private String linkedTo;
    private String medianColor;
    private double medianWidth;
    private String negativeColor;
    private Point point;
    private double pointInterval;
    private String pointIntervalUnit;
    private double pointPadding;
    private String pointPlacementAsString;
    private double pointPlacementAsNumber;
    private double pointRange;
    private double pointStart;
    private double pointWidth;
    private boolean selected;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private String stemColor;
    private String stemDashStyle;
    private double stemWidth;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private double turboThreshold;
    private boolean visible;
    private String whiskerColor;
    private double whiskerLengthAsNumber;
    private String whiskerLengthAsString;
    private double whiskerWidth;
    private String zoneAxis;
    private ArrayNumber zones;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockBoxplot allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String color() {
        return color;
    }

    public MockBoxplot color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockBoxplot colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockBoxplot colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockBoxplot cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockBoxplot depth(double depth) {
        this.depth = depth;
        return this;
    }

    public String edgeColor() {
        return edgeColor;
    }

    public MockBoxplot edgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
        return this;
    }

    public double edgeWidth() {
        return edgeWidth;
    }

    public MockBoxplot edgeWidth(double edgeWidth) {
        this.edgeWidth = edgeWidth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockBoxplot enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addBoxplotAfterAnimateHandler(BoxplotAfterAnimateHandler handler) {
    }

    public void addBoxplotCheckboxClickHandler(BoxplotCheckboxClickHandler handler) {
    }

    public void addBoxplotClickHandler(BoxplotClickHandler handler) {
    }

    public void addBoxplotHideHandler(BoxplotHideHandler handler) {
    }

    public void addBoxplotLegendItemClickHandler(BoxplotLegendItemClickHandler handler) {
    }

    public void addBoxplotMouseOutHandler(BoxplotMouseOutHandler handler) {
    }

    public void addBoxplotMouseOverHandler(BoxplotMouseOverHandler handler) {
    }

    public void addBoxplotShowHandler(BoxplotShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockBoxplot fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double groupPadding() {
        return groupPadding;
    }

    public MockBoxplot groupPadding(double groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public double groupZPadding() {
        return groupZPadding;
    }

    public MockBoxplot groupZPadding(double groupZPadding) {
        this.groupZPadding = groupZPadding;
        return this;
    }

    public boolean grouping() {
        return grouping;
    }

    public MockBoxplot grouping(boolean grouping) {
        this.grouping = grouping;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockBoxplot lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockBoxplot linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String medianColor() {
        return medianColor;
    }

    public MockBoxplot medianColor(String medianColor) {
        this.medianColor = medianColor;
        return this;
    }

    public double medianWidth() {
        return medianWidth;
    }

    public MockBoxplot medianWidth(double medianWidth) {
        this.medianWidth = medianWidth;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockBoxplot negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockBoxplot point(Point point) {
        this.point = point;
        return this;
    }

    public double pointInterval() {
        return pointInterval;
    }

    public MockBoxplot pointInterval(double pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public String pointIntervalUnit() {
        return pointIntervalUnit;
    }

    public MockBoxplot pointIntervalUnit(String pointIntervalUnit) {
        this.pointIntervalUnit = pointIntervalUnit;
        return this;
    }

    public double pointPadding() {
        return pointPadding;
    }

    public MockBoxplot pointPadding(double pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public String pointPlacementAsString() {
        return pointPlacementAsString;
    }

    public MockBoxplot pointPlacementAsString(String pointPlacementAsString) {
        this.pointPlacementAsString = pointPlacementAsString;
        return this;
    }

    public double pointPlacementAsNumber() {
        return pointPlacementAsNumber;
    }

    public MockBoxplot pointPlacementAsNumber(double pointPlacementAsNumber) {
        this.pointPlacementAsNumber = pointPlacementAsNumber;
        return this;
    }

    public double pointRange() {
        return pointRange;
    }

    public MockBoxplot pointRange(double pointRange) {
        this.pointRange = pointRange;
        return this;
    }

    public double pointStart() {
        return pointStart;
    }

    public MockBoxplot pointStart(double pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public double pointWidth() {
        return pointWidth;
    }

    public MockBoxplot pointWidth(double pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockBoxplot selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockBoxplot showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockBoxplot showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockBoxplot states(States states) {
        this.states = states;
        return this;
    }

    public String stemColor() {
        return stemColor;
    }

    public MockBoxplot stemColor(String stemColor) {
        this.stemColor = stemColor;
        return this;
    }

    public String stemDashStyle() {
        return stemDashStyle;
    }

    public MockBoxplot stemDashStyle(String stemDashStyle) {
        this.stemDashStyle = stemDashStyle;
        return this;
    }

    public double stemWidth() {
        return stemWidth;
    }

    public MockBoxplot stemWidth(double stemWidth) {
        this.stemWidth = stemWidth;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockBoxplot stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockBoxplot tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockBoxplot turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockBoxplot visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String whiskerColor() {
        return whiskerColor;
    }

    public MockBoxplot whiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
        return this;
    }

    public double whiskerLengthAsNumber() {
        return whiskerLengthAsNumber;
    }

    public MockBoxplot whiskerLengthAsNumber(double whiskerLengthAsNumber) {
        this.whiskerLengthAsNumber = whiskerLengthAsNumber;
        return this;
    }

    public String whiskerLengthAsString() {
        return whiskerLengthAsString;
    }

    public MockBoxplot whiskerLengthAsString(String whiskerLengthAsString) {
        this.whiskerLengthAsString = whiskerLengthAsString;
        return this;
    }

    public double whiskerWidth() {
        return whiskerWidth;
    }

    public MockBoxplot whiskerWidth(double whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockBoxplot zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockBoxplot zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

}
