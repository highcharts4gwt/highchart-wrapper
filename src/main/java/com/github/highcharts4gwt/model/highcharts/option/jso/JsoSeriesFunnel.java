
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesFunnel;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>funnel</code> series. If the <a href="#series<funnel>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.funnel">plotOptions.funnel</a>.</p>
 * 
 */
public class JsoSeriesFunnel
    extends JavaScriptObject
    implements SeriesFunnel
{


    protected JsoSeriesFunnel() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesFunnel allowPointSelect(boolean allowPointSelect)
        throws RuntimeException /*-{
        this["allowPointSelect"] = allowPointSelect;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoSeriesFunnel borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 1.0);
    }-*/
    ;

    public final native JsoSeriesFunnel borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native ArrayString centerAsArrayString()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || ["50%", "50%"]);
    }-*/
    ;

    public final native JsoSeriesFunnel centerAsArrayString(ArrayString centerAsArrayString)
        throws RuntimeException /*-{
        this["center"] = centerAsArrayString;
        return this;
    }-*/
    ;

    public final native ArrayNumber centerAsArrayNumber()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || ["50%", "50%"]);
    }-*/
    ;

    public final native JsoSeriesFunnel centerAsArrayNumber(ArrayNumber centerAsArrayNumber)
        throws RuntimeException /*-{
        this["center"] = centerAsArrayNumber;
        return this;
    }-*/
    ;

    public final native ArrayString colors()
        throws RuntimeException /*-{
        return this["colors"] = (this["colors"] || []);
    }-*/
    ;

    public final native JsoSeriesFunnel colors(ArrayString colors)
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

    public final native JsoSeriesFunnel cursor(String cursor)
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

    public final native JsoSeriesFunnel dataAsArrayObject(Array<Data> dataAsArrayObject)
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

    public final native JsoSeriesFunnel dataAsArrayNumber(ArrayNumber dataAsArrayNumber)
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

    public final native JsoSeriesFunnel dataLabels(DataLabels dataLabels)
        throws RuntimeException /*-{
        this["dataLabels"] = dataLabels;
        return this;
    }-*/
    ;

    public final native double depth()
        throws RuntimeException /*-{
        return this["depth"] = (this["depth"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesFunnel depth(double depth)
        throws RuntimeException /*-{
        this["depth"] = depth;
        return this;
    }-*/
    ;

    public final native boolean enableMouseTracking()
        throws RuntimeException /*-{
        return this["enableMouseTracking"] = (this["enableMouseTracking"] || true);
    }-*/
    ;

    public final native JsoSeriesFunnel enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesFunnelAfterAnimateHandler(SeriesFunnelAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelAfterAnimateHandler::onSeriesFunnelAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesFunnelCheckboxClickHandler(SeriesFunnelCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelCheckboxClickHandler::onSeriesFunnelCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesFunnelClickHandler(SeriesFunnelClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelClickHandler::onSeriesFunnelClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesFunnelHideHandler(SeriesFunnelHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelHideHandler::onSeriesFunnelHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesFunnelLegendItemClickHandler(SeriesFunnelLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelLegendItemClickHandler::onSeriesFunnelLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesFunnelMouseOutHandler(SeriesFunnelMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelMouseOutHandler::onSeriesFunnelMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesFunnelMouseOverHandler(SeriesFunnelMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelMouseOverHandler::onSeriesFunnelMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesFunnelShowHandler(SeriesFunnelShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    funnelShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelShowHandler::onSeriesFunnelShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesfunnel/SeriesFunnelShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double heightAsNumber()
        throws RuntimeException /*-{
        return this["height"] = (this["height"] || null);
    }-*/
    ;

    public final native JsoSeriesFunnel heightAsNumber(double heightAsNumber)
        throws RuntimeException /*-{
        this["height"] = heightAsNumber;
        return this;
    }-*/
    ;

    public final native String heightAsString()
        throws RuntimeException /*-{
        return this["height"] = (this["height"] || "null");
    }-*/
    ;

    public final native JsoSeriesFunnel heightAsString(String heightAsString)
        throws RuntimeException /*-{
        this["height"] = heightAsString;
        return this;
    }-*/
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "");
    }-*/
    ;

    public final native JsoSeriesFunnel id(String id)
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

    public final native JsoSeriesFunnel index(double index)
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

    public final native JsoSeriesFunnel keys(ArrayString keys)
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

    public final native JsoSeriesFunnel legendIndex(double legendIndex)
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

    public final native JsoSeriesFunnel linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native double minSize()
        throws RuntimeException /*-{
        return this["minSize"] = (this["minSize"] || 80.0);
    }-*/
    ;

    public final native JsoSeriesFunnel minSize(double minSize)
        throws RuntimeException /*-{
        this["minSize"] = minSize;
        return this;
    }-*/
    ;

    public final native String name()
        throws RuntimeException /*-{
        return this["name"] = (this["name"] || "null");
    }-*/
    ;

    public final native JsoSeriesFunnel name(String name)
        throws RuntimeException /*-{
        this["name"] = name;
        return this;
    }-*/
    ;

    public final native double neckHeightAsNumber()
        throws RuntimeException /*-{
        return this["neckHeight"] = (this["neckHeight"] || null);
    }-*/
    ;

    public final native JsoSeriesFunnel neckHeightAsNumber(double neckHeightAsNumber)
        throws RuntimeException /*-{
        this["neckHeight"] = neckHeightAsNumber;
        return this;
    }-*/
    ;

    public final native String neckHeightAsString()
        throws RuntimeException /*-{
        return this["neckHeight"] = (this["neckHeight"] || "25%");
    }-*/
    ;

    public final native JsoSeriesFunnel neckHeightAsString(String neckHeightAsString)
        throws RuntimeException /*-{
        this["neckHeight"] = neckHeightAsString;
        return this;
    }-*/
    ;

    public final native double neckWidthAsNumber()
        throws RuntimeException /*-{
        return this["neckWidth"] = (this["neckWidth"] || null);
    }-*/
    ;

    public final native JsoSeriesFunnel neckWidthAsNumber(double neckWidthAsNumber)
        throws RuntimeException /*-{
        this["neckWidth"] = neckWidthAsNumber;
        return this;
    }-*/
    ;

    public final native String neckWidthAsString()
        throws RuntimeException /*-{
        return this["neckWidth"] = (this["neckWidth"] || "30%");
    }-*/
    ;

    public final native JsoSeriesFunnel neckWidthAsString(String neckWidthAsString)
        throws RuntimeException /*-{
        this["neckWidth"] = neckWidthAsString;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoSeriesFunnel point(Point point)
        throws RuntimeException /*-{
        this["point"] = point;
        return this;
    }-*/
    ;

    public final native boolean reversed()
        throws RuntimeException /*-{
        return this["reversed"] = (this["reversed"] || false);
    }-*/
    ;

    public final native JsoSeriesFunnel reversed(boolean reversed)
        throws RuntimeException /*-{
        this["reversed"] = reversed;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoSeriesFunnel selected(boolean selected)
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

    public final native JsoSeriesFunnel shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoSeriesFunnel shadowAsJsonString(String shadowAsJsonString)
        throws RuntimeException /*-{
        this["shadow"] = JSON.parse(shadowAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean showInLegend()
        throws RuntimeException /*-{
        return this["showInLegend"] = (this["showInLegend"] || false);
    }-*/
    ;

    public final native JsoSeriesFunnel showInLegend(boolean showInLegend)
        throws RuntimeException /*-{
        this["showInLegend"] = showInLegend;
        return this;
    }-*/
    ;

    public final native double slicedOffset()
        throws RuntimeException /*-{
        return this["slicedOffset"] = (this["slicedOffset"] || 10.0);
    }-*/
    ;

    public final native JsoSeriesFunnel slicedOffset(double slicedOffset)
        throws RuntimeException /*-{
        this["slicedOffset"] = slicedOffset;
        return this;
    }-*/
    ;

    public final native States states()
        throws RuntimeException /*-{
        return this["states"] = (this["states"] || {});
    }-*/
    ;

    public final native JsoSeriesFunnel states(States states)
        throws RuntimeException /*-{
        this["states"] = states;
        return this;
    }-*/
    ;

    public final native boolean stickyTracking()
        throws RuntimeException /*-{
        return this["stickyTracking"] = (this["stickyTracking"] || false);
    }-*/
    ;

    public final native JsoSeriesFunnel stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesFunnel tooltip(Tooltip tooltip)
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

    public final native JsoSeriesFunnel type(String type)
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

    public final native JsoSeriesFunnel visible(boolean visible)
        throws RuntimeException /*-{
        this["visible"] = visible;
        return this;
    }-*/
    ;

    public final native double widthAsNumber()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || null);
    }-*/
    ;

    public final native JsoSeriesFunnel widthAsNumber(double widthAsNumber)
        throws RuntimeException /*-{
        this["width"] = widthAsNumber;
        return this;
    }-*/
    ;

    public final native String widthAsString()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || "90%");
    }-*/
    ;

    public final native JsoSeriesFunnel widthAsString(String widthAsString)
        throws RuntimeException /*-{
        this["width"] = widthAsString;
        return this;
    }-*/
    ;

    public final native double zIndex()
        throws RuntimeException /*-{
        return this["zIndex"] = (this["zIndex"] || '');
    }-*/
    ;

    public final native JsoSeriesFunnel zIndex(double zIndex)
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

    public final native JsoSeriesFunnel zoneAxis(String zoneAxis)
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

    public final native JsoSeriesFunnel zones(ArrayNumber zones)
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

    public final native JsoSeriesFunnel setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesFunnel setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
