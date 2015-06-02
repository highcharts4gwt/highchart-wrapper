
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn.data;

import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.data.Events;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Individual point events
 * 
 */
public class JsoEvents
    extends JavaScriptObject
    implements Events
{


    protected JsoEvents() {
    }

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoEvents setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoEvents setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
