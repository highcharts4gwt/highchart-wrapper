
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesHeatmap;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>heatmap</code> series. If the <a href="#series<heatmap>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.heatmap">plotOptions.heatmap</a>.</p>
 * 
 */
public class JsoSeriesHeatmap
    extends JavaScriptObject
    implements SeriesHeatmap
{


    protected JsoSeriesHeatmap() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesHeatmap allowPointSelect(boolean allowPointSelect)
        throws RuntimeException /*-{
        this["allowPointSelect"] = allowPointSelect;
        return this;
    }-*/
    ;

    public final native boolean animation()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoSeriesHeatmap animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoSeriesHeatmap borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderRadius()
        throws RuntimeException /*-{
        return this["borderRadius"] = (this["borderRadius"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap borderRadius(double borderRadius)
        throws RuntimeException /*-{
        this["borderRadius"] = borderRadius;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoSeriesHeatmap color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native boolean colorByPoint()
        throws RuntimeException /*-{
        return this["colorByPoint"] = (this["colorByPoint"] || false);
    }-*/
    ;

    public final native JsoSeriesHeatmap colorByPoint(boolean colorByPoint)
        throws RuntimeException /*-{
        this["colorByPoint"] = colorByPoint;
        return this;
    }-*/
    ;

    public final native ArrayString colors()
        throws RuntimeException /*-{
        return this["colors"] = (this["colors"] || []);
    }-*/
    ;

    public final native JsoSeriesHeatmap colors(ArrayString colors)
        throws RuntimeException /*-{
        this["colors"] = colors;
        return this;
    }-*/
    ;

    public final native double colsize()
        throws RuntimeException /*-{
        return this["colsize"] = (this["colsize"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap colsize(double colsize)
        throws RuntimeException /*-{
        this["colsize"] = colsize;
        return this;
    }-*/
    ;

    public final native double cropThreshold()
        throws RuntimeException /*-{
        return this["cropThreshold"] = (this["cropThreshold"] || 50.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap cropThreshold(double cropThreshold)
        throws RuntimeException /*-{
        this["cropThreshold"] = cropThreshold;
        return this;
    }-*/
    ;

    public final native String cursor()
        throws RuntimeException /*-{
        return this["cursor"] = (this["cursor"] || "null");
    }-*/
    ;

    public final native JsoSeriesHeatmap cursor(String cursor)
        throws RuntimeException /*-{
        this["cursor"] = cursor;
        return this;
    }-*/
    ;

    public final native Array<Data> dataAsArrayObject()
        throws RuntimeException /*-{
        return this["data"] = (this["data"] || []);
    }-*/
    ;

    public final native JsoSeriesHeatmap dataAsArrayObject(Array<Data> dataAsArrayObject)
        throws RuntimeException /*-{
        this["data"] = dataAsArrayObject;
        return this;
    }-*/
    ;

    public final native DataLabels dataLabels()
        throws RuntimeException /*-{
        return this["dataLabels"] = (this["dataLabels"] || {});
    }-*/
    ;

    public final native JsoSeriesHeatmap dataLabels(DataLabels dataLabels)
        throws RuntimeException /*-{
        this["dataLabels"] = dataLabels;
        return this;
    }-*/
    ;

    public final native boolean enableMouseTracking()
        throws RuntimeException /*-{
        return this["enableMouseTracking"] = (this["enableMouseTracking"] || true);
    }-*/
    ;

    public final native JsoSeriesHeatmap enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesHeatmapAfterAnimateHandler(SeriesHeatmapAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapAfterAnimateHandler::onSeriesHeatmapAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesHeatmapCheckboxClickHandler(SeriesHeatmapCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapCheckboxClickHandler::onSeriesHeatmapCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesHeatmapClickHandler(SeriesHeatmapClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapClickHandler::onSeriesHeatmapClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesHeatmapHideHandler(SeriesHeatmapHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapHideHandler::onSeriesHeatmapHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesHeatmapLegendItemClickHandler(SeriesHeatmapLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapLegendItemClickHandler::onSeriesHeatmapLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesHeatmapMouseOutHandler(SeriesHeatmapMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapMouseOutHandler::onSeriesHeatmapMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesHeatmapMouseOverHandler(SeriesHeatmapMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapMouseOverHandler::onSeriesHeatmapMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesHeatmapShowHandler(SeriesHeatmapShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    heatmapShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapShowHandler::onSeriesHeatmapShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesheatmap/SeriesHeatmapShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "");
    }-*/
    ;

    public final native JsoSeriesHeatmap id(String id)
        throws RuntimeException /*-{
        this["id"] = id;
        return this;
    }-*/
    ;

    public final native double index()
        throws RuntimeException /*-{
        return this["index"] = (this["index"] || null);
    }-*/
    ;

    public final native JsoSeriesHeatmap index(double index)
        throws RuntimeException /*-{
        this["index"] = index;
        return this;
    }-*/
    ;

    public final native ArrayString keys()
        throws RuntimeException /*-{
        return this["keys"] = (this["keys"] || []);
    }-*/
    ;

    public final native JsoSeriesHeatmap keys(ArrayString keys)
        throws RuntimeException /*-{
        this["keys"] = keys;
        return this;
    }-*/
    ;

    public final native double legendIndex()
        throws RuntimeException /*-{
        return this["legendIndex"] = (this["legendIndex"] || null);
    }-*/
    ;

    public final native JsoSeriesHeatmap legendIndex(double legendIndex)
        throws RuntimeException /*-{
        this["legendIndex"] = legendIndex;
        return this;
    }-*/
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || "");
    }-*/
    ;

    public final native JsoSeriesHeatmap linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native String name()
        throws RuntimeException /*-{
        return this["name"] = (this["name"] || "null");
    }-*/
    ;

    public final native JsoSeriesHeatmap name(String name)
        throws RuntimeException /*-{
        this["name"] = name;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoSeriesHeatmap point(Point point)
        throws RuntimeException /*-{
        this["point"] = point;
        return this;
    }-*/
    ;

    public final native double rowsize()
        throws RuntimeException /*-{
        return this["rowsize"] = (this["rowsize"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap rowsize(double rowsize)
        throws RuntimeException /*-{
        this["rowsize"] = rowsize;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoSeriesHeatmap selected(boolean selected)
        throws RuntimeException /*-{
        this["selected"] = selected;
        return this;
    }-*/
    ;

    public final native boolean shadowAsBoolean()
        throws RuntimeException /*-{
        return this["shadow"] = (this["shadow"] || false);
    }-*/
    ;

    public final native JsoSeriesHeatmap shadowAsBoolean(boolean shadowAsBoolean)
        throws RuntimeException /*-{
        this["shadow"] = shadowAsBoolean;
        return this;
    }-*/
    ;

    public final native String shadowAsJsonString()
        throws RuntimeException /*-{
        this["shadow"] = (this["shadow"] || JSON.parse('false'));
        return JSON.stringify(this["shadow"]);
    }-*/
    ;

    public final native JsoSeriesHeatmap shadowAsJsonString(String shadowAsJsonString)
        throws RuntimeException /*-{
        this["shadow"] = JSON.parse(shadowAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean showCheckbox()
        throws RuntimeException /*-{
        return this["showCheckbox"] = (this["showCheckbox"] || false);
    }-*/
    ;

    public final native JsoSeriesHeatmap showCheckbox(boolean showCheckbox)
        throws RuntimeException /*-{
        this["showCheckbox"] = showCheckbox;
        return this;
    }-*/
    ;

    public final native boolean showInLegend()
        throws RuntimeException /*-{
        return this["showInLegend"] = (this["showInLegend"] || true);
    }-*/
    ;

    public final native JsoSeriesHeatmap showInLegend(boolean showInLegend)
        throws RuntimeException /*-{
        this["showInLegend"] = showInLegend;
        return this;
    }-*/
    ;

    public final native States states()
        throws RuntimeException /*-{
        return this["states"] = (this["states"] || {});
    }-*/
    ;

    public final native JsoSeriesHeatmap states(States states)
        throws RuntimeException /*-{
        this["states"] = states;
        return this;
    }-*/
    ;

    public final native boolean stickyTracking()
        throws RuntimeException /*-{
        return this["stickyTracking"] = (this["stickyTracking"] || true);
    }-*/
    ;

    public final native JsoSeriesHeatmap stickyTracking(boolean stickyTracking)
        throws RuntimeException /*-{
        this["stickyTracking"] = stickyTracking;
        return this;
    }-*/
    ;

    public final native Tooltip tooltip()
        throws RuntimeException /*-{
        return this["tooltip"] = (this["tooltip"] || {});
    }-*/
    ;

    public final native JsoSeriesHeatmap tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native double turboThreshold()
        throws RuntimeException /*-{
        return this["turboThreshold"] = (this["turboThreshold"] || 1000.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap turboThreshold(double turboThreshold)
        throws RuntimeException /*-{
        this["turboThreshold"] = turboThreshold;
        return this;
    }-*/
    ;

    public final native String type()
        throws RuntimeException /*-{
        return this["type"] = (this["type"] || "null");
    }-*/
    ;

    public final native JsoSeriesHeatmap type(String type)
        throws RuntimeException /*-{
        this["type"] = type;
        return this;
    }-*/
    ;

    public final native boolean visible()
        throws RuntimeException /*-{
        return this["visible"] = (this["visible"] || true);
    }-*/
    ;

    public final native JsoSeriesHeatmap visible(boolean visible)
        throws RuntimeException /*-{
        this["visible"] = visible;
        return this;
    }-*/
    ;

    public final native double xAxisAsNumber()
        throws RuntimeException /*-{
        return this["xAxis"] = (this["xAxis"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap xAxisAsNumber(double xAxisAsNumber)
        throws RuntimeException /*-{
        this["xAxis"] = xAxisAsNumber;
        return this;
    }-*/
    ;

    public final native String xAxisAsString()
        throws RuntimeException /*-{
        return this["xAxis"] = (this["xAxis"] || "0");
    }-*/
    ;

    public final native JsoSeriesHeatmap xAxisAsString(String xAxisAsString)
        throws RuntimeException /*-{
        this["xAxis"] = xAxisAsString;
        return this;
    }-*/
    ;

    public final native double yAxisAsNumber()
        throws RuntimeException /*-{
        return this["yAxis"] = (this["yAxis"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesHeatmap yAxisAsNumber(double yAxisAsNumber)
        throws RuntimeException /*-{
        this["yAxis"] = yAxisAsNumber;
        return this;
    }-*/
    ;

    public final native String yAxisAsString()
        throws RuntimeException /*-{
        return this["yAxis"] = (this["yAxis"] || "0");
    }-*/
    ;

    public final native JsoSeriesHeatmap yAxisAsString(String yAxisAsString)
        throws RuntimeException /*-{
        this["yAxis"] = yAxisAsString;
        return this;
    }-*/
    ;

    public final native double zIndex()
        throws RuntimeException /*-{
        return this["zIndex"] = (this["zIndex"] || '');
    }-*/
    ;

    public final native JsoSeriesHeatmap zIndex(double zIndex)
        throws RuntimeException /*-{
        this["zIndex"] = zIndex;
        return this;
    }-*/
    ;

    public final native String zoneAxis()
        throws RuntimeException /*-{
        return this["zoneAxis"] = (this["zoneAxis"] || "y");
    }-*/
    ;

    public final native JsoSeriesHeatmap zoneAxis(String zoneAxis)
        throws RuntimeException /*-{
        this["zoneAxis"] = zoneAxis;
        return this;
    }-*/
    ;

    public final native ArrayNumber zones()
        throws RuntimeException /*-{
        return this["zones"] = (this["zones"] || []);
    }-*/
    ;

    public final native JsoSeriesHeatmap zones(ArrayNumber zones)
        throws RuntimeException /*-{
        this["zones"] = zones;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoSeriesHeatmap setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesHeatmap setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
