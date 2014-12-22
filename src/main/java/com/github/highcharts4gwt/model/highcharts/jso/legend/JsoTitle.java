
package com.github.highcharts4gwt.model.highcharts.jso.legend;

import com.github.highcharts4gwt.model.highcharts.api.legend.Title;
import com.google.gwt.core.client.JavaScriptObject;

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

}
