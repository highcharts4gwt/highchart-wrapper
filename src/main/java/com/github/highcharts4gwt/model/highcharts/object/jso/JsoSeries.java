
package com.github.highcharts4gwt.model.highcharts.object.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>The Series object is the JavaScript representation of each line, area series, pie etc.</p><p>The object can be accessed in a number of ways. All series and point event handlers give a reference to the series object. The <code>chart</code> object has a <code>series</code> property that is a collection of all the chart's series. The <code>point</code> objects also have the same reference.</p><p>Another way to reference the series programmatically is by id. Add an id in the series configuration options, and get the series object by <code>chart.get(id)</code>.</p><p>Configuration options for the series are given in three levels. Options for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series of a specific type are given in the plotOptions of that type, for example plotOptions.line. Next, options for one single series are given in <a class="internal" href="#series">the series array</a>.</p>
 * 
 */
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
