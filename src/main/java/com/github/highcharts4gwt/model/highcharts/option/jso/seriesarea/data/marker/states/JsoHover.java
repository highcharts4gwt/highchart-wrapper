
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea.data.marker.states;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.data.marker.states.Hover;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * 
 */
public class JsoHover
    extends JavaScriptObject
    implements Hover
{


    protected JsoHover() {
    }

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoHover enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "");
    }-*/
    ;

    public final native JsoHover fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoHover lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 0.0);
    }-*/
    ;

    public final native JsoHover lineWidth(double lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native double lineWidthPlus()
        throws RuntimeException /*-{
        return this["lineWidthPlus"] = (this["lineWidthPlus"] || 1.0);
    }-*/
    ;

    public final native JsoHover lineWidthPlus(double lineWidthPlus)
        throws RuntimeException /*-{
        this["lineWidthPlus"] = lineWidthPlus;
        return this;
    }-*/
    ;

    public final native double radius()
        throws RuntimeException /*-{
        return this["radius"] = (this["radius"] || null);
    }-*/
    ;

    public final native JsoHover radius(double radius)
        throws RuntimeException /*-{
        this["radius"] = radius;
        return this;
    }-*/
    ;

    public final native double radiusPlus()
        throws RuntimeException /*-{
        return this["radiusPlus"] = (this["radiusPlus"] || 2.0);
    }-*/
    ;

    public final native JsoHover radiusPlus(double radiusPlus)
        throws RuntimeException /*-{
        this["radiusPlus"] = radiusPlus;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoHover setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoHover setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
