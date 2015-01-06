
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Loading;
import com.google.gwt.core.client.JavaScriptObject;

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

}
