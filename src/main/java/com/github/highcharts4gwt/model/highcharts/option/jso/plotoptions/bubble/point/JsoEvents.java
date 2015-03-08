
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bubble.point;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.Events;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Events for each single point
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

}
