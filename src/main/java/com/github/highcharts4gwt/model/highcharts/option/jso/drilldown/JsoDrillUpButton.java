
package com.github.highcharts4gwt.model.highcharts.option.jso.drilldown;

import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Options for the drill up button that appears when drilling down on a series. The text for the button is defined in <a href="#lang.drillUpText">lang.drillUpText</a>.
 * 
 */
public class JsoDrillUpButton
    extends JavaScriptObject
    implements DrillUpButton
{


    protected JsoDrillUpButton() {
    }

    public final native String position()
        throws RuntimeException /*-{
        this["position"] = (this["position"] || JSON.parse(''));
        return JSON.stringify(this["position"]);
    }-*/
    ;

    public final native JsoDrillUpButton position(String positionAsJsonString)
        throws RuntimeException /*-{
        this["position"] = JSON.parse(positionAsJsonString);
        return this;
    }-*/
    ;

    public final native String relativeTo()
        throws RuntimeException /*-{
        return this["relativeTo"] = (this["relativeTo"] || "plotBox");
    }-*/
    ;

    public final native JsoDrillUpButton relativeTo(String relativeTo)
        throws RuntimeException /*-{
        this["relativeTo"] = relativeTo;
        return this;
    }-*/
    ;

    public final native String theme()
        throws RuntimeException /*-{
        this["theme"] = (this["theme"] || JSON.parse(''));
        return JSON.stringify(this["theme"]);
    }-*/
    ;

    public final native JsoDrillUpButton theme(String themeAsJsonString)
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

    public final native JsoDrillUpButton setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoDrillUpButton setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
