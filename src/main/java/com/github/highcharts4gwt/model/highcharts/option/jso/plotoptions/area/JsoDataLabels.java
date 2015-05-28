
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.DataLabels;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * 
 */
public class JsoDataLabels
    extends JavaScriptObject
    implements DataLabels
{


    protected JsoDataLabels() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "center");
    }-*/
    ;

    public final native JsoDataLabels align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native boolean allowOverlap()
        throws RuntimeException /*-{
        return this["allowOverlap"] = (this["allowOverlap"] || false);
    }-*/
    ;

    public final native JsoDataLabels allowOverlap(boolean allowOverlap)
        throws RuntimeException /*-{
        this["allowOverlap"] = allowOverlap;
        return this;
    }-*/
    ;

    public final native String backgroundColor()
        throws RuntimeException /*-{
        return this["backgroundColor"] = (this["backgroundColor"] || "null");
    }-*/
    ;

    public final native JsoDataLabels backgroundColor(String backgroundColor)
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

    public final native JsoDataLabels borderColor(String borderColor)
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

    public final native JsoDataLabels borderRadius(double borderRadius)
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

    public final native JsoDataLabels borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoDataLabels color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native boolean crop()
        throws RuntimeException /*-{
        return this["crop"] = (this["crop"] || true);
    }-*/
    ;

    public final native JsoDataLabels crop(boolean crop)
        throws RuntimeException /*-{
        this["crop"] = crop;
        return this;
    }-*/
    ;

    public final native boolean defer()
        throws RuntimeException /*-{
        return this["defer"] = (this["defer"] || true);
    }-*/
    ;

    public final native JsoDataLabels defer(boolean defer)
        throws RuntimeException /*-{
        this["defer"] = defer;
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || false);
    }-*/
    ;

    public final native JsoDataLabels enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native String format()
        throws RuntimeException /*-{
        return this["format"] = (this["format"] || "{y}");
    }-*/
    ;

    public final native JsoDataLabels format(String format)
        throws RuntimeException /*-{
        this["format"] = format;
        return this;
    }-*/
    ;

    public final native boolean inside()
        throws RuntimeException /*-{
        return this["inside"] = (this["inside"] || false);
    }-*/
    ;

    public final native JsoDataLabels inside(boolean inside)
        throws RuntimeException /*-{
        this["inside"] = inside;
        return this;
    }-*/
    ;

    public final native String overflow()
        throws RuntimeException /*-{
        return this["overflow"] = (this["overflow"] || "justify");
    }-*/
    ;

    public final native JsoDataLabels overflow(String overflow)
        throws RuntimeException /*-{
        this["overflow"] = overflow;
        return this;
    }-*/
    ;

    public final native double padding()
        throws RuntimeException /*-{
        return this["padding"] = (this["padding"] || 5.0);
    }-*/
    ;

    public final native JsoDataLabels padding(double padding)
        throws RuntimeException /*-{
        this["padding"] = padding;
        return this;
    }-*/
    ;

    public final native double rotation()
        throws RuntimeException /*-{
        return this["rotation"] = (this["rotation"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels rotation(double rotation)
        throws RuntimeException /*-{
        this["rotation"] = rotation;
        return this;
    }-*/
    ;

    public final native boolean shadowAsBoolean()
        throws RuntimeException /*-{
        return this["shadow"] = (this["shadow"] || false);
    }-*/
    ;

    public final native JsoDataLabels shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoDataLabels shadowAsJsonString(String shadowAsJsonString)
        throws RuntimeException /*-{
        this["shadow"] = JSON.parse(shadowAsJsonString);
        return this;
    }-*/
    ;

    public final native String shape()
        throws RuntimeException /*-{
        return this["shape"] = (this["shape"] || "square");
    }-*/
    ;

    public final native JsoDataLabels shape(String shape)
        throws RuntimeException /*-{
        this["shape"] = shape;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{"color": "contrast", "fontSize": "11px", "fontWeight": "bold", "textShadow": "0 0 6px contrast, 0 0 3px contrast" }'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoDataLabels style(String styleAsJsonString)
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

    public final native JsoDataLabels useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native String verticalAlign()
        throws RuntimeException /*-{
        return this["verticalAlign"] = (this["verticalAlign"] || "null");
    }-*/
    ;

    public final native JsoDataLabels verticalAlign(String verticalAlign)
        throws RuntimeException /*-{
        this["verticalAlign"] = verticalAlign;
        return this;
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels x(double x)
        throws RuntimeException /*-{
        this["x"] = x;
        return this;
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || -6.0);
    }-*/
    ;

    public final native JsoDataLabels y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

    public final native double zIndex()
        throws RuntimeException /*-{
        return this["zIndex"] = (this["zIndex"] || 6.0);
    }-*/
    ;

    public final native JsoDataLabels zIndex(double zIndex)
        throws RuntimeException /*-{
        this["zIndex"] = zIndex;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoDataLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoDataLabels setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
