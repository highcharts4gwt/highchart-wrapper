
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bubble.marker.states;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.marker.states.Select;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoSelect
    extends JavaScriptObject
    implements Select
{


    protected JsoSelect() {
    }

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoSelect enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "null");
    }-*/
    ;

    public final native JsoSelect fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "#000000");
    }-*/
    ;

    public final native JsoSelect lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 0.0);
    }-*/
    ;

    public final native JsoSelect lineWidth(double lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native double radius()
        throws RuntimeException /*-{
        return this["radius"] = (this["radius"] || null);
    }-*/
    ;

    public final native JsoSelect radius(double radius)
        throws RuntimeException /*-{
        this["radius"] = radius;
        return this;
    }-*/
    ;

}
