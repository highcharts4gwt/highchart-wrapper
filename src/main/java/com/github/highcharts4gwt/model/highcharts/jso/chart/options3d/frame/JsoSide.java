
package com.github.highcharts4gwt.model.highcharts.jso.chart.options3d.frame;

import com.github.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Side;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoSide
    extends JavaScriptObject
    implements Side
{


    protected JsoSide() {
    }

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "transparent");
    }-*/
    ;

    public final native JsoSide color(String color)
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

    public final native JsoSide size(double size)
        throws RuntimeException /*-{
        this["size"] = size;
        return this;
    }-*/
    ;

}
