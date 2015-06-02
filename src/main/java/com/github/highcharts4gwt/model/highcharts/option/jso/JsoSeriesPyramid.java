
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPyramid;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>pyramid</code> series. If the <a href="#series<pyramid>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pyramid">plotOptions.pyramid</a>.</p>
 * 
 */
public class JsoSeriesPyramid
    extends JavaScriptObject
    implements SeriesPyramid
{


    protected JsoSeriesPyramid() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesPyramid allowPointSelect(boolean allowPointSelect)
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

    public final native JsoSeriesPyramid borderColor(String borderColor)
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

    public final native JsoSeriesPyramid borderWidth(double borderWidth)
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

    public final native JsoSeriesPyramid centerAsArrayString(ArrayString centerAsArrayString)
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

    public final native JsoSeriesPyramid centerAsArrayNumber(ArrayNumber centerAsArrayNumber)
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

    public final native JsoSeriesPyramid colors(ArrayString colors)
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

    public final native JsoSeriesPyramid cursor(String cursor)
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

    public final native JsoSeriesPyramid dataAsArrayObject(Array<Data> dataAsArrayObject)
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

    public final native JsoSeriesPyramid dataAsArrayNumber(ArrayNumber dataAsArrayNumber)
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

    public final native JsoSeriesPyramid dataLabels(DataLabels dataLabels)
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

    public final native JsoSeriesPyramid depth(double depth)
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

    public final native JsoSeriesPyramid enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesPyramidAfterAnimateHandler(SeriesPyramidAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidAfterAnimateHandler::onSeriesPyramidAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPyramidCheckboxClickHandler(SeriesPyramidCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidCheckboxClickHandler::onSeriesPyramidCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPyramidClickHandler(SeriesPyramidClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidClickHandler::onSeriesPyramidClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPyramidHideHandler(SeriesPyramidHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidHideHandler::onSeriesPyramidHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPyramidLegendItemClickHandler(SeriesPyramidLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidLegendItemClickHandler::onSeriesPyramidLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPyramidMouseOutHandler(SeriesPyramidMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOutHandler::onSeriesPyramidMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPyramidMouseOverHandler(SeriesPyramidMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOverHandler::onSeriesPyramidMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesPyramidShowHandler(SeriesPyramidShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pyramidShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidShowHandler::onSeriesPyramidShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriespyramid/SeriesPyramidShowEvent;)(
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

    public final native JsoSeriesPyramid heightAsNumber(double heightAsNumber)
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

    public final native JsoSeriesPyramid heightAsString(String heightAsString)
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

    public final native JsoSeriesPyramid id(String id)
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

    public final native JsoSeriesPyramid index(double index)
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

    public final native JsoSeriesPyramid keys(ArrayString keys)
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

    public final native JsoSeriesPyramid legendIndex(double legendIndex)
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

    public final native JsoSeriesPyramid linkedTo(String linkedTo)
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

    public final native JsoSeriesPyramid minSize(double minSize)
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

    public final native JsoSeriesPyramid name(String name)
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

    public final native JsoSeriesPyramid point(Point point)
        throws RuntimeException /*-{
        this["point"] = point;
        return this;
    }-*/
    ;

    public final native boolean reversed()
        throws RuntimeException /*-{
        return this["reversed"] = (this["reversed"] || true);
    }-*/
    ;

    public final native JsoSeriesPyramid reversed(boolean reversed)
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

    public final native JsoSeriesPyramid selected(boolean selected)
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

    public final native JsoSeriesPyramid shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoSeriesPyramid shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoSeriesPyramid showInLegend(boolean showInLegend)
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

    public final native JsoSeriesPyramid slicedOffset(double slicedOffset)
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

    public final native JsoSeriesPyramid states(States states)
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

    public final native JsoSeriesPyramid stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesPyramid tooltip(Tooltip tooltip)
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

    public final native JsoSeriesPyramid type(String type)
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

    public final native JsoSeriesPyramid visible(boolean visible)
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

    public final native JsoSeriesPyramid widthAsNumber(double widthAsNumber)
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

    public final native JsoSeriesPyramid widthAsString(String widthAsString)
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

    public final native JsoSeriesPyramid zIndex(double zIndex)
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

    public final native JsoSeriesPyramid zoneAxis(String zoneAxis)
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

    public final native JsoSeriesPyramid zones(ArrayNumber zones)
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

    public final native JsoSeriesPyramid setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesPyramid setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
