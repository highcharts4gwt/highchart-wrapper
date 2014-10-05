
package com.usesoft.highcharts4gwt.model.highcharts.jso.drilldown;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;

public class JsoDrillUpButton
    extends JavaScriptObject
    implements DrillUpButton
{


    protected JsoDrillUpButton() {
    }

    public final native String position()
        throws RuntimeException /*-{
        return this["position"] = (this["position"] || "");
    }-*/
    ;

    public final native JsoDrillUpButton position(String position)
        throws RuntimeException /*-{
        this["position"] = position;
        return this;
    }-*/
    ;

    public final native String relativeTo()
        throws RuntimeException /*-{
        return this["relativeTo"] = (this["relativeTo"] || "plotBox");
    }-*/
    ;

    public final native JsoDrillUpButton relativeTo(String relativeTo)
        throws RuntimeException /*-{
        this["relativeTo"] = relativeTo;
        return this;
    }-*/
    ;

    public final native String theme()
        throws RuntimeException /*-{
        return this["theme"] = (this["theme"] || "");
    }-*/
    ;

    public final native JsoDrillUpButton theme(String theme)
        throws RuntimeException /*-{
        this["theme"] = theme;
        return this;
    }-*/
    ;

}
