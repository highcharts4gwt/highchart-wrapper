
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.UpdateHandler;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * An array of data points for the series. For the <code>boxplot</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li><p>An array of arrays with 6 or 5 values. In this case, the values correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string, it is
 *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 5. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the series options.</p>
 * <pre>data: [
 *     [0, 3, 0, 10, 3, 5], 
 *     [1, 7, 8, 7, 2, 9], 
 *     [2, 6, 9, 5, 1, 3]
 * ]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<boxplot>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     x: 1,
 *     low: 4,
 *     q1: 9,
 *     median: 9,
 *     q3: 1,
 *     high: 10,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     x: 1,
 *     low: 5,
 *     q1: 7,
 *     median: 3,
 *     q3: 6,
 *     high: 2,
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

    public final native void addClickHandler(ClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.ClickHandler::onClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/data/ClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOutHandler(MouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.MouseOutHandler::onMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/data/MouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOverHandler(MouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.MouseOverHandler::onMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/data/MouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addRemoveHandler(RemoveHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    remove: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.RemoveHandler::onRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/data/RemoveEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSelectHandler(SelectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    select: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.SelectHandler::onSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/data/SelectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addUnselectHandler(UnselectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    unselect: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.UnselectHandler::onUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/data/UnselectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addUpdateHandler(UpdateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    update: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.UpdateHandler::onUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/data/UpdateEvent;)(
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

    public final native double median()
        throws RuntimeException /*-{
        return this["median"] = (this["median"] || null);
    }-*/
    ;

    public final native JsoData median(double median)
        throws RuntimeException /*-{
        this["median"] = median;
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

    public final native double q1()
        throws RuntimeException /*-{
        return this["q1"] = (this["q1"] || null);
    }-*/
    ;

    public final native JsoData q1(double q1)
        throws RuntimeException /*-{
        this["q1"] = q1;
        return this;
    }-*/
    ;

    public final native double q3()
        throws RuntimeException /*-{
        return this["q3"] = (this["q3"] || null);
    }-*/
    ;

    public final native JsoData q3(double q3)
        throws RuntimeException /*-{
        this["q3"] = q3;
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
