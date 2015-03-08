
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.Tooltip;


/**
 * A pyramid chart consists of a single pyramid with item heights corresponding to each point value. Technically it is the same as a reversed funnel chart without a neck.
 * 
 */
public interface Pyramid {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    Pyramid allowPointSelect(boolean allowPointSelect);

    /**
     * The color of the border surrounding each slice.
     * 
     */
    String borderColor();

    /**
     * The color of the border surrounding each slice.
     * 
     */
    Pyramid borderColor(String borderColor);

    /**
     * The width of the border surrounding each slice.
     * 
     */
    double borderWidth();

    /**
     * The width of the border surrounding each slice.
     * 
     */
    Pyramid borderWidth(double borderWidth);

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    ArrayString centerAsArrayString();

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    Pyramid centerAsArrayString(ArrayString centerAsArrayString);

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    ArrayNumber centerAsArrayNumber();

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    Pyramid centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    Pyramid colors(ArrayString colors);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    Pyramid cursor(String cursor);

    /**
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     */
    Pyramid dataLabels(DataLabels dataLabels);

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    double depth();

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    Pyramid depth(double depth);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    Pyramid enableMouseTracking(boolean enableMouseTracking);

    void addPyramidAfterAnimateHandler(PyramidAfterAnimateHandler pyramidAfterAnimateHandler);

    void addPyramidCheckboxClickHandler(PyramidCheckboxClickHandler pyramidCheckboxClickHandler);

    void addPyramidClickHandler(PyramidClickHandler pyramidClickHandler);

    void addPyramidHideHandler(PyramidHideHandler pyramidHideHandler);

    void addPyramidLegendItemClickHandler(PyramidLegendItemClickHandler pyramidLegendItemClickHandler);

    void addPyramidMouseOutHandler(PyramidMouseOutHandler pyramidMouseOutHandler);

    void addPyramidMouseOverHandler(PyramidMouseOverHandler pyramidMouseOverHandler);

    void addPyramidShowHandler(PyramidShowHandler pyramidShowHandler);

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    double heightAsNumber();

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    Pyramid heightAsNumber(double heightAsNumber);

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    String heightAsString();

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    Pyramid heightAsString(String heightAsString);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    Pyramid linkedTo(String linkedTo);

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    double minSize();

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    Pyramid minSize(double minSize);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    Pyramid point(Point point);

    /**
     * The pyramid is reversed by default, as opposed to the funnel, which shares the layout engine, and is not reversed.
     * 
     */
    boolean reversed();

    /**
     * The pyramid is reversed by default, as opposed to the funnel, which shares the layout engine, and is not reversed.
     * 
     */
    Pyramid reversed(boolean reversed);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    Pyramid selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Pyramid shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Pyramid shadowAsJsonString(String shadowAsJsonString);

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    Pyramid showInLegend(boolean showInLegend);

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    double slicedOffset();

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    Pyramid slicedOffset(double slicedOffset);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    Pyramid states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    Pyramid stickyTracking(boolean stickyTracking);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Pyramid tooltip(Tooltip tooltip);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    Pyramid visible(boolean visible);

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    double widthAsNumber();

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    Pyramid widthAsNumber(double widthAsNumber);

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    String widthAsString();

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    Pyramid widthAsString(String widthAsString);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    Pyramid zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    Pyramid zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Pyramid setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
