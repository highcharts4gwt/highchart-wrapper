
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Level;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Tooltip;


/**
 * The size of the point shape is determined by its value relative to its siblings values.
 * Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
 * 
 */
public interface Treemap {


    /**
     * When enabled the user can click on a point which is a parent and zoom in on its children.
     * 
     */
    boolean allowDrillToNode();

    /**
     * When enabled the user can click on a point which is a parent and zoom in on its children.
     * 
     */
    Treemap allowDrillToNode(boolean allowDrillToNode);

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    Treemap allowPointSelect(boolean allowPointSelect);

    /**
     * Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal.
     * The next levels starting direction will always be the opposite of the previous.
     * 
     */
    boolean alternateStartingDirection();

    /**
     * Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal.
     * The next levels starting direction will always be the opposite of the previous.
     * 
     */
    Treemap alternateStartingDirection(boolean alternateStartingDirection);

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
    Treemap animation(boolean animation);

    /**
     * The color of the border surrounding each tree map item.
     * 
     */
    String borderColor();

    /**
     * The color of the border surrounding each tree map item.
     * 
     */
    Treemap borderColor(String borderColor);

    /**
     * The width of the border surrounding each column or bar.
     * 
     */
    double borderWidth();

    /**
     * The width of the border surrounding each column or bar.
     * 
     */
    Treemap borderWidth(double borderWidth);

    /**
     * The main color of the series. In heat maps this color is rarely used, as we mostly use the color to denote the value of each point. Unless options are set in the <a href="#colorAxis">colorAxis</a>, the default value is pulled from the <a href="#colors">options.colors</a> array.
     * 
     */
    String color();

    /**
     * The main color of the series. In heat maps this color is rarely used, as we mostly use the color to denote the value of each point. Unless options are set in the <a href="#colorAxis">colorAxis</a>, the default value is pulled from the <a href="#colors">options.colors</a> array.
     * 
     */
    Treemap color(String color);

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    boolean colorByPoint();

    /**
     * When using automatic point colors pulled from the <code>options.colors</code> collection, this option determines whether the chart should receive  one color per series or one color per point.
     * 
     */
    Treemap colorByPoint(boolean colorByPoint);

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
     * 
     */
    Treemap colors(ArrayString colors);

    /**
     * When the series contains less points than the crop threshold, all points are drawn, event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.
     * 
     */
    double cropThreshold();

    /**
     * When the series contains less points than the crop threshold, all points are drawn, event if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.
     * 
     */
    Treemap cropThreshold(double cropThreshold);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    Treemap cursor(String cursor);

    /**
     * 
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     * 
     */
    Treemap dataLabels(DataLabels dataLabels);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    Treemap enableMouseTracking(boolean enableMouseTracking);

    void addAfterAnimateHandler(AfterAnimateHandler afterAnimateHandler);

    void addCheckboxClickHandler(CheckboxClickHandler checkboxClickHandler);

    void addClickHandler(ClickHandler clickHandler);

    void addHideHandler(HideHandler hideHandler);

    void addLegendItemClickHandler(LegendItemClickHandler legendItemClickHandler);

    void addMouseOutHandler(MouseOutHandler mouseOutHandler);

    void addMouseOverHandler(MouseOverHandler mouseOverHandler);

    void addShowHandler(ShowHandler showHandler);

    /**
     * This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is undefined, it will be true by default. However when allowDrillToNode is true, then it will be false by default.
     * 
     */
    boolean interactByLeaf();

    /**
     * This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is undefined, it will be true by default. However when allowDrillToNode is true, then it will be false by default.
     * 
     */
    Treemap interactByLeaf(boolean interactByLeaf);

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    ArrayString keys();

    /**
     * A custom mapping of data point array positions to respective object properties. For example, is the first key is <code>name</code>, the first item in a series.data array is interpreted as point.name.
     * 
     */
    Treemap keys(ArrayString keys);

    /**
     * This option decides which algorithm is used for setting position and dimensions of the points. Can be one of <code>sliceAndDice</code>, <code>stripes</code>, <code>squarified</code> or <code>strip</code>.
     * 
     */
    String layoutAlgorithm();

    /**
     * This option decides which algorithm is used for setting position and dimensions of the points. Can be one of <code>sliceAndDice</code>, <code>stripes</code>, <code>squarified</code> or <code>strip</code>.
     * 
     */
    Treemap layoutAlgorithm(String layoutAlgorithm);

    /**
     * Defines which direction the layout algorithm will start drawing. Possible values are "vertical" and "horizontal".
     * 
     */
    String layoutStartingDirection();

    /**
     * Defines which direction the layout algorithm will start drawing. Possible values are "vertical" and "horizontal".
     * 
     */
    Treemap layoutStartingDirection(String layoutStartingDirection);

    /**
     * Used together with the levels and allowDrillToNode options. When set to false the first level visible when drilling is considered to be level one. Otherwise the level will be the same as the tree structure.
     * 
     */
    boolean levelIsConstant();

    /**
     * Used together with the levels and allowDrillToNode options. When set to false the first level visible when drilling is considered to be level one. Otherwise the level will be the same as the tree structure.
     * 
     */
    Treemap levelIsConstant(boolean levelIsConstant);

    /**
     * Set options on specific levels. Takes precedence over series options, but not point options.
     * 
     */
    Array<Level> levels();

    /**
     * Set options on specific levels. Takes precedence over series options, but not point options.
     * 
     */
    Treemap levels(Array<Level> levels);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    Treemap linkedTo(String linkedTo);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    Treemap point(Point point);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    Treemap selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Treemap shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Treemap shadowAsJsonString(String shadowAsJsonString);

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    boolean showCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
     * 
     */
    Treemap showCheckbox(boolean showCheckbox);

    /**
     * Whether to display this series type or specific series item in the legend.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this series type or specific series item in the legend.
     * 
     */
    Treemap showInLegend(boolean showInLegend);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    Treemap states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
     * 
     */
    Treemap stickyTracking(boolean stickyTracking);

    /**
     * 
     * 
     */
    Tooltip tooltip();

    /**
     * 
     * 
     */
    Treemap tooltip(Tooltip tooltip);

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    double turboThreshold();

    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to <code>0</code> disable.
     * 
     */
    Treemap turboThreshold(double turboThreshold);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    Treemap visible(boolean visible);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    Treemap zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    Treemap zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Treemap setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Treemap setFunctionAsString(String fieldName, String functionAsString);

}
