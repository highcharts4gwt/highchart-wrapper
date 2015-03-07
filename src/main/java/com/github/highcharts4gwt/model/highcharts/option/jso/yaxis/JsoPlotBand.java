
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.plotbands.Label;
import com.google.gwt.core.client.JavaScriptObject;

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

    public final native double innerRadiusAsNumber()
        throws RuntimeException /*-{
        return this["innerRadius"] = (this["innerRadius"] || null);
    }-*/
    ;

    public final native JsoPlotBand innerRadiusAsNumber(double innerRadiusAsNumber)
        throws RuntimeException /*-{
        this["innerRadius"] = innerRadiusAsNumber;
        return this;
    }-*/
    ;

    public final native String innerRadiusAsString()
        throws RuntimeException /*-{
        return this["innerRadius"] = (this["innerRadius"] || "null");
    }-*/
    ;

    public final native JsoPlotBand innerRadiusAsString(String innerRadiusAsString)
        throws RuntimeException /*-{
        this["innerRadius"] = innerRadiusAsString;
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

    public final native double outerRadiusAsNumber()
        throws RuntimeException /*-{
        return this["outerRadius"] = (this["outerRadius"] || null);
    }-*/
    ;

    public final native JsoPlotBand outerRadiusAsNumber(double outerRadiusAsNumber)
        throws RuntimeException /*-{
        this["outerRadius"] = outerRadiusAsNumber;
        return this;
    }-*/
    ;

    public final native String outerRadiusAsString()
        throws RuntimeException /*-{
        return this["outerRadius"] = (this["outerRadius"] || "100%");
    }-*/
    ;

    public final native JsoPlotBand outerRadiusAsString(String outerRadiusAsString)
        throws RuntimeException /*-{
        this["outerRadius"] = outerRadiusAsString;
        return this;
    }-*/
    ;

    public final native double thicknessAsNumber()
        throws RuntimeException /*-{
        return this["thickness"] = (this["thickness"] || 10.0);
    }-*/
    ;

    public final native JsoPlotBand thicknessAsNumber(double thicknessAsNumber)
        throws RuntimeException /*-{
        this["thickness"] = thicknessAsNumber;
        return this;
    }-*/
    ;

    public final native String thicknessAsString()
        throws RuntimeException /*-{
        return this["thickness"] = (this["thickness"] || "10");
    }-*/
    ;

    public final native JsoPlotBand thicknessAsString(String thicknessAsString)
        throws RuntimeException /*-{
        this["thickness"] = thicknessAsString;
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
