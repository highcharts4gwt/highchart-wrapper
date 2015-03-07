
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Break;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoBreak
    extends JavaScriptObject
    implements Break
{


    protected JsoBreak() {
    }

    public final native double breakSize()
        throws RuntimeException /*-{
        return this["breakSize"] = (this["breakSize"] || 0.0);
    }-*/
    ;

    public final native JsoBreak breakSize(double breakSize)
        throws RuntimeException /*-{
        this["breakSize"] = breakSize;
        return this;
    }-*/
    ;

    public final native double from()
        throws RuntimeException /*-{
        return this["from"] = (this["from"] || '');
    }-*/
    ;

    public final native JsoBreak from(double from)
        throws RuntimeException /*-{
        this["from"] = from;
        return this;
    }-*/
    ;

    public final native double repeat()
        throws RuntimeException /*-{
        return this["repeat"] = (this["repeat"] || 0.0);
    }-*/
    ;

    public final native JsoBreak repeat(double repeat)
        throws RuntimeException /*-{
        this["repeat"] = repeat;
        return this;
    }-*/
    ;

    public final native double to()
        throws RuntimeException /*-{
        return this["to"] = (this["to"] || '');
    }-*/
    ;

    public final native JsoBreak to(double to)
        throws RuntimeException /*-{
        this["to"] = to;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoBreak setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
