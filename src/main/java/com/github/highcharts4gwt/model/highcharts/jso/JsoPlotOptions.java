
package com.github.highcharts4gwt.model.highcharts.jso;

import com.github.highcharts4gwt.model.highcharts.api.PlotOptions;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Arearange;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Areaspline;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Areasplinerange;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Bar;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Bubble;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Columnrange;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Errorbar;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Funnel;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Gauge;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Heatmap;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Line;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Pie;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Pyramid;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Scatter;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Solidgauge;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Spline;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Waterfall;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoPlotOptions
    extends JavaScriptObject
    implements PlotOptions
{


    protected JsoPlotOptions() {
    }

    public final native Area area()
        throws RuntimeException /*-{
        return this["area"] = (this["area"] || {});
    }-*/
    ;

    public final native JsoPlotOptions area(Area area)
        throws RuntimeException /*-{
        this["area"] = area;
        return this;
    }-*/
    ;

    public final native Arearange arearange()
        throws RuntimeException /*-{
        return this["arearange"] = (this["arearange"] || {});
    }-*/
    ;

    public final native JsoPlotOptions arearange(Arearange arearange)
        throws RuntimeException /*-{
        this["arearange"] = arearange;
        return this;
    }-*/
    ;

    public final native Areaspline areaspline()
        throws RuntimeException /*-{
        return this["areaspline"] = (this["areaspline"] || {});
    }-*/
    ;

    public final native JsoPlotOptions areaspline(Areaspline areaspline)
        throws RuntimeException /*-{
        this["areaspline"] = areaspline;
        return this;
    }-*/
    ;

    public final native Areasplinerange areasplinerange()
        throws RuntimeException /*-{
        return this["areasplinerange"] = (this["areasplinerange"] || {});
    }-*/
    ;

    public final native JsoPlotOptions areasplinerange(Areasplinerange areasplinerange)
        throws RuntimeException /*-{
        this["areasplinerange"] = areasplinerange;
        return this;
    }-*/
    ;

    public final native Bar bar()
        throws RuntimeException /*-{
        return this["bar"] = (this["bar"] || {});
    }-*/
    ;

    public final native JsoPlotOptions bar(Bar bar)
        throws RuntimeException /*-{
        this["bar"] = bar;
        return this;
    }-*/
    ;

    public final native Boxplot boxplot()
        throws RuntimeException /*-{
        return this["boxplot"] = (this["boxplot"] || {});
    }-*/
    ;

    public final native JsoPlotOptions boxplot(Boxplot boxplot)
        throws RuntimeException /*-{
        this["boxplot"] = boxplot;
        return this;
    }-*/
    ;

    public final native Bubble bubble()
        throws RuntimeException /*-{
        return this["bubble"] = (this["bubble"] || {});
    }-*/
    ;

    public final native JsoPlotOptions bubble(Bubble bubble)
        throws RuntimeException /*-{
        this["bubble"] = bubble;
        return this;
    }-*/
    ;

    public final native Column column()
        throws RuntimeException /*-{
        return this["column"] = (this["column"] || {});
    }-*/
    ;

    public final native JsoPlotOptions column(Column column)
        throws RuntimeException /*-{
        this["column"] = column;
        return this;
    }-*/
    ;

    public final native Columnrange columnrange()
        throws RuntimeException /*-{
        return this["columnrange"] = (this["columnrange"] || {});
    }-*/
    ;

    public final native JsoPlotOptions columnrange(Columnrange columnrange)
        throws RuntimeException /*-{
        this["columnrange"] = columnrange;
        return this;
    }-*/
    ;

    public final native Errorbar errorbar()
        throws RuntimeException /*-{
        return this["errorbar"] = (this["errorbar"] || {});
    }-*/
    ;

    public final native JsoPlotOptions errorbar(Errorbar errorbar)
        throws RuntimeException /*-{
        this["errorbar"] = errorbar;
        return this;
    }-*/
    ;

    public final native Funnel funnel()
        throws RuntimeException /*-{
        return this["funnel"] = (this["funnel"] || {});
    }-*/
    ;

    public final native JsoPlotOptions funnel(Funnel funnel)
        throws RuntimeException /*-{
        this["funnel"] = funnel;
        return this;
    }-*/
    ;

    public final native Gauge gauge()
        throws RuntimeException /*-{
        return this["gauge"] = (this["gauge"] || {});
    }-*/
    ;

    public final native JsoPlotOptions gauge(Gauge gauge)
        throws RuntimeException /*-{
        this["gauge"] = gauge;
        return this;
    }-*/
    ;

    public final native Heatmap heatmap()
        throws RuntimeException /*-{
        return this["heatmap"] = (this["heatmap"] || {});
    }-*/
    ;

    public final native JsoPlotOptions heatmap(Heatmap heatmap)
        throws RuntimeException /*-{
        this["heatmap"] = heatmap;
        return this;
    }-*/
    ;

    public final native Line line()
        throws RuntimeException /*-{
        return this["line"] = (this["line"] || {});
    }-*/
    ;

    public final native JsoPlotOptions line(Line line)
        throws RuntimeException /*-{
        this["line"] = line;
        return this;
    }-*/
    ;

    public final native Pie pie()
        throws RuntimeException /*-{
        return this["pie"] = (this["pie"] || {});
    }-*/
    ;

    public final native JsoPlotOptions pie(Pie pie)
        throws RuntimeException /*-{
        this["pie"] = pie;
        return this;
    }-*/
    ;

    public final native Pyramid pyramid()
        throws RuntimeException /*-{
        return this["pyramid"] = (this["pyramid"] || {});
    }-*/
    ;

    public final native JsoPlotOptions pyramid(Pyramid pyramid)
        throws RuntimeException /*-{
        this["pyramid"] = pyramid;
        return this;
    }-*/
    ;

    public final native Scatter scatter()
        throws RuntimeException /*-{
        return this["scatter"] = (this["scatter"] || {});
    }-*/
    ;

    public final native JsoPlotOptions scatter(Scatter scatter)
        throws RuntimeException /*-{
        this["scatter"] = scatter;
        return this;
    }-*/
    ;

    public final native Series series()
        throws RuntimeException /*-{
        return this["series"] = (this["series"] || {});
    }-*/
    ;

    public final native JsoPlotOptions series(Series series)
        throws RuntimeException /*-{
        this["series"] = series;
        return this;
    }-*/
    ;

    public final native Solidgauge solidgauge()
        throws RuntimeException /*-{
        return this["solidgauge"] = (this["solidgauge"] || {});
    }-*/
    ;

    public final native JsoPlotOptions solidgauge(Solidgauge solidgauge)
        throws RuntimeException /*-{
        this["solidgauge"] = solidgauge;
        return this;
    }-*/
    ;

    public final native Spline spline()
        throws RuntimeException /*-{
        return this["spline"] = (this["spline"] || {});
    }-*/
    ;

    public final native JsoPlotOptions spline(Spline spline)
        throws RuntimeException /*-{
        this["spline"] = spline;
        return this;
    }-*/
    ;

    public final native Waterfall waterfall()
        throws RuntimeException /*-{
        return this["waterfall"] = (this["waterfall"] || {});
    }-*/
    ;

    public final native JsoPlotOptions waterfall(Waterfall waterfall)
        throws RuntimeException /*-{
        this["waterfall"] = waterfall;
        return this;
    }-*/
    ;

}
