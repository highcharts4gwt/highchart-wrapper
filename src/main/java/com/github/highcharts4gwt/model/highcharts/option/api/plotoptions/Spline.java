
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.Tooltip;


/**
 * 
 */
public interface Spline {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    Spline allowPointSelect(boolean allowPointSelect);

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
    Spline animation(boolean animation);

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    String color();

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    Spline color(String color);

    /**
     * Polar charts only. Whether to connect the ends of a line series plot across the extremes.
     * 
     */
    boolean connectEnds();

    /**
     * Polar charts only. Whether to connect the ends of a line series plot across the extremes.
     * 
     */
    Spline connectEnds(boolean connectEnds);

    /**
     * Whether to connect a graph line across null points.
     * 
     */
    boolean connectNulls();

    /**
     * Whether to connect a graph line across null points.
     * 
     */
    Spline connectNulls(boolean connectNulls);

    /**
     * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
     * 
     */
    double cropThreshold();

    /**
     * When the series contains less points than the crop threshold, all points are drawn,  event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.  .
     * 
     */
    Spline cropThreshold(double cropThreshold);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    Spline cursor(String cursor);

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
    Spline dashStyle(String dashStyle);

    /**
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     */
    Spline dataLabels(DataLabels dataLabels);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    Spline enableMouseTracking(boolean enableMouseTracking);

    void addSplineAfterAnimateHandler(SplineAfterAnimateHandler splineAfterAnimateHandler);

    void addSplineCheckboxClickHandler(SplineCheckboxClickHandler splineCheckboxClickHandler);

    void addSplineClickHandler(SplineClickHandler splineClickHandler);

    void addSplineHideHandler(SplineHideHandler splineHideHandler);

    void addSplineLegendItemClickHandler(SplineLegendItemClickHandler splineLegendItemClickHandler);

    void addSplineMouseOutHandler(SplineMouseOutHandler splineMouseOutHandler);

    void addSplineMouseOverHandler(SplineMouseOverHandler splineMouseOverHandler);

    void addSplineShowHandler(SplineShowHandler splineShowHandler);

    /**
     * Pixel with of the graph line.
     * 
     */
    double lineWidth();

    /**
     * Pixel with of the graph line.
     * 
     */
    Spline lineWidth(double lineWidth);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    Spline linkedTo(String linkedTo);

    /**
     * 
     */
    Marker marker();

    /**
     * 
     */
    Spline marker(Marker marker);

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    String negativeColor();

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    Spline negativeColor(String negativeColor);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    Spline point(Point point);

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
    Spline pointInterval(double pointInterval);

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    String pointIntervalUnit();

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    Spline pointIntervalUnit(String pointIntervalUnit);

    /**
     * <p>Possible values: null, "on", "between".</p>
     * <p>In a column chart, when pointPlacement is "on", the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is "between", the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    String pointPlacementAsString();

    /**
     * <p>Possible values: null, "on", "between".</p>
     * <p>In a column chart, when pointPlacement is "on", the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is "between", the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    Spline pointPlacementAsString(String pointPlacementAsString);

    /**
     * <p>Possible values: null, "on", "between".</p>
     * <p>In a column chart, when pointPlacement is "on", the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is "between", the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    double pointPlacementAsNumber();

    /**
     * <p>Possible values: null, "on", "between".</p>
     * <p>In a column chart, when pointPlacement is "on", the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is "between", the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    Spline pointPlacementAsNumber(double pointPlacementAsNumber);

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    double pointStart();

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    Spline pointStart(double pointStart);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    Spline selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Spline shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Spline shadowAsJsonString(String shadowAsJsonString);

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    boolean showCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    Spline showCheckbox(boolean showCheckbox);

    /**
     * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
     * 
     */
    Spline showInLegend(boolean showInLegend);

    /**
     * Whether to stack the values of each series on top of each other. Possible values are null to disable, "normal" to stack by value or "percent".
     * 
     */
    String stacking();

    /**
     * Whether to stack the values of each series on top of each other. Possible values are null to disable, "normal" to stack by value or "percent".
     * 
     */
    Spline stacking(String stacking);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    Spline states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    Spline stickyTracking(boolean stickyTracking);

    /**
     * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
     * 
     */
    double threshold();

    /**
     * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
     * 
     */
    Spline threshold(double threshold);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Spline tooltip(Tooltip tooltip);

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    double turboThreshold();

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    Spline turboThreshold(double turboThreshold);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    Spline visible(boolean visible);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    Spline zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    Spline zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Spline setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
