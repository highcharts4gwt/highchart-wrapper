
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.PlotOptions;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Areaspline;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Bar;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Bubble;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Columnrange;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Errorbar;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Funnel;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Gauge;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Line;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Pie;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Pyramid;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Solidgauge;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Spline;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Waterfall;

public class MockPlotOptions
    implements PlotOptions
{

    private Area area;
    private Areaspline areaspline;
    private Bar bar;
    private Boxplot boxplot;
    private Bubble bubble;
    private Columnrange columnrange;
    private Errorbar errorbar;
    private Funnel funnel;
    private Gauge gauge;
    private String heatmap;
    private Line line;
    private Pie pie;
    private Pyramid pyramid;
    private Series series;
    private Solidgauge solidgauge;
    private Spline spline;
    private Waterfall waterfall;

    public Area area() {
        return area;
    }

    public MockPlotOptions area(Area area) {
        this.area = area;
        return this;
    }

    public Areaspline areaspline() {
        return areaspline;
    }

    public MockPlotOptions areaspline(Areaspline areaspline) {
        this.areaspline = areaspline;
        return this;
    }

    public Bar bar() {
        return bar;
    }

    public MockPlotOptions bar(Bar bar) {
        this.bar = bar;
        return this;
    }

    public Boxplot boxplot() {
        return boxplot;
    }

    public MockPlotOptions boxplot(Boxplot boxplot) {
        this.boxplot = boxplot;
        return this;
    }

    public Bubble bubble() {
        return bubble;
    }

    public MockPlotOptions bubble(Bubble bubble) {
        this.bubble = bubble;
        return this;
    }

    public Columnrange columnrange() {
        return columnrange;
    }

    public MockPlotOptions columnrange(Columnrange columnrange) {
        this.columnrange = columnrange;
        return this;
    }

    public Errorbar errorbar() {
        return errorbar;
    }

    public MockPlotOptions errorbar(Errorbar errorbar) {
        this.errorbar = errorbar;
        return this;
    }

    public Funnel funnel() {
        return funnel;
    }

    public MockPlotOptions funnel(Funnel funnel) {
        this.funnel = funnel;
        return this;
    }

    public Gauge gauge() {
        return gauge;
    }

    public MockPlotOptions gauge(Gauge gauge) {
        this.gauge = gauge;
        return this;
    }

    public String heatmap() {
        return heatmap;
    }

    public MockPlotOptions heatmap(String heatmap) {
        this.heatmap = heatmap;
        return this;
    }

    public Line line() {
        return line;
    }

    public MockPlotOptions line(Line line) {
        this.line = line;
        return this;
    }

    public Pie pie() {
        return pie;
    }

    public MockPlotOptions pie(Pie pie) {
        this.pie = pie;
        return this;
    }

    public Pyramid pyramid() {
        return pyramid;
    }

    public MockPlotOptions pyramid(Pyramid pyramid) {
        this.pyramid = pyramid;
        return this;
    }

    public Series series() {
        return series;
    }

    public MockPlotOptions series(Series series) {
        this.series = series;
        return this;
    }

    public Solidgauge solidgauge() {
        return solidgauge;
    }

    public MockPlotOptions solidgauge(Solidgauge solidgauge) {
        this.solidgauge = solidgauge;
        return this;
    }

    public Spline spline() {
        return spline;
    }

    public MockPlotOptions spline(Spline spline) {
        this.spline = spline;
        return this;
    }

    public Waterfall waterfall() {
        return waterfall;
    }

    public MockPlotOptions waterfall(Waterfall waterfall) {
        this.waterfall = waterfall;
        return this;
    }

}
