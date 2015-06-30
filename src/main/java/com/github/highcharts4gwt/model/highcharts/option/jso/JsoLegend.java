
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.LabelFormatterCallback;
import com.github.highcharts4gwt.model.highcharts.option.api.Legend;
import com.github.highcharts4gwt.model.highcharts.option.api.legend.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.legend.Title;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * The legend is a box containing a symbol and name for each series item
 * 	or point item in the chart.
 * 
 */
public class JsoLegend
    extends JavaScriptObject
    implements Legend
{


    protected JsoLegend() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "center");
    }-*/
    ;

    public final native JsoLegend align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native String backgroundColor()
        throws RuntimeException /*-{
        return this["backgroundColor"] = (this["backgroundColor"] || "null");
    }-*/
    ;

    public final native JsoLegend backgroundColor(String backgroundColor)
        throws RuntimeException /*-{
        this["backgroundColor"] = backgroundColor;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "#909090");
    }-*/
    ;

    public final native JsoLegend borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderRadius()
        throws RuntimeException /*-{
        return this["borderRadius"] = (this["borderRadius"] || 0.0);
    }-*/
    ;

    public final native JsoLegend borderRadius(double borderRadius)
        throws RuntimeException /*-{
        this["borderRadius"] = borderRadius;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 0.0);
    }-*/
    ;

    public final native JsoLegend borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoLegend enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native boolean floating()
        throws RuntimeException /*-{
        return this["floating"] = (this["floating"] || false);
    }-*/
    ;

    public final native JsoLegend floating(boolean floating)
        throws RuntimeException /*-{
        this["floating"] = floating;
        return this;
    }-*/
    ;

    public final native double itemDistance()
        throws RuntimeException /*-{
        return this["itemDistance"] = (this["itemDistance"] || 20.0);
    }-*/
    ;

    public final native JsoLegend itemDistance(double itemDistance)
        throws RuntimeException /*-{
        this["itemDistance"] = itemDistance;
        return this;
    }-*/
    ;

    public final native String itemHiddenStyle()
        throws RuntimeException /*-{
        this["itemHiddenStyle"] = (this["itemHiddenStyle"] || {});
        return JSON.stringify(this["itemHiddenStyle"]);
    }-*/
    ;

    public final native JsoLegend itemHiddenStyle(String itemHiddenStyleAsJsonString)
        throws RuntimeException /*-{
        this["itemHiddenStyle"] = JSON.parse(itemHiddenStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native String itemHoverStyle()
        throws RuntimeException /*-{
        this["itemHoverStyle"] = (this["itemHoverStyle"] || {});
        return JSON.stringify(this["itemHoverStyle"]);
    }-*/
    ;

    public final native JsoLegend itemHoverStyle(String itemHoverStyleAsJsonString)
        throws RuntimeException /*-{
        this["itemHoverStyle"] = JSON.parse(itemHoverStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native double itemMarginBottom()
        throws RuntimeException /*-{
        return this["itemMarginBottom"] = (this["itemMarginBottom"] || 0.0);
    }-*/
    ;

    public final native JsoLegend itemMarginBottom(double itemMarginBottom)
        throws RuntimeException /*-{
        this["itemMarginBottom"] = itemMarginBottom;
        return this;
    }-*/
    ;

    public final native double itemMarginTop()
        throws RuntimeException /*-{
        return this["itemMarginTop"] = (this["itemMarginTop"] || 0.0);
    }-*/
    ;

    public final native JsoLegend itemMarginTop(double itemMarginTop)
        throws RuntimeException /*-{
        this["itemMarginTop"] = itemMarginTop;
        return this;
    }-*/
    ;

    public final native String itemStyle()
        throws RuntimeException /*-{
        this["itemStyle"] = (this["itemStyle"] || JSON.parse('{ "color": "#333333", "cursor": "pointer", "fontSize": "12px", "fontWeight": "bold" }'));
        return JSON.stringify(this["itemStyle"]);
    }-*/
    ;

    public final native JsoLegend itemStyle(String itemStyleAsJsonString)
        throws RuntimeException /*-{
        this["itemStyle"] = JSON.parse(itemStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native double itemWidth()
        throws RuntimeException /*-{
        return this["itemWidth"] = (this["itemWidth"] || null);
    }-*/
    ;

    public final native JsoLegend itemWidth(double itemWidth)
        throws RuntimeException /*-{
        this["itemWidth"] = itemWidth;
        return this;
    }-*/
    ;

    public final native String labelFormat()
        throws RuntimeException /*-{
        return this["labelFormat"] = (this["labelFormat"] || "{name}");
    }-*/
    ;

    public final native JsoLegend labelFormat(String labelFormat)
        throws RuntimeException /*-{
        this["labelFormat"] = labelFormat;
        return this;
    }-*/
    ;

    public final native JsoLegend labelFormatter(LabelFormatterCallback labelFormatter)
        throws RuntimeException 
            /*-{
            $wnd.jQuery.extend(true, this, 
            {
                labelFormatter: function() {
                    return labelFormatter.@com.github.highcharts4gwt.model.highcharts.option.api.LabelFormatterCallback::onCallback()(
                        
                     );
                 }
             });
    }-*/;
    ;

    public final native String layout()
        throws RuntimeException /*-{
        return this["layout"] = (this["layout"] || "horizontal");
    }-*/
    ;

    public final native JsoLegend layout(String layout)
        throws RuntimeException /*-{
        this["layout"] = layout;
        return this;
    }-*/
    ;

    public final native double lineHeight()
        throws RuntimeException /*-{
        return this["lineHeight"] = (this["lineHeight"] || 16.0);
    }-*/
    ;

    public final native JsoLegend lineHeight(double lineHeight)
        throws RuntimeException /*-{
        this["lineHeight"] = lineHeight;
        return this;
    }-*/
    ;

    public final native double margin()
        throws RuntimeException /*-{
        return this["margin"] = (this["margin"] || 12.0);
    }-*/
    ;

    public final native JsoLegend margin(double margin)
        throws RuntimeException /*-{
        this["margin"] = margin;
        return this;
    }-*/
    ;

    public final native double maxHeight()
        throws RuntimeException /*-{
        return this["maxHeight"] = (this["maxHeight"] || null);
    }-*/
    ;

    public final native JsoLegend maxHeight(double maxHeight)
        throws RuntimeException /*-{
        this["maxHeight"] = maxHeight;
        return this;
    }-*/
    ;

    public final native Navigation navigation()
        throws RuntimeException /*-{
        return this["navigation"] = (this["navigation"] || {});
    }-*/
    ;

    public final native JsoLegend navigation(Navigation navigation)
        throws RuntimeException /*-{
        this["navigation"] = navigation;
        return this;
    }-*/
    ;

    public final native double padding()
        throws RuntimeException /*-{
        return this["padding"] = (this["padding"] || 8.0);
    }-*/
    ;

    public final native JsoLegend padding(double padding)
        throws RuntimeException /*-{
        this["padding"] = padding;
        return this;
    }-*/
    ;

    public final native boolean reversed()
        throws RuntimeException /*-{
        return this["reversed"] = (this["reversed"] || false);
    }-*/
    ;

    public final native JsoLegend reversed(boolean reversed)
        throws RuntimeException /*-{
        this["reversed"] = reversed;
        return this;
    }-*/
    ;

    public final native boolean rtl()
        throws RuntimeException /*-{
        return this["rtl"] = (this["rtl"] || false);
    }-*/
    ;

    public final native JsoLegend rtl(boolean rtl)
        throws RuntimeException /*-{
        this["rtl"] = rtl;
        return this;
    }-*/
    ;

    public final native boolean shadowAsBoolean()
        throws RuntimeException /*-{
        return this["shadow"] = (this["shadow"] || false);
    }-*/
    ;

    public final native JsoLegend shadowAsBoolean(boolean shadowAsBoolean)
        throws RuntimeException /*-{
        this["shadow"] = shadowAsBoolean;
        return this;
    }-*/
    ;

    public final native String shadowAsJsonString()
        throws RuntimeException /*-{
        this["shadow"] = (this["shadow"] || JSON.parse('false'));
        return JSON.stringify(this["shadow"]);
    }-*/
    ;

    public final native JsoLegend shadowAsJsonString(String shadowAsJsonString)
        throws RuntimeException /*-{
        this["shadow"] = JSON.parse(shadowAsJsonString);
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoLegend style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native double symbolHeight()
        throws RuntimeException /*-{
        return this["symbolHeight"] = (this["symbolHeight"] || null);
    }-*/
    ;

    public final native JsoLegend symbolHeight(double symbolHeight)
        throws RuntimeException /*-{
        this["symbolHeight"] = symbolHeight;
        return this;
    }-*/
    ;

    public final native double symbolPadding()
        throws RuntimeException /*-{
        return this["symbolPadding"] = (this["symbolPadding"] || 5.0);
    }-*/
    ;

    public final native JsoLegend symbolPadding(double symbolPadding)
        throws RuntimeException /*-{
        this["symbolPadding"] = symbolPadding;
        return this;
    }-*/
    ;

    public final native double symbolRadius()
        throws RuntimeException /*-{
        return this["symbolRadius"] = (this["symbolRadius"] || 2.0);
    }-*/
    ;

    public final native JsoLegend symbolRadius(double symbolRadius)
        throws RuntimeException /*-{
        this["symbolRadius"] = symbolRadius;
        return this;
    }-*/
    ;

    public final native double symbolWidth()
        throws RuntimeException /*-{
        return this["symbolWidth"] = (this["symbolWidth"] || 16.0);
    }-*/
    ;

    public final native JsoLegend symbolWidth(double symbolWidth)
        throws RuntimeException /*-{
        this["symbolWidth"] = symbolWidth;
        return this;
    }-*/
    ;

    public final native Title title()
        throws RuntimeException /*-{
        return this["title"] = (this["title"] || {});
    }-*/
    ;

    public final native JsoLegend title(Title title)
        throws RuntimeException /*-{
        this["title"] = title;
        return this;
    }-*/
    ;

    public final native boolean useHTML()
        throws RuntimeException /*-{
        return this["useHTML"] = (this["useHTML"] || false);
    }-*/
    ;

    public final native JsoLegend useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native String verticalAlign()
        throws RuntimeException /*-{
        return this["verticalAlign"] = (this["verticalAlign"] || "bottom");
    }-*/
    ;

    public final native JsoLegend verticalAlign(String verticalAlign)
        throws RuntimeException /*-{
        this["verticalAlign"] = verticalAlign;
        return this;
    }-*/
    ;

    public final native double width()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || null);
    }-*/
    ;

    public final native JsoLegend width(double width)
        throws RuntimeException /*-{
        this["width"] = width;
        return this;
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || 0.0);
    }-*/
    ;

    public final native JsoLegend x(double x)
        throws RuntimeException /*-{
        this["x"] = x;
        return this;
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || 0.0);
    }-*/
    ;

    public final native JsoLegend y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoLegend setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoLegend setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
