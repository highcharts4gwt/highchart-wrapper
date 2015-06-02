
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataUpdateHandler;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * An array of data points for the series. For the <code>columnrange</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,low,high</code>. If the first value is a string, it is
 *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the series options.</p>
 * <pre>data: [
 *     [0, 4, 2], 
 *     [1, 2, 1], 
 *     [2, 9, 10]
 * ]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<columnrange>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     x: 1,
 *     low: 0,
 *     high: 4,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     x: 1,
 *     low: 5,
 *     high: 3,
 *     name: "Point1",
 *     color: "#FF00FF"
 * }]</pre></li>
 *  </ol>
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataClickHandler::onDataClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriescolumnrange/data/DataClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataMouseOutHandler::onDataMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriescolumnrange/data/DataMouseOutEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataMouseOverHandler::onDataMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriescolumnrange/data/DataMouseOverEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataRemoveHandler::onDataRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriescolumnrange/data/DataRemoveEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataSelectHandler::onDataSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriescolumnrange/data/DataSelectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataUnselectHandler::onDataUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriescolumnrange/data/DataUnselectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.data.DataUpdateHandler::onDataUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriescolumnrange/data/DataUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double high()
        throws RuntimeException /*-{
        return this["high"] = (this["high"] || null);
    }-*/
    ;

    public final native JsoData high(double high)
        throws RuntimeException /*-{
        this["high"] = high;
        return this;
    }-*/
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

    public final native double low()
        throws RuntimeException /*-{
        return this["low"] = (this["low"] || null);
    }-*/
    ;

    public final native JsoData low(double low)
        throws RuntimeException /*-{
        this["low"] = low;
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

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoData selected(boolean selected)
        throws RuntimeException /*-{
        this["selected"] = selected;
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

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoData setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
