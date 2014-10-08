
package com.usesoft.highcharts4gwt.model.highcharts.jso;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.NoData;

public class JsoNoData
    extends JavaScriptObject
    implements NoData
{


    protected JsoNoData() {
    }

    public final native String attr()
        throws RuntimeException /*-{
        this["attr"] = (this["attr"] || "null");
        return JSON.stringify(this["attr"]);
    }-*/
    ;

    public final native JsoNoData attr(String attr)
        throws RuntimeException /*-{
        this["attr"] = JSON.parse(attr);
        return this;
    }-*/
    ;

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || "{ "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }");
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoNoData position(String position)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(position);
        return this;
    }-*/
    ;

}
