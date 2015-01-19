
package com.github.highcharts4gwt.model.highcharts.object.jso;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoChart
    extends JavaScriptObject
    implements Chart
{


    protected JsoChart() {
    }

    public final native com.github.highcharts4gwt.model.array.api.Array<Axis> xAxis()
        throws RuntimeException /*-{
        return this["xAxis"] = (this["xAxis"] || []);
    }-*/
    ;

    public final native com.github.highcharts4gwt.model.array.api.Array<Axis> yAxis()
        throws RuntimeException /*-{
        return this["yAxis"] = (this["yAxis"] || []);
    }-*/
    ;

    public final native com.github.highcharts4gwt.model.array.api.Array<Series> series()
        throws RuntimeException /*-{
        return this["series"] = (this["series"] || []);
    }-*/
    ;

}
