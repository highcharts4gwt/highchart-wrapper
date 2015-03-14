
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Funnel;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
 * 
 */
public class JsoFunnel
    extends JavaScriptObject
    implements Funnel
{


    protected JsoFunnel() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoFunnel allowPointSelect(boolean allowPointSelect)
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

    public final native JsoFunnel borderColor(String borderColor)
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

    public final native JsoFunnel borderWidth(double borderWidth)
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

    public final native JsoFunnel centerAsArrayString(ArrayString centerAsArrayString)
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

    public final native JsoFunnel centerAsArrayNumber(ArrayNumber centerAsArrayNumber)
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

    public final native JsoFunnel colors(ArrayString colors)
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

    public final native JsoFunnel cursor(String cursor)
        throws RuntimeException /*-{
        this["cursor"] = cursor;
        return this;
    }-*/
    ;

    public final native DataLabels dataLabels()
        throws RuntimeException /*-{
        return this["dataLabels"] = (this["dataLabels"] || {});
    }-*/
    ;

    public final native JsoFunnel dataLabels(DataLabels dataLabels)
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

    public final native JsoFunnel depth(double depth)
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

    public final native JsoFunnel enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addFunnelAfterAnimateHandler(FunnelAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelAfterAnimateHandler::onFunnelAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addFunnelCheckboxClickHandler(FunnelCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelCheckboxClickHandler::onFunnelCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addFunnelClickHandler(FunnelClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelClickHandler::onFunnelClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addFunnelHideHandler(FunnelHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelHideHandler::onFunnelHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addFunnelLegendItemClickHandler(FunnelLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelLegendItemClickHandler::onFunnelLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addFunnelMouseOutHandler(FunnelMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOutHandler::onFunnelMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addFunnelMouseOverHandler(FunnelMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOverHandler::onFunnelMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addFunnelShowHandler(FunnelShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelShowHandler::onFunnelShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/funnel/FunnelShowEvent;)(
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

    public final native JsoFunnel heightAsNumber(double heightAsNumber)
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

    public final native JsoFunnel heightAsString(String heightAsString)
        throws RuntimeException /*-{
        this["height"] = heightAsString;
        return this;
    }-*/
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || "");
    }-*/
    ;

    public final native JsoFunnel linkedTo(String linkedTo)
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

    public final native JsoFunnel minSize(double minSize)
        throws RuntimeException /*-{
        this["minSize"] = minSize;
        return this;
    }-*/
    ;

    public final native double neckHeightAsNumber()
        throws RuntimeException /*-{
        return this["neckHeight"] = (this["neckHeight"] || null);
    }-*/
    ;

    public final native JsoFunnel neckHeightAsNumber(double neckHeightAsNumber)
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

    public final native JsoFunnel neckHeightAsString(String neckHeightAsString)
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

    public final native JsoFunnel neckWidthAsNumber(double neckWidthAsNumber)
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

    public final native JsoFunnel neckWidthAsString(String neckWidthAsString)
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

    public final native JsoFunnel point(Point point)
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

    public final native JsoFunnel reversed(boolean reversed)
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

    public final native JsoFunnel selected(boolean selected)
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

    public final native JsoFunnel shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoFunnel shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoFunnel showInLegend(boolean showInLegend)
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

    public final native JsoFunnel slicedOffset(double slicedOffset)
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

    public final native JsoFunnel states(States states)
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

    public final native JsoFunnel stickyTracking(boolean stickyTracking)
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

    public final native JsoFunnel tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native boolean visible()
        throws RuntimeException /*-{
        return this["visible"] = (this["visible"] || true);
    }-*/
    ;

    public final native JsoFunnel visible(boolean visible)
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

    public final native JsoFunnel widthAsNumber(double widthAsNumber)
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

    public final native JsoFunnel widthAsString(String widthAsString)
        throws RuntimeException /*-{
        this["width"] = widthAsString;
        return this;
    }-*/
    ;

    public final native String zoneAxis()
        throws RuntimeException /*-{
        return this["zoneAxis"] = (this["zoneAxis"] || "y");
    }-*/
    ;

    public final native JsoFunnel zoneAxis(String zoneAxis)
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

    public final native JsoFunnel zones(ArrayNumber zones)
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

    public final native JsoFunnel setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoFunnel setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + valueToBeEvaluated + ')');
        return this;
    }-*/
    ;

}
