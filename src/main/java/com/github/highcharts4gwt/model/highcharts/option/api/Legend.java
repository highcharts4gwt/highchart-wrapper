
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.legend.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.legend.Title;


/**
 * The legend is a box containing a symbol and name for each series item
 * 	or point item in the chart.
 * 
 */
public interface Legend {


    /**
     * The horizontal alignment of the legend box within the chart area. Valid values are <code>"left"</code>, <code>"center"</code> and <code>"right"</code>.
     * 
     */
    String align();

    /**
     * The horizontal alignment of the legend box within the chart area. Valid values are <code>"left"</code>, <code>"center"</code> and <code>"right"</code>.
     * 
     */
    Legend align(String align);

    /**
     * The background color of the legend.
     * 
     */
    String backgroundColor();

    /**
     * The background color of the legend.
     * 
     */
    Legend backgroundColor(String backgroundColor);

    /**
     * The color of the drawn border around the legend.
     * 
     */
    String borderColor();

    /**
     * The color of the drawn border around the legend.
     * 
     */
    Legend borderColor(String borderColor);

    /**
     * The border corner radius of the legend.
     * 
     */
    double borderRadius();

    /**
     * The border corner radius of the legend.
     * 
     */
    Legend borderRadius(double borderRadius);

    /**
     * The width of the drawn border around the legend.
     * 
     */
    double borderWidth();

    /**
     * The width of the drawn border around the legend.
     * 
     */
    Legend borderWidth(double borderWidth);

    /**
     * Enable or disable the legend.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable the legend.
     * 
     */
    Legend enabled(boolean enabled);

    /**
     * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
     * 
     */
    boolean floating();

    /**
     * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
     * 
     */
    Legend floating(boolean floating);

    /**
     * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item.
     * 
     */
    double itemDistance();

    /**
     * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item.
     * 
     */
    Legend itemDistance(double itemDistance);

    /**
     * CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
     * <pre>itemHiddenStyle: {
     * 	color: '#CCC'
     * }</pre>
     * 
     */
    String itemHiddenStyle();

    /**
     * CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
     * <pre>itemHiddenStyle: {
     * 	color: '#CCC'
     * }</pre>
     * 
     */
    Legend itemHiddenStyle(String itemHiddenStyleAsJsonString);

    /**
     * CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
     * <pre>itemHoverStyle: {
     * 	color: '#000'
     * }</pre>
     * 
     */
    String itemHoverStyle();

    /**
     * CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
     * <pre>itemHoverStyle: {
     * 	color: '#000'
     * }</pre>
     * 
     */
    Legend itemHoverStyle(String itemHoverStyleAsJsonString);

    /**
     * The pixel bottom margin for each legend item.
     * 
     */
    double itemMarginBottom();

    /**
     * The pixel bottom margin for each legend item.
     * 
     */
    Legend itemMarginBottom(double itemMarginBottom);

    /**
     * The pixel top margin for each legend item.
     * 
     */
    double itemMarginTop();

    /**
     * The pixel top margin for each legend item.
     * 
     */
    Legend itemMarginTop(double itemMarginTop);

    /**
     * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
     * 
     */
    String itemStyle();

    /**
     * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
     * 
     */
    Legend itemStyle(String itemStyleAsJsonString);

    /**
     * The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
     * 
     */
    double itemWidth();

    /**
     * The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
     * 
     */
    Legend itemWidth(double itemWidth);

    /**
     * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
     * 
     */
    String labelFormat();

    /**
     * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
     * 
     */
    Legend labelFormat(String labelFormat);

    /**
     * The layout of the legend items. Can be one of "horizontal" or "vertical".
     * 
     */
    String layout();

    /**
     * The layout of the legend items. Can be one of "horizontal" or "vertical".
     * 
     */
    Legend layout(String layout);

    /**
     * Line height for the legend items. Deprecated as of 2.1. Instead, the line height for each  item can be set using itemStyle.lineHeight, and the padding between items using itemMarginTop and itemMarginBottom.
     * 
     */
    double lineHeight();

    /**
     * Line height for the legend items. Deprecated as of 2.1. Instead, the line height for each  item can be set using itemStyle.lineHeight, and the padding between items using itemMarginTop and itemMarginBottom.
     * 
     */
    Legend lineHeight(double lineHeight);

    /**
     * If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
     * 
     */
    double margin();

    /**
     * If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
     * 
     */
    Legend margin(double margin);

    /**
     * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
     * 
     */
    double maxHeight();

    /**
     * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
     * 
     */
    Legend maxHeight(double maxHeight);

    /**
     * Options for the paging or navigation appearing when the legend is overflown. When <a href="#legend.useHTML">legend.useHTML</a> is enabled, navigation is disabled.
     * 
     */
    Navigation navigation();

    /**
     * Options for the paging or navigation appearing when the legend is overflown. When <a href="#legend.useHTML">legend.useHTML</a> is enabled, navigation is disabled.
     * 
     */
    Legend navigation(Navigation navigation);

    /**
     * The inner padding of the legend box.
     * 
     */
    double padding();

    /**
     * The inner padding of the legend box.
     * 
     */
    Legend padding(double padding);

    /**
     * Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
     * 
     */
    boolean reversed();

    /**
     * Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
     * 
     */
    Legend reversed(boolean reversed);

    /**
     * Whether to show the symbol on the right side of the text rather than the left side.  This is common in Arabic and Hebraic.
     * 
     */
    boolean rtl();

    /**
     * Whether to show the symbol on the right side of the text rather than the left side.  This is common in Arabic and Hebraic.
     * 
     */
    Legend rtl(boolean rtl);

    /**
     * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code> also needs to be applied for this to take effect. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code> also needs to be applied for this to take effect. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Legend shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code> also needs to be applied for this to take effect. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code> also needs to be applied for this to take effect. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    Legend shadowAsJsonString(String shadowAsJsonString);

    /**
     * CSS styles for the legend area. In the 1.x versions the position of the legend area was determined by CSS. In 2.x, the position is determined by properties like  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
     * 
     */
    String style();

    /**
     * CSS styles for the legend area. In the 1.x versions the position of the legend area was determined by CSS. In 2.x, the position is determined by properties like  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
     * 
     */
    Legend style(String styleAsJsonString);

    /**
     * The pixel height of the symbol for series types that use a rectangle in the legend.
     * 
     */
    double symbolHeight();

    /**
     * The pixel height of the symbol for series types that use a rectangle in the legend.
     * 
     */
    Legend symbolHeight(double symbolHeight);

    /**
     * The pixel padding between the legend item symbol and the legend item text.
     * 
     */
    double symbolPadding();

    /**
     * The pixel padding between the legend item symbol and the legend item text.
     * 
     */
    Legend symbolPadding(double symbolPadding);

    /**
     * The border radius of the symbol for series types that use a rectangle in the legend.
     * 
     */
    double symbolRadius();

    /**
     * The border radius of the symbol for series types that use a rectangle in the legend.
     * 
     */
    Legend symbolRadius(double symbolRadius);

    /**
     * The pixel width of the legend item symbol.
     * 
     */
    double symbolWidth();

    /**
     * The pixel width of the legend item symbol.
     * 
     */
    Legend symbolWidth(double symbolWidth);

    /**
     * A title to be added on top of the legend.
     * 
     */
    Title title();

    /**
     * A title to be added on top of the legend.
     * 
     */
    Legend title(Title title);

    /**
     * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. When using HTML, <a href="#legend.navigation">legend.navigation</a> is disabled.</p>
     * 
     */
    boolean useHTML();

    /**
     * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. When using HTML, <a href="#legend.navigation">legend.navigation</a> is disabled.</p>
     * 
     */
    Legend useHTML(boolean useHTML);

    /**
     * The vertical alignment of the legend box. Can be one of "top", "middle" or  "bottom". Vertical position can be further determined by the <code>y</code> option.
     * 
     */
    String verticalAlign();

    /**
     * The vertical alignment of the legend box. Can be one of "top", "middle" or  "bottom". Vertical position can be further determined by the <code>y</code> option.
     * 
     */
    Legend verticalAlign(String verticalAlign);

    /**
     * The width of the legend box.
     * 
     */
    double width();

    /**
     * The width of the legend box.
     * 
     */
    Legend width(double width);

    /**
     * The x offset of the legend relative to its horizontal alignment <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right.
     * 
     */
    double x();

    /**
     * The x offset of the legend relative to its horizontal alignment <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right.
     * 
     */
    Legend x(double x);

    /**
     * The vertical offset of the legend relative to it's vertical alignment <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
     * 
     */
    double y();

    /**
     * The vertical offset of the legend relative to it's vertical alignment <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
     * 
     */
    Legend y(double y);

    String getFieldAsJsonObject(String fieldName);

    Legend setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Legend setFunctionAsString(String fieldName, String functionAsString);

}
