
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPyramid;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Tooltip;


/**
 * <p>A <code>pyramid</code> series. If the <a href="#series<pyramid>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pyramid">plotOptions.pyramid</a>.</p>
 * 
 */
public class MockSeriesPyramid
    implements SeriesPyramid
{

    private boolean allowPointSelect;
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
    private double heightAsNumber;
    private String heightAsString;
    private String id;
    private double index;
    private ArrayString keys;
    private double legendIndex;
    private String linkedTo;
    private double minSize;
    private String name;
    private Point point;
    private boolean reversed;
    private boolean selected;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showInLegend;
    private double slicedOffset;
    private States states;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private String type;
    private boolean visible;
    private double widthAsNumber;
    private String widthAsString;
    private double zIndex;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockSeriesPyramid allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockSeriesPyramid borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockSeriesPyramid borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ArrayString centerAsArrayString() {
        return centerAsArrayString;
    }

    public MockSeriesPyramid centerAsArrayString(ArrayString centerAsArrayString) {
        this.centerAsArrayString = centerAsArrayString;
        return this;
    }

    public ArrayNumber centerAsArrayNumber() {
        return centerAsArrayNumber;
    }

    public MockSeriesPyramid centerAsArrayNumber(ArrayNumber centerAsArrayNumber) {
        this.centerAsArrayNumber = centerAsArrayNumber;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesPyramid colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesPyramid cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesPyramid dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesPyramid dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesPyramid dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockSeriesPyramid depth(double depth) {
        this.depth = depth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesPyramid enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSeriesPyramidAfterAnimateHandler(SeriesPyramidAfterAnimateHandler handler) {
    }

    public void addSeriesPyramidCheckboxClickHandler(SeriesPyramidCheckboxClickHandler handler) {
    }

    public void addSeriesPyramidClickHandler(SeriesPyramidClickHandler handler) {
    }

    public void addSeriesPyramidHideHandler(SeriesPyramidHideHandler handler) {
    }

    public void addSeriesPyramidLegendItemClickHandler(SeriesPyramidLegendItemClickHandler handler) {
    }

    public void addSeriesPyramidMouseOutHandler(SeriesPyramidMouseOutHandler handler) {
    }

    public void addSeriesPyramidMouseOverHandler(SeriesPyramidMouseOverHandler handler) {
    }

    public void addSeriesPyramidShowHandler(SeriesPyramidShowHandler handler) {
    }

    public double heightAsNumber() {
        return heightAsNumber;
    }

    public MockSeriesPyramid heightAsNumber(double heightAsNumber) {
        this.heightAsNumber = heightAsNumber;
        return this;
    }

    public String heightAsString() {
        return heightAsString;
    }

    public MockSeriesPyramid heightAsString(String heightAsString) {
        this.heightAsString = heightAsString;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesPyramid id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesPyramid index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesPyramid keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesPyramid legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesPyramid linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minSize() {
        return minSize;
    }

    public MockSeriesPyramid minSize(double minSize) {
        this.minSize = minSize;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesPyramid name(String name) {
        this.name = name;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesPyramid point(Point point) {
        this.point = point;
        return this;
    }

    public boolean reversed() {
        return reversed;
    }

    public MockSeriesPyramid reversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesPyramid selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesPyramid shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesPyramid shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesPyramid showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public double slicedOffset() {
        return slicedOffset;
    }

    public MockSeriesPyramid slicedOffset(double slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesPyramid states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesPyramid stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesPyramid tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesPyramid type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesPyramid visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double widthAsNumber() {
        return widthAsNumber;
    }

    public MockSeriesPyramid widthAsNumber(double widthAsNumber) {
        this.widthAsNumber = widthAsNumber;
        return this;
    }

    public String widthAsString() {
        return widthAsString;
    }

    public MockSeriesPyramid widthAsString(String widthAsString) {
        this.widthAsString = widthAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesPyramid zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesPyramid zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesPyramid zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesPyramid setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesPyramid setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
