
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Funnel;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Tooltip;


/**
 * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
 * 
 */
public class MockFunnel
    implements Funnel
{

    private boolean allowPointSelect;
    private String borderColor;
    private double borderWidth;
    private ArrayString centerAsArrayString;
    private ArrayNumber centerAsArrayNumber;
    private ArrayString colors;
    private String cursor;
    private DataLabels dataLabels;
    private double depth;
    private boolean enableMouseTracking;
    private double heightAsNumber;
    private String heightAsString;
    private ArrayString keys;
    private String linkedTo;
    private double minSize;
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
    private boolean visible;
    private double widthAsNumber;
    private String widthAsString;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockFunnel allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockFunnel borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockFunnel borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ArrayString centerAsArrayString() {
        return centerAsArrayString;
    }

    public MockFunnel centerAsArrayString(ArrayString centerAsArrayString) {
        this.centerAsArrayString = centerAsArrayString;
        return this;
    }

    public ArrayNumber centerAsArrayNumber() {
        return centerAsArrayNumber;
    }

    public MockFunnel centerAsArrayNumber(ArrayNumber centerAsArrayNumber) {
        this.centerAsArrayNumber = centerAsArrayNumber;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockFunnel colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockFunnel cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockFunnel dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockFunnel depth(double depth) {
        this.depth = depth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockFunnel enableMouseTracking(boolean enableMouseTracking) {
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

    public MockFunnel heightAsNumber(double heightAsNumber) {
        this.heightAsNumber = heightAsNumber;
        return this;
    }

    public String heightAsString() {
        return heightAsString;
    }

    public MockFunnel heightAsString(String heightAsString) {
        this.heightAsString = heightAsString;
        return this;
    }

    public ArrayString keys() {
        return keys;
    }

    public MockFunnel keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockFunnel linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minSize() {
        return minSize;
    }

    public MockFunnel minSize(double minSize) {
        this.minSize = minSize;
        return this;
    }

    public double neckHeightAsNumber() {
        return neckHeightAsNumber;
    }

    public MockFunnel neckHeightAsNumber(double neckHeightAsNumber) {
        this.neckHeightAsNumber = neckHeightAsNumber;
        return this;
    }

    public String neckHeightAsString() {
        return neckHeightAsString;
    }

    public MockFunnel neckHeightAsString(String neckHeightAsString) {
        this.neckHeightAsString = neckHeightAsString;
        return this;
    }

    public double neckWidthAsNumber() {
        return neckWidthAsNumber;
    }

    public MockFunnel neckWidthAsNumber(double neckWidthAsNumber) {
        this.neckWidthAsNumber = neckWidthAsNumber;
        return this;
    }

    public String neckWidthAsString() {
        return neckWidthAsString;
    }

    public MockFunnel neckWidthAsString(String neckWidthAsString) {
        this.neckWidthAsString = neckWidthAsString;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockFunnel point(Point point) {
        this.point = point;
        return this;
    }

    public boolean reversed() {
        return reversed;
    }

    public MockFunnel reversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockFunnel selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockFunnel shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockFunnel shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockFunnel showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public double slicedOffset() {
        return slicedOffset;
    }

    public MockFunnel slicedOffset(double slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public States states() {
        return states;
    }

    public MockFunnel states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockFunnel stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockFunnel tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockFunnel visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double widthAsNumber() {
        return widthAsNumber;
    }

    public MockFunnel widthAsNumber(double widthAsNumber) {
        this.widthAsNumber = widthAsNumber;
        return this;
    }

    public String widthAsString() {
        return widthAsString;
    }

    public MockFunnel widthAsString(String widthAsString) {
        this.widthAsString = widthAsString;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockFunnel zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockFunnel zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockFunnel setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockFunnel setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
