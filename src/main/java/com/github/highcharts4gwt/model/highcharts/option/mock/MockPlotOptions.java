
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.PlotOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Area;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Arearange;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Areaspline;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Areasplinerange;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Bar;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Boxplot;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Bubble;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Column;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Columnrange;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Errorbar;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Funnel;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Gauge;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Heatmap;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Line;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Pie;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Polygon;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Pyramid;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Scatter;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Solidgauge;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Spline;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Treemap;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Waterfall;


/**
 * <p>The plotOptions is a wrapper object for config objects for each series type.
 * 		The config objects for each series can also be overridden for each series 
 * 		item as given in the series array.</p>
 * 		<p>Configuration options for the series are given in three levels. Options
 * 		for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series
 * 		of a specific type are given in the plotOptions of that type, for example plotOptions.line.
 * 		Next, options for one single series are given in <a class="internal" href="#series">the 
 * 		series array</a>.</p>
 * 
 */
public class MockPlotOptions
    implements PlotOptions
{

    private Area area;
    private Arearange arearange;
    private Areaspline areaspline;
    private Areasplinerange areasplinerange;
    private Bar bar;
    private Boxplot boxplot;
    private Bubble bubble;
    private Column column;
    private Columnrange columnrange;
    private Errorbar errorbar;
    private Funnel funnel;
    private Gauge gauge;
    private Heatmap heatmap;
    private Line line;
    private Pie pie;
    private Polygon polygon;
    private Pyramid pyramid;
    private Scatter scatter;
    private Series series;
    private Solidgauge solidgauge;
    private Spline spline;
    private Treemap treemap;
    private Waterfall waterfall;
    private String genericField;
    private String functionAsString;

    public Area area() {
        return area;
    }

    public MockPlotOptions area(Area area) {
        this.area = area;
        return this;
    }

    public Arearange arearange() {
        return arearange;
    }

    public MockPlotOptions arearange(Arearange arearange) {
        this.arearange = arearange;
        return this;
    }

    public Areaspline areaspline() {
        return areaspline;
    }

    public MockPlotOptions areaspline(Areaspline areaspline) {
        this.areaspline = areaspline;
        return this;
    }

    public Areasplinerange areasplinerange() {
        return areasplinerange;
    }

    public MockPlotOptions areasplinerange(Areasplinerange areasplinerange) {
        this.areasplinerange = areasplinerange;
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

    public Column column() {
        return column;
    }

    public MockPlotOptions column(Column column) {
        this.column = column;
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

    public Heatmap heatmap() {
        return heatmap;
    }

    public MockPlotOptions heatmap(Heatmap heatmap) {
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

    public Polygon polygon() {
        return polygon;
    }

    public MockPlotOptions polygon(Polygon polygon) {
        this.polygon = polygon;
        return this;
    }

    public Pyramid pyramid() {
        return pyramid;
    }

    public MockPlotOptions pyramid(Pyramid pyramid) {
        this.pyramid = pyramid;
        return this;
    }

    public Scatter scatter() {
        return scatter;
    }

    public MockPlotOptions scatter(Scatter scatter) {
        this.scatter = scatter;
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

    public Treemap treemap() {
        return treemap;
    }

    public MockPlotOptions treemap(Treemap treemap) {
        this.treemap = treemap;
        return this;
    }

    public Waterfall waterfall() {
        return waterfall;
    }

    public MockPlotOptions waterfall(Waterfall waterfall) {
        this.waterfall = waterfall;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPlotOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockPlotOptions setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
