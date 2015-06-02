
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Tooltip;


/**
 * <p>A <code>scatter</code> series. If the <a href="#series<scatter>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.scatter">plotOptions.scatter</a>.</p>
 * 
 */
public interface SeriesScatter {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    SeriesScatter allowPointSelect(boolean allowPointSelect);

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
    SeriesScatter animation(boolean animation);

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    String color();

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    SeriesScatter color(String color);

    /**
     * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
     * 
     */
    double cropThreshold();

    /**
     * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
     * 
     */
    SeriesScatter cropThreshold(double cropThreshold);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    SeriesScatter cursor(String cursor);

    /**
     * A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:
     * 		    <ul>
     * 		    	<li>Solid</li>
     * 		    	<li>ShortDash</li>
     * 		    	<li>ShortDot</li>
     * 		    	<li>ShortDashDot</li>
     * 		    	<li>ShortDashDotDot</li>
     * 		    	<li>Dot</li>
     * 		    	<li>Dash</li>
     * 		    	<li>LongDash</li>
     * 		    	<li>DashDot</li>
     * 		    	<li>LongDashDot</li>
     * 		    	<li>LongDashDotDot</li>
     * 		    </ul>
     * 
     */
    String dashStyle();

    /**
     * A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:
     * 		    <ul>
     * 		    	<li>Solid</li>
     * 		    	<li>ShortDash</li>
     * 		    	<li>ShortDot</li>
     * 		    	<li>ShortDashDot</li>
     * 		    	<li>ShortDashDotDot</li>
     * 		    	<li>Dot</li>
     * 		    	<li>Dash</li>
     * 		    	<li>LongDash</li>
     * 		    	<li>DashDot</li>
     * 		    	<li>LongDashDot</li>
     * 		    	<li>LongDashDotDot</li>
     * 		    </ul>
     * 
     */
    SeriesScatter dashStyle(String dashStyle);

    /**
     * An array of data points for the series. For the <code>scatter</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
     *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
     *  	and <code>pointInterval</code> given in the series options. If the axis
     *  	has categories, these will be used.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
     *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
     *     [0, 0], 
     *     [1, 8], 
     *     [2, 9]
     * ]</pre></li>
     * 
     * 
     * <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<scatter>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     x: 1,
     *     y: 2,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     x: 1,
     *     y: 4,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    Array<Data> dataAsArrayObject();

    /**
     * An array of data points for the series. For the <code>scatter</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
     *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
     *  	and <code>pointInterval</code> given in the series options. If the axis
     *  	has categories, these will be used.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
     *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
     *     [0, 0], 
     *     [1, 8], 
     *     [2, 9]
     * ]</pre></li>
     * 
     * 
     * <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<scatter>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     x: 1,
     *     y: 2,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     x: 1,
     *     y: 4,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    SeriesScatter dataAsArrayObject(Array<Data> dataAsArrayObject);

    /**
     * An array of data points for the series. For the <code>scatter</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
     *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
     *  	and <code>pointInterval</code> given in the series options. If the axis
     *  	has categories, these will be used.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
     *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
     *     [0, 0], 
     *     [1, 8], 
     *     [2, 9]
     * ]</pre></li>
     * 
     * 
     * <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<scatter>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     x: 1,
     *     y: 2,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     x: 1,
     *     y: 4,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    ArrayNumber dataAsArrayNumber();

    /**
     * An array of data points for the series. For the <code>scatter</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
     *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
     *  	and <code>pointInterval</code> given in the series options. If the axis
     *  	has categories, these will be used.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
     *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
     *     [0, 0], 
     *     [1, 8], 
     *     [2, 9]
     * ]</pre></li>
     * 
     * 
     * <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<scatter>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     x: 1,
     *     y: 2,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     x: 1,
     *     y: 4,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    SeriesScatter dataAsArrayNumber(ArrayNumber dataAsArrayNumber);

    /**
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     */
    SeriesScatter dataLabels(DataLabels dataLabels);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    SeriesScatter enableMouseTracking(boolean enableMouseTracking);

    void addSeriesScatterAfterAnimateHandler(SeriesScatterAfterAnimateHandler seriesScatterAfterAnimateHandler);

    void addSeriesScatterCheckboxClickHandler(SeriesScatterCheckboxClickHandler seriesScatterCheckboxClickHandler);

    void addSeriesScatterClickHandler(SeriesScatterClickHandler seriesScatterClickHandler);

    void addSeriesScatterHideHandler(SeriesScatterHideHandler seriesScatterHideHandler);

    void addSeriesScatterLegendItemClickHandler(SeriesScatterLegendItemClickHandler seriesScatterLegendItemClickHandler);

    void addSeriesScatterMouseOutHandler(SeriesScatterMouseOutHandler seriesScatterMouseOutHandler);

    void addSeriesScatterMouseOverHandler(SeriesScatterMouseOverHandler seriesScatterMouseOverHandler);

    void addSeriesScatterShowHandler(SeriesScatterShowHandler seriesScatterShowHandler);

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    SeriesScatter id(String id);

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    double index();

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    SeriesScatter index(double index);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    SeriesScatter keys(ArrayString keys);

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    double legendIndex();

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    SeriesScatter legendIndex(double legendIndex);

    /**
     * The width of the line connecting the data points.
     * 
     */
    double lineWidth();

    /**
     * The width of the line connecting the data points.
     * 
     */
    SeriesScatter lineWidth(double lineWidth);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    SeriesScatter linkedTo(String linkedTo);

    /**
     * 
     */
    Marker marker();

    /**
     * 
     */
    SeriesScatter marker(Marker marker);

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    String name();

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    SeriesScatter name(String name);

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    String negativeColor();

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    SeriesScatter negativeColor(String negativeColor);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    SeriesScatter point(Point point);

    /**
     * <p>If no x values are given for the points in a series, pointInterval defines
     *  the interval of the x values. For example, if a series contains one value
     *  every decade starting from year 0, set pointInterval to 10.</p>
     * <p>Since Highcharts 4.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
     * 
     */
    double pointInterval();

    /**
     * <p>If no x values are given for the points in a series, pointInterval defines
     *  the interval of the x values. For example, if a series contains one value
     *  every decade starting from year 0, set pointInterval to 10.</p>
     * <p>Since Highcharts 4.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
     * 
     */
    SeriesScatter pointInterval(double pointInterval);

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    String pointIntervalUnit();

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    SeriesScatter pointIntervalUnit(String pointIntervalUnit);

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    double pointStart();

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    SeriesScatter pointStart(double pointStart);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    SeriesScatter selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesScatter shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesScatter shadowAsJsonString(String shadowAsJsonString);

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    boolean showCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    SeriesScatter showCheckbox(boolean showCheckbox);

    /**
     * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
     * 
     */
    SeriesScatter showInLegend(boolean showInLegend);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    SeriesScatter states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    SeriesScatter stickyTracking(boolean stickyTracking);

    /**
     * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
     * 
     */
    double threshold();

    /**
     * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
     * 
     */
    SeriesScatter threshold(double threshold);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    SeriesScatter tooltip(Tooltip tooltip);

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    double turboThreshold();

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    SeriesScatter turboThreshold(double turboThreshold);

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    String type();

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    SeriesScatter type(String type);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    SeriesScatter visible(boolean visible);

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    double xAxisAsNumber();

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    SeriesScatter xAxisAsNumber(double xAxisAsNumber);

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    String xAxisAsString();

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    SeriesScatter xAxisAsString(String xAxisAsString);

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    double yAxisAsNumber();

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    SeriesScatter yAxisAsNumber(double yAxisAsNumber);

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    String yAxisAsString();

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    SeriesScatter yAxisAsString(String yAxisAsString);

    /**
     * Define the visual z index of the series.
     * 
     */
    double zIndex();

    /**
     * Define the visual z index of the series.
     * 
     */
    SeriesScatter zIndex(double zIndex);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    SeriesScatter zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    SeriesScatter zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    SeriesScatter setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    SeriesScatter setFunctionAsString(String fieldName, String functionAsString);

}
