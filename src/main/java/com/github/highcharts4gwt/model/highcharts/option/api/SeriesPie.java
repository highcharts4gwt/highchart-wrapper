
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Tooltip;


/**
 * <p>A <code>pie</code> series. If the <a href="#series<pie>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pie">plotOptions.pie</a>.</p>
 * 
 */
public interface SeriesPie {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    SeriesPie allowPointSelect(boolean allowPointSelect);

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
    SeriesPie animation(boolean animation);

    /**
     * The color of the border surrounding each slice.
     * 
     */
    String borderColor();

    /**
     * The color of the border surrounding each slice.
     * 
     */
    SeriesPie borderColor(String borderColor);

    /**
     * The width of the border surrounding each slice.
     * 
     */
    double borderWidth();

    /**
     * The width of the border surrounding each slice.
     * 
     */
    SeriesPie borderWidth(double borderWidth);

    /**
     * The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence, the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the center should be explicitly set, for example to <code>["50%", "50%"]</code>.
     * 
     */
    ArrayString centerAsArrayString();

    /**
     * The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence, the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the center should be explicitly set, for example to <code>["50%", "50%"]</code>.
     * 
     */
    SeriesPie centerAsArrayString(ArrayString centerAsArrayString);

    /**
     * The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence, the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the center should be explicitly set, for example to <code>["50%", "50%"]</code>.
     * 
     */
    ArrayNumber centerAsArrayNumber();

    /**
     * The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence, the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the center should be explicitly set, for example to <code>["50%", "50%"]</code>.
     * 
     */
    SeriesPie centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    SeriesPie colors(ArrayString colors);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    SeriesPie cursor(String cursor);

    /**
     * An array of data points for the series. For the <code>pie</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pie>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 1,
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
     * An array of data points for the series. For the <code>pie</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pie>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 1,
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
    SeriesPie dataAsArrayObject(Array<Data> dataAsArrayObject);

    /**
     * An array of data points for the series. For the <code>pie</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pie>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 1,
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
     * An array of data points for the series. For the <code>pie</code> series type, points can be given in the following ways:
     *  <ol>
     *  	<li>An array of numerical values. In this case, the numerical values will 
     *  	be interpreted as <code>y</code> options.  Example:
     * <pre>data: [0, 5, 3, 5]</pre>
     *  	</li>
     *  <li><p>An array of objects with named values. The objects are
     *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pie>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
     * 
     * <pre>data: [{
     *     y: 1,
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
    SeriesPie dataAsArrayNumber(ArrayNumber dataAsArrayNumber);

    /**
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     */
    SeriesPie dataLabels(DataLabels dataLabels);

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    double depth();

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    SeriesPie depth(double depth);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    SeriesPie enableMouseTracking(boolean enableMouseTracking);

    /**
     * The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to <code>startAngle</code> plus 360.
     * 
     */
    double endAngle();

    /**
     * The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to <code>startAngle</code> plus 360.
     * 
     */
    SeriesPie endAngle(double endAngle);

    void addAfterAnimateHandler(AfterAnimateHandler afterAnimateHandler);

    void addCheckboxClickHandler(CheckboxClickHandler checkboxClickHandler);

    void addClickHandler(ClickHandler clickHandler);

    void addHideHandler(HideHandler hideHandler);

    void addLegendItemClickHandler(LegendItemClickHandler legendItemClickHandler);

    void addMouseOutHandler(MouseOutHandler mouseOutHandler);

    void addMouseOverHandler(MouseOverHandler mouseOverHandler);

    void addShowHandler(ShowHandler showHandler);

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
     * 
     */
    SeriesPie id(String id);

    /**
     * <p>Equivalent to <a href="#chart.ignoreHiddenSeries">chart.ignoreHiddenSeries</a>, this option tells whether the series shall be redrawn as if the hidden point were <code>null</code>.</p>
     * <p>The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.</p>
     * 
     */
    boolean ignoreHiddenPoint();

    /**
     * <p>Equivalent to <a href="#chart.ignoreHiddenSeries">chart.ignoreHiddenSeries</a>, this option tells whether the series shall be redrawn as if the hidden point were <code>null</code>.</p>
     * <p>The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.</p>
     * 
     */
    SeriesPie ignoreHiddenPoint(boolean ignoreHiddenPoint);

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    double index();

    /**
     * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
     * 
     */
    SeriesPie index(double index);

    /**
     * <p>The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers.</p>
     * 
     * <p>Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.</p>
     * 
     */
    String innerSizeAsString();

    /**
     * <p>The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers.</p>
     * 
     * <p>Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.</p>
     * 
     */
    SeriesPie innerSizeAsString(String innerSizeAsString);

    /**
     * <p>The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers.</p>
     * 
     * <p>Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.</p>
     * 
     */
    double innerSizeAsNumber();

    /**
     * <p>The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers.</p>
     * 
     * <p>Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.</p>
     * 
     */
    SeriesPie innerSizeAsNumber(double innerSizeAsNumber);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    SeriesPie keys(ArrayString keys);

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    double legendIndex();

    /**
     * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
     * 
     */
    SeriesPie legendIndex(double legendIndex);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    SeriesPie linkedTo(String linkedTo);

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    double minSize();

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    SeriesPie minSize(double minSize);

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    String name();

    /**
     * The name of the series as shown in the legend, tooltip etc.
     * 
     */
    SeriesPie name(String name);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    SeriesPie point(Point point);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    SeriesPie selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesPie shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    SeriesPie shadowAsJsonString(String shadowAsJsonString);

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    SeriesPie showInLegend(boolean showInLegend);

    /**
     * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example <code>"75%"</code>.
     * 
     */
    String sizeAsString();

    /**
     * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example <code>"75%"</code>.
     * 
     */
    SeriesPie sizeAsString(String sizeAsString);

    /**
     * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example <code>"75%"</code>.
     * 
     */
    double sizeAsNumber();

    /**
     * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example <code>"75%"</code>.
     * 
     */
    SeriesPie sizeAsNumber(double sizeAsNumber);

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    double slicedOffset();

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    SeriesPie slicedOffset(double slicedOffset);

    /**
     * The start angle of the pie slices in degrees where 0 is top and 90 right.
     * 
     */
    double startAngle();

    /**
     * The start angle of the pie slices in degrees where 0 is top and 90 right.
     * 
     */
    SeriesPie startAngle(double startAngle);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    SeriesPie states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    SeriesPie stickyTracking(boolean stickyTracking);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    SeriesPie tooltip(Tooltip tooltip);

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    String type();

    /**
     * The type of series. Can be one of <code>area</code>, <code>areaspline</code>, <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>, <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
     * 
     */
    SeriesPie type(String type);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    SeriesPie visible(boolean visible);

    /**
     * Define the visual z index of the series.
     * 
     */
    double zIndex();

    /**
     * Define the visual z index of the series.
     * 
     */
    SeriesPie zIndex(double zIndex);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    SeriesPie zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    SeriesPie zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    SeriesPie setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    SeriesPie setFunctionAsString(String fieldName, String functionAsString);

}
