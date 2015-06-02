
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPie;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>pie</code> series. If the <a href="#series<pie>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pie">plotOptions.pie</a>.</p>
 * 
 */
public class JsoSeriesPie
    extends JavaScriptObject
    implements SeriesPie
{


    protected JsoSeriesPie() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesPie allowPointSelect(boolean allowPointSelect)
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

    public final native JsoSeriesPie animation(boolean animation)
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

    public final native JsoSeriesPie borderColor(String borderColor)
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

    public final native JsoSeriesPie borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native ArrayString centerAsArrayString()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || [null, null]);
    }-*/
    ;

    public final native JsoSeriesPie centerAsArrayString(ArrayString centerAsArrayString)
        throws RuntimeException /*-{
        this["center"] = centerAsArrayString;
        return this;
    }-*/
    ;

    public final native ArrayNumber centerAsArrayNumber()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || [null, null]);
    }-*/
    ;

    public final native JsoSeriesPie centerAsArrayNumber(ArrayNumber centerAsArrayNumber)
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

    public final native JsoSeriesPie colors(ArrayString colors)
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

    public final native JsoSeriesPie cursor(String cursor)
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

    public final native JsoSeriesPie dataAsArrayObject(Array<Data> dataAsArrayObject)
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

    public final native JsoSeriesPie dataAsArrayNumber(ArrayNumber dataAsArrayNumber)
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

    public final native JsoSeriesPie dataLabels(DataLabels dataLabels)
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

    public final native JsoSeriesPie depth(double depth)
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

    public final native JsoSeriesPie enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native double endAngle()
        throws RuntimeException /*-{
        return this["endAngle"] = (this["endAngle"] || null);
    }-*/
    ;

    public final native JsoSeriesPie endAngle(double endAngle)
        throws RuntimeException /*-{
        this["endAngle"] = endAngle;
        return this;
    }-*/
    ;

    public final native void addSeriesPieAfterAnimateHandler(SeriesPieAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieAfterAnimateHandler::onSeriesPieAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPieCheckboxClickHandler(SeriesPieCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieCheckboxClickHandler::onSeriesPieCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPieClickHandler(SeriesPieClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieClickHandler::onSeriesPieClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPieHideHandler(SeriesPieHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieHideHandler::onSeriesPieHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPieLegendItemClickHandler(SeriesPieLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieLegendItemClickHandler::onSeriesPieLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPieMouseOutHandler(SeriesPieMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieMouseOutHandler::onSeriesPieMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPieMouseOverHandler(SeriesPieMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieMouseOverHandler::onSeriesPieMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPieShowHandler(SeriesPieShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pieShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieShowHandler::onSeriesPieShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespie/SeriesPieShowEvent;)(
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

    public final native JsoSeriesPie id(String id)
        throws RuntimeException /*-{
        this["id"] = id;
        return this;
    }-*/
    ;

    public final native boolean ignoreHiddenPoint()
        throws RuntimeException /*-{
        return this["ignoreHiddenPoint"] = (this["ignoreHiddenPoint"] || true);
    }-*/
    ;

    public final native JsoSeriesPie ignoreHiddenPoint(boolean ignoreHiddenPoint)
        throws RuntimeException /*-{
        this["ignoreHiddenPoint"] = ignoreHiddenPoint;
        return this;
    }-*/
    ;

    public final native double index()
        throws RuntimeException /*-{
        return this["index"] = (this["index"] || null);
    }-*/
    ;

    public final native JsoSeriesPie index(double index)
        throws RuntimeException /*-{
        this["index"] = index;
        return this;
    }-*/
    ;

    public final native String innerSizeAsString()
        throws RuntimeException /*-{
        return this["innerSize"] = (this["innerSize"] || "0");
    }-*/
    ;

    public final native JsoSeriesPie innerSizeAsString(String innerSizeAsString)
        throws RuntimeException /*-{
        this["innerSize"] = innerSizeAsString;
        return this;
    }-*/
    ;

    public final native double innerSizeAsNumber()
        throws RuntimeException /*-{
        return this["innerSize"] = (this["innerSize"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesPie innerSizeAsNumber(double innerSizeAsNumber)
        throws RuntimeException /*-{
        this["innerSize"] = innerSizeAsNumber;
        return this;
    }-*/
    ;

    public final native ArrayString keys()
        throws RuntimeException /*-{
        return this["keys"] = (this["keys"] || []);
    }-*/
    ;

    public final native JsoSeriesPie keys(ArrayString keys)
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

    public final native JsoSeriesPie legendIndex(double legendIndex)
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

    public final native JsoSeriesPie linkedTo(String linkedTo)
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

    public final native JsoSeriesPie minSize(double minSize)
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

    public final native JsoSeriesPie name(String name)
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

    public final native JsoSeriesPie point(Point point)
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

    public final native JsoSeriesPie selected(boolean selected)
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

    public final native JsoSeriesPie shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoSeriesPie shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoSeriesPie showInLegend(boolean showInLegend)
        throws RuntimeException /*-{
        this["showInLegend"] = showInLegend;
        return this;
    }-*/
    ;

    public final native String sizeAsString()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || "");
    }-*/
    ;

    public final native JsoSeriesPie sizeAsString(String sizeAsString)
        throws RuntimeException /*-{
        this["size"] = sizeAsString;
        return this;
    }-*/
    ;

    public final native double sizeAsNumber()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || '');
    }-*/
    ;

    public final native JsoSeriesPie sizeAsNumber(double sizeAsNumber)
        throws RuntimeException /*-{
        this["size"] = sizeAsNumber;
        return this;
    }-*/
    ;

    public final native double slicedOffset()
        throws RuntimeException /*-{
        return this["slicedOffset"] = (this["slicedOffset"] || 10.0);
    }-*/
    ;

    public final native JsoSeriesPie slicedOffset(double slicedOffset)
        throws RuntimeException /*-{
        this["slicedOffset"] = slicedOffset;
        return this;
    }-*/
    ;

    public final native double startAngle()
        throws RuntimeException /*-{
        return this["startAngle"] = (this["startAngle"] || 0.0);
    }-*/
    ;

    public final native JsoSeriesPie startAngle(double startAngle)
        throws RuntimeException /*-{
        this["startAngle"] = startAngle;
        return this;
    }-*/
    ;

    public final native States states()
        throws RuntimeException /*-{
        return this["states"] = (this["states"] || {});
    }-*/
    ;

    public final native JsoSeriesPie states(States states)
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

    public final native JsoSeriesPie stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesPie tooltip(Tooltip tooltip)
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

    public final native JsoSeriesPie type(String type)
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

    public final native JsoSeriesPie visible(boolean visible)
        throws RuntimeException /*-{
        this["visible"] = visible;
        return this;
    }-*/
    ;

    public final native double zIndex()
        throws RuntimeException /*-{
        return this["zIndex"] = (this["zIndex"] || '');
    }-*/
    ;

    public final native JsoSeriesPie zIndex(double zIndex)
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

    public final native JsoSeriesPie zoneAxis(String zoneAxis)
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

    public final native JsoSeriesPie zones(ArrayNumber zones)
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

    public final native JsoSeriesPie setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesPie setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
