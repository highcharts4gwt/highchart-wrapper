
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.Tooltip;


/**
 * A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the <code>yAxis</code>, which is extended with some color options, <a href="#yAxis.minColor">minColor</a>, <a href="#yAxis.maxColor">maxColor</a> and <a href="#yAxis.stops">stops</a>, to control the color of the gauge itself.
 * 
 */
public interface Solidgauge {


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
    Solidgauge animation(boolean animation);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    Solidgauge cursor(String cursor);

    /**
     * Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below the point.
     * 
     */
    DataLabels dataLabels();

    /**
     * Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below the point.
     * 
     */
    Solidgauge dataLabels(DataLabels dataLabels);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    Solidgauge enableMouseTracking(boolean enableMouseTracking);

    void addSolidgaugeAfterAnimateHandler(SolidgaugeAfterAnimateHandler solidgaugeAfterAnimateHandler);

    void addSolidgaugeCheckboxClickHandler(SolidgaugeCheckboxClickHandler solidgaugeCheckboxClickHandler);

    void addSolidgaugeClickHandler(SolidgaugeClickHandler solidgaugeClickHandler);

    void addSolidgaugeHideHandler(SolidgaugeHideHandler solidgaugeHideHandler);

    void addSolidgaugeLegendItemClickHandler(SolidgaugeLegendItemClickHandler solidgaugeLegendItemClickHandler);

    void addSolidgaugeMouseOutHandler(SolidgaugeMouseOutHandler solidgaugeMouseOutHandler);

    void addSolidgaugeMouseOverHandler(SolidgaugeMouseOverHandler solidgaugeMouseOverHandler);

    void addSolidgaugeShowHandler(SolidgaugeShowHandler solidgaugeShowHandler);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    Solidgauge keys(ArrayString keys);

    /**
     * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
     * 
     */
    double overshoot();

    /**
     * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
     * 
     */
    Solidgauge overshoot(double overshoot);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    Solidgauge point(Point point);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    Solidgauge selected(boolean selected);

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    boolean showCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    Solidgauge showCheckbox(boolean showCheckbox);

    /**
     * Whether to display this particular series or series type in the legend. Defaults to false for gauge series.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. Defaults to false for gauge series.
     * 
     */
    Solidgauge showInLegend(boolean showInLegend);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    Solidgauge states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    Solidgauge stickyTracking(boolean stickyTracking);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Solidgauge tooltip(Tooltip tooltip);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    Solidgauge visible(boolean visible);

    /**
     * When this option is <code>true</code>, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
     * 
     */
    boolean wrap();

    /**
     * When this option is <code>true</code>, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
     * 
     */
    Solidgauge wrap(boolean wrap);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    Solidgauge zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    Solidgauge zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Solidgauge setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Solidgauge setFunctionAsString(String fieldName, String functionAsString);

}
