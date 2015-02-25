
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Solidgauge;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.Tooltip;

public class MockSolidgauge
    implements Solidgauge
{

    private boolean animation;
    private String cursor;
    private DataLabels dataLabels;
    private boolean enableMouseTracking;
    private double overshoot;
    private Point point;
    private boolean selected;
    private boolean showCheckbox;
    private boolean showInLegend;
    private States states;
    private boolean stickyTracking;
    private Tooltip tooltip;
    private boolean visible;
    private boolean wrap;
    private String zoneAxis;
    private ArrayNumber zones;

    public boolean animation() {
        return animation;
    }

    public MockSolidgauge animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String cursor() {
        return cursor;
    }

    public MockSolidgauge cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DataLabels dataLabels() {
        return dataLabels;
    }

    public MockSolidgauge dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public boolean enableMouseTracking() {
        return enableMouseTracking;
    }

    public MockSolidgauge enableMouseTracking(boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public void addSolidgaugeAfterAnimateHandler(SolidgaugeAfterAnimateHandler handler) {
    }

    public void addSolidgaugeCheckboxClickHandler(SolidgaugeCheckboxClickHandler handler) {
    }

    public void addSolidgaugeClickHandler(SolidgaugeClickHandler handler) {
    }

    public void addSolidgaugeHideHandler(SolidgaugeHideHandler handler) {
    }

    public void addSolidgaugeLegendItemClickHandler(SolidgaugeLegendItemClickHandler handler) {
    }

    public void addSolidgaugeMouseOutHandler(SolidgaugeMouseOutHandler handler) {
    }

    public void addSolidgaugeMouseOverHandler(SolidgaugeMouseOverHandler handler) {
    }

    public void addSolidgaugeShowHandler(SolidgaugeShowHandler handler) {
    }

    public double overshoot() {
        return overshoot;
    }

    public MockSolidgauge overshoot(double overshoot) {
        this.overshoot = overshoot;
        return this;
    }

    public Point point() {
        return point;
    }

    public MockSolidgauge point(Point point) {
        this.point = point;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockSolidgauge selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public boolean showCheckbox() {
        return showCheckbox;
    }

    public MockSolidgauge showCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public boolean showInLegend() {
        return showInLegend;
    }

    public MockSolidgauge showInLegend(boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public States states() {
        return states;
    }

    public MockSolidgauge states(States states) {
        this.states = states;
        return this;
    }

    public boolean stickyTracking() {
        return stickyTracking;
    }

    public MockSolidgauge stickyTracking(boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockSolidgauge tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public boolean visible() {
        return visible;
    }

    public MockSolidgauge visible(boolean visible) {
        this.visible = visible;
        return this;
    }

    public boolean wrap() {
        return wrap;
    }

    public MockSolidgauge wrap(boolean wrap) {
        this.wrap = wrap;
        return this;
    }

    public String zoneAxis() {
        return zoneAxis;
    }

    public MockSolidgauge zoneAxis(String zoneAxis) {
        this.zoneAxis = zoneAxis;
        return this;
    }

    public ArrayNumber zones() {
        return zones;
    }

    public MockSolidgauge zones(ArrayNumber zones) {
        this.zones = zones;
        return this;
    }

}
