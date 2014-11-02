
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoArea
    extends JsoSeries
    implements Area
{


    protected JsoArea() {
    }

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "null");
    }-*/
    ;

    public final native JsoArea fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native Number fillOpacity()
        throws RuntimeException /*-{
        return this["fillOpacity"] = (this["fillOpacity"] || 0.75);
    }-*/
    ;

    public final native JsoArea fillOpacity(Number fillOpacity)
        throws RuntimeException /*-{
        this["fillOpacity"] = fillOpacity;
        return this;
    }-*/
    ;

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "null");
    }-*/
    ;

    public final native JsoArea lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native String negativeFillColor()
        throws RuntimeException /*-{
        return this["negativeFillColor"] = (this["negativeFillColor"] || "");
    }-*/
    ;

    public final native JsoArea negativeFillColor(String negativeFillColor)
        throws RuntimeException /*-{
        this["negativeFillColor"] = negativeFillColor;
        return this;
    }-*/
    ;

    public final native boolean trackByArea()
        throws RuntimeException /*-{
        return this["trackByArea"] = (this["trackByArea"] || false);
    }-*/
    ;

    public final native JsoArea trackByArea(boolean trackByArea)
        throws RuntimeException /*-{
        this["trackByArea"] = trackByArea;
        return this;
    }-*/
    ;

}
