
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Pivot;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Options for the pivot or the center point of the gauge.
 * 
 */
public class JsoPivot
    extends JavaScriptObject
    implements Pivot
{


    protected JsoPivot() {
    }

    public final native String backgroundColor()
        throws RuntimeException /*-{
        return this["backgroundColor"] = (this["backgroundColor"] || "black");
    }-*/
    ;

    public final native JsoPivot backgroundColor(String backgroundColor)
        throws RuntimeException /*-{
        this["backgroundColor"] = backgroundColor;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "silver");
    }-*/
    ;

    public final native JsoPivot borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 0.0);
    }-*/
    ;

    public final native JsoPivot borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native double radius()
        throws RuntimeException /*-{
        return this["radius"] = (this["radius"] || 5.0);
    }-*/
    ;

    public final native JsoPivot radius(double radius)
        throws RuntimeException /*-{
        this["radius"] = radius;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoPivot setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoPivot setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
