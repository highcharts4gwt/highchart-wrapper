
package com.github.highcharts4gwt.model.highcharts.jso;

import com.github.highcharts4gwt.model.highcharts.api.NoData;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoNoData
    extends JavaScriptObject
    implements NoData
{


    protected JsoNoData() {
    }

    public final native String attr()
        throws RuntimeException /*-{
        this["attr"] = (this["attr"] || {});
        return JSON.stringify(this["attr"]);
    }-*/
    ;

    public final native JsoNoData attr(String attrAsJsonString)
        throws RuntimeException /*-{
        this["attr"] = JSON.parse(attrAsJsonString);
        return this;
    }-*/
    ;

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || JSON.parse('{ "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }'));
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoNoData position(String positionAsJsonString)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(positionAsJsonString);
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{ "fontSize": "12px", "fontWeight": "bold", "color": "#60606a" }'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoNoData style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

}
