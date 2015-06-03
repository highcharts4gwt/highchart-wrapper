
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.AddSeriesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.AfterPrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.BeforePrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.DrilldownHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.DrillupHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.LoadHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.Options3d;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.RedrawHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ResetZoomButton;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.SelectionHandler;


/**
 * Options regarding the chart area and plot area as well as general chart options.
 * 
 */
public interface Chart {


    /**
     * When using multiple axis, the ticks of two or more opposite axes will  automatically be aligned by adding ticks to the axis or axes with the least ticks. This can be prevented by setting <code>alignTicks</code> to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting <code>gridLineWidth</code> to 0.
     * 
     */
    boolean alignTicks();

    /**
     * When using multiple axis, the ticks of two or more opposite axes will  automatically be aligned by adding ticks to the axis or axes with the least ticks. This can be prevented by setting <code>alignTicks</code> to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting <code>gridLineWidth</code> to 0.
     * 
     */
    Chart alignTicks(boolean alignTicks);

    /**
     * <p>Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to false here. It can be overridden for each individual API method as a function parameter. The only animation not affected by this option is the  initial series animation, see <a class="internal" href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported:  </p><dl> 	<dt>duration</dt> 	<dd>The duration of the animation in milliseconds.</dd> 	 	<dt>easing</dt> 	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or 	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably 	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using  	MooTools as the general framework, use the property name <code>transition</code> instead  	of <code>easing</code>.</dd> </dl>
     * 
     */
    boolean animationAsBoolean();

    /**
     * <p>Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to false here. It can be overridden for each individual API method as a function parameter. The only animation not affected by this option is the  initial series animation, see <a class="internal" href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported:  </p><dl> 	<dt>duration</dt> 	<dd>The duration of the animation in milliseconds.</dd> 	 	<dt>easing</dt> 	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or 	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably 	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using  	MooTools as the general framework, use the property name <code>transition</code> instead  	of <code>easing</code>.</dd> </dl>
     * 
     */
    Chart animationAsBoolean(boolean animationAsBoolean);

    /**
     * <p>Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to false here. It can be overridden for each individual API method as a function parameter. The only animation not affected by this option is the  initial series animation, see <a class="internal" href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported:  </p><dl> 	<dt>duration</dt> 	<dd>The duration of the animation in milliseconds.</dd> 	 	<dt>easing</dt> 	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or 	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably 	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using  	MooTools as the general framework, use the property name <code>transition</code> instead  	of <code>easing</code>.</dd> </dl>
     * 
     */
    String animationAsJsonString();

    /**
     * <p>Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to false here. It can be overridden for each individual API method as a function parameter. The only animation not affected by this option is the  initial series animation, see <a class="internal" href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported:  </p><dl> 	<dt>duration</dt> 	<dd>The duration of the animation in milliseconds.</dd> 	 	<dt>easing</dt> 	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or 	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably 	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using  	MooTools as the general framework, use the property name <code>transition</code> instead  	of <code>easing</code>.</dd> </dl>
     * 
     */
    Chart animationAsJsonString(String animationAsJsonString);

    /**
     * The background color or gradient for the outer chart area.
     * 
     */
    String backgroundColor();

    /**
     * The background color or gradient for the outer chart area.
     * 
     */
    Chart backgroundColor(String backgroundColor);

    /**
     * The color of the outer chart border.
     * 
     */
    String borderColor();

    /**
     * The color of the outer chart border.
     * 
     */
    Chart borderColor(String borderColor);

    /**
     * The corner radius of the outer chart border.
     * 
     */
    double borderRadius();

    /**
     * The corner radius of the outer chart border.
     * 
     */
    Chart borderRadius(double borderRadius);

    /**
     * The pixel width of the outer chart border.
     * 
     */
    double borderWidth();

    /**
     * The pixel width of the outer chart border.
     * 
     */
    Chart borderWidth(double borderWidth);

    /**
     * A CSS class name to apply to the charts container <code>div</code>, allowing unique CSS styling for each chart.
     * 
     */
    String className();

    /**
     * A CSS class name to apply to the charts container <code>div</code>, allowing unique CSS styling for each chart.
     * 
     */
    Chart className(String className);

    /**
     * Alias of <code>type</code>.
     * 
     */
    String defaultSeriesType();

    /**
     * Alias of <code>type</code>.
     * 
     */
    Chart defaultSeriesType(String defaultSeriesType);

    void addAddSeriesHandler(AddSeriesHandler addSeriesHandler);

    void addAfterPrintHandler(AfterPrintHandler afterPrintHandler);

    void addBeforePrintHandler(BeforePrintHandler beforePrintHandler);

    void addClickHandler(ClickHandler clickHandler);

    void addDrilldownHandler(DrilldownHandler drilldownHandler);

    void addDrillupHandler(DrillupHandler drillupHandler);

    void addLoadHandler(LoadHandler loadHandler);

    void addRedrawHandler(RedrawHandler redrawHandler);

    void addSelectionHandler(SelectionHandler selectionHandler);

    /**
     * An explicit height for the chart. By default the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.
     * 
     */
    double height();

    /**
     * An explicit height for the chart. By default the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.
     * 
     */
    Chart height(double height);

    /**
     * If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and showing a series will not affect the axes or the other series. For stacks, once one series within the stack is hidden, the rest of the stack will close in around it even if the axis is not affected.
     * 
     */
    boolean ignoreHiddenSeries();

    /**
     * If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and showing a series will not affect the axes or the other series. For stacks, once one series within the stack is hidden, the rest of the stack will close in around it even if the axis is not affected.
     * 
     */
    Chart ignoreHiddenSeries(boolean ignoreHiddenSeries);

    /**
     * Whether to invert the axes so that the x axis is vertical and y axis is horizontal. When true, the x axis is reversed by default. If a bar series is present in the chart, it will be inverted automatically.
     * 
     */
    boolean inverted();

    /**
     * Whether to invert the axes so that the x axis is vertical and y axis is horizontal. When true, the x axis is reversed by default. If a bar series is present in the chart, it will be inverted automatically.
     * 
     */
    Chart inverted(boolean inverted);

    /**
     * <p>The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options <code>marginTop</code>, <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p> <p>Since version 2.1, the margin is 0 by default. The actual space is dynamically calculated  from the offset of axis labels, axis title, title, subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
     * 		 Defaults to <code>[null]</code>.
     * 
     */
    ArrayNumber margin();

    /**
     * <p>The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options <code>marginTop</code>, <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p> <p>Since version 2.1, the margin is 0 by default. The actual space is dynamically calculated  from the offset of axis labels, axis title, title, subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
     * 		 Defaults to <code>[null]</code>.
     * 
     */
    Chart margin(ArrayNumber margin);

    /**
     * The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingBottom</code>.
     * 
     */
    double marginBottom();

    /**
     * The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingBottom</code>.
     * 
     */
    Chart marginBottom(double marginBottom);

    /**
     * The margin between the left outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingLeft</code>.
     * 
     */
    double marginLeft();

    /**
     * The margin between the left outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingLeft</code>.
     * 
     */
    Chart marginLeft(double marginLeft);

    /**
     * The margin between the right outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingRight</code>.
     * 
     */
    double marginRight();

    /**
     * The margin between the right outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingRight</code>.
     * 
     */
    Chart marginRight(double marginRight);

    /**
     * The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingTop</code>.
     * 
     */
    double marginTop();

    /**
     * The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingTop</code>.
     * 
     */
    Chart marginTop(double marginTop);

    /**
     * Options to render charts in 3 dimensions. This feature requires <code>highcharts-3d.js</code>, found in the download package or online at <a href="http://code.highcharts.com/highcharts-3d.js">code.highcharts.com/highcharts-3d.js</a>.
     * 
     */
    Options3d options3d();

    /**
     * Options to render charts in 3 dimensions. This feature requires <code>highcharts-3d.js</code>, found in the download package or online at <a href="http://code.highcharts.com/highcharts-3d.js">code.highcharts.com/highcharts-3d.js</a>.
     * 
     */
    Chart options3d(Options3d options3d);

    /**
     * Allows setting a key to switch between zooming and panning.
     * 
     */
    String panKey();

    /**
     * Allows setting a key to switch between zooming and panning.
     * 
     */
    Chart panKey(String panKey);

    /**
     * Allow panning in a chart. Best used with <a href="#chart.panKey">panKey</a> to combine zooming and panning.
     * 
     */
    boolean panning();

    /**
     * Allow panning in a chart. Best used with <a href="#chart.panKey">panKey</a> to combine zooming and panning.
     * 
     */
    Chart panning(boolean panning);

    /**
     * Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch gestures only. By default, the <code>pinchType</code> is the same as the <code>zoomType</code> setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse drag pans the chart, while pinching is enabled.
     * 
     */
    String pinchType();

    /**
     * Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch gestures only. By default, the <code>pinchType</code> is the same as the <code>zoomType</code> setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse drag pans the chart, while pinching is enabled.
     * 
     */
    Chart pinchType(String pinchType);

    /**
     * The background color or gradient for the plot area.
     * 
     */
    String plotBackgroundColor();

    /**
     * The background color or gradient for the plot area.
     * 
     */
    Chart plotBackgroundColor(String plotBackgroundColor);

    /**
     * The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.
     * 
     */
    String plotBackgroundImage();

    /**
     * The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.
     * 
     */
    Chart plotBackgroundImage(String plotBackgroundImage);

    /**
     * The color of the inner chart or plot area border.
     * 
     */
    String plotBorderColor();

    /**
     * The color of the inner chart or plot area border.
     * 
     */
    Chart plotBorderColor(String plotBorderColor);

    /**
     * The pixel width of the plot area border.
     * 
     */
    double plotBorderWidth();

    /**
     * The pixel width of the plot area border.
     * 
     */
    Chart plotBorderWidth(double plotBorderWidth);

    /**
     * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean plotShadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Chart plotShadowAsBoolean(boolean plotShadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String plotShadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Chart plotShadowAsJsonString(String plotShadowAsJsonString);

    /**
     * When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system. Requires <code>highcharts-more.js</code>.
     * 
     */
    boolean polar();

    /**
     * When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system. Requires <code>highcharts-more.js</code>.
     * 
     */
    Chart polar(boolean polar);

    /**
     * Whether to reflow the chart to fit the width of the container div on resizing the window.
     * 
     */
    boolean reflow();

    /**
     * Whether to reflow the chart to fit the width of the container div on resizing the window.
     * 
     */
    Chart reflow(boolean reflow);

    /**
     * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference.
     * 
     */
    String renderToAsString();

    /**
     * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference.
     * 
     */
    Chart renderToAsString(String renderToAsString);

    /**
     * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference.
     * 
     */
    String renderToAsJsonString();

    /**
     * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference.
     * 
     */
    Chart renderToAsJsonString(String renderToAsJsonString);

    /**
     * The button that appears after a selection zoom, allowing the user to reset zoom.
     * 
     */
    ResetZoomButton resetZoomButton();

    /**
     * The button that appears after a selection zoom, allowing the user to reset zoom.
     * 
     */
    Chart resetZoomButton(ResetZoomButton resetZoomButton);

    /**
     * The background color of the marker square when selecting (zooming in on) an area of the chart.
     * 
     */
    String selectionMarkerFill();

    /**
     * The background color of the marker square when selecting (zooming in on) an area of the chart.
     * 
     */
    Chart selectionMarkerFill(String selectionMarkerFill);

    /**
     * Whether to apply a drop shadow to the outer chart area. Requires that  backgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the outer chart area. Requires that  backgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Chart shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the outer chart area. Requires that  backgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the outer chart area. Requires that  backgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Chart shadowAsJsonString(String shadowAsJsonString);

    /**
     * Whether to show the axes initially. This only applies to empty charts where series are added dynamically, as axes are automatically added to cartesian series.
     * 
     */
    boolean showAxes();

    /**
     * Whether to show the axes initially. This only applies to empty charts where series are added dynamically, as axes are automatically added to cartesian series.
     * 
     */
    Chart showAxes(boolean showAxes);

    /**
     * The distance between the outer edge of the chart and the content, like title, legend, axis title or labels. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
     * 
     */
    ArrayNumber spacing();

    /**
     * The distance between the outer edge of the chart and the content, like title, legend, axis title or labels. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
     * 
     */
    Chart spacing(ArrayNumber spacing);

    /**
     * <p>The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle or  legend in top position).</p>
     * 
     */
    double spacingBottom();

    /**
     * <p>The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle or  legend in top position).</p>
     * 
     */
    Chart spacingBottom(double spacingBottom);

    /**
     * <p>The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle or  legend in top position).</p>
     * 
     */
    double spacingLeft();

    /**
     * <p>The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle or  legend in top position).</p>
     * 
     */
    Chart spacingLeft(double spacingLeft);

    /**
     * <p>The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle or  legend in top position).</p>
     * 
     */
    double spacingRight();

    /**
     * <p>The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle or  legend in top position).</p>
     * 
     */
    Chart spacingRight(double spacingRight);

    /**
     * <p>The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
     *  legend in top position).</p>
     * 
     */
    double spacingTop();

    /**
     * <p>The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
     *  legend in top position).</p>
     * 
     */
    Chart spacingTop(double spacingTop);

    /**
     * Additional CSS styles to apply inline to the container <code>div</code>. Note that since the default font styles are applied in the renderer, it is ignorant of the individual chart  options and must be set globally. Defaults to:
     * <pre>style: {
     * 	fontFamily: '"Lucida Grande", "Lucida Sans Unicode", Verdana, Arial, Helvetica, sans-serif', // default font
     * 	fontSize: '12px'
     * }</pre>
     * 
     */
    String style();

    /**
     * Additional CSS styles to apply inline to the container <code>div</code>. Note that since the default font styles are applied in the renderer, it is ignorant of the individual chart  options and must be set globally. Defaults to:
     * <pre>style: {
     * 	fontFamily: '"Lucida Grande", "Lucida Sans Unicode", Verdana, Arial, Helvetica, sans-serif', // default font
     * 	fontSize: '12px'
     * }</pre>
     * 
     */
    Chart style(String styleAsJsonString);

    /**
     * The default series type for the chart. Can be any of the chart types listed under <a href="#plotOptions">plotOptions</a>.
     * 
     */
    String type();

    /**
     * The default series type for the chart. Can be any of the chart types listed under <a href="#plotOptions">plotOptions</a>.
     * 
     */
    Chart type(String type);

    /**
     * An explicit width for the chart. By default the width is calculated from the offset width of the containing element.
     * 
     */
    double width();

    /**
     * An explicit width for the chart. By default the width is calculated from the offset width of the containing element.
     * 
     */
    Chart width(double width);

    /**
     * Decides in what dimensions the user can zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
     * 
     */
    String zoomType();

    /**
     * Decides in what dimensions the user can zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
     * 
     */
    Chart zoomType(String zoomType);

    String getFieldAsJsonObject(String fieldName);

    Chart setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Chart setFunctionAsString(String fieldName, String functionAsString);

}
