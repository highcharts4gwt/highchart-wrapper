
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Subtitle;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoSubtitle
    extends JavaScriptObject
    implements Subtitle
{


    protected JsoSubtitle() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "center");
    }-*/
    ;

    public final native JsoSubtitle align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native boolean floating()
        throws RuntimeException /*-{
        return this["floating"] = (this["floating"] || false);
    }-*/
    ;

    public final native JsoSubtitle floating(boolean floating)
        throws RuntimeException /*-{
        this["floating"] = floating;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{ "color": "#555555" }'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoSubtitle style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String text()
        throws RuntimeException /*-{
        return this["text"] = (this["text"] || "null");
    }-*/
    ;

    public final native JsoSubtitle text(String text)
        throws RuntimeException /*-{
        this["text"] = text;
        return this;
    }-*/
    ;

    public final native boolean useHTML()
        throws RuntimeException /*-{
        return this["useHTML"] = (this["useHTML"] || false);
    }-*/
    ;

    public final native JsoSubtitle useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native String verticalAlign()
        throws RuntimeException /*-{
        return this["verticalAlign"] = (this["verticalAlign"] || "");
    }-*/
    ;

    public final native JsoSubtitle verticalAlign(String verticalAlign)
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

    public final native JsoSubtitle x(double x)
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

    public final native JsoSubtitle y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

}
