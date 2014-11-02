
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Waterfall;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoColumn;

public class JsoWaterfall
    extends JsoColumn
    implements Waterfall
{


    protected JsoWaterfall() {
    }

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "#333333");
    }-*/
    ;

    public final native JsoWaterfall lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native String upColor()
        throws RuntimeException /*-{
        return this["upColor"] = (this["upColor"] || "");
    }-*/
    ;

    public final native JsoWaterfall upColor(String upColor)
        throws RuntimeException /*-{
        this["upColor"] = upColor;
        return this;
    }-*/
    ;

}
