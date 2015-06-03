
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Tooltip;


/**
 * <p>A <code>boxplot</code> series. If the <a href="#series<boxplot>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.boxplot">plotOptions.boxplot</a>.</p>
 * 
 */
public interface SeriesBoxplot {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    SeriesBoxplot allowPointSelect(boolean allowPointSelect);

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    String color();

    /**
     * The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
     * 
     */
    SeriesBoxplot color(String color);

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    boolean colorByPoint();

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    SeriesBoxplot colorByPoint(boolean colorByPoint);

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    SeriesBoxplot colors(ArrayString colors);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    SeriesBoxplot cursor(String cursor);

    /**
     * An array of data points for the series. For the <code>boxplot</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li><p>An array of arrays with 6 or 5 values. In this case, the values correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string, it is
     *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 5. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
     *  	and <code>pointInterval</code> given in the series options.</p>
     * <pre>data: [
     *     [0, 3, 0, 10, 3, 5], 
     *     [1, 7, 8, 7, 2, 9], 
     *     [2, 6, 9, 5, 1, 3]
     * ]</pre></li>
     * 
     * 
     * <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<boxplot>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     x: 1,
     *     low: 4,
     *     q1: 9,
     *     median: 9,
     *     q3: 1,
     *     high: 10,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     x: 1,
     *     low: 5,
     *     q1: 7,
     *     median: 3,
     *     q3: 6,
     *     high: 2,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    Array<Data> dataAsArrayObject();

    /**
     * An array of data points for the series. For the <code>boxplot</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li><p>An array of arrays with 6 or 5 values. In this case, the values correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string, it is
     *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 5. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
     *  	and <code>pointInterval</code> given in the series options.</p>
     * <pre>data: [
     *     [0, 3, 0, 10, 3, 5], 
     *     [1, 7, 8, 7, 2, 9], 
     *     [2, 6, 9, 5, 1, 3]
     * ]</pre></li>
     * 
     * 
     * <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<boxplot>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     x: 1,
     *     low: 4,
     *     q1: 9,
     *     median: 9,
     *     q3: 1,
     *     high: 10,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     x: 1,
     *     low: 5,
     *     q1: 7,
     *     median: 3,
     *     q3: 6,
     *     high: 2,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    SeriesBoxplot dataAsArrayObject(Array<Data> dataAsArrayObject);

    /**
     * Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    double depth();

    /**
     * Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    SeriesBoxplot depth(double depth);

    /**
     *  3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it defaults to the same color as the column.
     * 
     */
    String edgeColor();

    /**
     *  3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it defaults to the same color as the column.
     * 
     */
    SeriesBoxplot edgeColor(String edgeColor);

    /**
     *  3D columns only. The width of the colored edges.
     * 
     */
    double edgeWidth();

    /**
     *  3D columns only. The width of the colored edges.
     * 
     */
    SeriesBoxplot edgeWidth(double edgeWidth);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    SeriesBoxplot enableMouseTracking(boolean enableMouseTracking);

    void addAfterAnimateHandler(AfterAnimateHandler afterAnimateHandler);

    void addCheckboxClickHandler(CheckboxClickHandler checkboxClickHandler);

    void addClickHandler(ClickHandler clickHandler);

    void addHideHandler(HideHandler hideHandler);

    void addLegendItemClickHandler(LegendItemClickHandler legendItemClickHandler);

    void addMouseOutHandler(MouseOutHandler mouseOutHandler);

    void addMouseOverHandler(MouseOverHandler mouseOverHandler);

    void addShowHandler(ShowHandler showHandler);

    /**
     * The fill color of the box.
     * 
     */
    String fillColor();

    /**
     * The fill color of the box.
     * 
     */
    SeriesBoxplot fillColor(String fillColor);

    /**
     * Padding between each value groups, in x axis units.
     * 
     */
    double groupPadding();

    /**
     * Padding between each value groups, in x axis units.
     * 
     */
    SeriesBoxplot groupPadding(double groupPadding);

    /**
     * The spacing between columns on the Z Axis in a 3D chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    double groupZPadding();

    /**
     * The spacing between columns on the Z Axis in a 3D chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    SeriesBoxplot groupZPadding(double groupZPadding);

    /**
     * Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other.
     * 
     */
    boolean grouping();

    /**
     * Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other.
     * 
     */
    SeriesBoxplot grouping(boolean grouping);

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    SeriesBoxplot id(String id);

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    double index();

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    SeriesBoxplot index(double index);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    SeriesBoxplot keys(ArrayString keys);

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    double legendIndex();

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    SeriesBoxplot legendIndex(double legendIndex);

    /**
     * The width of the line surrounding the box. If any of <a href="#plotOptions.boxplot.stemWidth">stemWidth</a>, <a href="#plotOptions.boxplot.medianWidth">medianWidth</a> or <a href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are <code>null</code>, the lineWidth also applies to these lines.
     * 
     */
    double lineWidth();

    /**
     * The width of the line surrounding the box. If any of <a href="#plotOptions.boxplot.stemWidth">stemWidth</a>, <a href="#plotOptions.boxplot.medianWidth">medianWidth</a> or <a href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are <code>null</code>, the lineWidth also applies to these lines.
     * 
     */
    SeriesBoxplot lineWidth(double lineWidth);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    SeriesBoxplot linkedTo(String linkedTo);

    /**
     * The color of the median line. If <code>null</code>, the general series color applies.
     * 
     */
    String medianColor();

    /**
     * The color of the median line. If <code>null</code>, the general series color applies.
     * 
     */
    SeriesBoxplot medianColor(String medianColor);

    /**
     * The pixel width of the median line. If <code>null</code>, the <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> is used.
     * 
     */
    double medianWidth();

    /**
     * The pixel width of the median line. If <code>null</code>, the <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> is used.
     * 
     */
    SeriesBoxplot medianWidth(double medianWidth);

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    String name();

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    SeriesBoxplot name(String name);

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    String negativeColor();

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    SeriesBoxplot negativeColor(String negativeColor);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    SeriesBoxplot point(Point point);

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
    SeriesBoxplot pointInterval(double pointInterval);

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    String pointIntervalUnit();

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    SeriesBoxplot pointIntervalUnit(String pointIntervalUnit);

    /**
     * Padding between each column or bar, in x axis units.
     * 
     */
    double pointPadding();

    /**
     * Padding between each column or bar, in x axis units.
     * 
     */
    SeriesBoxplot pointPadding(double pointPadding);

    /**
     * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
     * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    String pointPlacementAsString();

    /**
     * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
     * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    SeriesBoxplot pointPlacementAsString(String pointPlacementAsString);

    /**
     * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
     * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    double pointPlacementAsNumber();

    /**
     * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
     * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
     * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
     * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
     * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
     * 
     */
    SeriesBoxplot pointPlacementAsNumber(double pointPlacementAsNumber);

    /**
     * The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points.
     * 
     */
    double pointRange();

    /**
     * The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points.
     * 
     */
    SeriesBoxplot pointRange(double pointRange);

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    double pointStart();

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    SeriesBoxplot pointStart(double pointStart);

    /**
     * A pixel value specifying a fixed width for each column or bar. When <code>null</code>, the width is calculated from the <code>pointPadding</code> and <code>groupPadding</code>.
     * 
     */
    double pointWidth();

    /**
     * A pixel value specifying a fixed width for each column or bar. When <code>null</code>, the width is calculated from the <code>pointPadding</code> and <code>groupPadding</code>.
     * 
     */
    SeriesBoxplot pointWidth(double pointWidth);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    SeriesBoxplot selected(boolean selected);

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    boolean showCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    SeriesBoxplot showCheckbox(boolean showCheckbox);

    /**
     * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
     * 
     */
    SeriesBoxplot showInLegend(boolean showInLegend);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    SeriesBoxplot states(States states);

    /**
     * The color of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the series color is used.
     * 
     */
    String stemColor();

    /**
     * The color of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the series color is used.
     * 
     */
    SeriesBoxplot stemColor(String stemColor);

    /**
     * The dash style of the stem, the vertical line extending from the box to the whiskers.
     * 
     */
    String stemDashStyle();

    /**
     * The dash style of the stem, the vertical line extending from the box to the whiskers.
     * 
     */
    SeriesBoxplot stemDashStyle(String stemDashStyle);

    /**
     * The width of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the width is inherited from the <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.
     * 
     */
    double stemWidth();

    /**
     * The width of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the width is inherited from the <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.
     * 
     */
    SeriesBoxplot stemWidth(double stemWidth);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    SeriesBoxplot stickyTracking(boolean stickyTracking);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    SeriesBoxplot tooltip(Tooltip tooltip);

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    double turboThreshold();

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    SeriesBoxplot turboThreshold(double turboThreshold);

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    String type();

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    SeriesBoxplot type(String type);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    SeriesBoxplot visible(boolean visible);

    /**
     * The color of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general series color is used.
     * 
     */
    String whiskerColor();

    /**
     * The color of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general series color is used.
     * 
     */
    SeriesBoxplot whiskerColor(String whiskerColor);

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    double whiskerLengthAsNumber();

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    SeriesBoxplot whiskerLengthAsNumber(double whiskerLengthAsNumber);

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    String whiskerLengthAsString();

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    SeriesBoxplot whiskerLengthAsString(String whiskerLengthAsString);

    /**
     * The line width of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> applies.
     * 
     */
    double whiskerWidth();

    /**
     * The line width of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> applies.
     * 
     */
    SeriesBoxplot whiskerWidth(double whiskerWidth);

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    double xAxisAsNumber();

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    SeriesBoxplot xAxisAsNumber(double xAxisAsNumber);

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    String xAxisAsString();

    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
     * 
     */
    SeriesBoxplot xAxisAsString(String xAxisAsString);

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    double yAxisAsNumber();

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    SeriesBoxplot yAxisAsNumber(double yAxisAsNumber);

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    String yAxisAsString();

    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
     * 
     */
    SeriesBoxplot yAxisAsString(String yAxisAsString);

    /**
     * Define the visual z index of the series.
     * 
     */
    double zIndex();

    /**
     * Define the visual z index of the series.
     * 
     */
    SeriesBoxplot zIndex(double zIndex);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    SeriesBoxplot zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    SeriesBoxplot zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    SeriesBoxplot setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    SeriesBoxplot setFunctionAsString(String fieldName, String functionAsString);

}
