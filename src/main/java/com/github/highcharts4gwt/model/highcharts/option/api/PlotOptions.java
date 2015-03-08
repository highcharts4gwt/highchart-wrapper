
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
public interface PlotOptions {


    /**
     * 
     */
    Area area();

    /**
     * 
     */
    PlotOptions area(Area area);

    /**
     * The area range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
     * 
     */
    Arearange arearange();

    /**
     * The area range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
     * 
     */
    PlotOptions arearange(Arearange arearange);

    /**
     * 
     */
    Areaspline areaspline();

    /**
     * 
     */
    PlotOptions areaspline(Areaspline areaspline);

    /**
     * The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
     * 
     */
    Areasplinerange areasplinerange();

    /**
     * The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
     * 
     */
    PlotOptions areasplinerange(Areasplinerange areasplinerange);

    /**
     * 
     */
    Bar bar();

    /**
     * 
     */
    PlotOptions bar(Bar bar);

    /**
     * A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
     * 
     */
    Boxplot boxplot();

    /**
     * A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
     * 
     */
    PlotOptions boxplot(Boxplot boxplot);

    /**
     * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
     * 
     */
    Bubble bubble();

    /**
     * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
     * 
     */
    PlotOptions bubble(Bubble bubble);

    /**
     * 
     * 
     */
    Column column();

    /**
     * 
     * 
     */
    PlotOptions column(Column column);

    /**
     * The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
     * 
     */
    Columnrange columnrange();

    /**
     * The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
     * 
     */
    PlotOptions columnrange(Columnrange columnrange);

    /**
     * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
     * 
     */
    Errorbar errorbar();

    /**
     * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
     * 
     */
    PlotOptions errorbar(Errorbar errorbar);

    /**
     * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
     * 
     */
    Funnel funnel();

    /**
     * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
     * 
     */
    PlotOptions funnel(Funnel funnel);

    /**
     * General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
     * 
     */
    Gauge gauge();

    /**
     * General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
     * 
     */
    PlotOptions gauge(Gauge gauge);

    /**
     * <p>The heatmap series type. This series type is available both in Highcharts and Highmaps.</p>
     * 
     * <p>The colors of each heat map point is usually determined by its value and controlled by settings on the <a href="#colorAxis">colorAxis</a>.</p>
     * 
     */
    Heatmap heatmap();

    /**
     * <p>The heatmap series type. This series type is available both in Highcharts and Highmaps.</p>
     * 
     * <p>The colors of each heat map point is usually determined by its value and controlled by settings on the <a href="#colorAxis">colorAxis</a>.</p>
     * 
     */
    PlotOptions heatmap(Heatmap heatmap);

    /**
     * 
     */
    Line line();

    /**
     * 
     */
    PlotOptions line(Line line);

    /**
     * A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
     * 
     */
    Pie pie();

    /**
     * A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
     * 
     */
    PlotOptions pie(Pie pie);

    /**
     * A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
     * 
     */
    Polygon polygon();

    /**
     * A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
     * 
     */
    PlotOptions polygon(Polygon polygon);

    /**
     * A pyramid chart consists of a single pyramid with item heights corresponding to each point value. Technically it is the same as a reversed funnel chart without a neck.
     * 
     */
    Pyramid pyramid();

    /**
     * A pyramid chart consists of a single pyramid with item heights corresponding to each point value. Technically it is the same as a reversed funnel chart without a neck.
     * 
     */
    PlotOptions pyramid(Pyramid pyramid);

    /**
     * 
     * 
     */
    Scatter scatter();

    /**
     * 
     * 
     */
    PlotOptions scatter(Scatter scatter);

    /**
     * <p>General options for all series types.</p>
     * 
     */
    Series series();

    /**
     * <p>General options for all series types.</p>
     * 
     */
    PlotOptions series(Series series);

    /**
     * A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the <code>yAxis</code>, which is extended with some color options, <a href="#yAxis.minColor">minColor</a>, <a href="#yAxis.maxColor">maxColor</a> and <a href="#yAxis.stops">stops</a>, to control the color of the gauge itself.
     * 
     */
    Solidgauge solidgauge();

    /**
     * A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the <code>yAxis</code>, which is extended with some color options, <a href="#yAxis.minColor">minColor</a>, <a href="#yAxis.maxColor">maxColor</a> and <a href="#yAxis.stops">stops</a>, to control the color of the gauge itself.
     * 
     */
    PlotOptions solidgauge(Solidgauge solidgauge);

    /**
     * 
     */
    Spline spline();

    /**
     * 
     */
    PlotOptions spline(Spline spline);

    /**
     * The size of the point shape is determined by its value relative to its siblings values.
     * Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
     * 
     */
    Treemap treemap();

    /**
     * The size of the point shape is determined by its value relative to its siblings values.
     * Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
     * 
     */
    PlotOptions treemap(Treemap treemap);

    /**
     * Options for the waterfall series type.
     * 
     */
    Waterfall waterfall();

    /**
     * Options for the waterfall series type.
     * 
     */
    PlotOptions waterfall(Waterfall waterfall);

    String getFieldAsJsonObject(String fieldName);

    PlotOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
