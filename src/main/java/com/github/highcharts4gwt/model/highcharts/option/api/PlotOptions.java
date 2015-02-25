
package com.github.highcharts4gwt.model.highcharts.option.api;

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

public interface PlotOptions {


    Area area();

    PlotOptions area(Area area);

    Arearange arearange();

    PlotOptions arearange(Arearange arearange);

    Areaspline areaspline();

    PlotOptions areaspline(Areaspline areaspline);

    Areasplinerange areasplinerange();

    PlotOptions areasplinerange(Areasplinerange areasplinerange);

    Bar bar();

    PlotOptions bar(Bar bar);

    Boxplot boxplot();

    PlotOptions boxplot(Boxplot boxplot);

    Bubble bubble();

    PlotOptions bubble(Bubble bubble);

    Column column();

    PlotOptions column(Column column);

    Columnrange columnrange();

    PlotOptions columnrange(Columnrange columnrange);

    Errorbar errorbar();

    PlotOptions errorbar(Errorbar errorbar);

    Funnel funnel();

    PlotOptions funnel(Funnel funnel);

    Gauge gauge();

    PlotOptions gauge(Gauge gauge);

    Heatmap heatmap();

    PlotOptions heatmap(Heatmap heatmap);

    Line line();

    PlotOptions line(Line line);

    Pie pie();

    PlotOptions pie(Pie pie);

    Polygon polygon();

    PlotOptions polygon(Polygon polygon);

    Pyramid pyramid();

    PlotOptions pyramid(Pyramid pyramid);

    Scatter scatter();

    PlotOptions scatter(Scatter scatter);

    Series series();

    PlotOptions series(Series series);

    Solidgauge solidgauge();

    PlotOptions solidgauge(Solidgauge solidgauge);

    Spline spline();

    PlotOptions spline(Spline spline);

    Treemap treemap();

    PlotOptions treemap(Treemap treemap);

    Waterfall waterfall();

    PlotOptions waterfall(Waterfall waterfall);

}
