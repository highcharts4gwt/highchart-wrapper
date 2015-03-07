
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.StackLabels;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoStackLabels
    extends JavaScriptObject
    implements StackLabels
{


    protected JsoStackLabels() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "null");
    }-*/
    ;

    public final native JsoStackLabels align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || false);
    }-*/
    ;

    public final native JsoStackLabels enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native String format()
        throws RuntimeException /*-{
        return this["format"] = (this["format"] || "{total}");
    }-*/
    ;

    public final native JsoStackLabels format(String format)
        throws RuntimeException /*-{
        this["format"] = format;
        return this;
    }-*/
    ;

    public final native double rotation()
        throws RuntimeException /*-{
        return this["rotation"] = (this["rotation"] || 0.0);
    }-*/
    ;

    public final native JsoStackLabels rotation(double rotation)
        throws RuntimeException /*-{
        this["rotation"] = rotation;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{ "color": "#000000", "fontSize": "11px", "fontWeight": "bold", "textShadow": "0 0 6px contrast, 00 3px contrast" }'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoStackLabels style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String textAlign()
        throws RuntimeException /*-{
        return this["textAlign"] = (this["textAlign"] || "null");
    }-*/
    ;

    public final native JsoStackLabels textAlign(String textAlign)
        throws RuntimeException /*-{
        this["textAlign"] = textAlign;
        return this;
    }-*/
    ;

    public final native boolean useHTML()
        throws RuntimeException /*-{
        return this["useHTML"] = (this["useHTML"] || false);
    }-*/
    ;

    public final native JsoStackLabels useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native String verticalAlign()
        throws RuntimeException /*-{
        return this["verticalAlign"] = (this["verticalAlign"] || "null");
    }-*/
    ;

    public final native JsoStackLabels verticalAlign(String verticalAlign)
        throws RuntimeException /*-{
        this["verticalAlign"] = verticalAlign;
        return this;
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || null);
    }-*/
    ;

    public final native JsoStackLabels x(double x)
        throws RuntimeException /*-{
        this["x"] = x;
        return this;
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || null);
    }-*/
    ;

    public final native JsoStackLabels y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoStackLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
