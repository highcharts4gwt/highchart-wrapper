
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesFunnel;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Tooltip;


/**
 * <p>A <code>funnel</code> series. If the <a href="#series<funnel>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.funnel">plotOptions.funnel</a>.</p>
 * 
 */
public class MockSeriesFunnel
    implements SeriesFunnel
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
    private double neckHeightAsNumber;
    private String neckHeightAsString;
    private double neckWidthAsNumber;
    private String neckWidthAsString;
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

    public MockSeriesFunnel allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockSeriesFunnel borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockSeriesFunnel borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ArrayString centerAsArrayString() {
        return centerAsArrayString;
    }

    public MockSeriesFunnel centerAsArrayString(ArrayString centerAsArrayString) {
        this.centerAsArrayString = centerAsArrayString;
        return this;
    }

    public ArrayNumber centerAsArrayNumber() {
        return centerAsArrayNumber;
    }

    public MockSeriesFunnel centerAsArrayNumber(ArrayNumber centerAsArrayNumber) {
        this.centerAsArrayNumber = centerAsArrayNumber;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockSeriesFunnel colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSeriesFunnel cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeriesFunnel dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeriesFunnel dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSeriesFunnel dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockSeriesFunnel depth(double depth) {
        this.depth = depth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSeriesFunnel enableMouseTracking(boolean enableMouseTracking) {
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

    public double heightAsNumber() {
        return heightAsNumber;
    }

    public MockSeriesFunnel heightAsNumber(double heightAsNumber) {
        this.heightAsNumber = heightAsNumber;
        return this;
    }

    public String heightAsString() {
        return heightAsString;
    }

    public MockSeriesFunnel heightAsString(String heightAsString) {
        this.heightAsString = heightAsString;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeriesFunnel id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeriesFunnel index(double index) {
        this.index = index;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockSeriesFunnel keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeriesFunnel legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockSeriesFunnel linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minSize() {
        return minSize;
    }

    public MockSeriesFunnel minSize(double minSize) {
        this.minSize = minSize;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeriesFunnel name(String name) {
        this.name = name;
        return this;
    }

    public double neckHeightAsNumber() {
        return neckHeightAsNumber;
    }

    public MockSeriesFunnel neckHeightAsNumber(double neckHeightAsNumber) {
        this.neckHeightAsNumber = neckHeightAsNumber;
        return this;
    }

    public String neckHeightAsString() {
        return neckHeightAsString;
    }

    public MockSeriesFunnel neckHeightAsString(String neckHeightAsString) {
        this.neckHeightAsString = neckHeightAsString;
        return this;
    }

    public double neckWidthAsNumber() {
        return neckWidthAsNumber;
    }

    public MockSeriesFunnel neckWidthAsNumber(double neckWidthAsNumber) {
        this.neckWidthAsNumber = neckWidthAsNumber;
        return this;
    }

    public String neckWidthAsString() {
        return neckWidthAsString;
    }

    public MockSeriesFunnel neckWidthAsString(String neckWidthAsString) {
        this.neckWidthAsString = neckWidthAsString;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSeriesFunnel point(Point point) {
        this.point = point;
        return this;
    }

    public boolean reversed() {
        return reversed;
    }

    public MockSeriesFunnel reversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSeriesFunnel selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockSeriesFunnel shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockSeriesFunnel shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSeriesFunnel showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public double slicedOffset() {
        return slicedOffset;
    }

    public MockSeriesFunnel slicedOffset(double slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSeriesFunnel states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSeriesFunnel stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSeriesFunnel tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeriesFunnel type(String type) {
        this.type = type;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSeriesFunnel visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double widthAsNumber() {
        return widthAsNumber;
    }

    public MockSeriesFunnel widthAsNumber(double widthAsNumber) {
        this.widthAsNumber = widthAsNumber;
        return this;
    }

    public String widthAsString() {
        return widthAsString;
    }

    public MockSeriesFunnel widthAsString(String widthAsString) {
        this.widthAsString = widthAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeriesFunnel zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSeriesFunnel zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSeriesFunnel zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeriesFunnel setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSeriesFunnel setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
