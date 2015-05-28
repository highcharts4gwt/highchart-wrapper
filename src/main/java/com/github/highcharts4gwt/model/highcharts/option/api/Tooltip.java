
package com.github.highcharts4gwt.model.highcharts.option.api;



/**
 * Options for the tooltip that appears when the user hovers over a series or point.
 * 
 */
public interface Tooltip {


    /**
     * Enable or disable animation of the tooltip. In slow legacy IE browsers the animation is disabled by default.
     * 
     */
    boolean animation();

    /**
     * Enable or disable animation of the tooltip. In slow legacy IE browsers the animation is disabled by default.
     * 
     */
    Tooltip animation(boolean animation);

    /**
     * The background color or gradient for the tooltip.
     * 
     */
    String backgroundColor();

    /**
     * The background color or gradient for the tooltip.
     * 
     */
    Tooltip backgroundColor(String backgroundColor);

    /**
     * The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
     * 
     */
    String borderColor();

    /**
     * The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
     * 
     */
    Tooltip borderColor(String borderColor);

    /**
     * The radius of the rounded border corners.
     * 
     */
    double borderRadius();

    /**
     * The radius of the rounded border corners.
     * 
     */
    Tooltip borderRadius(double borderRadius);

    /**
     * The pixel width of the tooltip border.
     * 
     */
    double borderWidth();

    /**
     * The pixel width of the tooltip border.
     * 
     */
    Tooltip borderWidth(double borderWidth);

    /**
     * <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>
     * 
     * <p>Defaults to:
     * <pre>{
     *     millisecond:"%A, %b %e, %H:%M:%S.%L",
     *     second:"%A, %b %e, %H:%M:%S",
     *     minute:"%A, %b %e, %H:%M",
     *     hour:"%A, %b %e, %H:%M",
     *     day:"%A, %b %e, %Y",
     *     week:"Week from %A, %b %e, %Y",
     *     month:"%B %Y",
     *     year:"%Y"
     * }</pre>
     * </p>
     * 
     */
    String dateTimeLabelFormats();

    /**
     * <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>
     * 
     * <p>Defaults to:
     * <pre>{
     *     millisecond:"%A, %b %e, %H:%M:%S.%L",
     *     second:"%A, %b %e, %H:%M:%S",
     *     minute:"%A, %b %e, %H:%M",
     *     hour:"%A, %b %e, %H:%M",
     *     day:"%A, %b %e, %Y",
     *     week:"Week from %A, %b %e, %Y",
     *     month:"%B %Y",
     *     year:"%Y"
     * }</pre>
     * </p>
     * 
     */
    Tooltip dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

    /**
     * Enable or disable the tooltip.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable the tooltip.
     * 
     */
    Tooltip enabled(boolean enabled);

    /**
     * <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>
     * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
     * 
     */
    boolean followPointer();

    /**
     * <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>
     * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
     * 
     */
    Tooltip followPointer(boolean followPointer);

    /**
     * Whether the tooltip should follow the finger as it moves on a touch device. If <a href="#chart.zoomType">chart.zoomType</a> is set, it will override <code>followTouchMove</code>.
     * 
     */
    boolean followTouchMove();

    /**
     * Whether the tooltip should follow the finger as it moves on a touch device. If <a href="#chart.zoomType">chart.zoomType</a> is set, it will override <code>followTouchMove</code>.
     * 
     */
    Tooltip followTouchMove(boolean followTouchMove);

    /**
     * A string to append to the tooltip format.
     * 
     */
    String footerFormat();

    /**
     * A string to append to the tooltip format.
     * 
     */
    Tooltip footerFormat(String footerFormat);

    /**
     * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p> 
     * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
     * 
     */
    String headerFormat();

    /**
     * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p> 
     * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
     * 
     */
    Tooltip headerFormat(String headerFormat);

    /**
     * The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart.
     * 
     */
    double hideDelay();

    /**
     * The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart.
     * 
     */
    Tooltip hideDelay(double hideDelay);

    /**
     * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
     * 
     */
    String pointFormat();

    /**
     * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
     * 
     */
    Tooltip pointFormat(String pointFormat);

    /**
     * Whether to apply a drop shadow to the tooltip.
     * 
     */
    boolean shadow();

    /**
     * Whether to apply a drop shadow to the tooltip.
     * 
     */
    Tooltip shadow(boolean shadow);

    /**
     * The name of a symbol to use for the border around the tooltip. In Highcharts 3.x and less, the shape was <code>square</code>.
     * 
     */
    String shape();

    /**
     * The name of a symbol to use for the border around the tooltip. In Highcharts 3.x and less, the shape was <code>square</code>.
     * 
     */
    Tooltip shape(String shape);

    /**
     * When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is recommended for single series charts and for tablet/mobile optimized charts.
     * 
     */
    boolean shared();

    /**
     * When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is recommended for single series charts and for tablet/mobile optimized charts.
     * 
     */
    Tooltip shared(boolean shared);

    /**
     * Proximity snap for graphs or single points. Does not apply to bars, columns and pie slices. It defaults to 10 for mouse-powered devices and 25 for touch  devices. Note that since Highcharts 4.1 the whole plot area by default captures pointer events in order to show the tooltip, so for tooltip.snap to make sense, <a href="#plotOptions.series.stickyTracking">stickyTracking</a> must be <code>false</code>.
     * 
     */
    double snap();

    /**
     * Proximity snap for graphs or single points. Does not apply to bars, columns and pie slices. It defaults to 10 for mouse-powered devices and 25 for touch  devices. Note that since Highcharts 4.1 the whole plot area by default captures pointer events in order to show the tooltip, so for tooltip.snap to make sense, <a href="#plotOptions.series.stickyTracking">stickyTracking</a> must be <code>false</code>.
     * 
     */
    Tooltip snap(double snap);

    /**
     * CSS styles for the tooltip. The tooltip can also be styled through the CSS class <code>.highcharts-tooltip</code>. Default value:
     * <pre>style: {
     * 	color: '#333333',
     * 	fontSize: '12px',
     * 	padding: '8px'
     * }</pre>
     * 
     */
    String style();

    /**
     * CSS styles for the tooltip. The tooltip can also be styled through the CSS class <code>.highcharts-tooltip</code>. Default value:
     * <pre>style: {
     * 	color: '#333333',
     * 	fontSize: '12px',
     * 	padding: '8px'
     * }</pre>
     * 
     */
    Tooltip style(String styleAsJsonString);

    /**
     * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
     * 
     */
    boolean useHTML();

    /**
     * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
     * 
     */
    Tooltip useHTML(boolean useHTML);

    /**
     * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
     * 
     */
    double valueDecimals();

    /**
     * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
     * 
     */
    Tooltip valueDecimals(double valueDecimals);

    /**
     * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
     * 
     */
    String valuePrefix();

    /**
     * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
     * 
     */
    Tooltip valuePrefix(String valuePrefix);

    /**
     * A string to append to each series' y value. Overridable in each series' tooltip options object.
     * 
     */
    String valueSuffix();

    /**
     * A string to append to each series' y value. Overridable in each series' tooltip options object.
     * 
     */
    Tooltip valueSuffix(String valueSuffix);

    /**
     * The format for the date in the tooltip header if the X axis is a datetime axis. The default is a best guess based on the smallest distance between points in the chart.
     * 
     */
    String xDateFormat();

    /**
     * The format for the date in the tooltip header if the X axis is a datetime axis. The default is a best guess based on the smallest distance between points in the chart.
     * 
     */
    Tooltip xDateFormat(String xDateFormat);

    String getFieldAsJsonObject(String fieldName);

    Tooltip setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Tooltip setFunctionAsString(String fieldName, String functionAsString);

}
