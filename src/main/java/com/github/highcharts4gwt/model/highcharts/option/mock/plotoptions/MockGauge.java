
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Gauge;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Dial;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Pivot;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Tooltip;


/**
 * General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
 * 
 */
public class MockGauge
    implements Gauge
{

    private boolean animation;
    private String color;
    private String cursor;
    private DataLabels dataLabels;
    private Dial dial;
    private boolean enableMouseTracking;
    private ArrayString keys;
    private String linkedTo;
    private String negativeColor;
    private double overshoot;
    private Pivot pivot;
    private Point point;
    private boolean selected;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private boolean stickyTracking;
    private double threshold;
    private Tooltip tooltip;
    private boolean visible;
    private boolean wrap;
    private String zoneAxis;
    private ArrayNumber zones;
    private String genericField;
    private String functionAsString;

    public boolean animation() {
        return animation;
    }

    public MockGauge animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String color() {
        return color;
    }

    public MockGauge color(String color) {
        this.color = color;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockGauge cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockGauge dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public Dial dial() {
        return dial;
    }

    public MockGauge dial(Dial dial) {
        this.dial = dial;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockGauge enableMouseTracking(boolean enableMouseTracking) {
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

    public ArrayString keys() {
        return keys;
    }

    public MockGauge keys(ArrayString keys) {
        this.keys = keys;
        return this;
    }

    public String linkedTo() {
        return linkedTo;
    }

    public MockGauge linkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public String negativeColor() {
        return negativeColor;
    }

    public MockGauge negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public double overshoot() {
        return overshoot;
    }

    public MockGauge overshoot(double overshoot) {
        this.overshoot = overshoot;
        return this;
    }

    public Pivot pivot() {
        return pivot;
    }

    public MockGauge pivot(Pivot pivot) {
        this.pivot = pivot;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockGauge point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockGauge selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockGauge showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockGauge showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockGauge states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockGauge stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public double threshold() {
        return threshold;
    }

    public MockGauge threshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockGauge tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockGauge visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public boolean wrap() {
        return wrap;
    }

    public MockGauge wrap(boolean wrap) {
        this.wrap = wrap;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockGauge zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockGauge zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockGauge setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockGauge setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
