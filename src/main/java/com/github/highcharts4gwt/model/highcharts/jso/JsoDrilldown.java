
package com.github.highcharts4gwt.model.highcharts.jso;

import com.github.highcharts4gwt.model.highcharts.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoDrilldown
    extends JavaScriptObject
    implements Drilldown
{


    protected JsoDrilldown() {
    }

    public final native String activeAxisLabelStyle()
        throws RuntimeException /*-{
        this["activeAxisLabelStyle"] = (this["activeAxisLabelStyle"] || {});
        return JSON.stringify(this["activeAxisLabelStyle"]);
    }-*/
    ;

    public final native JsoDrilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString)
        throws RuntimeException /*-{
        this["activeAxisLabelStyle"] = JSON.parse(activeAxisLabelStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native String activeDataLabelStyle()
        throws RuntimeException /*-{
        this["activeDataLabelStyle"] = (this["activeDataLabelStyle"] || {});
        return JSON.stringify(this["activeDataLabelStyle"]);
    }-*/
    ;

    public final native JsoDrilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString)
        throws RuntimeException /*-{
        this["activeDataLabelStyle"] = JSON.parse(activeDataLabelStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean animationAsBoolean()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || false);
    }-*/
    ;

    public final native JsoDrilldown animationAsBoolean(boolean animationAsBoolean)
        throws RuntimeException /*-{
        this["animation"] = animationAsBoolean;
        return this;
    }-*/
    ;

    public final native String animationAsJsonString()
        throws RuntimeException /*-{
        this["animation"] = (this["animation"] || JSON.parse(''));
        return JSON.stringify(this["animation"]);
    }-*/
    ;

    public final native JsoDrilldown animationAsJsonString(String animationAsJsonString)
        throws RuntimeException /*-{
        this["animation"] = JSON.parse(animationAsJsonString);
        return this;
    }-*/
    ;

    public final native DrillUpButton drillUpButton()
        throws RuntimeException /*-{
        return this["drillUpButton"] = (this["drillUpButton"] || {});
    }-*/
    ;

    public final native JsoDrilldown drillUpButton(DrillUpButton drillUpButton)
        throws RuntimeException /*-{
        this["drillUpButton"] = drillUpButton;
        return this;
    }-*/
    ;

}
