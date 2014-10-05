
package com.usesoft.highcharts4gwt.model.highcharts.api;

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

public interface PlotOptions {


    Area area();

    PlotOptions area(Area area);

    Areaspline areaspline();

    PlotOptions areaspline(Areaspline areaspline);

    Bar bar();

    PlotOptions bar(Bar bar);

    Boxplot boxplot();

    PlotOptions boxplot(Boxplot boxplot);

    Bubble bubble();

    PlotOptions bubble(Bubble bubble);

    Columnrange columnrange();

    PlotOptions columnrange(Columnrange columnrange);

    Errorbar errorbar();

    PlotOptions errorbar(Errorbar errorbar);

    Funnel funnel();

    PlotOptions funnel(Funnel funnel);

    Gauge gauge();

    PlotOptions gauge(Gauge gauge);

    String heatmap();

    PlotOptions heatmap(String heatmap);

    Line line();

    PlotOptions line(Line line);

    Pie pie();

    PlotOptions pie(Pie pie);

    Pyramid pyramid();

    PlotOptions pyramid(Pyramid pyramid);

    Series series();

    PlotOptions series(Series series);

    Solidgauge solidgauge();

    PlotOptions solidgauge(Solidgauge solidgauge);

    Spline spline();

    PlotOptions spline(Spline spline);

    Waterfall waterfall();

    PlotOptions waterfall(Waterfall waterfall);

}
