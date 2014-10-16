
package com.usesoft.highcharts4gwt.model.highcharts.jso.legend;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.legend.Title;

public class JsoTitle
    extends JavaScriptObject
    implements Title
{


    protected JsoTitle() {
    }

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse(''));
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

}
