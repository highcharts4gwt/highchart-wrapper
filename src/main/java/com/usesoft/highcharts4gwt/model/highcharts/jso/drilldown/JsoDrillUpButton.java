
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
        this["position"] = (this["position"] || "");
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoDrillUpButton position(String position)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(position);
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
        this["theme"] = (this["theme"] || "");
        return JSON.stringify(this["theme"]);
    }-*/
    ;

    public final native JsoDrillUpButton theme(String theme)
        throws RuntimeException /*-{
        this["theme"] = JSON.parse(theme);
        return this;
    }-*/
    ;

}
