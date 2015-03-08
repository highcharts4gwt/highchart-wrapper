
package com.github.highcharts4gwt.model.highcharts.option.jso.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotbands.Label;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>
 * 
 * <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
 * 
 */
public class JsoPlotBand
    extends JavaScriptObject
    implements PlotBand
{


    protected JsoPlotBand() {
    }

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "null");
    }-*/
    ;

    public final native JsoPlotBand borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 0.0);
    }-*/
    ;

    public final native JsoPlotBand borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoPlotBand color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native double from()
        throws RuntimeException /*-{
        return this["from"] = (this["from"] || null);
    }-*/
    ;

    public final native JsoPlotBand from(double from)
        throws RuntimeException /*-{
        this["from"] = from;
        return this;
    }-*/
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "null");
    }-*/
    ;

    public final native JsoPlotBand id(String id)
        throws RuntimeException /*-{
        this["id"] = id;
        return this;
    }-*/
    ;

    public final native Label label()
        throws RuntimeException /*-{
        return this["label"] = (this["label"] || {});
    }-*/
    ;

    public final native JsoPlotBand label(Label label)
        throws RuntimeException /*-{
        this["label"] = label;
        return this;
    }-*/
    ;

    public final native double to()
        throws RuntimeException /*-{
        return this["to"] = (this["to"] || null);
    }-*/
    ;

    public final native JsoPlotBand to(double to)
        throws RuntimeException /*-{
        this["to"] = to;
        return this;
    }-*/
    ;

    public final native double zIndex()
        throws RuntimeException /*-{
        return this["zIndex"] = (this["zIndex"] || null);
    }-*/
    ;

    public final native JsoPlotBand zIndex(double zIndex)
        throws RuntimeException /*-{
        this["zIndex"] = zIndex;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoPlotBand setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
