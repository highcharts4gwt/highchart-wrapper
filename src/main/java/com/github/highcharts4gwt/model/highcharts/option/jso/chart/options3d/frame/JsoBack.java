
package com.github.highcharts4gwt.model.highcharts.option.jso.chart.options3d.frame;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Back;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoBack
    extends JavaScriptObject
    implements Back
{


    protected JsoBack() {
    }

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "transparent");
    }-*/
    ;

    public final native JsoBack color(String color)
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

    public final native JsoBack size(double size)
        throws RuntimeException /*-{
        this["size"] = size;
        return this;
    }-*/
    ;

}