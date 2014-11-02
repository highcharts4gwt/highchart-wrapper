
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.spline;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.DataLabels;
import com.usesoft.highcharts4gwt.model.highcharts.jso.xaxis.JsoLabels;

public class JsoDataLabels
    extends JsoLabels
    implements DataLabels
{


    protected JsoDataLabels() {
    }

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

    public final native Number borderRadius()
        throws RuntimeException /*-{
        return this["borderRadius"] = (this["borderRadius"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels borderRadius(Number borderRadius)
        throws RuntimeException /*-{
        this["borderRadius"] = borderRadius;
        return this;
    }-*/
    ;

    public final native Number borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels borderWidth(Number borderWidth)
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

    public final native Number padding()
        throws RuntimeException /*-{
        return this["padding"] = (this["padding"] || 2.0);
    }-*/
    ;

    public final native JsoDataLabels padding(Number padding)
        throws RuntimeException /*-{
        this["padding"] = padding;
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

}
