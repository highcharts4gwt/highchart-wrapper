
package com.github.highcharts4gwt.model.highcharts.object.jso;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>The Point object is the JavaScript representation of each data point</p><p>The object can be accessed in a number of ways. In all point event handlers the point object is <code>this</code>. In the <code>series</code> object all the points are accessed by the <code>series.data</code> array.</p><p>Another way to reference the point programmatically is by id. Add an id in the point configuration options, and get the point object by <code>chart.get(id)</code>.</p>
 * 
 */
public class JsoPoint
    extends JavaScriptObject
    implements Point
{


    protected JsoPoint() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this["series"] = (this["series"] || {});
    }-*/
    ;

    public final native double percentage()
        throws RuntimeException /*-{
        return this["percentage"] = (this["percentage"] || null);
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || null);
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || null);
    }-*/
    ;

    public final native String categoryAsString()
        throws RuntimeException /*-{
        return this["category"] = (this["category"] || "null");
    }-*/
    ;

    public final native double categoryAsNumber()
        throws RuntimeException /*-{
        return this["category"] = (this["category"] || null);
    }-*/
    ;

}
