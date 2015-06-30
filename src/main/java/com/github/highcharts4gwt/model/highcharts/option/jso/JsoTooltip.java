
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.FormatterCallback;
import com.github.highcharts4gwt.model.highcharts.option.api.PointFormatterCallback;
import com.github.highcharts4gwt.model.highcharts.option.api.PositionerCallback;
import com.github.highcharts4gwt.model.highcharts.option.api.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Options for the tooltip that appears when the user hovers over a series or point.
 * 
 */
public class JsoTooltip
    extends JavaScriptObject
    implements Tooltip
{


    protected JsoTooltip() {
    }

    public final native boolean animation()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoTooltip animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native String backgroundColor()
        throws RuntimeException /*-{
        return this["backgroundColor"] = (this["backgroundColor"] || "rgba(255, 255, 255, 0.85)");
    }-*/
    ;

    public final native JsoTooltip backgroundColor(String backgroundColor)
        throws RuntimeException /*-{
        this["backgroundColor"] = backgroundColor;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "null");
    }-*/
    ;

    public final native JsoTooltip borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderRadius()
        throws RuntimeException /*-{
        return this["borderRadius"] = (this["borderRadius"] || 3.0);
    }-*/
    ;

    public final native JsoTooltip borderRadius(double borderRadius)
        throws RuntimeException /*-{
        this["borderRadius"] = borderRadius;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 1.0);
    }-*/
    ;

    public final native JsoTooltip borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native String dateTimeLabelFormats()
        throws RuntimeException /*-{
        this["dateTimeLabelFormats"] = (this["dateTimeLabelFormats"] || JSON.parse(''));
        return JSON.stringify(this["dateTimeLabelFormats"]);
    }-*/
    ;

    public final native JsoTooltip dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString)
        throws RuntimeException /*-{
        this["dateTimeLabelFormats"] = JSON.parse(dateTimeLabelFormatsAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoTooltip enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native boolean followPointer()
        throws RuntimeException /*-{
        return this["followPointer"] = (this["followPointer"] || false);
    }-*/
    ;

    public final native JsoTooltip followPointer(boolean followPointer)
        throws RuntimeException /*-{
        this["followPointer"] = followPointer;
        return this;
    }-*/
    ;

    public final native boolean followTouchMove()
        throws RuntimeException /*-{
        return this["followTouchMove"] = (this["followTouchMove"] || true);
    }-*/
    ;

    public final native JsoTooltip followTouchMove(boolean followTouchMove)
        throws RuntimeException /*-{
        this["followTouchMove"] = followTouchMove;
        return this;
    }-*/
    ;

    public final native String footerFormat()
        throws RuntimeException /*-{
        return this["footerFormat"] = (this["footerFormat"] || "false");
    }-*/
    ;

    public final native JsoTooltip footerFormat(String footerFormat)
        throws RuntimeException /*-{
        this["footerFormat"] = footerFormat;
        return this;
    }-*/
    ;

    public final native JsoTooltip formatter(FormatterCallback formatter)
        throws RuntimeException 
            /*-{
            $wnd.jQuery.extend(true, this, 
            {
                formatter: function() {
                    return formatter.@com.github.highcharts4gwt.model.highcharts.option.api.FormatterCallback::onCallback()(
                        
                     );
                 }
             });
    }-*/;
    ;

    public final native String headerFormat()
        throws RuntimeException /*-{
        return this["headerFormat"] = (this["headerFormat"] || "");
    }-*/
    ;

    public final native JsoTooltip headerFormat(String headerFormat)
        throws RuntimeException /*-{
        this["headerFormat"] = headerFormat;
        return this;
    }-*/
    ;

    public final native double hideDelay()
        throws RuntimeException /*-{
        return this["hideDelay"] = (this["hideDelay"] || 500.0);
    }-*/
    ;

    public final native JsoTooltip hideDelay(double hideDelay)
        throws RuntimeException /*-{
        this["hideDelay"] = hideDelay;
        return this;
    }-*/
    ;

    public final native String pointFormat()
        throws RuntimeException /*-{
        return this["pointFormat"] = (this["pointFormat"] || "<span style=\"color:{point.color}\">\u25CF</span> {series.name}: <b>{point.y}</b><br/>");
    }-*/
    ;

    public final native JsoTooltip pointFormat(String pointFormat)
        throws RuntimeException /*-{
        this["pointFormat"] = pointFormat;
        return this;
    }-*/
    ;

    public final native JsoTooltip pointFormatter(PointFormatterCallback pointFormatter)
        throws RuntimeException 
            /*-{
            $wnd.jQuery.extend(true, this, 
            {
                pointFormatter: function() {
                    return pointFormatter.@com.github.highcharts4gwt.model.highcharts.option.api.PointFormatterCallback::onCallback(Lcom/github/highcharts4gwt/model/highcharts/object/api/Point;)(
                        this
                     );
                 }
             });
    }-*/;
    ;

    public final native JsoTooltip positioner(PositionerCallback positioner)
        throws RuntimeException 
            /*-{
            $wnd.jQuery.extend(true, this, 
            {
                positioner: function() {
                    return positioner.@com.github.highcharts4gwt.model.highcharts.option.api.PositionerCallback::onCallback()(
                        
                     );
                 }
             });
    }-*/;
    ;

    public final native boolean shadow()
        throws RuntimeException /*-{
        return this["shadow"] = (this["shadow"] || true);
    }-*/
    ;

    public final native JsoTooltip shadow(boolean shadow)
        throws RuntimeException /*-{
        this["shadow"] = shadow;
        return this;
    }-*/
    ;

    public final native String shape()
        throws RuntimeException /*-{
        return this["shape"] = (this["shape"] || "callout");
    }-*/
    ;

    public final native JsoTooltip shape(String shape)
        throws RuntimeException /*-{
        this["shape"] = shape;
        return this;
    }-*/
    ;

    public final native boolean shared()
        throws RuntimeException /*-{
        return this["shared"] = (this["shared"] || false);
    }-*/
    ;

    public final native JsoTooltip shared(boolean shared)
        throws RuntimeException /*-{
        this["shared"] = shared;
        return this;
    }-*/
    ;

    public final native double snap()
        throws RuntimeException /*-{
        return this["snap"] = (this["snap"] || null);
    }-*/
    ;

    public final native JsoTooltip snap(double snap)
        throws RuntimeException /*-{
        this["snap"] = snap;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoTooltip style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean useHTML()
        throws RuntimeException /*-{
        return this["useHTML"] = (this["useHTML"] || false);
    }-*/
    ;

    public final native JsoTooltip useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native double valueDecimals()
        throws RuntimeException /*-{
        return this["valueDecimals"] = (this["valueDecimals"] || null);
    }-*/
    ;

    public final native JsoTooltip valueDecimals(double valueDecimals)
        throws RuntimeException /*-{
        this["valueDecimals"] = valueDecimals;
        return this;
    }-*/
    ;

    public final native String valuePrefix()
        throws RuntimeException /*-{
        return this["valuePrefix"] = (this["valuePrefix"] || "null");
    }-*/
    ;

    public final native JsoTooltip valuePrefix(String valuePrefix)
        throws RuntimeException /*-{
        this["valuePrefix"] = valuePrefix;
        return this;
    }-*/
    ;

    public final native String valueSuffix()
        throws RuntimeException /*-{
        return this["valueSuffix"] = (this["valueSuffix"] || "null");
    }-*/
    ;

    public final native JsoTooltip valueSuffix(String valueSuffix)
        throws RuntimeException /*-{
        this["valueSuffix"] = valueSuffix;
        return this;
    }-*/
    ;

    public final native String xDateFormat()
        throws RuntimeException /*-{
        return this["xDateFormat"] = (this["xDateFormat"] || "null");
    }-*/
    ;

    public final native JsoTooltip xDateFormat(String xDateFormat)
        throws RuntimeException /*-{
        this["xDateFormat"] = xDateFormat;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoTooltip setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoTooltip setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
