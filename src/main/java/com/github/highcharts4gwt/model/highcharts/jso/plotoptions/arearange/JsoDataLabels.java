
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.DataLabels;

public class JsoDataLabels
    extends com.github.highcharts4gwt.model.highcharts.jso.plotoptions.series.JsoDataLabels
    implements DataLabels
{


    protected JsoDataLabels() {
    }

    public final native double xHigh()
        throws RuntimeException /*-{
        return this["xHigh"] = (this["xHigh"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels xHigh(double xHigh)
        throws RuntimeException /*-{
        this["xHigh"] = xHigh;
        return this;
    }-*/
    ;

    public final native double xLow()
        throws RuntimeException /*-{
        return this["xLow"] = (this["xLow"] || 0.0);
    }-*/
    ;

    public final native JsoDataLabels xLow(double xLow)
        throws RuntimeException /*-{
        this["xLow"] = xLow;
        return this;
    }-*/
    ;

    public final native double yHigh()
        throws RuntimeException /*-{
        return this["yHigh"] = (this["yHigh"] || -6.0);
    }-*/
    ;

    public final native JsoDataLabels yHigh(double yHigh)
        throws RuntimeException /*-{
        this["yHigh"] = yHigh;
        return this;
    }-*/
    ;

    public final native double yLow()
        throws RuntimeException /*-{
        return this["yLow"] = (this["yLow"] || 16.0);
    }-*/
    ;

    public final native JsoDataLabels yLow(double yLow)
        throws RuntimeException /*-{
        this["yLow"] = yLow;
        return this;
    }-*/
    ;

}
