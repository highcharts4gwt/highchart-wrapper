
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Dial;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Pivot;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Tooltip;


/**
 * General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
 * 
 */
public interface Gauge {


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
    Gauge animation(boolean animation);

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    String color();

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    Gauge color(String color);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    Gauge cursor(String cursor);

    /**
     * Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below the point.
     * 
     */
    DataLabels dataLabels();

    /**
     * Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below the point.
     * 
     */
    Gauge dataLabels(DataLabels dataLabels);

    /**
     * Options for the dial or arrow pointer of the gauge.
     * 
     */
    Dial dial();

    /**
     * Options for the dial or arrow pointer of the gauge.
     * 
     */
    Gauge dial(Dial dial);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    Gauge enableMouseTracking(boolean enableMouseTracking);

    void addGaugeAfterAnimateHandler(GaugeAfterAnimateHandler gaugeAfterAnimateHandler);

    void addGaugeCheckboxClickHandler(GaugeCheckboxClickHandler gaugeCheckboxClickHandler);

    void addGaugeClickHandler(GaugeClickHandler gaugeClickHandler);

    void addGaugeHideHandler(GaugeHideHandler gaugeHideHandler);

    void addGaugeLegendItemClickHandler(GaugeLegendItemClickHandler gaugeLegendItemClickHandler);

    void addGaugeMouseOutHandler(GaugeMouseOutHandler gaugeMouseOutHandler);

    void addGaugeMouseOverHandler(GaugeMouseOverHandler gaugeMouseOverHandler);

    void addGaugeShowHandler(GaugeShowHandler gaugeShowHandler);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    Gauge keys(ArrayString keys);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    Gauge linkedTo(String linkedTo);

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    String negativeColor();

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    Gauge negativeColor(String negativeColor);

    /**
     * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
     * 
     */
    double overshoot();

    /**
     * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
     * 
     */
    Gauge overshoot(double overshoot);

    /**
     * Options for the pivot or the center point of the gauge.
     * 
     */
    Pivot pivot();

    /**
     * Options for the pivot or the center point of the gauge.
     * 
     */
    Gauge pivot(Pivot pivot);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    Gauge point(Point point);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    Gauge selected(boolean selected);

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    boolean showCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    Gauge showCheckbox(boolean showCheckbox);

    /**
     * Whether to display this particular series or series type in the legend. Defaults to false for gauge series.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. Defaults to false for gauge series.
     * 
     */
    Gauge showInLegend(boolean showInLegend);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    Gauge states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    Gauge stickyTracking(boolean stickyTracking);

    /**
     * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
     * 
     */
    double threshold();

    /**
     * The threshold, also called zero level or base level. For line type series this is only used in conjunction with <a href="#plotOptions.series.negativeColor">negativeColor</a>.
     * 
     */
    Gauge threshold(double threshold);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Gauge tooltip(Tooltip tooltip);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    Gauge visible(boolean visible);

    /**
     * When this option is <code>true</code>, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
     * 
     */
    boolean wrap();

    /**
     * When this option is <code>true</code>, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
     * 
     */
    Gauge wrap(boolean wrap);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    Gauge zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    Gauge zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Gauge setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Gauge setFunctionAsString(String fieldName, String functionAsString);

}
