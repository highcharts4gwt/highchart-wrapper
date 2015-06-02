
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Level;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Tooltip;


/**
 * <p>A <code>treemap</code> series. If the <a href="#series<treemap>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.treemap">plotOptions.treemap</a>.</p>
 * 
 */
public interface SeriesTreemap {


    /**
     * When enabled the user can click on a point which is a parent and zoom in on its children.
     * 
     */
    boolean allowDrillToNode();

    /**
     * When enabled the user can click on a point which is a parent and zoom in on its children.
     * 
     */
    SeriesTreemap allowDrillToNode(boolean allowDrillToNode);

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    SeriesTreemap allowPointSelect(boolean allowPointSelect);

    /**
     * Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal.
     * The next levels starting direction will always be the opposite of the previous.
     * 
     */
    boolean alternateStartingDirection();

    /**
     * Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal.
     * The next levels starting direction will always be the opposite of the previous.
     * 
     */
    SeriesTreemap alternateStartingDirection(boolean alternateStartingDirection);

    /**
     * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
     * <dl>
     *   <dt>duration</dt>
     *   <dd>The duration of the animation in milliseconds.</dd>
     * <dt>easing</dt>
     * <dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably				the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using MooTools as the general framework, use the property name <code>transition</code> instead of <code>easing</code>.</dd>
     * </dl>
     * <p>
     * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
     * 
     */
    boolean animation();

    /**
     * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
     * <dl>
     *   <dt>duration</dt>
     *   <dd>The duration of the animation in milliseconds.</dd>
     * <dt>easing</dt>
     * <dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably				the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using MooTools as the general framework, use the property name <code>transition</code> instead of <code>easing</code>.</dd>
     * </dl>
     * <p>
     * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
     * 
     */
    SeriesTreemap animation(boolean animation);

    /**
     * The color of the border surrounding each tree map item.
     * 
     */
    String borderColor();

    /**
     * The color of the border surrounding each tree map item.
     * 
     */
    SeriesTreemap borderColor(String borderColor);

    /**
     * The width of the border surrounding each column or bar.
     * 
     */
    double borderWidth();

    /**
     * The width of the border surrounding each column or bar.
     * 
     */
    SeriesTreemap borderWidth(double borderWidth);

    /**
     * The main color of the series. In heat maps this color is rarely used, as we mostly use the color to denote the value of each point. Unless options are set in the <a href="#colorAxis">colorAxis</a>, the default value is pulled from the <a href="#colors">options.colors</a> array.
     * 
     */
    String color();

    /**
     * The main color of the series. In heat maps this color is rarely used, as we mostly use the color to denote the value of each point. Unless options are set in the <a href="#colorAxis">colorAxis</a>, the default value is pulled from the <a href="#colors">options.colors</a> array.
     * 
     */
    SeriesTreemap color(String color);

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    boolean colorByPoint();

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    SeriesTreemap colorByPoint(boolean colorByPoint);

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    SeriesTreemap colors(ArrayString colors);

    /**
     * When the series contains less points than the crop threshold, all points are drawn, event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.
     * 
     */
    double cropThreshold();

    /**
     * When the series contains less points than the crop threshold, all points are drawn, event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.
     * 
     */
    SeriesTreemap cropThreshold(double cropThreshold);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    SeriesTreemap cursor(String cursor);

    /**
     * An array of data points for the series. For the <code>treemap</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>value</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<treemap>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     value: 7,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     value: 2,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<Data> dataAsArrayObject();

    /**
     * An array of data points for the series. For the <code>treemap</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>value</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<treemap>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     value: 7,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     value: 2,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    SeriesTreemap dataAsArrayObject(com.github.highcharts4gwt.model.array.api.Array<Data> dataAsArrayObject);

    /**
     * An array of data points for the series. For the <code>treemap</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>value</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<treemap>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     value: 7,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     value: 2,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    ArrayNumber dataAsArrayNumber();

    /**
     * An array of data points for the series. For the <code>treemap</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>value</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<treemap>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     value: 7,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     value: 2,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    SeriesTreemap dataAsArrayNumber(ArrayNumber dataAsArrayNumber);

    /**
     * 
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     * 
     */
    SeriesTreemap dataLabels(DataLabels dataLabels);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    SeriesTreemap enableMouseTracking(boolean enableMouseTracking);

    void addSeriesTreemapAfterAnimateHandler(SeriesTreemapAfterAnimateHandler seriesTreemapAfterAnimateHandler);

    void addSeriesTreemapCheckboxClickHandler(SeriesTreemapCheckboxClickHandler seriesTreemapCheckboxClickHandler);

    void addSeriesTreemapClickHandler(SeriesTreemapClickHandler seriesTreemapClickHandler);

    void addSeriesTreemapHideHandler(SeriesTreemapHideHandler seriesTreemapHideHandler);

    void addSeriesTreemapLegendItemClickHandler(SeriesTreemapLegendItemClickHandler seriesTreemapLegendItemClickHandler);

    void addSeriesTreemapMouseOutHandler(SeriesTreemapMouseOutHandler seriesTreemapMouseOutHandler);

    void addSeriesTreemapMouseOverHandler(SeriesTreemapMouseOverHandler seriesTreemapMouseOverHandler);

    void addSeriesTreemapShowHandler(SeriesTreemapShowHandler seriesTreemapShowHandler);

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    SeriesTreemap id(String id);

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    double index();

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    SeriesTreemap index(double index);

    /**
     * This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is undefined, it will be true by default. However when allowDrillToNode is true, then it will be false by default.
     * 
     */
    boolean interactByLeaf();

    /**
     * This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is undefined, it will be true by default. However when allowDrillToNode is true, then it will be false by default.
     * 
     */
    SeriesTreemap interactByLeaf(boolean interactByLeaf);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    SeriesTreemap keys(ArrayString keys);

    /**
     * This option decides which algorithm is used for setting position and dimensions of the points. Can be one of <code>sliceAndDice</code>, <code>stripes</code>, <code>squarified</code> or <code>strip</code>.
     * 
     */
    String layoutAlgorithm();

    /**
     * This option decides which algorithm is used for setting position and dimensions of the points. Can be one of <code>sliceAndDice</code>, <code>stripes</code>, <code>squarified</code> or <code>strip</code>.
     * 
     */
    SeriesTreemap layoutAlgorithm(String layoutAlgorithm);

    /**
     * Defines which direction the layout algorithm will start drawing. Possible values are "vertical" and "horizontal".
     * 
     */
    String layoutStartingDirection();

    /**
     * Defines which direction the layout algorithm will start drawing. Possible values are "vertical" and "horizontal".
     * 
     */
    SeriesTreemap layoutStartingDirection(String layoutStartingDirection);

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    double legendIndex();

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    SeriesTreemap legendIndex(double legendIndex);

    /**
     * Used together with the levels and allowDrillToNode options. When set to false the first level visible when drilling is considered to be level one. Otherwise the level will be the same as the tree structure.
     * 
     */
    boolean levelIsConstant();

    /**
     * Used together with the levels and allowDrillToNode options. When set to false the first level visible when drilling is considered to be level one. Otherwise the level will be the same as the tree structure.
     * 
     */
    SeriesTreemap levelIsConstant(boolean levelIsConstant);

    /**
     * Set options on specific levels. Takes precedence over series options, but not point options.
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<Level> levels();

    /**
     * Set options on specific levels. Takes precedence over series options, but not point options.
     * 
     */
    SeriesTreemap levels(com.github.highcharts4gwt.model.array.api.Array<Level> levels);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    SeriesTreemap linkedTo(String linkedTo);

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    String name();

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    SeriesTreemap name(String name);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    SeriesTreemap point(Point point);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    SeriesTreemap selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesTreemap shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesTreemap shadowAsJsonString(String shadowAsJsonString);

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    boolean showCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    SeriesTreemap showCheckbox(boolean showCheckbox);

    /**
     * Whether to display this series type or specific series item in the legend.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this series type or specific series item in the legend.
     * 
     */
    SeriesTreemap showInLegend(boolean showInLegend);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    SeriesTreemap states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    SeriesTreemap stickyTracking(boolean stickyTracking);

    /**
     * 
     * 
     */
    Tooltip tooltip();

    /**
     * 
     * 
     */
    SeriesTreemap tooltip(Tooltip tooltip);

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    double turboThreshold();

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    SeriesTreemap turboThreshold(double turboThreshold);

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    String type();

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    SeriesTreemap type(String type);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    SeriesTreemap visible(boolean visible);

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    double xAxisAsNumber();

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    SeriesTreemap xAxisAsNumber(double xAxisAsNumber);

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    String xAxisAsString();

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    SeriesTreemap xAxisAsString(String xAxisAsString);

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    double yAxisAsNumber();

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    SeriesTreemap yAxisAsNumber(double yAxisAsNumber);

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    String yAxisAsString();

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    SeriesTreemap yAxisAsString(String yAxisAsString);

    /**
     * Define the visual z index of the series.
     * 
     */
    double zIndex();

    /**
     * Define the visual z index of the series.
     * 
     */
    SeriesTreemap zIndex(double zIndex);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    SeriesTreemap zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    SeriesTreemap zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    SeriesTreemap setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    SeriesTreemap setFunctionAsString(String fieldName, String functionAsString);

}
