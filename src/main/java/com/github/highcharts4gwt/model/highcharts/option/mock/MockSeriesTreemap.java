
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesTreemap;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Level;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Tooltip;


/**
 * <p>A <code>treemap</code> series. If the <a href="#series<treemap>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.treemap">plotOptions.treemap</a>.</p>
 * 
 */
public class MockSeriesTreemap
    implements SeriesTreemap
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
    private com.github.highcharts4gwt.model.array.api.Array<Data> dataAsArrayObject;
    private ArrayNumber dataAsArrayNumber;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private String id;
    private double index;
    private boolean interactByLeaf;
    private ArrayString keys;
    private String layoutAlgorithm;
    private String layoutStartingDirection;
    private double legendIndex;
    private boolean levelIsConstant;
    private com.github.highcharts4gwt.model.array.api.Array<Level> levels;
    private String linkedTo;
    private String name;
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
    private String type;
    private boolean visible;
    private double xAxisAsNumber;
    private String xAxisAsString;
    private double yAxisAsNumber;
    private String yAxisAsString;
    private double zIndex;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowDrillToNode() {
        return allowDrillToNode;
    }

    public MockSeriesTreemap allowDrillToNode(boolean allowDrillToNode) {
        this.allowDrillToNode = allowDrillToNode;
        return this;
    }

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockSeriesTreemap allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean alternateStartingDirection() {
        return alternateStartingDirection;
    }

    public MockSeriesTreemap alternateStartingDirection(boolean alternateStartingDirection) {
        this.alternateStartingDirection = alternateStartingDirection;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesTreemap animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockSeriesTreemap borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockSeriesTreemap borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockSeriesTreemap color(String color) {
        this.color = color;
        return this;
    }

    public boolean colorByPoint() {
        return colorByPoint;
    }

    public MockSeriesTreemap colorByPoint(boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesTreemap colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public double cropThreshold() {
        return cropThreshold;
    }

    public MockSeriesTreemap cropThreshold(double cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesTreemap cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public com.github.highcharts4gwt.model.array.api.Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesTreemap dataAsArrayObject(com.github.highcharts4gwt.model.array.api.Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesTreemap dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesTreemap dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesTreemap enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addAfterAnimateHandler(AfterAnimateHandler handler) {
    }

    public void addCheckboxClickHandler(CheckboxClickHandler handler) {
    }

    public void addClickHandler(ClickHandler handler) {
    }

    public void addHideHandler(HideHandler handler) {
    }

    public void addLegendItemClickHandler(LegendItemClickHandler handler) {
    }

    public void addMouseOutHandler(MouseOutHandler handler) {
    }

    public void addMouseOverHandler(MouseOverHandler handler) {
    }

    public void addShowHandler(ShowHandler handler) {
    }

    public String id() {
        return id;
    }

    public MockSeriesTreemap id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesTreemap index(double index) {
        this.index = index;
        return this;
    }

    public boolean interactByLeaf() {
        return interactByLeaf;
    }

    public MockSeriesTreemap interactByLeaf(boolean interactByLeaf) {
        this.interactByLeaf = interactByLeaf;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesTreemap keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public String layoutAlgorithm() {
        return layoutAlgorithm;
    }

    public MockSeriesTreemap layoutAlgorithm(String layoutAlgorithm) {
        this.layoutAlgorithm = layoutAlgorithm;
        return this;
    }

    public String layoutStartingDirection() {
        return layoutStartingDirection;
    }

    public MockSeriesTreemap layoutStartingDirection(String layoutStartingDirection) {
        this.layoutStartingDirection = layoutStartingDirection;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesTreemap legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public boolean levelIsConstant() {
        return levelIsConstant;
    }

    public MockSeriesTreemap levelIsConstant(boolean levelIsConstant) {
        this.levelIsConstant = levelIsConstant;
        return this;
    }

    public com.github.highcharts4gwt.model.array.api.Array<Level> levels() {
        return levels;
    }

    public MockSeriesTreemap levels(com.github.highcharts4gwt.model.array.api.Array<Level> levels) {
        this.levels = levels;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesTreemap linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesTreemap name(String name) {
        this.name = name;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesTreemap point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesTreemap selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesTreemap shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesTreemap shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSeriesTreemap showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesTreemap showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesTreemap states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesTreemap stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesTreemap tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public double turboThreshold() {
        return turboThreshold;
    }

    public MockSeriesTreemap turboThreshold(double turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesTreemap type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesTreemap visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeriesTreemap xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeriesTreemap xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeriesTreemap yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeriesTreemap yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesTreemap zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesTreemap zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesTreemap zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesTreemap setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesTreemap setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
