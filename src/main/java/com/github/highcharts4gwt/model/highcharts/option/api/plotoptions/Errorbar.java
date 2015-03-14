
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.Tooltip;


/**
 * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
 * 
 */
public interface Errorbar {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    Errorbar allowPointSelect(boolean allowPointSelect);

    /**
     * The main color of the bars. This can be overridden by <a href="#plotOptions.errorbar.stemColor">stemColor</a> and <a href="#plotOptions.errorbar.whiskerColor">whiskerColor</a> individually.
     * 
     */
    String color();

    /**
     * The main color of the bars. This can be overridden by <a href="#plotOptions.errorbar.stemColor">stemColor</a> and <a href="#plotOptions.errorbar.whiskerColor">whiskerColor</a> individually.
     * 
     */
    Errorbar color(String color);

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    boolean colorByPoint();

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    Errorbar colorByPoint(boolean colorByPoint);

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    Errorbar colors(ArrayString colors);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    Errorbar cursor(String cursor);

    /**
     * Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    double depth();

    /**
     * Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    Errorbar depth(double depth);

    /**
     *  3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it defaults to the same color as the column.
     * 
     */
    String edgeColor();

    /**
     *  3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it defaults to the same color as the column.
     * 
     */
    Errorbar edgeColor(String edgeColor);

    /**
     *  3D columns only. The width of the colored edges.
     * 
     */
    double edgeWidth();

    /**
     *  3D columns only. The width of the colored edges.
     * 
     */
    Errorbar edgeWidth(double edgeWidth);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    Errorbar enableMouseTracking(boolean enableMouseTracking);

    void addErrorbarAfterAnimateHandler(ErrorbarAfterAnimateHandler errorbarAfterAnimateHandler);

    void addErrorbarCheckboxClickHandler(ErrorbarCheckboxClickHandler errorbarCheckboxClickHandler);

    void addErrorbarClickHandler(ErrorbarClickHandler errorbarClickHandler);

    void addErrorbarHideHandler(ErrorbarHideHandler errorbarHideHandler);

    void addErrorbarLegendItemClickHandler(ErrorbarLegendItemClickHandler errorbarLegendItemClickHandler);

    void addErrorbarMouseOutHandler(ErrorbarMouseOutHandler errorbarMouseOutHandler);

    void addErrorbarMouseOverHandler(ErrorbarMouseOverHandler errorbarMouseOverHandler);

    void addErrorbarShowHandler(ErrorbarShowHandler errorbarShowHandler);

    /**
     * The spacing between columns on the Z Axis in a 3D chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    double groupZPadding();

    /**
     * The spacing between columns on the Z Axis in a 3D chart. Requires <code>highcharts-3d.js</code>.
     * 
     */
    Errorbar groupZPadding(double groupZPadding);

    /**
     * The width of the line surrounding the box. If any of <a href="#plotOptions.boxplot.stemWidth">stemWidth</a>, <a href="#plotOptions.boxplot.medianWidth">medianWidth</a> or <a href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are <code>null</code>, the lineWidth also applies to these lines.
     * 
     */
    double lineWidth();

    /**
     * The width of the line surrounding the box. If any of <a href="#plotOptions.boxplot.stemWidth">stemWidth</a>, <a href="#plotOptions.boxplot.medianWidth">medianWidth</a> or <a href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are <code>null</code>, the lineWidth also applies to these lines.
     * 
     */
    Errorbar lineWidth(double lineWidth);

    /**
     * The parent series of the error bar. The default value links it to the previous series. Otherwise, use the id of the parent series.
     * 
     */
    String linkedTo();

    /**
     * The parent series of the error bar. The default value links it to the previous series. Otherwise, use the id of the parent series.
     * 
     */
    Errorbar linkedTo(String linkedTo);

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    String negativeColor();

    /**
     * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
     * 
     */
    Errorbar negativeColor(String negativeColor);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    Errorbar point(Point point);

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
    Errorbar pointInterval(double pointInterval);

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    String pointIntervalUnit();

    /**
     * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
     * 
     */
    Errorbar pointIntervalUnit(String pointIntervalUnit);

    /**
     * Padding between each column or bar, in x axis units.
     * 
     */
    double pointPadding();

    /**
     * Padding between each column or bar, in x axis units.
     * 
     */
    Errorbar pointPadding(double pointPadding);

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
    Errorbar pointPlacementAsString(String pointPlacementAsString);

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
    Errorbar pointPlacementAsNumber(double pointPlacementAsNumber);

    /**
     * The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points.
     * 
     */
    double pointRange();

    /**
     * The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points.
     * 
     */
    Errorbar pointRange(double pointRange);

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    double pointStart();

    /**
     * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
     * 
     */
    Errorbar pointStart(double pointStart);

    /**
     * A pixel value specifying a fixed width for each column or bar. When <code>null</code>, the width is calculated from the <code>pointPadding</code> and <code>groupPadding</code>.
     * 
     */
    double pointWidth();

    /**
     * A pixel value specifying a fixed width for each column or bar. When <code>null</code>, the width is calculated from the <code>pointPadding</code> and <code>groupPadding</code>.
     * 
     */
    Errorbar pointWidth(double pointWidth);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    Errorbar selected(boolean selected);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    Errorbar states(States states);

    /**
     * The color of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the series color is used.
     * 
     */
    String stemColor();

    /**
     * The color of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the series color is used.
     * 
     */
    Errorbar stemColor(String stemColor);

    /**
     * The dash style of the stem, the vertical line extending from the box to the whiskers.
     * 
     */
    String stemDashStyle();

    /**
     * The dash style of the stem, the vertical line extending from the box to the whiskers.
     * 
     */
    Errorbar stemDashStyle(String stemDashStyle);

    /**
     * The width of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the width is inherited from the <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.
     * 
     */
    double stemWidth();

    /**
     * The width of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the width is inherited from the <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.
     * 
     */
    Errorbar stemWidth(double stemWidth);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    Errorbar stickyTracking(boolean stickyTracking);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Errorbar tooltip(Tooltip tooltip);

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    double turboThreshold();

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    Errorbar turboThreshold(double turboThreshold);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    Errorbar visible(boolean visible);

    /**
     * The color of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general series color is used.
     * 
     */
    String whiskerColor();

    /**
     * The color of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general series color is used.
     * 
     */
    Errorbar whiskerColor(String whiskerColor);

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    double whiskerLengthAsNumber();

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    Errorbar whiskerLengthAsNumber(double whiskerLengthAsNumber);

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    String whiskerLengthAsString();

    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
     * 
     */
    Errorbar whiskerLengthAsString(String whiskerLengthAsString);

    /**
     * The line width of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general <a href="#plotOptions.errorbar.lineWidth">lineWidth</a> applies.
     * 
     */
    double whiskerWidth();

    /**
     * The line width of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general <a href="#plotOptions.errorbar.lineWidth">lineWidth</a> applies.
     * 
     */
    Errorbar whiskerWidth(double whiskerWidth);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    Errorbar zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    Errorbar zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Errorbar setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Errorbar setFunctionAsString(String fieldName, String functionAsString);

}
