
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesArea;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>area</code> series. If the <a href="#series<area>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.area">plotOptions.area</a>.</p>
 * 
 */
public class JsoSeriesArea
    extends JavaScriptObject
    implements SeriesArea
{


    protected JsoSeriesArea() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesArea allowPointSelect(boolean allowPointSelect)
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

    public final native JsoSeriesArea animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native boolean connectEnds()
        throws RuntimeException /*-{
        return this["connectEnds"] = (this["connectEnds"] || true);
    }-*/
    ;

    public final native JsoSeriesArea connectEnds(boolean connectEnds)
        throws RuntimeException /*-{
        this["connectEnds"] = connectEnds;
        return this;
    }-*/
    ;

    public final native boolean connectNulls()
        throws RuntimeException /*-{
        return this["connectNulls"] = (this["connectNulls"] || false);
    }-*/
    ;

    public final native JsoSeriesArea connectNulls(boolean connectNulls)
        throws RuntimeException /*-{
        this["connectNulls"] = connectNulls;
        return this;
    }-*/
    ;

    public final native double cropThreshold()
        throws RuntimeException /*-{
        return this["cropThreshold"] = (this["cropThreshold"] || 300.0);
    }-*/
    ;

    public final native JsoSeriesArea cropThreshold(double cropThreshold)
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

    public final native JsoSeriesArea cursor(String cursor)
        throws RuntimeException /*-{
        this["cursor"] = cursor;
        return this;
    }-*/
    ;

    public final native String dashStyle()
        throws RuntimeException /*-{
        return this["dashStyle"] = (this["dashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoSeriesArea dashStyle(String dashStyle)
        throws RuntimeException /*-{
        this["dashStyle"] = dashStyle;
        return this;
    }-*/
    ;

    public final native Array<Data> dataAsArrayObject()
        throws RuntimeException /*-{
        return this["data"] = (this["data"] || []);
    }-*/
    ;

    public final native JsoSeriesArea dataAsArrayObject(Array<Data> dataAsArrayObject)
        throws RuntimeException /*-{
        this["data"] = dataAsArrayObject;
        return this;
    }-*/
    ;

    public final native ArrayNumber dataAsArrayNumber()
        throws RuntimeException /*-{
        return this["data"] = (this["data"] || []);
    }-*/
    ;

    public final native JsoSeriesArea dataAsArrayNumber(ArrayNumber dataAsArrayNumber)
        throws RuntimeException /*-{
        this["data"] = dataAsArrayNumber;
        return this;
    }-*/
    ;

    public final native DataLabels dataLabels()
        throws RuntimeException /*-{
        return this["dataLabels"] = (this["dataLabels"] || {});
    }-*/
    ;

    public final native JsoSeriesArea dataLabels(DataLabels dataLabels)
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

    public final native JsoSeriesArea enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesAreaAfterAnimateHandler(SeriesAreaAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaAfterAnimateHandler::onSeriesAreaAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreaCheckboxClickHandler(SeriesAreaCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaCheckboxClickHandler::onSeriesAreaCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreaClickHandler(SeriesAreaClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaClickHandler::onSeriesAreaClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreaHideHandler(SeriesAreaHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaHideHandler::onSeriesAreaHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreaLegendItemClickHandler(SeriesAreaLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaLegendItemClickHandler::onSeriesAreaLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreaMouseOutHandler(SeriesAreaMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaMouseOutHandler::onSeriesAreaMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreaMouseOverHandler(SeriesAreaMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaMouseOverHandler::onSeriesAreaMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreaShowHandler(SeriesAreaShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areaShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaShowHandler::onSeriesAreaShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/SeriesAreaShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native double fillOpacity()
        throws RuntimeException /*-{
        return this["fillOpacity"] = (this["fillOpacity"] || 0.75);
    }-*/
    ;

    public final native JsoSeriesArea fillOpacity(double fillOpacity)
        throws RuntimeException /*-{
        this["fillOpacity"] = fillOpacity;
        return this;
    }-*/
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "");
    }-*/
    ;

    public final native JsoSeriesArea id(String id)
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

    public final native JsoSeriesArea index(double index)
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

    public final native JsoSeriesArea keys(ArrayString keys)
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

    public final native JsoSeriesArea legendIndex(double legendIndex)
        throws RuntimeException /*-{
        this["legendIndex"] = legendIndex;
        return this;
    }-*/
    ;

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 2.0);
    }-*/
    ;

    public final native JsoSeriesArea lineWidth(double lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || "");
    }-*/
    ;

    public final native JsoSeriesArea linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native Marker marker()
        throws RuntimeException /*-{
        return this["marker"] = (this["marker"] || {});
    }-*/
    ;

    public final native JsoSeriesArea marker(Marker marker)
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

    public final native JsoSeriesArea name(String name)
        throws RuntimeException /*-{
        this["name"] = name;
        return this;
    }-*/
    ;

    public final native String negativeColor()
        throws RuntimeException /*-{
        return this["negativeColor"] = (this["negativeColor"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea negativeColor(String negativeColor)
        throws RuntimeException /*-{
        this["negativeColor"] = negativeColor;
        return this;
    }-*/
    ;

    public final native String negativeFillColor()
        throws RuntimeException /*-{
        return this["negativeFillColor"] = (this["negativeFillColor"] || "");
    }-*/
    ;

    public final native JsoSeriesArea negativeFillColor(String negativeFillColor)
        throws RuntimeException /*-{
        this["negativeFillColor"] = negativeFillColor;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoSeriesArea point(Point point)
        throws RuntimeException /*-{
        this["point"] = point;
        return this;
    }-*/
    ;

    public final native double pointInterval()
        throws RuntimeException /*-{
        return this["pointInterval"] = (this["pointInterval"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesArea pointInterval(double pointInterval)
        throws RuntimeException /*-{
        this["pointInterval"] = pointInterval;
        return this;
    }-*/
    ;

    public final native String pointIntervalUnit()
        throws RuntimeException /*-{
        return this["pointIntervalUnit"] = (this["pointIntervalUnit"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea pointIntervalUnit(String pointIntervalUnit)
        throws RuntimeException /*-{
        this["pointIntervalUnit"] = pointIntervalUnit;
        return this;
    }-*/
    ;

    public final native String pointPlacementAsString()
        throws RuntimeException /*-{
        return this["pointPlacement"] = (this["pointPlacement"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea pointPlacementAsString(String pointPlacementAsString)
        throws RuntimeException /*-{
        this["pointPlacement"] = pointPlacementAsString;
        return this;
    }-*/
    ;

    public final native double pointPlacementAsNumber()
        throws RuntimeException /*-{
        return this["pointPlacement"] = (this["pointPlacement"] || null);
    }-*/
    ;

    public final native JsoSeriesArea pointPlacementAsNumber(double pointPlacementAsNumber)
        throws RuntimeException /*-{
        this["pointPlacement"] = pointPlacementAsNumber;
        return this;
    }-*/
    ;

    public final native double pointStart()
        throws RuntimeException /*-{
        return this["pointStart"] = (this["pointStart"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesArea pointStart(double pointStart)
        throws RuntimeException /*-{
        this["pointStart"] = pointStart;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoSeriesArea selected(boolean selected)
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

    public final native JsoSeriesArea shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoSeriesArea shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoSeriesArea showCheckbox(boolean showCheckbox)
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

    public final native JsoSeriesArea showInLegend(boolean showInLegend)
        throws RuntimeException /*-{
        this["showInLegend"] = showInLegend;
        return this;
    }-*/
    ;

    public final native String stack()
        throws RuntimeException /*-{
        return this["stack"] = (this["stack"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea stack(String stack)
        throws RuntimeException /*-{
        this["stack"] = stack;
        return this;
    }-*/
    ;

    public final native String stacking()
        throws RuntimeException /*-{
        return this["stacking"] = (this["stacking"] || "null");
    }-*/
    ;

    public final native JsoSeriesArea stacking(String stacking)
        throws RuntimeException /*-{
        this["stacking"] = stacking;
        return this;
    }-*/
    ;

    public final native States states()
        throws RuntimeException /*-{
        return this["states"] = (this["states"] || {});
    }-*/
    ;

    public final native JsoSeriesArea states(States states)
        throws RuntimeException /*-{
        this["states"] = states;
        return this;
    }-*/
    ;

    public final native String step()
        throws RuntimeException /*-{
        return this["step"] = (this["step"] || "false");
    }-*/
    ;

    public final native JsoSeriesArea step(String step)
        throws RuntimeException /*-{
        this["step"] = step;
        return this;
    }-*/
    ;

    public final native boolean stickyTracking()
        throws RuntimeException /*-{
        return this["stickyTracking"] = (this["stickyTracking"] || true);
    }-*/
    ;

    public final native JsoSeriesArea stickyTracking(boolean stickyTracking)
        throws RuntimeException /*-{
        this["stickyTracking"] = stickyTracking;
        return this;
    }-*/
    ;

    public final native double threshold()
        throws RuntimeException /*-{
        return this["threshold"] = (this["threshold"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesArea threshold(double threshold)
        throws RuntimeException /*-{
        this["threshold"] = threshold;
        return this;
    }-*/
    ;

    public final native Tooltip tooltip()
        throws RuntimeException /*-{
        return this["tooltip"] = (this["tooltip"] || {});
    }-*/
    ;

    public final native JsoSeriesArea tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native boolean trackByArea()
        throws RuntimeException /*-{
        return this["trackByArea"] = (this["trackByArea"] || false);
    }-*/
    ;

    public final native JsoSeriesArea trackByArea(boolean trackByArea)
        throws RuntimeException /*-{
        this["trackByArea"] = trackByArea;
        return this;
    }-*/
    ;

    public final native double turboThreshold()
        throws RuntimeException /*-{
        return this["turboThreshold"] = (this["turboThreshold"] || 1000.0);
    }-*/
    ;

    public final native JsoSeriesArea turboThreshold(double turboThreshold)
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

    public final native JsoSeriesArea type(String type)
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

    public final native JsoSeriesArea visible(boolean visible)
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

    public final native JsoSeriesArea xAxisAsNumber(double xAxisAsNumber)
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

    public final native JsoSeriesArea xAxisAsString(String xAxisAsString)
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

    public final native JsoSeriesArea yAxisAsNumber(double yAxisAsNumber)
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

    public final native JsoSeriesArea yAxisAsString(String yAxisAsString)
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

    public final native JsoSeriesArea zIndex(double zIndex)
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

    public final native JsoSeriesArea zoneAxis(String zoneAxis)
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

    public final native JsoSeriesArea zones(ArrayNumber zones)
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

    public final native JsoSeriesArea setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesArea setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
