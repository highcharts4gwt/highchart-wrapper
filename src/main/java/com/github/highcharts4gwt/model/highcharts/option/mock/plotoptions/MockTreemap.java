
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Treemap;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Level;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapShowHandler;


/**
 * The size of the point shape is determined by its value relative to its siblings values.
 * Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
 * 
 */
public class MockTreemap
    implements Treemap
{

    private boolean allowDrillToNode;
    private boolean allowPointSelect;
    private boolean alternateStartingDirection;
    private boolean animation;
    private String borderColor;
    private double borderWidth;
    private String color;
    private boolean colorByPoint;
    private ArrayString colors;
    private double cropThreshold;
    private String cursor;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private boolean interactByLeaf;
    private ArrayString keys;
    private String layoutAlgorithm;
    private String layoutStartingDirection;
    private boolean levelIsConstant;
    private Array<Level> levels;
    private String linkedTo;
    private Point point;
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
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowDrillToNode() {
        return allowDrillToNode;
    }

    public MockTreemap allowDrillToNode(boolean allowDrillToNode) {
        this.allowDrillToNode = allowDrillToNode;
        return this;
    }

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockTreemap allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean alternateStartingDirection() {
        return alternateStartingDirection;
    }

    public MockTreemap alternateStartingDirection(boolean alternateStartingDirection) {
        this.alternateStartingDirection = alternateStartingDirection;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockTreemap animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockTreemap borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockTreemap borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockTreemap color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockTreemap colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockTreemap colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockTreemap cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockTreemap cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockTreemap dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockTreemap enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addTreemapAfterAnimateHandler(TreemapAfterAnimateHandler handler) {
    }

    public void addTreemapCheckboxClickHandler(TreemapCheckboxClickHandler handler) {
    }

    public void addTreemapClickHandler(TreemapClickHandler handler) {
    }

    public void addTreemapHideHandler(TreemapHideHandler handler) {
    }

    public void addTreemapLegendItemClickHandler(TreemapLegendItemClickHandler handler) {
    }

    public void addTreemapMouseOutHandler(TreemapMouseOutHandler handler) {
    }

    public void addTreemapMouseOverHandler(TreemapMouseOverHandler handler) {
    }

    public void addTreemapShowHandler(TreemapShowHandler handler) {
    }

    public boolean interactByLeaf() {
        return interactByLeaf;
    }

    public MockTreemap interactByLeaf(boolean interactByLeaf) {
        this.interactByLeaf = interactByLeaf;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockTreemap keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public String layoutAlgorithm() {
        return layoutAlgorithm;
    }

    public MockTreemap layoutAlgorithm(String layoutAlgorithm) {
        this.layoutAlgorithm = layoutAlgorithm;
        return this;
    }

    public String layoutStartingDirection() {
        return layoutStartingDirection;
    }

    public MockTreemap layoutStartingDirection(String layoutStartingDirection) {
        this.layoutStartingDirection = layoutStartingDirection;
        return this;
    }

    public boolean levelIsConstant() {
        return levelIsConstant;
    }

    public MockTreemap levelIsConstant(boolean levelIsConstant) {
        this.levelIsConstant = levelIsConstant;
        return this;
    }

    public Array<Level> levels() {
        return levels;
    }

    public MockTreemap levels(Array<Level> levels) {
        this.levels = levels;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockTreemap linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockTreemap point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockTreemap selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockTreemap shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockTreemap shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockTreemap showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockTreemap showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockTreemap states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockTreemap stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockTreemap tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockTreemap turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockTreemap visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockTreemap zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockTreemap zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockTreemap setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockTreemap setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
