
package com.github.highcharts4gwt.model.highcharts.option.jso.xaxis.plotlines;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotlines.Label;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoLabel
    extends JavaScriptObject
    implements Label
{


    protected JsoLabel() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "left");
    }-*/
    ;

    public final native JsoLabel align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native double rotation()
        throws RuntimeException /*-{
        return this["rotation"] = (this["rotation"] || null);
    }-*/
    ;

    public final native JsoLabel rotation(double rotation)
        throws RuntimeException /*-{
        this["rotation"] = rotation;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoLabel style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String text()
        throws RuntimeException /*-{
        return this["text"] = (this["text"] || "");
    }-*/
    ;

    public final native JsoLabel text(String text)
        throws RuntimeException /*-{
        this["text"] = text;
        return this;
    }-*/
    ;

    public final native String textAlign()
        throws RuntimeException /*-{
        return this["textAlign"] = (this["textAlign"] || "null");
    }-*/
    ;

    public final native JsoLabel textAlign(String textAlign)
        throws RuntimeException /*-{
        this["textAlign"] = textAlign;
        return this;
    }-*/
    ;

    public final native boolean useHTML()
        throws RuntimeException /*-{
        return this["useHTML"] = (this["useHTML"] || false);
    }-*/
    ;

    public final native JsoLabel useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native String verticalAlign()
        throws RuntimeException /*-{
        return this["verticalAlign"] = (this["verticalAlign"] || "top");
    }-*/
    ;

    public final native JsoLabel verticalAlign(String verticalAlign)
        throws RuntimeException /*-{
        this["verticalAlign"] = verticalAlign;
        return this;
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || null);
    }-*/
    ;

    public final native JsoLabel x(double x)
        throws RuntimeException /*-{
        this["x"] = x;
        return this;
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || null);
    }-*/
    ;

    public final native JsoLabel y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

}
