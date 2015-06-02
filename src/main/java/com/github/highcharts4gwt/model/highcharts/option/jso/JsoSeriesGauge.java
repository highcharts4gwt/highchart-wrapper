
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesGauge;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Dial;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Pivot;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>gauge</code> series. If the <a href="#series<gauge>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.gauge">plotOptions.gauge</a>.</p>
 * 
 */
public class JsoSeriesGauge
    extends JavaScriptObject
    implements SeriesGauge
{


    protected JsoSeriesGauge() {
    }

    public final native boolean animation()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoSeriesGauge animation(boolean animation)
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

    public final native JsoSeriesGauge color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native String cursor()
        throws RuntimeException /*-{
        return this["cursor"] = (this["cursor"] || "null");
    }-*/
    ;

    public final native JsoSeriesGauge cursor(String cursor)
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

    public final native JsoSeriesGauge dataAsArrayObject(Array<Data> dataAsArrayObject)
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

    public final native JsoSeriesGauge dataAsArrayNumber(ArrayNumber dataAsArrayNumber)
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

    public final native JsoSeriesGauge dataLabels(DataLabels dataLabels)
        throws RuntimeException /*-{
        this["dataLabels"] = dataLabels;
        return this;
    }-*/
    ;

    public final native Dial dial()
        throws RuntimeException /*-{
        return this["dial"] = (this["dial"] || {});
    }-*/
    ;

    public final native JsoSeriesGauge dial(Dial dial)
        throws RuntimeException /*-{
        this["dial"] = dial;
        return this;
    }-*/
    ;

    public final native boolean enableMouseTracking()
        throws RuntimeException /*-{
        return this["enableMouseTracking"] = (this["enableMouseTracking"] || true);
    }-*/
    ;

    public final native JsoSeriesGauge enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesGaugeAfterAnimateHandler(SeriesGaugeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeAfterAnimateHandler::onSeriesGaugeAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesGaugeCheckboxClickHandler(SeriesGaugeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeCheckboxClickHandler::onSeriesGaugeCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesGaugeClickHandler(SeriesGaugeClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeClickHandler::onSeriesGaugeClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesGaugeHideHandler(SeriesGaugeHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeHideHandler::onSeriesGaugeHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesGaugeLegendItemClickHandler(SeriesGaugeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeLegendItemClickHandler::onSeriesGaugeLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesGaugeMouseOutHandler(SeriesGaugeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOutHandler::onSeriesGaugeMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesGaugeMouseOverHandler(SeriesGaugeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOverHandler::onSeriesGaugeMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesGaugeShowHandler(SeriesGaugeShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    gaugeShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeShowHandler::onSeriesGaugeShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesgauge/SeriesGaugeShowEvent;)(
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

    public final native JsoSeriesGauge id(String id)
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

    public final native JsoSeriesGauge index(double index)
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

    public final native JsoSeriesGauge keys(ArrayString keys)
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

    public final native JsoSeriesGauge legendIndex(double legendIndex)
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

    public final native JsoSeriesGauge linkedTo(String linkedTo)
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

    public final native JsoSeriesGauge name(String name)
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

    public final native JsoSeriesGauge negativeColor(String negativeColor)
        throws RuntimeException /*-{
        this["negativeColor"] = negativeColor;
        return this;
    }-*/
    ;

    public final native double overshoot()
        throws RuntimeException /*-{
        return this["overshoot"] = (this["overshoot"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesGauge overshoot(double overshoot)
        throws RuntimeException /*-{
        this["overshoot"] = overshoot;
        return this;
    }-*/
    ;

    public final native Pivot pivot()
        throws RuntimeException /*-{
        return this["pivot"] = (this["pivot"] || {});
    }-*/
    ;

    public final native JsoSeriesGauge pivot(Pivot pivot)
        throws RuntimeException /*-{
        this["pivot"] = pivot;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoSeriesGauge point(Point point)
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

    public final native JsoSeriesGauge selected(boolean selected)
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

    public final native JsoSeriesGauge showCheckbox(boolean showCheckbox)
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

    public final native JsoSeriesGauge showInLegend(boolean showInLegend)
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

    public final native JsoSeriesGauge states(States states)
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

    public final native JsoSeriesGauge stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesGauge threshold(double threshold)
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

    public final native JsoSeriesGauge tooltip(Tooltip tooltip)
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

    public final native JsoSeriesGauge type(String type)
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

    public final native JsoSeriesGauge visible(boolean visible)
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

    public final native JsoSeriesGauge wrap(boolean wrap)
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

    public final native JsoSeriesGauge xAxisAsNumber(double xAxisAsNumber)
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

    public final native JsoSeriesGauge xAxisAsString(String xAxisAsString)
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

    public final native JsoSeriesGauge yAxisAsNumber(double yAxisAsNumber)
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

    public final native JsoSeriesGauge yAxisAsString(String yAxisAsString)
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

    public final native JsoSeriesGauge zIndex(double zIndex)
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

    public final native JsoSeriesGauge zoneAxis(String zoneAxis)
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

    public final native JsoSeriesGauge zones(ArrayNumber zones)
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

    public final native JsoSeriesGauge setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesGauge setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
