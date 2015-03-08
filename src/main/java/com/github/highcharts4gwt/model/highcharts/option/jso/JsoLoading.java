
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Loading;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * The loading options control the appearance of the loading screen that covers the 
 * 	plot area on chart operations. This screen only appears after an explicit call
 * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
 * 	to the end user that something is going on, for example while retrieving new data
 * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
 * 	object, but part of the <code>lang</code> object.
 * 
 */
public class JsoLoading
    extends JavaScriptObject
    implements Loading
{


    protected JsoLoading() {
    }

    public final native double hideDuration()
        throws RuntimeException /*-{
        return this["hideDuration"] = (this["hideDuration"] || 100.0);
    }-*/
    ;

    public final native JsoLoading hideDuration(double hideDuration)
        throws RuntimeException /*-{
        this["hideDuration"] = hideDuration;
        return this;
    }-*/
    ;

    public final native String labelStyle()
        throws RuntimeException /*-{
        this["labelStyle"] = (this["labelStyle"] || JSON.parse('{ "fontWeight": "bold", "position": "relative", "top": "45%" }'));
        return JSON.stringify(this["labelStyle"]);
    }-*/
    ;

    public final native JsoLoading labelStyle(String labelStyleAsJsonString)
        throws RuntimeException /*-{
        this["labelStyle"] = JSON.parse(labelStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native double showDuration()
        throws RuntimeException /*-{
        return this["showDuration"] = (this["showDuration"] || 100.0);
    }-*/
    ;

    public final native JsoLoading showDuration(double showDuration)
        throws RuntimeException /*-{
        this["showDuration"] = showDuration;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoLoading style(String styleAsJsonString)
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

    public final native JsoLoading setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
