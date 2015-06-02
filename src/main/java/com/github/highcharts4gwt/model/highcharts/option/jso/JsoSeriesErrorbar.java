
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesErrorbar;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.States;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>errorbar</code> series. If the <a href="#series<errorbar>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.errorbar">plotOptions.errorbar</a>.</p>
 * 
 */
public class JsoSeriesErrorbar
    extends JavaScriptObject
    implements SeriesErrorbar
{


    protected JsoSeriesErrorbar() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesErrorbar allowPointSelect(boolean allowPointSelect)
        throws RuntimeException /*-{
        this["allowPointSelect"] = allowPointSelect;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "#000000");
    }-*/
    ;

    public final native JsoSeriesErrorbar color(String color)
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

    public final native JsoSeriesErrorbar colorByPoint(boolean colorByPoint)
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

    public final native JsoSeriesErrorbar colors(ArrayString colors)
        throws RuntimeException /*-{
        this["colors"] = colors;
        return this;
    }-*/
    ;

    public final native String cursor()
        throws RuntimeException /*-{
        return this["cursor"] = (this["cursor"] || "null");
    }-*/
    ;

    public final native JsoSeriesErrorbar cursor(String cursor)
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

    public final native JsoSeriesErrorbar dataAsArrayObject(Array<Data> dataAsArrayObject)
        throws RuntimeException /*-{
        this["data"] = dataAsArrayObject;
        return this;
    }-*/
    ;

    public final native double depth()
        throws RuntimeException /*-{
        return this["depth"] = (this["depth"] || 25.0);
    }-*/
    ;

    public final native JsoSeriesErrorbar depth(double depth)
        throws RuntimeException /*-{
        this["depth"] = depth;
        return this;
    }-*/
    ;

    public final native String edgeColor()
        throws RuntimeException /*-{
        return this["edgeColor"] = (this["edgeColor"] || "");
    }-*/
    ;

    public final native JsoSeriesErrorbar edgeColor(String edgeColor)
        throws RuntimeException /*-{
        this["edgeColor"] = edgeColor;
        return this;
    }-*/
    ;

    public final native double edgeWidth()
        throws RuntimeException /*-{
        return this["edgeWidth"] = (this["edgeWidth"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesErrorbar edgeWidth(double edgeWidth)
        throws RuntimeException /*-{
        this["edgeWidth"] = edgeWidth;
        return this;
    }-*/
    ;

    public final native boolean enableMouseTracking()
        throws RuntimeException /*-{
        return this["enableMouseTracking"] = (this["enableMouseTracking"] || true);
    }-*/
    ;

    public final native JsoSeriesErrorbar enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesErrorbarAfterAnimateHandler(SeriesErrorbarAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarAfterAnimateHandler::onSeriesErrorbarAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesErrorbarCheckboxClickHandler(SeriesErrorbarCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarCheckboxClickHandler::onSeriesErrorbarCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesErrorbarClickHandler(SeriesErrorbarClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarClickHandler::onSeriesErrorbarClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesErrorbarHideHandler(SeriesErrorbarHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarHideHandler::onSeriesErrorbarHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesErrorbarLegendItemClickHandler(SeriesErrorbarLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarLegendItemClickHandler::onSeriesErrorbarLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesErrorbarMouseOutHandler(SeriesErrorbarMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOutHandler::onSeriesErrorbarMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesErrorbarMouseOverHandler(SeriesErrorbarMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOverHandler::onSeriesErrorbarMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesErrorbarShowHandler(SeriesErrorbarShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    errorbarShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarShowHandler::onSeriesErrorbarShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/serieserrorbar/SeriesErrorbarShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double groupZPadding()
        throws RuntimeException /*-{
        return this["groupZPadding"] = (this["groupZPadding"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesErrorbar groupZPadding(double groupZPadding)
        throws RuntimeException /*-{
        this["groupZPadding"] = groupZPadding;
        return this;
    }-*/
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "");
    }-*/
    ;

    public final native JsoSeriesErrorbar id(String id)
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

    public final native JsoSeriesErrorbar index(double index)
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

    public final native JsoSeriesErrorbar keys(ArrayString keys)
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

    public final native JsoSeriesErrorbar legendIndex(double legendIndex)
        throws RuntimeException /*-{
        this["legendIndex"] = legendIndex;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesErrorbar lineWidth(double lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || ":previous");
    }-*/
    ;

    public final native JsoSeriesErrorbar linkedTo(String linkedTo)
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

    public final native JsoSeriesErrorbar name(String name)
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

    public final native JsoSeriesErrorbar negativeColor(String negativeColor)
        throws RuntimeException /*-{
        this["negativeColor"] = negativeColor;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoSeriesErrorbar point(Point point)
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

    public final native JsoSeriesErrorbar pointInterval(double pointInterval)
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

    public final native JsoSeriesErrorbar pointIntervalUnit(String pointIntervalUnit)
        throws RuntimeException /*-{
        this["pointIntervalUnit"] = pointIntervalUnit;
        return this;
    }-*/
    ;

    public final native double pointPadding()
        throws RuntimeException /*-{
        return this["pointPadding"] = (this["pointPadding"] || 0.1);
    }-*/
    ;

    public final native JsoSeriesErrorbar pointPadding(double pointPadding)
        throws RuntimeException /*-{
        this["pointPadding"] = pointPadding;
        return this;
    }-*/
    ;

    public final native String pointPlacementAsString()
        throws RuntimeException /*-{
        return this["pointPlacement"] = (this["pointPlacement"] || "null");
    }-*/
    ;

    public final native JsoSeriesErrorbar pointPlacementAsString(String pointPlacementAsString)
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

    public final native JsoSeriesErrorbar pointPlacementAsNumber(double pointPlacementAsNumber)
        throws RuntimeException /*-{
        this["pointPlacement"] = pointPlacementAsNumber;
        return this;
    }-*/
    ;

    public final native double pointRange()
        throws RuntimeException /*-{
        return this["pointRange"] = (this["pointRange"] || null);
    }-*/
    ;

    public final native JsoSeriesErrorbar pointRange(double pointRange)
        throws RuntimeException /*-{
        this["pointRange"] = pointRange;
        return this;
    }-*/
    ;

    public final native double pointStart()
        throws RuntimeException /*-{
        return this["pointStart"] = (this["pointStart"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesErrorbar pointStart(double pointStart)
        throws RuntimeException /*-{
        this["pointStart"] = pointStart;
        return this;
    }-*/
    ;

    public final native double pointWidth()
        throws RuntimeException /*-{
        return this["pointWidth"] = (this["pointWidth"] || null);
    }-*/
    ;

    public final native JsoSeriesErrorbar pointWidth(double pointWidth)
        throws RuntimeException /*-{
        this["pointWidth"] = pointWidth;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoSeriesErrorbar selected(boolean selected)
        throws RuntimeException /*-{
        this["selected"] = selected;
        return this;
    }-*/
    ;

    public final native States states()
        throws RuntimeException /*-{
        return this["states"] = (this["states"] || {});
    }-*/
    ;

    public final native JsoSeriesErrorbar states(States states)
        throws RuntimeException /*-{
        this["states"] = states;
        return this;
    }-*/
    ;

    public final native String stemColor()
        throws RuntimeException /*-{
        return this["stemColor"] = (this["stemColor"] || "null");
    }-*/
    ;

    public final native JsoSeriesErrorbar stemColor(String stemColor)
        throws RuntimeException /*-{
        this["stemColor"] = stemColor;
        return this;
    }-*/
    ;

    public final native String stemDashStyle()
        throws RuntimeException /*-{
        return this["stemDashStyle"] = (this["stemDashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoSeriesErrorbar stemDashStyle(String stemDashStyle)
        throws RuntimeException /*-{
        this["stemDashStyle"] = stemDashStyle;
        return this;
    }-*/
    ;

    public final native double stemWidth()
        throws RuntimeException /*-{
        return this["stemWidth"] = (this["stemWidth"] || null);
    }-*/
    ;

    public final native JsoSeriesErrorbar stemWidth(double stemWidth)
        throws RuntimeException /*-{
        this["stemWidth"] = stemWidth;
        return this;
    }-*/
    ;

    public final native boolean stickyTracking()
        throws RuntimeException /*-{
        return this["stickyTracking"] = (this["stickyTracking"] || true);
    }-*/
    ;

    public final native JsoSeriesErrorbar stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesErrorbar tooltip(Tooltip tooltip)
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

    public final native JsoSeriesErrorbar turboThreshold(double turboThreshold)
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

    public final native JsoSeriesErrorbar type(String type)
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

    public final native JsoSeriesErrorbar visible(boolean visible)
        throws RuntimeException /*-{
        this["visible"] = visible;
        return this;
    }-*/
    ;

    public final native String whiskerColor()
        throws RuntimeException /*-{
        return this["whiskerColor"] = (this["whiskerColor"] || "null");
    }-*/
    ;

    public final native JsoSeriesErrorbar whiskerColor(String whiskerColor)
        throws RuntimeException /*-{
        this["whiskerColor"] = whiskerColor;
        return this;
    }-*/
    ;

    public final native double whiskerLengthAsNumber()
        throws RuntimeException /*-{
        return this["whiskerLength"] = (this["whiskerLength"] || null);
    }-*/
    ;

    public final native JsoSeriesErrorbar whiskerLengthAsNumber(double whiskerLengthAsNumber)
        throws RuntimeException /*-{
        this["whiskerLength"] = whiskerLengthAsNumber;
        return this;
    }-*/
    ;

    public final native String whiskerLengthAsString()
        throws RuntimeException /*-{
        return this["whiskerLength"] = (this["whiskerLength"] || "50%");
    }-*/
    ;

    public final native JsoSeriesErrorbar whiskerLengthAsString(String whiskerLengthAsString)
        throws RuntimeException /*-{
        this["whiskerLength"] = whiskerLengthAsString;
        return this;
    }-*/
    ;

    public final native double whiskerWidth()
        throws RuntimeException /*-{
        return this["whiskerWidth"] = (this["whiskerWidth"] || null);
    }-*/
    ;

    public final native JsoSeriesErrorbar whiskerWidth(double whiskerWidth)
        throws RuntimeException /*-{
        this["whiskerWidth"] = whiskerWidth;
        return this;
    }-*/
    ;

    public final native double xAxisAsNumber()
        throws RuntimeException /*-{
        return this["xAxis"] = (this["xAxis"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesErrorbar xAxisAsNumber(double xAxisAsNumber)
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

    public final native JsoSeriesErrorbar xAxisAsString(String xAxisAsString)
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

    public final native JsoSeriesErrorbar yAxisAsNumber(double yAxisAsNumber)
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

    public final native JsoSeriesErrorbar yAxisAsString(String yAxisAsString)
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

    public final native JsoSeriesErrorbar zIndex(double zIndex)
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

    public final native JsoSeriesErrorbar zoneAxis(String zoneAxis)
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

    public final native JsoSeriesErrorbar zones(ArrayNumber zones)
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

    public final native JsoSeriesErrorbar setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesErrorbar setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
