
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesAreasplinerange;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>areasplinerange</code> series. If the <a href="#series<areasplinerange>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.areasplinerange">plotOptions.areasplinerange</a>.</p>
 * 
 */
public class JsoSeriesAreasplinerange
    extends JavaScriptObject
    implements SeriesAreasplinerange
{


    protected JsoSeriesAreasplinerange() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesAreasplinerange allowPointSelect(boolean allowPointSelect)
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

    public final native JsoSeriesAreasplinerange animation(boolean animation)
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

    public final native JsoSeriesAreasplinerange color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native boolean connectNulls()
        throws RuntimeException /*-{
        return this["connectNulls"] = (this["connectNulls"] || false);
    }-*/
    ;

    public final native JsoSeriesAreasplinerange connectNulls(boolean connectNulls)
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

    public final native JsoSeriesAreasplinerange cropThreshold(double cropThreshold)
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

    public final native JsoSeriesAreasplinerange cursor(String cursor)
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

    public final native JsoSeriesAreasplinerange dashStyle(String dashStyle)
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

    public final native JsoSeriesAreasplinerange dataAsArrayObject(Array<Data> dataAsArrayObject)
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

    public final native JsoSeriesAreasplinerange dataLabels(DataLabels dataLabels)
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

    public final native JsoSeriesAreasplinerange enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesAreasplinerangeAfterAnimateHandler(SeriesAreasplinerangeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeAfterAnimateHandler::onSeriesAreasplinerangeAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreasplinerangeCheckboxClickHandler(SeriesAreasplinerangeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeCheckboxClickHandler::onSeriesAreasplinerangeCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreasplinerangeClickHandler(SeriesAreasplinerangeClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeClickHandler::onSeriesAreasplinerangeClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreasplinerangeHideHandler(SeriesAreasplinerangeHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeHideHandler::onSeriesAreasplinerangeHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreasplinerangeLegendItemClickHandler(SeriesAreasplinerangeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeLegendItemClickHandler::onSeriesAreasplinerangeLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreasplinerangeMouseOutHandler(SeriesAreasplinerangeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeMouseOutHandler::onSeriesAreasplinerangeMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreasplinerangeMouseOverHandler(SeriesAreasplinerangeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeMouseOverHandler::onSeriesAreasplinerangeMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesAreasplinerangeShowHandler(SeriesAreasplinerangeShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    areasplinerangeShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeShowHandler::onSeriesAreasplinerangeShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareasplinerange/SeriesAreasplinerangeShowEvent;)(
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

    public final native JsoSeriesAreasplinerange fillColor(String fillColor)
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

    public final native JsoSeriesAreasplinerange fillOpacity(double fillOpacity)
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

    public final native JsoSeriesAreasplinerange id(String id)
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

    public final native JsoSeriesAreasplinerange index(double index)
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

    public final native JsoSeriesAreasplinerange keys(ArrayString keys)
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

    public final native JsoSeriesAreasplinerange legendIndex(double legendIndex)
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

    public final native JsoSeriesAreasplinerange lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesAreasplinerange lineWidth(double lineWidth)
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

    public final native JsoSeriesAreasplinerange linkedTo(String linkedTo)
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

    public final native JsoSeriesAreasplinerange name(String name)
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

    public final native JsoSeriesAreasplinerange negativeColor(String negativeColor)
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

    public final native JsoSeriesAreasplinerange negativeFillColor(String negativeFillColor)
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

    public final native JsoSeriesAreasplinerange point(Point point)
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

    public final native JsoSeriesAreasplinerange pointInterval(double pointInterval)
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

    public final native JsoSeriesAreasplinerange pointIntervalUnit(String pointIntervalUnit)
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

    public final native JsoSeriesAreasplinerange pointPlacementAsString(String pointPlacementAsString)
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

    public final native JsoSeriesAreasplinerange pointPlacementAsNumber(double pointPlacementAsNumber)
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

    public final native JsoSeriesAreasplinerange pointStart(double pointStart)
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

    public final native JsoSeriesAreasplinerange selected(boolean selected)
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

    public final native JsoSeriesAreasplinerange shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoSeriesAreasplinerange shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoSeriesAreasplinerange showCheckbox(boolean showCheckbox)
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

    public final native JsoSeriesAreasplinerange showInLegend(boolean showInLegend)
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

    public final native JsoSeriesAreasplinerange states(States states)
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

    public final native JsoSeriesAreasplinerange step(String step)
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

    public final native JsoSeriesAreasplinerange stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesAreasplinerange tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native boolean trackByArea()
        throws RuntimeException /*-{
        return this["trackByArea"] = (this["trackByArea"] || true);
    }-*/
    ;

    public final native JsoSeriesAreasplinerange trackByArea(boolean trackByArea)
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

    public final native JsoSeriesAreasplinerange turboThreshold(double turboThreshold)
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

    public final native JsoSeriesAreasplinerange type(String type)
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

    public final native JsoSeriesAreasplinerange visible(boolean visible)
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

    public final native JsoSeriesAreasplinerange xAxisAsNumber(double xAxisAsNumber)
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

    public final native JsoSeriesAreasplinerange xAxisAsString(String xAxisAsString)
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

    public final native JsoSeriesAreasplinerange yAxisAsNumber(double yAxisAsNumber)
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

    public final native JsoSeriesAreasplinerange yAxisAsString(String yAxisAsString)
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

    public final native JsoSeriesAreasplinerange zIndex(double zIndex)
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

    public final native JsoSeriesAreasplinerange zoneAxis(String zoneAxis)
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

    public final native JsoSeriesAreasplinerange zones(ArrayNumber zones)
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

    public final native JsoSeriesAreasplinerange setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesAreasplinerange setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
