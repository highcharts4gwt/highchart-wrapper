
package com.github.highcharts4gwt.model.highcharts.option.jso.labels;

import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * A HTML label that can be positioned anywhere in the chart area.
 * 
 */
public class JsoItem
    extends JavaScriptObject
    implements Item
{


    protected JsoItem() {
    }

    public final native String html()
        throws RuntimeException /*-{
        return this["html"] = (this["html"] || "null");
    }-*/
    ;

    public final native JsoItem html(String html)
        throws RuntimeException /*-{
        this["html"] = html;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoItem style(String styleAsJsonString)
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

    public final native JsoItem setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoItem setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
