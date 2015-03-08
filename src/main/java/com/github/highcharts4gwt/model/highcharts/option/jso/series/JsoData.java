
package com.github.highcharts4gwt.model.highcharts.option.jso.series;

import com.github.highcharts4gwt.model.highcharts.option.api.series.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUpdateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.Marker;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * An array of data points for the series. The points can be given in three ways:
 *  <ol>
 *  	<li>An array of numerical values. In this case, the numerical values will 
 *  	be interpreted as y values, and x values will be automatically calculated,
 *  	either starting at 0 and incrementing by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the plotOptions. If the axis is
 *  	has categories, these will be used. This option is not available for range series. Example:
 * <pre>data: [0, 5, 3, 5]</pre>
 *  	</li>
 *  	<li><p>An array of arrays with two values. In this case, the first value is the
 *  	x value and the second is the y value. If the first value is a string, it is
 *  	applied as the name of the point, and the x value is incremented following
 *  	the above rules.</p>
 * <p>For range series, the arrays will be interpreted as <code>[x, low, high]</code>. In this cases, the X value can be skipped altogether to make use of <code>pointStart</code> and <code>pointRange</code>.</p>
 * 
 *  Example:
 * <pre>data: [[5, 2], [6, 3], [8, 2]]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. In this case the objects are
 *  	point configuration objects as seen below.</p>
 * 
 * <p>Range series values are given by <code>low</code> and <code>high</code>.</p>
 * 
 * Example:
 * <pre>data: [{
 * 	name: 'Point 1',
 * 	color: '#00FF00',
 * 	y: 0
 * }, {
 * 	name: 'Point 2',
 * 	color: '#FF00FF',
 * 	y: 5
 * }]</pre></li>
 *  </ol>
 * 
 * <p>Note that line series and derived types like spline and area, require data to be sorted by X because it interpolates mouse coordinates for the tooltip. Column and scatter series, where each point has its own mouse event, does not require sorting.</p>
 * 
 */
public class JsoData
    extends JavaScriptObject
    implements Data
{


    protected JsoData() {
    }

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "undefined");
    }-*/
    ;

    public final native JsoData color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native double colorValue()
        throws RuntimeException /*-{
        return this["colorValue"] = (this["colorValue"] || undefined);
    }-*/
    ;

    public final native JsoData colorValue(double colorValue)
        throws RuntimeException /*-{
        this["colorValue"] = colorValue;
        return this;
    }-*/
    ;

    public final native String dataLabels()
        throws RuntimeException /*-{
        this["dataLabels"] = (this["dataLabels"] || {});
        return JSON.stringify(this["dataLabels"]);
    }-*/
    ;

    public final native JsoData dataLabels(String dataLabelsAsJsonString)
        throws RuntimeException /*-{
        this["dataLabels"] = JSON.parse(dataLabelsAsJsonString);
        return this;
    }-*/
    ;

    public final native String drilldown()
        throws RuntimeException /*-{
        return this["drilldown"] = (this["drilldown"] || "");
    }-*/
    ;

    public final native JsoData drilldown(String drilldown)
        throws RuntimeException /*-{
        this["drilldown"] = drilldown;
        return this;
    }-*/
    ;

    public final native void addDataClickHandler(DataClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataClickHandler::onDataClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/series/data/DataClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addDataMouseOutHandler(DataMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataMouseOutHandler::onDataMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/series/data/DataMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addDataMouseOverHandler(DataMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataMouseOverHandler::onDataMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/series/data/DataMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addDataRemoveHandler(DataRemoveHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    remove: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataRemoveHandler::onDataRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/series/data/DataRemoveEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addDataSelectHandler(DataSelectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    select: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataSelectHandler::onDataSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/series/data/DataSelectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addDataUnselectHandler(DataUnselectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    unselect: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUnselectHandler::onDataUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/series/data/DataUnselectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addDataUpdateHandler(DataUpdateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    update: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUpdateHandler::onDataUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/series/data/DataUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "null");
    }-*/
    ;

    public final native JsoData id(String id)
        throws RuntimeException /*-{
        this["id"] = id;
        return this;
    }-*/
    ;

    public final native boolean isIntermediateSum()
        throws RuntimeException /*-{
        return this["isIntermediateSum"] = (this["isIntermediateSum"] || false);
    }-*/
    ;

    public final native JsoData isIntermediateSum(boolean isIntermediateSum)
        throws RuntimeException /*-{
        this["isIntermediateSum"] = isIntermediateSum;
        return this;
    }-*/
    ;

    public final native boolean isSum()
        throws RuntimeException /*-{
        return this["isSum"] = (this["isSum"] || false);
    }-*/
    ;

    public final native JsoData isSum(boolean isSum)
        throws RuntimeException /*-{
        this["isSum"] = isSum;
        return this;
    }-*/
    ;

    public final native double legendIndex()
        throws RuntimeException /*-{
        return this["legendIndex"] = (this["legendIndex"] || null);
    }-*/
    ;

    public final native JsoData legendIndex(double legendIndex)
        throws RuntimeException /*-{
        this["legendIndex"] = legendIndex;
        return this;
    }-*/
    ;

    public final native Marker marker()
        throws RuntimeException /*-{
        return this["marker"] = (this["marker"] || {});
    }-*/
    ;

    public final native JsoData marker(Marker marker)
        throws RuntimeException /*-{
        this["marker"] = marker;
        return this;
    }-*/
    ;

    public final native String name()
        throws RuntimeException /*-{
        return this["name"] = (this["name"] || "null");
    }-*/
    ;

    public final native JsoData name(String name)
        throws RuntimeException /*-{
        this["name"] = name;
        return this;
    }-*/
    ;

    public final native String parent()
        throws RuntimeException /*-{
        return this["parent"] = (this["parent"] || "undefined");
    }-*/
    ;

    public final native JsoData parent(String parent)
        throws RuntimeException /*-{
        this["parent"] = parent;
        return this;
    }-*/
    ;

    public final native boolean sliced()
        throws RuntimeException /*-{
        return this["sliced"] = (this["sliced"] || false);
    }-*/
    ;

    public final native JsoData sliced(boolean sliced)
        throws RuntimeException /*-{
        this["sliced"] = sliced;
        return this;
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || null);
    }-*/
    ;

    public final native JsoData x(double x)
        throws RuntimeException /*-{
        this["x"] = x;
        return this;
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || null);
    }-*/
    ;

    public final native JsoData y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoData setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
