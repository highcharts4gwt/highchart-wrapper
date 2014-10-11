
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
        this["attr"] = (this["attr"] || {});
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
        this["position"] = (this["position"] || JSON.parse('{ "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }'));
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoNoData position(String position)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(position);
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{ "fontSize": "12px", "fontWeight": "bold", "color": "#60606a" }'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoNoData style(String style)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(style);
        return this;
    }-*/
    ;

}
