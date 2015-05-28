
package com.github.highcharts4gwt.model.highcharts.option.jso.legend;

import com.github.highcharts4gwt.model.highcharts.option.api.legend.Navigation;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Options for the paging or navigation appearing when the legend is overflown. When <a href="#legend.useHTML">legend.useHTML</a> is enabled, navigation is disabled.
 * 
 */
public class JsoNavigation
    extends JavaScriptObject
    implements Navigation
{


    protected JsoNavigation() {
    }

    public final native String activeColor()
        throws RuntimeException /*-{
        return this["activeColor"] = (this["activeColor"] || "#3E576F");
    }-*/
    ;

    public final native JsoNavigation activeColor(String activeColor)
        throws RuntimeException /*-{
        this["activeColor"] = activeColor;
        return this;
    }-*/
    ;

    public final native boolean animationAsBoolean()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoNavigation animationAsBoolean(boolean animationAsBoolean)
        throws RuntimeException /*-{
        this["animation"] = animationAsBoolean;
        return this;
    }-*/
    ;

    public final native String animationAsJsonString()
        throws RuntimeException /*-{
        this["animation"] = (this["animation"] || JSON.parse('true'));
        return JSON.stringify(this["animation"]);
    }-*/
    ;

    public final native JsoNavigation animationAsJsonString(String animationAsJsonString)
        throws RuntimeException /*-{
        this["animation"] = JSON.parse(animationAsJsonString);
        return this;
    }-*/
    ;

    public final native double arrowSize()
        throws RuntimeException /*-{
        return this["arrowSize"] = (this["arrowSize"] || 12.0);
    }-*/
    ;

    public final native JsoNavigation arrowSize(double arrowSize)
        throws RuntimeException /*-{
        this["arrowSize"] = arrowSize;
        return this;
    }-*/
    ;

    public final native String inactiveColor()
        throws RuntimeException /*-{
        return this["inactiveColor"] = (this["inactiveColor"] || "#CCC");
    }-*/
    ;

    public final native JsoNavigation inactiveColor(String inactiveColor)
        throws RuntimeException /*-{
        this["inactiveColor"] = inactiveColor;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoNavigation style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoNavigation setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoNavigation setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
