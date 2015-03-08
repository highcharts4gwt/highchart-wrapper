
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.ResetZoomButton;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * The button that appears after a selection zoom, allowing the user to reset zoom.
 * 
 */
public class JsoResetZoomButton
    extends JavaScriptObject
    implements ResetZoomButton
{


    protected JsoResetZoomButton() {
    }

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || {});
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoResetZoomButton position(String positionAsJsonString)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(positionAsJsonString);
        return this;
    }-*/
    ;

    public final native String relativeTo()
        throws RuntimeException /*-{
        return this["relativeTo"] = (this["relativeTo"] || "plot");
    }-*/
    ;

    public final native JsoResetZoomButton relativeTo(String relativeTo)
        throws RuntimeException /*-{
        this["relativeTo"] = relativeTo;
        return this;
    }-*/
    ;

    public final native String theme()
        throws RuntimeException /*-{
        this["theme"] = (this["theme"] || {});
        return JSON.stringify(this["theme"]);
    }-*/
    ;

    public final native JsoResetZoomButton theme(String themeAsJsonString)
        throws RuntimeException /*-{
        this["theme"] = JSON.parse(themeAsJsonString);
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoResetZoomButton setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
