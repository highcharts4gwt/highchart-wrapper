
package com.usesoft.highcharts4gwt.model.highcharts.jso.chart.options3d.frame;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Back;

public class JsoBack
    extends JavaScriptObject
    implements Back
{


    protected JsoBack() {
    }

    public final native Number size()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || 1.0);
    }-*/
    ;

    public final native JsoBack size(Number size)
        throws RuntimeException /*-{
        this["size"] = size;
        return this;
    }-*/
    ;

}