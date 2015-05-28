
package com.github.highcharts4gwt.model.highcharts.option.jso.legend;

import com.github.highcharts4gwt.model.highcharts.option.api.legend.Title;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * A title to be added on top of the legend.
 * 
 */
public class JsoTitle
    extends JavaScriptObject
    implements Title
{


    protected JsoTitle() {
    }

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{"fontWeight":"bold"}'));
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
        return this["text"] = (this["text"] || "null");
    }-*/
    ;

    public final native JsoTitle text(String text)
        throws RuntimeException /*-{
        this["text"] = text;
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
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
