
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.DataLabels;
import com.google.gwt.core.client.JavaScriptObject;

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
        return this["padding"] = (this["padding"] || 2.0);
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

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{"color": "#606060", "fontSize": "11px"}'));
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

    public final native double xHigh()
        throws RuntimeException /*-{
        return this["xHigh"] = (this["xHigh"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels xHigh(double xHigh)
        throws RuntimeException /*-{
        this["xHigh"] = xHigh;
        return this;
    }-*/
    ;

    public final native double xLow()
        throws RuntimeException /*-{
        return this["xLow"] = (this["xLow"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels xLow(double xLow)
        throws RuntimeException /*-{
        this["xLow"] = xLow;
        return this;
    }-*/
    ;

    public final native double yHigh()
        throws RuntimeException /*-{
        return this["yHigh"] = (this["yHigh"] || -6.0);
    }-*/
    ;

    public final native JsoDataLabels yHigh(double yHigh)
        throws RuntimeException /*-{
        this["yHigh"] = yHigh;
        return this;
    }-*/
    ;

    public final native double yLow()
        throws RuntimeException /*-{
        return this["yLow"] = (this["yLow"] || 16.0);
    }-*/
    ;

    public final native JsoDataLabels yLow(double yLow)
        throws RuntimeException /*-{
        this["yLow"] = yLow;
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

}