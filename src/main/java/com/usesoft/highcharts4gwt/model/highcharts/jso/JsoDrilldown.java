
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
