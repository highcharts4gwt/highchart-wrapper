
package com.usesoft.highcharts4gwt.model.highcharts.jso.chart;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.ResetZoomButton;

public class JsoResetZoomButton
    extends JavaScriptObject
    implements ResetZoomButton
{


    protected JsoResetZoomButton() {
    }

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || {});
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoResetZoomButton position(String position)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(position);
        return this;
    }-*/
    ;

    public final native String relativeTo()
        throws RuntimeException /*-{
        return this["relativeTo"] = (this["relativeTo"] || "plot");
    }-*/
    ;

    public final native JsoResetZoomButton relativeTo(String relativeTo)
        throws RuntimeException /*-{
        this["relativeTo"] = relativeTo;
        return this;
    }-*/
    ;

    public final native String theme()
        throws RuntimeException /*-{
        this["theme"] = (this["theme"] || {});
        return JSON.stringify(this["theme"]);
    }-*/
    ;

    public final native JsoResetZoomButton theme(String theme)
        throws RuntimeException /*-{
        this["theme"] = JSON.parse(theme);
        return this;
    }-*/
    ;

}
