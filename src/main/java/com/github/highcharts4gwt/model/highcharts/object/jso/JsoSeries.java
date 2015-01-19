
package com.github.highcharts4gwt.model.highcharts.object.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoSeries
    extends JavaScriptObject
    implements Series
{


    protected JsoSeries() {
    }

    public final native String name()
        throws RuntimeException /*-{
        return this["name"] = (this["name"] || "null");
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native String type()
        throws RuntimeException /*-{
        return this["type"] = (this["type"] || "null");
    }-*/
    ;

    public final native boolean visible()
        throws RuntimeException /*-{
        return this["visible"] = (this["visible"] || false);
    }-*/
    ;

    public final native Chart chart()
        throws RuntimeException /*-{
        return this["chart"] = (this["chart"] || {});
    }-*/
    ;

    public final native Array<Point> data()
        throws RuntimeException /*-{
        return this["data"] = (this["data"] || []);
    }-*/
    ;

    public final native Axis xAxis()
        throws RuntimeException /*-{
        return this["xAxis"] = (this["xAxis"] || {});
    }-*/
    ;

    public final native Axis yAxis()
        throws RuntimeException /*-{
        return this["yAxis"] = (this["yAxis"] || {});
    }-*/
    ;

}
