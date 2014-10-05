
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
        return this["attr"] = (this["attr"] || "null");
    }-*/
    ;

    public final native JsoNoData attr(String attr)
        throws RuntimeException /*-{
        this["attr"] = attr;
        return this;
    }-*/
    ;

    public final native String position()
        throws RuntimeException /*-{
        return this["position"] = (this["position"] || "{ "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }");
    }-*/
    ;

    public final native JsoNoData position(String position)
        throws RuntimeException /*-{
        this["position"] = position;
        return this;
    }-*/
    ;

}
