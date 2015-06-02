
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Tooltip;


/**
 * <p>A <code>pyramid</code> series. If the <a href="#series<pyramid>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pyramid">plotOptions.pyramid</a>.</p>
 * 
 */
public interface SeriesPyramid {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    SeriesPyramid allowPointSelect(boolean allowPointSelect);

    /**
     * The color of the border surrounding each slice.
     * 
     */
    String borderColor();

    /**
     * The color of the border surrounding each slice.
     * 
     */
    SeriesPyramid borderColor(String borderColor);

    /**
     * The width of the border surrounding each slice.
     * 
     */
    double borderWidth();

    /**
     * The width of the border surrounding each slice.
     * 
     */
    SeriesPyramid borderWidth(double borderWidth);

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    ArrayString centerAsArrayString();

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    SeriesPyramid centerAsArrayString(ArrayString centerAsArrayString);

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    ArrayNumber centerAsArrayNumber();

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    SeriesPyramid centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    SeriesPyramid colors(ArrayString colors);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    SeriesPyramid cursor(String cursor);

    /**
     * An array of data points for the series. For the <code>pyramid</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pyramid>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 6,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     y: 7,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    Array<Data> dataAsArrayObject();

    /**
     * An array of data points for the series. For the <code>pyramid</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pyramid>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 6,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     y: 7,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    SeriesPyramid dataAsArrayObject(Array<Data> dataAsArrayObject);

    /**
     * An array of data points for the series. For the <code>pyramid</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pyramid>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 6,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     y: 7,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    ArrayNumber dataAsArrayNumber();

    /**
     * An array of data points for the series. For the <code>pyramid</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pyramid>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 6,
     *     name: "Point2",
     *     color: "#00FF00"
     * }, {
     *     y: 7,
     *     name: "Point1",
     *     color: "#FF00FF"
     * }]</pre></li>
     *  </ol>
     * 
     */
    SeriesPyramid dataAsArrayNumber(ArrayNumber dataAsArrayNumber);

    /**
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     */
    SeriesPyramid dataLabels(DataLabels dataLabels);

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    double depth();

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    SeriesPyramid depth(double depth);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    SeriesPyramid enableMouseTracking(boolean enableMouseTracking);

    void addSeriesPyramidAfterAnimateHandler(SeriesPyramidAfterAnimateHandler seriesPyramidAfterAnimateHandler);

    void addSeriesPyramidCheckboxClickHandler(SeriesPyramidCheckboxClickHandler seriesPyramidCheckboxClickHandler);

    void addSeriesPyramidClickHandler(SeriesPyramidClickHandler seriesPyramidClickHandler);

    void addSeriesPyramidHideHandler(SeriesPyramidHideHandler seriesPyramidHideHandler);

    void addSeriesPyramidLegendItemClickHandler(SeriesPyramidLegendItemClickHandler seriesPyramidLegendItemClickHandler);

    void addSeriesPyramidMouseOutHandler(SeriesPyramidMouseOutHandler seriesPyramidMouseOutHandler);

    void addSeriesPyramidMouseOverHandler(SeriesPyramidMouseOverHandler seriesPyramidMouseOverHandler);

    void addSeriesPyramidShowHandler(SeriesPyramidShowHandler seriesPyramidShowHandler);

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    double heightAsNumber();

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    SeriesPyramid heightAsNumber(double heightAsNumber);

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    String heightAsString();

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    SeriesPyramid heightAsString(String heightAsString);

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    SeriesPyramid id(String id);

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    double index();

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    SeriesPyramid index(double index);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    SeriesPyramid keys(ArrayString keys);

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    double legendIndex();

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    SeriesPyramid legendIndex(double legendIndex);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    SeriesPyramid linkedTo(String linkedTo);

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    double minSize();

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    SeriesPyramid minSize(double minSize);

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    String name();

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    SeriesPyramid name(String name);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    SeriesPyramid point(Point point);

    /**
     * The pyramid is reversed by default, as opposed to the funnel, which shares the layout engine, and is not reversed.
     * 
     */
    boolean reversed();

    /**
     * The pyramid is reversed by default, as opposed to the funnel, which shares the layout engine, and is not reversed.
     * 
     */
    SeriesPyramid reversed(boolean reversed);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    SeriesPyramid selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesPyramid shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesPyramid shadowAsJsonString(String shadowAsJsonString);

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    SeriesPyramid showInLegend(boolean showInLegend);

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    double slicedOffset();

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    SeriesPyramid slicedOffset(double slicedOffset);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    SeriesPyramid states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    SeriesPyramid stickyTracking(boolean stickyTracking);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    SeriesPyramid tooltip(Tooltip tooltip);

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    String type();

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    SeriesPyramid type(String type);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    SeriesPyramid visible(boolean visible);

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    double widthAsNumber();

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    SeriesPyramid widthAsNumber(double widthAsNumber);

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    String widthAsString();

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    SeriesPyramid widthAsString(String widthAsString);

    /**
     * Define the visual z index of the series.
     * 
     */
    double zIndex();

    /**
     * Define the visual z index of the series.
     * 
     */
    SeriesPyramid zIndex(double zIndex);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    SeriesPyramid zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    SeriesPyramid zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    SeriesPyramid setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    SeriesPyramid setFunctionAsString(String fieldName, String functionAsString);

}
