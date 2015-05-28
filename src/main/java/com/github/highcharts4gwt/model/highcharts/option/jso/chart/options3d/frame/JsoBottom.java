
package com.github.highcharts4gwt.model.highcharts.option.jso.chart.options3d.frame;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Bottom;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * The bottom of the frame around a 3D chart.
 * 
 */
public class JsoBottom
    extends JavaScriptObject
    implements Bottom
{


    protected JsoBottom() {
    }

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "transparent");
    }-*/
    ;

    public final native JsoBottom color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native double size()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || 1.0);
    }-*/
    ;

    public final native JsoBottom size(double size)
        throws RuntimeException /*-{
        this["size"] = size;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoBottom setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoBottom setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
