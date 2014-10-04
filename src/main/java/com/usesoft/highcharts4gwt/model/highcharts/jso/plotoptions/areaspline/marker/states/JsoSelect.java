
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.areaspline.marker.states;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.marker.states.Select;

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

    public final native Number lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 0.0);
    }-*/
    ;

    public final native JsoSelect lineWidth(Number lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native Number radius()
        throws RuntimeException /*-{
        return this["radius"] = (this["radius"] || null);
    }-*/
    ;

    public final native JsoSelect radius(Number radius)
        throws RuntimeException /*-{
        this["radius"] = radius;
        return this;
    }-*/
    ;

}
