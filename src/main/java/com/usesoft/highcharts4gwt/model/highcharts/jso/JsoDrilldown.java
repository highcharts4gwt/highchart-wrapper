
package com.usesoft.highcharts4gwt.model.highcharts.jso;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.Drilldown;
import com.usesoft.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;

public class JsoDrilldown
    extends JavaScriptObject
    implements Drilldown
{


    protected JsoDrilldown() {
    }

    public final native String activeAxisLabelStyle()
        throws RuntimeException /*-{
        this["activeAxisLabelStyle"] = (this["activeAxisLabelStyle"] || {});
        return JSON.stringify(this["activeAxisLabelStyle"]);
    }-*/
    ;

    public final native JsoDrilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString)
        throws RuntimeException /*-{
        this["activeAxisLabelStyle"] = JSON.parse(activeAxisLabelStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native String activeDataLabelStyle()
        throws RuntimeException /*-{
        this["activeDataLabelStyle"] = (this["activeDataLabelStyle"] || {});
        return JSON.stringify(this["activeDataLabelStyle"]);
    }-*/
    ;

    public final native JsoDrilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString)
        throws RuntimeException /*-{
        this["activeDataLabelStyle"] = JSON.parse(activeDataLabelStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native DrillUpButton drillUpButton()
        throws RuntimeException /*-{
        return this["drillUpButton"] = (this["drillUpButton"] || {});
    }-*/
    ;

    public final native JsoDrilldown drillUpButton(DrillUpButton drillUpButton)
        throws RuntimeException /*-{
        this["drillUpButton"] = drillUpButton;
        return this;
    }-*/
    ;

}
