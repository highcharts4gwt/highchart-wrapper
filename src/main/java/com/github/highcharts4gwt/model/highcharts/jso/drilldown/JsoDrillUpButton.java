
package com.github.highcharts4gwt.model.highcharts.jso.drilldown;

import com.github.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoDrillUpButton
    extends JavaScriptObject
    implements DrillUpButton
{


    protected JsoDrillUpButton() {
    }

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || JSON.parse(''));
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoDrillUpButton position(String positionAsJsonString)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(positionAsJsonString);
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
        this["theme"] = (this["theme"] || JSON.parse(''));
        return JSON.stringify(this["theme"]);
    }-*/
    ;

    public final native JsoDrillUpButton theme(String themeAsJsonString)
        throws RuntimeException /*-{
        this["theme"] = JSON.parse(themeAsJsonString);
        return this;
    }-*/
    ;

}
