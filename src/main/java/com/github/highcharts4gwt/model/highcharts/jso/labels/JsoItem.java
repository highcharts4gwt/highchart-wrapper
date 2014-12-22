
package com.github.highcharts4gwt.model.highcharts.jso.labels;

import com.github.highcharts4gwt.model.highcharts.api.labels.Item;
import com.google.gwt.core.client.JavaScriptObject;

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

}
