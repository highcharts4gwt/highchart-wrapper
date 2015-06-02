
package com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange;



/**
 * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
 * 
 */
public interface Tooltip {


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
