
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Title;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * The chart's main title.
 * 
 */
public class JsoTitle
    extends JavaScriptObject
    implements Title
{


    protected JsoTitle() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "center");
    }-*/
    ;

    public final native JsoTitle align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native boolean floating()
        throws RuntimeException /*-{
        return this["floating"] = (this["floating"] || false);
    }-*/
    ;

    public final native JsoTitle floating(boolean floating)
        throws RuntimeException /*-{
        this["floating"] = floating;
        return this;
    }-*/
    ;

    public final native double margin()
        throws RuntimeException /*-{
        return this["margin"] = (this["margin"] || 15.0);
    }-*/
    ;

    public final native JsoTitle margin(double margin)
        throws RuntimeException /*-{
        this["margin"] = margin;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{ "color": "#333333", "fontSize": "18px" }'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoTitle style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String text()
        throws RuntimeException /*-{
        return this["text"] = (this["text"] || "Chart title");
    }-*/
    ;

    public final native JsoTitle text(String text)
        throws RuntimeException /*-{
        this["text"] = text;
        return this;
    }-*/
    ;

    public final native boolean useHTML()
        throws RuntimeException /*-{
        return this["useHTML"] = (this["useHTML"] || false);
    }-*/
    ;

    public final native JsoTitle useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native String verticalAlign()
        throws RuntimeException /*-{
        return this["verticalAlign"] = (this["verticalAlign"] || "");
    }-*/
    ;

    public final native JsoTitle verticalAlign(String verticalAlign)
        throws RuntimeException /*-{
        this["verticalAlign"] = verticalAlign;
        return this;
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || 0.0);
    }-*/
    ;

    public final native JsoTitle x(double x)
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

    public final native JsoTitle y(double y)
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

    public final native JsoTitle setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoTitle setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + valueToBeEvaluated + ')');
        return this;
    }-*/
    ;

}
