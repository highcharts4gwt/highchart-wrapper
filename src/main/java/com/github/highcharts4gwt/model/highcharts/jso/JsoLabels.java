
package com.github.highcharts4gwt.model.highcharts.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.api.Labels;
import com.github.highcharts4gwt.model.highcharts.api.labels.Item;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoLabels
    extends JavaScriptObject
    implements Labels
{


    protected JsoLabels() {
    }

    public final native Array<Item> items()
        throws RuntimeException /*-{
        return this["items"] = (this["items"] || []);
    }-*/
    ;

    public final native JsoLabels items(Array<Item> items)
        throws RuntimeException /*-{
        this["items"] = items;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || {});
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoLabels style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

}