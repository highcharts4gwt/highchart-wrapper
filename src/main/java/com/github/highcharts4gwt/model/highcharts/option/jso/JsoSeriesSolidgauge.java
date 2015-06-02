
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesSolidgauge;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>solidgauge</code> series. If the <a href="#series<solidgauge>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.solidgauge">plotOptions.solidgauge</a>.</p>
 * 
 */
public class JsoSeriesSolidgauge
    extends JavaScriptObject
    implements SeriesSolidgauge
{


    protected JsoSeriesSolidgauge() {
    }

    public final native boolean animation()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoSeriesSolidgauge animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native String cursor()
        throws RuntimeException /*-{
        return this["cursor"] = (this["cursor"] || "null");
    }-*/
    ;

    public final native JsoSeriesSolidgauge cursor(String cursor)
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

    public final native JsoSeriesSolidgauge dataAsArrayObject(Array<Data> dataAsArrayObject)
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

    public final native JsoSeriesSolidgauge dataAsArrayNumber(ArrayNumber dataAsArrayNumber)
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

    public final native JsoSeriesSolidgauge dataLabels(DataLabels dataLabels)
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

    public final native JsoSeriesSolidgauge enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesSolidgaugeAfterAnimateHandler(SeriesSolidgaugeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeAfterAnimateHandler::onSeriesSolidgaugeAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesSolidgaugeCheckboxClickHandler(SeriesSolidgaugeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeCheckboxClickHandler::onSeriesSolidgaugeCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesSolidgaugeClickHandler(SeriesSolidgaugeClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeClickHandler::onSeriesSolidgaugeClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesSolidgaugeHideHandler(SeriesSolidgaugeHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeHideHandler::onSeriesSolidgaugeHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesSolidgaugeLegendItemClickHandler(SeriesSolidgaugeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeLegendItemClickHandler::onSeriesSolidgaugeLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesSolidgaugeMouseOutHandler(SeriesSolidgaugeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOutHandler::onSeriesSolidgaugeMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesSolidgaugeMouseOverHandler(SeriesSolidgaugeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOverHandler::onSeriesSolidgaugeMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesSolidgaugeShowHandler(SeriesSolidgaugeShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    solidgaugeShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeShowHandler::onSeriesSolidgaugeShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriessolidgauge/SeriesSolidgaugeShowEvent;)(
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

    public final native JsoSeriesSolidgauge id(String id)
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

    public final native JsoSeriesSolidgauge index(double index)
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

    public final native JsoSeriesSolidgauge keys(ArrayString keys)
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

    public final native JsoSeriesSolidgauge legendIndex(double legendIndex)
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

    public final native JsoSeriesSolidgauge name(String name)
        throws RuntimeException /*-{
        this["name"] = name;
        return this;
    }-*/
    ;

    public final native double overshoot()
        throws RuntimeException /*-{
        return this["overshoot"] = (this["overshoot"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesSolidgauge overshoot(double overshoot)
        throws RuntimeException /*-{
        this["overshoot"] = overshoot;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoSeriesSolidgauge point(Point point)
        throws RuntimeException /*-{
        this["point"] = point;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoSeriesSolidgauge selected(boolean selected)
        throws RuntimeException /*-{
        this["selected"] = selected;
        return this;
    }-*/
    ;

    public final native boolean showCheckbox()
        throws RuntimeException /*-{
        return this["showCheckbox"] = (this["showCheckbox"] || false);
    }-*/
    ;

    public final native JsoSeriesSolidgauge showCheckbox(boolean showCheckbox)
        throws RuntimeException /*-{
        this["showCheckbox"] = showCheckbox;
        return this;
    }-*/
    ;

    public final native boolean showInLegend()
        throws RuntimeException /*-{
        return this["showInLegend"] = (this["showInLegend"] || false);
    }-*/
    ;

    public final native JsoSeriesSolidgauge showInLegend(boolean showInLegend)
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

    public final native JsoSeriesSolidgauge states(States states)
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

    public final native JsoSeriesSolidgauge stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesSolidgauge tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native String type()
        throws RuntimeException /*-{
        return this["type"] = (this["type"] || "null");
    }-*/
    ;

    public final native JsoSeriesSolidgauge type(String type)
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

    public final native JsoSeriesSolidgauge visible(boolean visible)
        throws RuntimeException /*-{
        this["visible"] = visible;
        return this;
    }-*/
    ;

    public final native boolean wrap()
        throws RuntimeException /*-{
        return this["wrap"] = (this["wrap"] || true);
    }-*/
    ;

    public final native JsoSeriesSolidgauge wrap(boolean wrap)
        throws RuntimeException /*-{
        this["wrap"] = wrap;
        return this;
    }-*/
    ;

    public final native double xAxisAsNumber()
        throws RuntimeException /*-{
        return this["xAxis"] = (this["xAxis"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesSolidgauge xAxisAsNumber(double xAxisAsNumber)
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

    public final native JsoSeriesSolidgauge xAxisAsString(String xAxisAsString)
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

    public final native JsoSeriesSolidgauge yAxisAsNumber(double yAxisAsNumber)
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

    public final native JsoSeriesSolidgauge yAxisAsString(String yAxisAsString)
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

    public final native JsoSeriesSolidgauge zIndex(double zIndex)
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

    public final native JsoSeriesSolidgauge zoneAxis(String zoneAxis)
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

    public final native JsoSeriesSolidgauge zones(ArrayNumber zones)
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

    public final native JsoSeriesSolidgauge setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesSolidgauge setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
