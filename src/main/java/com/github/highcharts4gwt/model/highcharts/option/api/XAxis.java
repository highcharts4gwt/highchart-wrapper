
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.AfterBreaksHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.AfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PointBreakHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.SetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Title;


/**
 * <p>The X axis or category axis. Normally this is the horizontal axis, though if the 
 * 	chart is inverted this is the vertical axis. In case of multiple axes, the xAxis
 * 	node is an array of configuration objects.</p>
 * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
 * 	access to the axis.</p>
 * 
 */
public interface XAxis {


    /**
     * Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals must be avoided in the axis tick labels.
     * 
     */
    boolean allowDecimals();

    /**
     * Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals must be avoided in the axis tick labels.
     * 
     */
    XAxis allowDecimals(boolean allowDecimals);

    /**
     * When using an alternate grid color, a band is painted across the plot area between every other grid line.
     * 
     */
    String alternateGridColor();

    /**
     * When using an alternate grid color, a band is painted across the plot area between every other grid line.
     * 
     */
    XAxis alternateGridColor(String alternateGridColor);

    /**
     * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
     * 
     */
    ArrayNumber breaks();

    /**
     * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
     * 
     */
    XAxis breaks(ArrayNumber breaks);

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
    XAxis categories(ArrayString categories);

    /**
     * The highest allowed value for automatically computed axis extremes.
     * 
     */
    double ceiling();

    /**
     * The highest allowed value for automatically computed axis extremes.
     * 
     */
    XAxis ceiling(double ceiling);

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
    XAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

    /**
     * Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
     * 
     */
    boolean endOnTick();

    /**
     * Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
     * 
     */
    XAxis endOnTick(boolean endOnTick);

    void addAfterBreaksHandler(AfterBreaksHandler afterBreaksHandler);

    void addAfterSetExtremesHandler(AfterSetExtremesHandler afterSetExtremesHandler);

    void addPointBreakHandler(PointBreakHandler pointBreakHandler);

    void addSetExtremesHandler(SetExtremesHandler setExtremesHandler);

    /**
     * The lowest allowed value for automatically computed axis extremes.
     * 
     */
    double floor();

    /**
     * The lowest allowed value for automatically computed axis extremes.
     * 
     */
    XAxis floor(double floor);

    /**
     * Color of the grid lines extending the ticks across the plot area.
     * 
     */
    String gridLineColor();

    /**
     * Color of the grid lines extending the ticks across the plot area.
     * 
     */
    XAxis gridLineColor(String gridLineColor);

    /**
     * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    String gridLineDashStyle();

    /**
     * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    XAxis gridLineDashStyle(String gridLineDashStyle);

    /**
     * The width of the grid lines extending the ticks across the plot area.
     * 
     */
    double gridLineWidth();

    /**
     * The width of the grid lines extending the ticks across the plot area.
     * 
     */
    XAxis gridLineWidth(double gridLineWidth);

    /**
     * The Z index of the grid lines.
     * 
     */
    double gridZIndex();

    /**
     * The Z index of the grid lines.
     * 
     */
    XAxis gridZIndex(double gridZIndex);

    /**
     * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
     * 
     */
    XAxis id(String id);

    /**
     * The axis labels show the number or category for each tick.
     * 
     */
    Labels labels();

    /**
     * The axis labels show the number or category for each tick.
     * 
     */
    XAxis labels(Labels labels);

    /**
     * The color of the line marking the axis itself.
     * 
     */
    String lineColor();

    /**
     * The color of the line marking the axis itself.
     * 
     */
    XAxis lineColor(String lineColor);

    /**
     * The width of the line marking the axis itself.
     * 
     */
    double lineWidth();

    /**
     * The width of the line marking the axis itself.
     * 
     */
    XAxis lineWidth(double lineWidth);

    /**
     * Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
     * 
     */
    double linkedTo();

    /**
     * Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
     * 
     */
    XAxis linkedTo(double linkedTo);

    /**
     * The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up. The actual maximum value is also influenced by  <a class="internal" href="#chart">chart.alignTicks</a>.
     * 
     */
    double max();

    /**
     * The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up. The actual maximum value is also influenced by  <a class="internal" href="#chart">chart.alignTicks</a>.
     * 
     */
    XAxis max(double max);

    /**
     * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
     * 
     */
    double maxPadding();

    /**
     * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
     * 
     */
    XAxis maxPadding(double maxPadding);

    /**
     * Deprecated. Renamed to <code>minRange</code> as of Highcharts 2.2.
     * 
     */
    double maxZoom();

    /**
     * Deprecated. Renamed to <code>minRange</code> as of Highcharts 2.2.
     * 
     */
    XAxis maxZoom(double maxZoom);

    /**
     * The minimum value of the axis. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
     * 
     */
    double min();

    /**
     * The minimum value of the axis. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
     * 
     */
    XAxis min(double min);

    /**
     * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
     * 
     */
    double minPadding();

    /**
     * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
     * 
     */
    XAxis minPadding(double minPadding);

    /**
     * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>
     * 
     */
    double minRange();

    /**
     * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>
     * 
     */
    XAxis minRange(double minRange);

    /**
     * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
     * 
     */
    double minTickInterval();

    /**
     * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
     * 
     */
    XAxis minTickInterval(double minTickInterval);

    /**
     * Color of the minor, secondary grid lines.
     * 
     */
    String minorGridLineColor();

    /**
     * Color of the minor, secondary grid lines.
     * 
     */
    XAxis minorGridLineColor(String minorGridLineColor);

    /**
     * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    String minorGridLineDashStyle();

    /**
     * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
     * 
     */
    XAxis minorGridLineDashStyle(String minorGridLineDashStyle);

    /**
     * Width of the minor, secondary grid lines.
     * 
     */
    double minorGridLineWidth();

    /**
     * Width of the minor, secondary grid lines.
     * 
     */
    XAxis minorGridLineWidth(double minorGridLineWidth);

    /**
     * Color for the minor tick marks.
     * 
     */
    String minorTickColor();

    /**
     * Color for the minor tick marks.
     * 
     */
    XAxis minorTickColor(String minorTickColor);

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
    XAxis minorTickIntervalAsString(String minorTickIntervalAsString);

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
    XAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber);

    /**
     * The pixel length of the minor tick marks.
     * 
     */
    double minorTickLength();

    /**
     * The pixel length of the minor tick marks.
     * 
     */
    XAxis minorTickLength(double minorTickLength);

    /**
     * The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    String minorTickPosition();

    /**
     * The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    XAxis minorTickPosition(String minorTickPosition);

    /**
     * The pixel width of the minor tick mark.
     * 
     */
    double minorTickWidth();

    /**
     * The pixel width of the minor tick mark.
     * 
     */
    XAxis minorTickWidth(double minorTickWidth);

    /**
     * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot.
     * 
     */
    double offset();

    /**
     * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot.
     * 
     */
    XAxis offset(double offset);

    /**
     * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes.
     * 
     */
    boolean opposite();

    /**
     * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes.
     * 
     */
    XAxis opposite(boolean opposite);

    /**
     * <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>
     * 
     * <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands();

    /**
     * <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>
     * 
     * <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
     * 
     */
    XAxis plotBands(com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands);

    /**
     * An array of lines stretching across the plot area, marking a specific value on one of the axes.
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines();

    /**
     * An array of lines stretching across the plot area, marking a specific value on one of the axes.
     * 
     */
    XAxis plotLines(com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines);

    /**
     * Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by default.
     * 
     */
    boolean reversed();

    /**
     * Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by default.
     * 
     */
    XAxis reversed(boolean reversed);

    /**
     * Whether to show the axis line and title when the axis has no data.
     * 
     */
    boolean showEmpty();

    /**
     * Whether to show the axis line and title when the axis has no data.
     * 
     */
    XAxis showEmpty(boolean showEmpty);

    /**
     * Whether to show the first tick label.
     * 
     */
    boolean showFirstLabel();

    /**
     * Whether to show the first tick label.
     * 
     */
    XAxis showFirstLabel(boolean showFirstLabel);

    /**
     * Whether to show the last tick label.
     * 
     */
    boolean showLastLabel();

    /**
     * Whether to show the last tick label.
     * 
     */
    XAxis showLastLabel(boolean showLastLabel);

    /**
     * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
     * 
     */
    double startOfWeek();

    /**
     * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
     * 
     */
    XAxis startOfWeek(double startOfWeek);

    /**
     * Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start.
     * 
     */
    boolean startOnTick();

    /**
     * Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start.
     * 
     */
    XAxis startOnTick(boolean startOnTick);

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
    XAxis tickAmount(double tickAmount);

    /**
     * Color for the main tick marks.
     * 
     */
    String tickColor();

    /**
     * Color for the main tick marks.
     * 
     */
    XAxis tickColor(String tickColor);

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
    XAxis tickInterval(double tickInterval);

    /**
     * The pixel length of the main tick marks.
     * 
     */
    double tickLength();

    /**
     * The pixel length of the main tick marks.
     * 
     */
    XAxis tickLength(double tickLength);

    /**
     * If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks. Not applicable to categorized axis. Defaults to <code>72</code>  for the Y axis and <code>100</code> for	the X axis.
     * 
     */
    double tickPixelInterval();

    /**
     * If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks. Not applicable to categorized axis. Defaults to <code>72</code>  for the Y axis and <code>100</code> for	the X axis.
     * 
     */
    XAxis tickPixelInterval(double tickPixelInterval);

    /**
     * The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    String tickPosition();

    /**
     * The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
     * 
     */
    XAxis tickPosition(String tickPosition);

    /**
     * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.
     * 
     */
    ArrayNumber tickPositions();

    /**
     * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.
     * 
     */
    XAxis tickPositions(ArrayNumber tickPositions);

    /**
     * The pixel width of the major tick marks.
     * 
     */
    double tickWidth();

    /**
     * The pixel width of the major tick marks.
     * 
     */
    XAxis tickWidth(double tickWidth);

    /**
     * For categorized axes only. If <code>on</code> the tick mark is placed in the center of  the category, if <code>between</code> the tick mark is placed between categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else <code>on</code>.
     * 
     */
    String tickmarkPlacement();

    /**
     * For categorized axes only. If <code>on</code> the tick mark is placed in the center of  the category, if <code>between</code> the tick mark is placed between categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else <code>on</code>.
     * 
     */
    XAxis tickmarkPlacement(String tickmarkPlacement);

    /**
     * The axis title, showing next to the axis line.
     * 
     */
    Title title();

    /**
     * The axis title, showing next to the axis line.
     * 
     */
    XAxis title(Title title);

    /**
     * The type of axis. Can be one of <code>"linear"</code>, <code>"logarithmic"</code>, <code>"datetime"</code> or <code>"category"</code>. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed 		on appropriate values like full hours or days. In a category axis, the <a href="#series.data">point names</a> of the chart's series are used for categories, if not a <a href="#xAxis.categories">categories</a> array is defined.
     * 
     */
    String type();

    /**
     * The type of axis. Can be one of <code>"linear"</code>, <code>"logarithmic"</code>, <code>"datetime"</code> or <code>"category"</code>. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed 		on appropriate values like full hours or days. In a category axis, the <a href="#series.data">point names</a> of the chart's series are used for categories, if not a <a href="#xAxis.categories">categories</a> array is defined.
     * 
     */
    XAxis type(String type);

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
    XAxis units(ArrayNumber units);

    String getFieldAsJsonObject(String fieldName);

    XAxis setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    XAxis setFunctionAsString(String fieldName, String functionAsString);

}
