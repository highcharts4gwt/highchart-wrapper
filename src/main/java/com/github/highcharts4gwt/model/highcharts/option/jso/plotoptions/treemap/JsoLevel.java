
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Level;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoLevel
    extends JavaScriptObject
    implements Level
{


    protected JsoLevel() {
    }

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "null");
    }-*/
    ;

    public final native JsoLevel borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native String borderDashStyle()
        throws RuntimeException /*-{
        return this["borderDashStyle"] = (this["borderDashStyle"] || "null");
    }-*/
    ;

    public final native JsoLevel borderDashStyle(String borderDashStyle)
        throws RuntimeException /*-{
        this["borderDashStyle"] = borderDashStyle;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || null);
    }-*/
    ;

    public final native JsoLevel borderWidth(double borderWidth)
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

    public final native JsoLevel color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native String dataLabels()
        throws RuntimeException /*-{
        this["dataLabels"] = (this["dataLabels"] || JSON.parse('undefined'));
        return JSON.stringify(this["dataLabels"]);
    }-*/
    ;

    public final native JsoLevel dataLabels(String dataLabelsAsJsonString)
        throws RuntimeException /*-{
        this["dataLabels"] = JSON.parse(dataLabelsAsJsonString);
        return this;
    }-*/
    ;

    public final native String layoutAlgorithm()
        throws RuntimeException /*-{
        return this["layoutAlgorithm"] = (this["layoutAlgorithm"] || "null");
    }-*/
    ;

    public final native JsoLevel layoutAlgorithm(String layoutAlgorithm)
        throws RuntimeException /*-{
        this["layoutAlgorithm"] = layoutAlgorithm;
        return this;
    }-*/
    ;

    public final native String layoutStartingDirection()
        throws RuntimeException /*-{
        return this["layoutStartingDirection"] = (this["layoutStartingDirection"] || "null");
    }-*/
    ;

    public final native JsoLevel layoutStartingDirection(String layoutStartingDirection)
        throws RuntimeException /*-{
        this["layoutStartingDirection"] = layoutStartingDirection;
        return this;
    }-*/
    ;

    public final native double level()
        throws RuntimeException /*-{
        return this["level"] = (this["level"] || null);
    }-*/
    ;

    public final native JsoLevel level(double level)
        throws RuntimeException /*-{
        this["level"] = level;
        return this;
    }-*/
    ;

}
