
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Dial;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Options for the dial or arrow pointer of the gauge.
 * 
 */
public class JsoDial
    extends JavaScriptObject
    implements Dial
{


    protected JsoDial() {
    }

    public final native String backgroundColor()
        throws RuntimeException /*-{
        return this["backgroundColor"] = (this["backgroundColor"] || "black");
    }-*/
    ;

    public final native JsoDial backgroundColor(String backgroundColor)
        throws RuntimeException /*-{
        this["backgroundColor"] = backgroundColor;
        return this;
    }-*/
    ;

    public final native String baseLength()
        throws RuntimeException /*-{
        return this["baseLength"] = (this["baseLength"] || "70%");
    }-*/
    ;

    public final native JsoDial baseLength(String baseLength)
        throws RuntimeException /*-{
        this["baseLength"] = baseLength;
        return this;
    }-*/
    ;

    public final native double baseWidth()
        throws RuntimeException /*-{
        return this["baseWidth"] = (this["baseWidth"] || 3.0);
    }-*/
    ;

    public final native JsoDial baseWidth(double baseWidth)
        throws RuntimeException /*-{
        this["baseWidth"] = baseWidth;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "silver");
    }-*/
    ;

    public final native JsoDial borderColor(String borderColor)
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

    public final native JsoDial borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native String radius()
        throws RuntimeException /*-{
        return this["radius"] = (this["radius"] || "80%");
    }-*/
    ;

    public final native JsoDial radius(String radius)
        throws RuntimeException /*-{
        this["radius"] = radius;
        return this;
    }-*/
    ;

    public final native String rearLength()
        throws RuntimeException /*-{
        return this["rearLength"] = (this["rearLength"] || "10%");
    }-*/
    ;

    public final native JsoDial rearLength(String rearLength)
        throws RuntimeException /*-{
        this["rearLength"] = rearLength;
        return this;
    }-*/
    ;

    public final native double topWidth()
        throws RuntimeException /*-{
        return this["topWidth"] = (this["topWidth"] || 1.0);
    }-*/
    ;

    public final native JsoDial topWidth(double topWidth)
        throws RuntimeException /*-{
        this["topWidth"] = topWidth;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoDial setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoDial setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + valueToBeEvaluated + ')');
        return this;
    }-*/
    ;

}
