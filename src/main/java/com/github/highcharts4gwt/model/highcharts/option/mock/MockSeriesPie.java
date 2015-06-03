
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPie;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Tooltip;


/**
 * <p>A <code>pie</code> series. If the <a href="#series<pie>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pie">plotOptions.pie</a>.</p>
 * 
 */
public class MockSeriesPie
    implements SeriesPie
{

    private boolean allowPointSelect;
    private boolean animation;
    private String borderColor;
    private double borderWidth;
    private ArrayString centerAsArrayString;
    private ArrayNumber centerAsArrayNumber;
    private ArrayString colors;
    private String cursor;
    private Array<Data> dataAsArrayObject;
    private ArrayNumber dataAsArrayNumber;
    private DataLabels dataLabels;
    private double depth;
    private boolean enableMouseTracking;
    private double endAngle;
    private String id;
    private boolean ignoreHiddenPoint;
    private double index;
    private String innerSizeAsString;
    private double innerSizeAsNumber;
    private ArrayString keys;
    private double legendIndex;
    private String linkedTo;
    private double minSize;
    private String name;
    private Point point;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showInLegend;
    private String sizeAsString;
    private double sizeAsNumber;
    private double slicedOffset;
    private double startAngle;
    private States states;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private String type;
    private boolean visible;
    private double zIndex;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockSeriesPie allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public boolean animation() {
        return animation;
    }

    public MockSeriesPie animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockSeriesPie borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockSeriesPie borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ArrayString centerAsArrayString() {
        return centerAsArrayString;
    }

    public MockSeriesPie centerAsArrayString(ArrayString centerAsArrayString) {
        this.centerAsArrayString = centerAsArrayString;
        return this;
    }

    public ArrayNumber centerAsArrayNumber() {
        return centerAsArrayNumber;
    }

    public MockSeriesPie centerAsArrayNumber(ArrayNumber centerAsArrayNumber) {
        this.centerAsArrayNumber = centerAsArrayNumber;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesPie colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesPie cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesPie dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesPie dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesPie dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockSeriesPie depth(double depth) {
        this.depth = depth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesPie enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public double endAngle() {
        return endAngle;
    }

    public MockSeriesPie endAngle(double endAngle) {
        this.endAngle = endAngle;
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

    public MockSeriesPie id(String id) {
        this.id = id;
        return this;
    }

    public boolean ignoreHiddenPoint() {
        return ignoreHiddenPoint;
    }

    public MockSeriesPie ignoreHiddenPoint(boolean ignoreHiddenPoint) {
        this.ignoreHiddenPoint = ignoreHiddenPoint;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesPie index(double index) {
        this.index = index;
        return this;
    }

    public String innerSizeAsString() {
        return innerSizeAsString;
    }

    public MockSeriesPie innerSizeAsString(String innerSizeAsString) {
        this.innerSizeAsString = innerSizeAsString;
        return this;
    }

    public double innerSizeAsNumber() {
        return innerSizeAsNumber;
    }

    public MockSeriesPie innerSizeAsNumber(double innerSizeAsNumber) {
        this.innerSizeAsNumber = innerSizeAsNumber;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesPie keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesPie legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesPie linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minSize() {
        return minSize;
    }

    public MockSeriesPie minSize(double minSize) {
        this.minSize = minSize;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesPie name(String name) {
        this.name = name;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesPie point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesPie selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesPie shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesPie shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesPie showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public String sizeAsString() {
        return sizeAsString;
    }

    public MockSeriesPie sizeAsString(String sizeAsString) {
        this.sizeAsString = sizeAsString;
        return this;
    }

    public double sizeAsNumber() {
        return sizeAsNumber;
    }

    public MockSeriesPie sizeAsNumber(double sizeAsNumber) {
        this.sizeAsNumber = sizeAsNumber;
        return this;
    }

    public double slicedOffset() {
        return slicedOffset;
    }

    public MockSeriesPie slicedOffset(double slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public double startAngle() {
        return startAngle;
    }

    public MockSeriesPie startAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesPie states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesPie stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesPie tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesPie type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesPie visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesPie zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesPie zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesPie zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesPie setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesPie setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
