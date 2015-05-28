
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.Credits;
import com.github.highcharts4gwt.model.highcharts.option.api.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.option.api.Exporting;
import com.github.highcharts4gwt.model.highcharts.option.api.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.Legend;
import com.github.highcharts4gwt.model.highcharts.option.api.Loading;
import com.github.highcharts4gwt.model.highcharts.option.api.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.NoData;
import com.github.highcharts4gwt.model.highcharts.option.api.Pane;
import com.github.highcharts4gwt.model.highcharts.option.api.PlotOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Subtitle;
import com.github.highcharts4gwt.model.highcharts.option.api.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.option.api.YAxis;


/**
 * 
 */
public interface ChartOptions {


    /**
     * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
     * 
     * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
     * 
     */
    Drilldown drilldown();

    /**
     * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
     * 
     * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
     * 
     */
    ChartOptions drilldown(Drilldown drilldown);

    /**
     * The legend is a box containing a symbol and name for each series item
     * 	or point item in the chart.
     * 
     */
    Legend legend();

    /**
     * The legend is a box containing a symbol and name for each series item
     * 	or point item in the chart.
     * 
     */
    ChartOptions legend(Legend legend);

    /**
     * Options regarding the chart area and plot area as well as general chart options.
     * 
     */
    Chart chart();

    /**
     * Options regarding the chart area and plot area as well as general chart options.
     * 
     */
    ChartOptions chart(Chart chart);

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
    PlotOptions plotOptions();

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
    ChartOptions plotOptions(PlotOptions plotOptions);

    /**
     * <p>The X axis or category axis. Normally this is the horizontal axis, though if the 
     * 	chart is inverted this is the vertical axis. In case of multiple axes, the xAxis
     * 	node is an array of configuration objects.</p>
     * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
     * 	access to the axis.</p>
     * 
     */
    XAxis xAxis();

    /**
     * <p>The X axis or category axis. Normally this is the horizontal axis, though if the 
     * 	chart is inverted this is the vertical axis. In case of multiple axes, the xAxis
     * 	node is an array of configuration objects.</p>
     * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
     * 	access to the axis.</p>
     * 
     */
    ChartOptions xAxis(XAxis xAxis);

    /**
     * <p>The Y axis or value axis. Normally this is the vertical axis, though if the 
     * 	chart is inverted this is the horizontal axis. In case of multiple axes, the yAxis
     * 	node is an array of configuration objects.</p>
     * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
     * 	access to the axis.</p>
     * 
     */
    YAxis yAxis();

    /**
     * <p>The Y axis or value axis. Normally this is the vertical axis, though if the 
     * 	chart is inverted this is the horizontal axis. In case of multiple axes, the yAxis
     * 	node is an array of configuration objects.</p>
     * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
     * 	access to the axis.</p>
     * 
     */
    ChartOptions yAxis(YAxis yAxis);

    /**
     * Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
     * 
     */
    Exporting exporting();

    /**
     * Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
     * 
     */
    ChartOptions exporting(Exporting exporting);

    /**
     * A collection of options for buttons and menus appearing in the exporting module.
     * 
     */
    Navigation navigation();

    /**
     * A collection of options for buttons and menus appearing in the exporting module.
     * 
     */
    ChartOptions navigation(Navigation navigation);

    /**
     * The chart's subtitle
     * 
     */
    Subtitle subtitle();

    /**
     * The chart's subtitle
     * 
     */
    ChartOptions subtitle(Subtitle subtitle);

    /**
     * The chart's main title.
     * 
     */
    Title title();

    /**
     * The chart's main title.
     * 
     */
    ChartOptions title(Title title);

    /**
     * Options for the tooltip that appears when the user hovers over a series or point.
     * 
     */
    Tooltip tooltip();

    /**
     * Options for the tooltip that appears when the user hovers over a series or point.
     * 
     */
    ChartOptions tooltip(Tooltip tooltip);

    /**
     * Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
     * 
     */
    NoData noData();

    /**
     * Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
     * 
     */
    ChartOptions noData(NoData noData);

    /**
     * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
     * 
     */
    Pane pane();

    /**
     * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
     * 
     */
    ChartOptions pane(Pane pane);

    /**
     * <p>An array containing the default colors for the chart's series. When all colors are used, new colors are pulled from the start again. Defaults to:
     * <pre>colors: ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', 
     *    '#f15c80', '#e4d354', '#2b908f', '#f45b5b', '#91e8e1']</pre>
     * 
     * Default colors can also be set on a series or series.type basis, see <a href="#plotOptions.column.colors">column.colors</a>, <a href="#plotOptions.pie.colors">pie.colors</a>.
     * </p>
     * 
     * <h3>Legacy</h3>
     * <p>In Highcharts 3.x, the default colors were:
     * <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', 
     *    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>
     * </p>
     * 
     * <p>In Highcharts 2.x, the default colors were:
     * <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', 
     *    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre></p>
     * 
     */
    ArrayString colors();

    /**
     * <p>An array containing the default colors for the chart's series. When all colors are used, new colors are pulled from the start again. Defaults to:
     * <pre>colors: ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', 
     *    '#f15c80', '#e4d354', '#2b908f', '#f45b5b', '#91e8e1']</pre>
     * 
     * Default colors can also be set on a series or series.type basis, see <a href="#plotOptions.column.colors">column.colors</a>, <a href="#plotOptions.pie.colors">pie.colors</a>.
     * </p>
     * 
     * <h3>Legacy</h3>
     * <p>In Highcharts 3.x, the default colors were:
     * <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', 
     *    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>
     * </p>
     * 
     * <p>In Highcharts 2.x, the default colors were:
     * <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', 
     *    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre></p>
     * 
     */
    ChartOptions colors(ArrayString colors);

    /**
     * <p>The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or grid views. See also the <a href="http://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>
     * 
     * <p>It requires the <code>modules/data.js</code> file to be loaded.</p>
     * 
     * <p>Please note that the default way of adding data in Highcharts, without the need of a module, is through the <a href="#series.data">series.data</a> option.</p>
     * 
     */
    Data data();

    /**
     * <p>The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or grid views. See also the <a href="http://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>
     * 
     * <p>It requires the <code>modules/data.js</code> file to be loaded.</p>
     * 
     * <p>Please note that the default way of adding data in Highcharts, without the need of a module, is through the <a href="#series.data">series.data</a> option.</p>
     * 
     */
    ChartOptions data(Data data);

    /**
     * Highchart by default puts a credits label in the lower right corner of the chart.
     * 		This can be changed using these options.
     * 
     */
    Credits credits();

    /**
     * Highchart by default puts a credits label in the lower right corner of the chart.
     * 		This can be changed using these options.
     * 
     */
    ChartOptions credits(Credits credits);

    /**
     * The loading options control the appearance of the loading screen that covers the 
     * 	plot area on chart operations. This screen only appears after an explicit call
     * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
     * 	to the end user that something is going on, for example while retrieving new data
     * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
     * 	object, but part of the <code>lang</code> object.
     * 
     */
    Loading loading();

    /**
     * The loading options control the appearance of the loading screen that covers the 
     * 	plot area on chart operations. This screen only appears after an explicit call
     * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
     * 	to the end user that something is going on, for example while retrieving new data
     * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
     * 	object, but part of the <code>lang</code> object.
     * 
     */
    ChartOptions loading(Loading loading);

    /**
     * HTML labels that can be positioned anywhere in the chart area.
     * 
     */
    Labels labels();

    /**
     * HTML labels that can be positioned anywhere in the chart area.
     * 
     */
    ChartOptions labels(Labels labels);

    /**
     * The actual series to append to the chart. In addition to 
     * 	the members listed below, any member of the <code>plotOptions</code> for that specific
     * 	type of plot can be added to a series individually. For example, even though a general
     * 	<code>lineWidth</code> is specified in <code>plotOptions.series</code>, an individual
     * 	<code>lineWidth</code> can be specified for each series.
     * 
     */
    Array<Object> series();

    /**
     * The actual series to append to the chart. In addition to 
     * 	the members listed below, any member of the <code>plotOptions</code> for that specific
     * 	type of plot can be added to a series individually. For example, even though a general
     * 	<code>lineWidth</code> is specified in <code>plotOptions.series</code>, an individual
     * 	<code>lineWidth</code> can be specified for each series.
     * 
     */
    ChartOptions series(Array<Object> series);

    String getFieldAsJsonObject(String fieldName);

    ChartOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    ChartOptions setFunctionAsString(String fieldName, String functionAsString);

}
