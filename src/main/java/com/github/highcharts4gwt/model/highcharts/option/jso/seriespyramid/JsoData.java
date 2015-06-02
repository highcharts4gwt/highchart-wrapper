
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataUpdateHandler;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * An array of data points for the series. For the <code>pyramid</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li>An array of numerical values. In this case, the numerical values will 
 *  	be interpreted as <code>y</code> options.  Example:
 * <pre>data: [0, 5, 3, 5]</pre>
 *  	</li>
 *  <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pyramid>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     y: 6,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     y: 7,
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataClickHandler::onDataClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/data/DataClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataMouseOutHandler::onDataMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/data/DataMouseOutEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataMouseOverHandler::onDataMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/data/DataMouseOverEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataRemoveHandler::onDataRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/data/DataRemoveEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataSelectHandler::onDataSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/data/DataSelectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataUnselectHandler::onDataUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/data/DataUnselectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataUpdateHandler::onDataUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/data/DataUpdateEvent;)(
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
