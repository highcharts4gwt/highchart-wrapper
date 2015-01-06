
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Pyramid;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.Tooltip;

public class MockPyramid
    implements Pyramid
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
    private String linkedTo;
    private double minSize;
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

    public boolean allowPointSelect() {
        return allowPointSelect;
    }

    public MockPyramid allowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockPyramid borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockPyramid borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public ArrayString centerAsArrayString() {
        return centerAsArrayString;
    }

    public MockPyramid centerAsArrayString(ArrayString centerAsArrayString) {
        this.centerAsArrayString = centerAsArrayString;
        return this;
    }

    public ArrayNumber centerAsArrayNumber() {
        return centerAsArrayNumber;
    }

    public MockPyramid centerAsArrayNumber(ArrayNumber centerAsArrayNumber) {
        this.centerAsArrayNumber = centerAsArrayNumber;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockPyramid colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockPyramid cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockPyramid dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockPyramid depth(double depth) {
        this.depth = depth;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockPyramid enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addPyramidAfterAnimateHandler(PyramidAfterAnimateHandler handler) {
    }

    public void addPyramidCheckboxClickHandler(PyramidCheckboxClickHandler handler) {
    }

    public void addPyramidClickHandler(PyramidClickHandler handler) {
    }

    public void addPyramidHideHandler(PyramidHideHandler handler) {
    }

    public void addPyramidLegendItemClickHandler(PyramidLegendItemClickHandler handler) {
    }

    public void addPyramidMouseOutHandler(PyramidMouseOutHandler handler) {
    }

    public void addPyramidMouseOverHandler(PyramidMouseOverHandler handler) {
    }

    public void addPyramidShowHandler(PyramidShowHandler handler) {
    }

    public double heightAsNumber() {
        return heightAsNumber;
    }

    public MockPyramid heightAsNumber(double heightAsNumber) {
        this.heightAsNumber = heightAsNumber;
        return this;
    }

    public String heightAsString() {
        return heightAsString;
    }

    public MockPyramid heightAsString(String heightAsString) {
        this.heightAsString = heightAsString;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockPyramid linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double minSize() {
        return minSize;
    }

    public MockPyramid minSize(double minSize) {
        this.minSize = minSize;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockPyramid point(Point point) {
        this.point = point;
        return this;
    }

    public boolean reversed() {
        return reversed;
    }

    public MockPyramid reversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockPyramid selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockPyramid shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockPyramid shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockPyramid showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public double slicedOffset() {
        return slicedOffset;
    }

    public MockPyramid slicedOffset(double slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public States states() {
        return states;
    }

    public MockPyramid states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockPyramid stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockPyramid tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockPyramid visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public double widthAsNumber() {
        return widthAsNumber;
    }

    public MockPyramid widthAsNumber(double widthAsNumber) {
        this.widthAsNumber = widthAsNumber;
        return this;
    }

    public String widthAsString() {
        return widthAsString;
    }

    public MockPyramid widthAsString(String widthAsString) {
        this.widthAsString = widthAsString;
        return this;
    }

}
