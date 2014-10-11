
package com.usesoft.highcharts4gwt.model.highcharts.jso;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.Loading;

public class JsoLoading
    extends JavaScriptObject
    implements Loading
{


    protected JsoLoading() {
    }

    public final native Number hideDuration()
        throws RuntimeException /*-{
        return this["hideDuration"] = (this["hideDuration"] || 100.0);
    }-*/
    ;

    public final native JsoLoading hideDuration(Number hideDuration)
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

    public final native JsoLoading labelStyle(String labelStyle)
        throws RuntimeException /*-{
        this["labelStyle"] = JSON.parse(labelStyle);
        return this;
    }-*/
    ;

    public final native Number showDuration()
        throws RuntimeException /*-{
        return this["showDuration"] = (this["showDuration"] || 100.0);
    }-*/
    ;

    public final native JsoLoading showDuration(Number showDuration)
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

    public final native JsoLoading style(String style)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(style);
        return this;
    }-*/
    ;

}
