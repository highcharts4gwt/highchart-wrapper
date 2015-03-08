
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Tooltip;


/**
 * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
 * 
 */
public interface Funnel {


    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    boolean allowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * 
     */
    Funnel allowPointSelect(boolean allowPointSelect);

    /**
     * The color of the border surrounding each slice.
     * 
     */
    String borderColor();

    /**
     * The color of the border surrounding each slice.
     * 
     */
    Funnel borderColor(String borderColor);

    /**
     * The width of the border surrounding each slice.
     * 
     */
    double borderWidth();

    /**
     * The width of the border surrounding each slice.
     * 
     */
    Funnel borderWidth(double borderWidth);

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    ArrayString centerAsArrayString();

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    Funnel centerAsArrayString(ArrayString centerAsArrayString);

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    ArrayNumber centerAsArrayNumber();

    /**
     * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area height.
     * 
     */
    Funnel centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    ArrayString colors();

    /**
     * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
     * 
     */
    Funnel colors(ArrayString colors);

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    String cursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
     * 
     */
    Funnel cursor(String cursor);

    /**
     * 
     */
    DataLabels dataLabels();

    /**
     * 
     */
    Funnel dataLabels(DataLabels dataLabels);

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    double depth();

    /**
     * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
     * 
     */
    Funnel depth(double depth);

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    boolean enableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
     * 
     */
    Funnel enableMouseTracking(boolean enableMouseTracking);

    void addFunnelAfterAnimateHandler(FunnelAfterAnimateHandler funnelAfterAnimateHandler);

    void addFunnelCheckboxClickHandler(FunnelCheckboxClickHandler funnelCheckboxClickHandler);

    void addFunnelClickHandler(FunnelClickHandler funnelClickHandler);

    void addFunnelHideHandler(FunnelHideHandler funnelHideHandler);

    void addFunnelLegendItemClickHandler(FunnelLegendItemClickHandler funnelLegendItemClickHandler);

    void addFunnelMouseOutHandler(FunnelMouseOutHandler funnelMouseOutHandler);

    void addFunnelMouseOverHandler(FunnelMouseOverHandler funnelMouseOverHandler);

    void addFunnelShowHandler(FunnelShowHandler funnelShowHandler);

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    double heightAsNumber();

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    Funnel heightAsNumber(double heightAsNumber);

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    String heightAsString();

    /**
     * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height.
     * 
     */
    Funnel heightAsString(String heightAsString);

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    String linkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
     * 
     */
    Funnel linkedTo(String linkedTo);

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    double minSize();

    /**
     * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
     * 
     */
    Funnel minSize(double minSize);

    /**
     * The height of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area height.
     * 
     */
    double neckHeightAsNumber();

    /**
     * The height of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area height.
     * 
     */
    Funnel neckHeightAsNumber(double neckHeightAsNumber);

    /**
     * The height of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area height.
     * 
     */
    String neckHeightAsString();

    /**
     * The height of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area height.
     * 
     */
    Funnel neckHeightAsString(String neckHeightAsString);

    /**
     * The width of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area width.
     * 
     */
    double neckWidthAsNumber();

    /**
     * The width of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area width.
     * 
     */
    Funnel neckWidthAsNumber(double neckWidthAsNumber);

    /**
     * The width of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area width.
     * 
     */
    String neckWidthAsString();

    /**
     * The width of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a percentage of the plot area width.
     * 
     */
    Funnel neckWidthAsString(String neckWidthAsString);

    /**
     * Properties for each single point
     * 
     */
    Point point();

    /**
     * Properties for each single point
     * 
     */
    Funnel point(Point point);

    /**
     * A reversed funnel has the widest area down. A reversed funnel with no neck width and neck height is a pyramid.
     * 
     */
    boolean reversed();

    /**
     * A reversed funnel has the widest area down. A reversed funnel with no neck width and neck height is a pyramid.
     * 
     */
    Funnel reversed(boolean reversed);

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    boolean selected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
     * 
     */
    Funnel selected(boolean selected);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Funnel shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Funnel shadowAsJsonString(String shadowAsJsonString);

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    boolean showInLegend();

    /**
     * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
     * 
     */
    Funnel showInLegend(boolean showInLegend);

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    double slicedOffset();

    /**
     * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
     * 
     */
    Funnel slicedOffset(double slicedOffset);

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    States states();

    /**
     * A wrapper object for all the series options in specific states.
     * 
     */
    Funnel states(States states);

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    boolean stickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the <code>mouseOut</code> event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the  tooltip will be hidden when moving the mouse between series.
     * 
     */
    Funnel stickyTracking(boolean stickyTracking);

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Tooltip tooltip();

    /**
     * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
     * 
     */
    Funnel tooltip(Tooltip tooltip);

    /**
     * Set the initial visibility of the series.
     * 
     */
    boolean visible();

    /**
     * Set the initial visibility of the series.
     * 
     */
    Funnel visible(boolean visible);

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    double widthAsNumber();

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    Funnel widthAsNumber(double widthAsNumber);

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    String widthAsString();

    /**
     * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
     * 
     */
    Funnel widthAsString(String widthAsString);

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    String zoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * 
     */
    Funnel zoneAxis(String zoneAxis);

    /**
     * An array defining zones within a series.
     * 
     */
    ArrayNumber zones();

    /**
     * An array defining zones within a series.
     * 
     */
    Funnel zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Funnel setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
