
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.Zone;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * An array defining zones within a series.
 * 
 */
public class JsoZone
    extends JavaScriptObject
    implements Zone
{


    protected JsoZone() {
    }

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoZone color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native String dashStyle()
        throws RuntimeException /*-{
        return this["dashStyle"] = (this["dashStyle"] || "null");
    }-*/
    ;

    public final native JsoZone dashStyle(String dashStyle)
        throws RuntimeException /*-{
        this["dashStyle"] = dashStyle;
        return this;
    }-*/
    ;

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "");
    }-*/
    ;

    public final native JsoZone fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native double value()
        throws RuntimeException /*-{
        return this["value"] = (this["value"] || undefined);
    }-*/
    ;

    public final native JsoZone value(double value)
        throws RuntimeException /*-{
        this["value"] = value;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoZone setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoZone setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
