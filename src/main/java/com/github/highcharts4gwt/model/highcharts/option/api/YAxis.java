
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.StackLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisAfterBreaksHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisPointBreakHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisSetExtremesHandler;


/**
 * <p>The Y axis or value axis. Normally this is the vertical axis, though if the 
 * 	chart is inverted this is the horizontal axis. In case of multiple axes, the yAxis
 * 	node is an array of configuration objects.</p>
 * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
 * 	access to the axis.</p>
 * 
 */
public interface YAxis {


    /**
     * Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals must be avoided in the axis tick labels.
     * 
     */
    boolean allowDecimals();

    /**
     * Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals must be avoided in the axis tick labels.
     * 
     */
    YAxis allowDecimals(boolean allowDecimals);

    /**
     * When using an alternate grid color, a band is painted across the plot area between every other grid line.
     * 
     */
    String alternateGridColor();

    /**
     * When using an alternate grid color, a band is painted across the plot area between every other grid line.
     * 
     */
    YAxis alternateGridColor(String alternateGridColor);

    /**
     * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
     * 
     */
    ArrayNumber breaks();

    /**
     * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
     * 
     */
    YAxis breaks(ArrayNumber breaks);

    /**
     * <p>If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a <a href="#series.data">name</a> and setting axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple series, best practice remains defining the <code>categories</code> array.</p>
     * 
     * <p>Example:
     * <pre>categories: ['Apples', 'Bananas', 'Oranges']</pre>
     * 		 Defaults to <code>null</code>
     * </p>
     * 
     */
    ArrayString categories();

    /**
     * <p>If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a <a href="#series.data">name</a> and setting axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple series, best practice remains defining the <code>categories</code> array.</p>
     * 
     * <p>Example:
     * <pre>categories: ['Apples', 'Bananas', 'Oranges']</pre>
     * 		 Defaults to <code>null</code>
     * </p>
     * 
     */
    YAxis categories(ArrayString categories);

    /**
     * The highest allowed value for automatically computed axis extremes.
     * 
     */
    double ceiling();

    /**
     * The highest allowed value for automatically computed axis extremes.
     * 
     */
    YAxis ceiling(double ceiling);

    /**
     * For a datetime axis, the scale will automatically adjust to the appropriate unit. This member gives the default string representations used for each unit. For an overview of the replacement codes, see dateFormat. Defaults to:
     * <pre>{
     * 	millisecond: '%H:%M:%S.%L',
     * 	second: '%H:%M:%S',
     * 	minute: '%H:%M',
     * 	hour: '%H:%M',
     * 	day: '%e. %b',
     * 	week: '%e. %b',
     * 	month: '%b \'%y',
     * 	year: '%Y'
     * }</pre>
     * 
     */
    String dateTimeLabelFormats();

    /**
     * For a datetime axis, the scale will automatically adjust to the appropriate unit. This member gives the default string representations used for each unit. For an overview of the replacement codes, see dateFormat. Defaults to:
     * <pre>{
     * 	millisecond: '%H:%M:%S.%L',
     * 	second: '%H:%M:%S',
     * 	minute: '%H:%M',
     * 	hour: '%H:%M',
     * 	day: '%e. %b',
     * 	week: '%e. %b',
     * 	month: '%b \'%y',
     * 	year: '%Y'
     * }</pre>
     * 
     */
    YAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

    /**
     * Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
     * 
     */
    boolean endOnTick();

    /**
     * Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
     * 
     */
    YAxis endOnTick(boolean endOnTick);

    void addYAxisAfterBreaksHandler(YAxisAfterBreaksHandler yAxisAfterBreaksHandler);

    void addYAxisAfterSetExtremesHandler(YAxisAfterSetExtremesHandler yAxisAfterSetExtremesHandler);

    void addYAxisPointBreakHandler(YAxisPointBreakHandler yAxisPointBreakHandler);

    void addYAxisSetExtremesHandler(YAxisSetExtremesHandler yAxisSetExtremesHandler);

    /**
     * The lowest allowed value for automatically computed axis extremes.
     * 
     */
    double floor();

    /**
     * The lowest allowed value for automatically computed axis extremes.
     * 
     */
    YAxis floor(double floor);

    /**
     * Color of the grid lines extending the ticks across the plot area.
     * 
     */
    String gridLineColor();

    /**
     * Color of the grid lines extending the ticks across the plot area.
     * 
     */
    YAxis gridLineColor(String gridLineColor);

    /**
     * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    String gridLineDashStyle();

    /**
     * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    YAxis gridLineDashStyle(String gridLineDashStyle);

    /**
     * Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either <code>circle</code> or <code>polygon</code>.
     * 
     */
    String gridLineInterpolation();

    /**
     * Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either <code>circle</code> or <code>polygon</code>.
     * 
     */
    YAxis gridLineInterpolation(String gridLineInterpolation);

    /**
     * The width of the grid lines extending the ticks across the plot area.
     * 
     */
    double gridLineWidth();

    /**
     * The width of the grid lines extending the ticks across the plot area.
     * 
     */
    YAxis gridLineWidth(double gridLineWidth);

    /**
     * The Z index of the grid lines.
     * 
     */
    double gridZIndex();

    /**
     * The Z index of the grid lines.
     * 
     */
    YAxis gridZIndex(double gridZIndex);

    /**
     * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
     * 
     */
    YAxis id(String id);

    /**
     * 
     */
    Labels labels();

    /**
     * 
     */
    YAxis labels(Labels labels);

    /**
     * The color of the line marking the axis itself.
     * 
     */
    String lineColor();

    /**
     * The color of the line marking the axis itself.
     * 
     */
    YAxis lineColor(String lineColor);

    /**
     * The width of the line marking the axis itself.
     * 
     */
    double lineWidth();

    /**
     * The width of the line marking the axis itself.
     * 
     */
    YAxis lineWidth(double lineWidth);

    /**
     * Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
     * 
     */
    double linkedTo();

    /**
     * Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
     * 
     */
    YAxis linkedTo(double linkedTo);

    /**
     * The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up. The actual maximum value is also influenced by  <a class="internal" href="#chart">chart.alignTicks</a>.
     * 
     */
    double max();

    /**
     * The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up. The actual maximum value is also influenced by  <a class="internal" href="#chart">chart.alignTicks</a>.
     * 
     */
    YAxis max(double max);

    /**
     * Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color to represent the maximum value of the Y axis.
     * 
     */
    String maxColor();

    /**
     * Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color to represent the maximum value of the Y axis.
     * 
     */
    YAxis maxColor(String maxColor);

    /**
     * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area.
     * 
     */
    double maxPadding();

    /**
     * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area.
     * 
     */
    YAxis maxPadding(double maxPadding);

    /**
     * Deprecated. Renamed to <code>minRange</code> as of Highcharts 2.2.
     * 
     */
    double maxZoom();

    /**
     * Deprecated. Renamed to <code>minRange</code> as of Highcharts 2.2.
     * 
     */
    YAxis maxZoom(double maxZoom);

    /**
     * The minimum value of the axis. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
     * 
     */
    double min();

    /**
     * The minimum value of the axis. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
     * 
     */
    YAxis min(double min);

    /**
     * Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color to represent the minimum value of the Y axis.
     * 
     */
    String minColor();

    /**
     * Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color to represent the minimum value of the Y axis.
     * 
     */
    YAxis minColor(String minColor);

    /**
     * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area.
     * 
     */
    double minPadding();

    /**
     * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area.
     * 
     */
    YAxis minPadding(double minPadding);

    /**
     * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>
     * 
     */
    double minRange();

    /**
     * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>
     * 
     */
    YAxis minRange(double minRange);

    /**
     * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
     * 
     */
    double minTickInterval();

    /**
     * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
     * 
     */
    YAxis minTickInterval(double minTickInterval);

    /**
     * Color of the minor, secondary grid lines.
     * 
     */
    String minorGridLineColor();

    /**
     * Color of the minor, secondary grid lines.
     * 
     */
    YAxis minorGridLineColor(String minorGridLineColor);

    /**
     * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    String minorGridLineDashStyle();

    /**
     * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    YAxis minorGridLineDashStyle(String minorGridLineDashStyle);

    /**
     * Width of the minor, secondary grid lines.
     * 
     */
    double minorGridLineWidth();

    /**
     * Width of the minor, secondary grid lines.
     * 
     */
    YAxis minorGridLineWidth(double minorGridLineWidth);

    /**
     * Color for the minor tick marks.
     * 
     */
    String minorTickColor();

    /**
     * Color for the minor tick marks.
     * 
     */
    YAxis minorTickColor(String minorTickColor);

    /**
     * <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, 
     *  the minor tick interval is calculated as a fifth of the tickInterval. If
     *  <code>null</code>, minor ticks are not shown.</p>
     *  <p>On logarithmic axes, the unit is the power of the value. For example, setting
     *  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting
     *  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 
     *  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,
     *  	attempting to enter approximately 5 minor ticks between each major tick.</p>
     * 
     * <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
     * 
     * <p>On axes using <a href="#xAxis.categories">categories</a>, minor ticks are not supported.</p>
     * 
     */
    String minorTickIntervalAsString();

    /**
     * <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, 
     *  the minor tick interval is calculated as a fifth of the tickInterval. If
     *  <code>null</code>, minor ticks are not shown.</p>
     *  <p>On logarithmic axes, the unit is the power of the value. For example, setting
     *  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting
     *  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 
     *  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,
     *  	attempting to enter approximately 5 minor ticks between each major tick.</p>
     * 
     * <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
     * 
     * <p>On axes using <a href="#xAxis.categories">categories</a>, minor ticks are not supported.</p>
     * 
     */
    YAxis minorTickIntervalAsString(String minorTickIntervalAsString);

    /**
     * <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, 
     *  the minor tick interval is calculated as a fifth of the tickInterval. If
     *  <code>null</code>, minor ticks are not shown.</p>
     *  <p>On logarithmic axes, the unit is the power of the value. For example, setting
     *  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting
     *  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 
     *  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,
     *  	attempting to enter approximately 5 minor ticks between each major tick.</p>
     * 
     * <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
     * 
     * <p>On axes using <a href="#xAxis.categories">categories</a>, minor ticks are not supported.</p>
     * 
     */
    double minorTickIntervalAsNumber();

    /**
     * <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, 
     *  the minor tick interval is calculated as a fifth of the tickInterval. If
     *  <code>null</code>, minor ticks are not shown.</p>
     *  <p>On logarithmic axes, the unit is the power of the value. For example, setting
     *  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting
     *  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 
     *  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,
     *  	attempting to enter approximately 5 minor ticks between each major tick.</p>
     * 
     * <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
     * 
     * <p>On axes using <a href="#xAxis.categories">categories</a>, minor ticks are not supported.</p>
     * 
     */
    YAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber);

    /**
     * The pixel length of the minor tick marks.
     * 
     */
    double minorTickLength();

    /**
     * The pixel length of the minor tick marks.
     * 
     */
    YAxis minorTickLength(double minorTickLength);

    /**
     * The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    String minorTickPosition();

    /**
     * The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    YAxis minorTickPosition(String minorTickPosition);

    /**
     * The pixel width of the minor tick mark.
     * 
     */
    double minorTickWidth();

    /**
     * The pixel width of the minor tick mark.
     * 
     */
    YAxis minorTickWidth(double minorTickWidth);

    /**
     * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot.
     * 
     */
    double offset();

    /**
     * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot.
     * 
     */
    YAxis offset(double offset);

    /**
     * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes.
     * 
     */
    boolean opposite();

    /**
     * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes.
     * 
     */
    YAxis opposite(boolean opposite);

    /**
     * An array of objects defining plot bands on the Y axis.
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands();

    /**
     * An array of objects defining plot bands on the Y axis.
     * 
     */
    YAxis plotBands(com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands);

    /**
     * An array of objects representing plot lines on the X axis
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines();

    /**
     * An array of objects representing plot lines on the X axis
     * 
     */
    YAxis plotLines(com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines);

    /**
     * Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by default.
     * 
     */
    boolean reversed();

    /**
     * Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by default.
     * 
     */
    YAxis reversed(boolean reversed);

    /**
     * If <code>true</code>, the first series in a stack will be drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first series is in the base of the stack.
     * 
     */
    boolean reversedStacks();

    /**
     * If <code>true</code>, the first series in a stack will be drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first series is in the base of the stack.
     * 
     */
    YAxis reversedStacks(boolean reversedStacks);

    /**
     * Whether to show the axis line and title when the axis has no data.
     * 
     */
    boolean showEmpty();

    /**
     * Whether to show the axis line and title when the axis has no data.
     * 
     */
    YAxis showEmpty(boolean showEmpty);

    /**
     * Whether to show the first tick label.
     * 
     */
    boolean showFirstLabel();

    /**
     * Whether to show the first tick label.
     * 
     */
    YAxis showFirstLabel(boolean showFirstLabel);

    /**
     * Whether to show the last tick label.
     * 
     */
    boolean showLastLabel();

    /**
     * Whether to show the last tick label.
     * 
     */
    YAxis showLastLabel(boolean showLastLabel);

    /**
     * The stack labels show the total value for each bar in a stacked column or bar chart. The label will be placed on top of
     * 	positive columns and below negative columns. In case of an inverted column chart or a bar chart the label is placed to 
     * 	the right of positive bars and to the left of negative bars.
     * 
     */
    StackLabels stackLabels();

    /**
     * The stack labels show the total value for each bar in a stacked column or bar chart. The label will be placed on top of
     * 	positive columns and below negative columns. In case of an inverted column chart or a bar chart the label is placed to 
     * 	the right of positive bars and to the left of negative bars.
     * 
     */
    YAxis stackLabels(StackLabels stackLabels);

    /**
     * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
     * 
     */
    double startOfWeek();

    /**
     * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
     * 
     */
    YAxis startOfWeek(double startOfWeek);

    /**
     * Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start.
     * 
     */
    boolean startOnTick();

    /**
     * Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start.
     * 
     */
    YAxis startOnTick(boolean startOnTick);

    /**
     * <p>The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the <code>tickPixelInterval</code> option.</p>
     * <p>This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.</p>
     * 
     */
    double tickAmount();

    /**
     * <p>The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the <code>tickPixelInterval</code> option.</p>
     * <p>This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.</p>
     * 
     */
    YAxis tickAmount(double tickAmount);

    /**
     * Color for the main tick marks.
     * 
     */
    String tickColor();

    /**
     * Color for the main tick marks.
     * 
     */
    YAxis tickColor(String tickColor);

    /**
     * <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval
     *  is computed to approximately follow the <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime axes.
     *  On categorized axes, a <code>null</code> tickInterval will default to 1, one category. 
     *  Note that datetime axes are based on milliseconds, so for 
     *  example an interval of one day is expressed as <code>24 * 3600 * 1000</code>.</p>
     *  <p>On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means
     *  	one tick on each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc.
     *  	A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc.</p>
     * <p>If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.</p>
     * 
     */
    double tickInterval();

    /**
     * <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval
     *  is computed to approximately follow the <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime axes.
     *  On categorized axes, a <code>null</code> tickInterval will default to 1, one category. 
     *  Note that datetime axes are based on milliseconds, so for 
     *  example an interval of one day is expressed as <code>24 * 3600 * 1000</code>.</p>
     *  <p>On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means
     *  	one tick on each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc.
     *  	A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc.</p>
     * <p>If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.</p>
     * 
     */
    YAxis tickInterval(double tickInterval);

    /**
     * The pixel length of the main tick marks.
     * 
     */
    double tickLength();

    /**
     * The pixel length of the main tick marks.
     * 
     */
    YAxis tickLength(double tickLength);

    /**
     * If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks. Not applicable to categorized axis. Defaults to <code>72</code>  for the Y axis and <code>100</code> for	the X axis.
     * 
     */
    double tickPixelInterval();

    /**
     * If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks. Not applicable to categorized axis. Defaults to <code>72</code>  for the Y axis and <code>100</code> for	the X axis.
     * 
     */
    YAxis tickPixelInterval(double tickPixelInterval);

    /**
     * The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    String tickPosition();

    /**
     * The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    YAxis tickPosition(String tickPosition);

    /**
     * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.
     * 
     */
    ArrayNumber tickPositions();

    /**
     * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.
     * 
     */
    YAxis tickPositions(ArrayNumber tickPositions);

    /**
     * The pixel width of the major tick marks.
     * 
     */
    double tickWidth();

    /**
     * The pixel width of the major tick marks.
     * 
     */
    YAxis tickWidth(double tickWidth);

    /**
     * For categorized axes only. If <code>on</code> the tick mark is placed in the center of  the category, if <code>between</code> the tick mark is placed between categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else <code>on</code>.
     * 
     */
    String tickmarkPlacement();

    /**
     * For categorized axes only. If <code>on</code> the tick mark is placed in the center of  the category, if <code>between</code> the tick mark is placed between categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else <code>on</code>.
     * 
     */
    YAxis tickmarkPlacement(String tickmarkPlacement);

    /**
     * 
     */
    Title title();

    /**
     * 
     */
    YAxis title(Title title);

    /**
     * The type of axis. Can be one of <code>"linear"</code>, <code>"logarithmic"</code>, <code>"datetime"</code> or <code>"category"</code>. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed 		on appropriate values like full hours or days. In a category axis, the <a href="#series.data">point names</a> of the chart's series are used for categories, if not a <a href="#xAxis.categories">categories</a> array is defined.
     * 
     */
    String type();

    /**
     * The type of axis. Can be one of <code>"linear"</code>, <code>"logarithmic"</code>, <code>"datetime"</code> or <code>"category"</code>. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed 		on appropriate values like full hours or days. In a category axis, the <a href="#series.data">point names</a> of the chart's series are used for categories, if not a <a href="#xAxis.categories">categories</a> array is defined.
     * 
     */
    YAxis type(String type);

    /**
     * Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:
     * <pre>units: [[
     * 	'millisecond', // unit name
     * 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
     * ], [
     * 	'second',
     * 	[1, 2, 5, 10, 15, 30]
     * ], [
     * 	'minute',
     * 	[1, 2, 5, 10, 15, 30]
     * ], [
     * 	'hour',
     * 	[1, 2, 3, 4, 6, 8, 12]
     * ], [
     * 	'day',
     * 	[1]
     * ], [
     * 	'week',
     * 	[1]
     * ], [
     * 	'month',
     * 	[1, 3, 6]
     * ], [
     * 	'year',
     * 	null
     * ]]</pre>
     * 
     */
    ArrayNumber units();

    /**
     * Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:
     * <pre>units: [[
     * 	'millisecond', // unit name
     * 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
     * ], [
     * 	'second',
     * 	[1, 2, 5, 10, 15, 30]
     * ], [
     * 	'minute',
     * 	[1, 2, 5, 10, 15, 30]
     * ], [
     * 	'hour',
     * 	[1, 2, 3, 4, 6, 8, 12]
     * ], [
     * 	'day',
     * 	[1]
     * ], [
     * 	'week',
     * 	[1]
     * ], [
     * 	'month',
     * 	[1, 3, 6]
     * ], [
     * 	'year',
     * 	null
     * ]]</pre>
     * 
     */
    YAxis units(ArrayNumber units);

    String getFieldAsJsonObject(String fieldName);

    YAxis setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
