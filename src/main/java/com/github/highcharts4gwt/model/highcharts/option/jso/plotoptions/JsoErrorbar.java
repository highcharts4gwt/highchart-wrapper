
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Errorbar;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.AfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.CheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.HideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.LegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
 * 
 */
public class JsoErrorbar
    extends JavaScriptObject
    implements Errorbar
{


    protected JsoErrorbar() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoErrorbar allowPointSelect(boolean allowPointSelect)
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

    public final native JsoErrorbar color(String color)
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

    public final native JsoErrorbar colorByPoint(boolean colorByPoint)
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

    public final native JsoErrorbar colors(ArrayString colors)
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

    public final native JsoErrorbar cursor(String cursor)
        throws RuntimeException /*-{
        this["cursor"] = cursor;
        return this;
    }-*/
    ;

    public final native double depth()
        throws RuntimeException /*-{
        return this["depth"] = (this["depth"] || 25.0);
    }-*/
    ;

    public final native JsoErrorbar depth(double depth)
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

    public final native JsoErrorbar edgeColor(String edgeColor)
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

    public final native JsoErrorbar edgeWidth(double edgeWidth)
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

    public final native JsoErrorbar enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addAfterAnimateHandler(AfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.AfterAnimateHandler::onAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/AfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addCheckboxClickHandler(CheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.CheckboxClickHandler::onCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/CheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addClickHandler(ClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ClickHandler::onClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/ClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHideHandler(HideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.HideHandler::onHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/HideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLegendItemClickHandler(LegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.LegendItemClickHandler::onLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/LegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOutHandler(MouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.MouseOutHandler::onMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/MouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOverHandler(MouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.MouseOverHandler::onMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/MouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addShowHandler(ShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ShowHandler::onShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/errorbar/ShowEvent;)(
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

    public final native JsoErrorbar groupZPadding(double groupZPadding)
        throws RuntimeException /*-{
        this["groupZPadding"] = groupZPadding;
        return this;
    }-*/
    ;

    public final native ArrayString keys()
        throws RuntimeException /*-{
        return this["keys"] = (this["keys"] || []);
    }-*/
    ;

    public final native JsoErrorbar keys(ArrayString keys)
        throws RuntimeException /*-{
        this["keys"] = keys;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoErrorbar lineWidth(double lineWidth)
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

    public final native JsoErrorbar linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native String negativeColor()
        throws RuntimeException /*-{
        return this["negativeColor"] = (this["negativeColor"] || "null");
    }-*/
    ;

    public final native JsoErrorbar negativeColor(String negativeColor)
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

    public final native JsoErrorbar point(Point point)
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

    public final native JsoErrorbar pointInterval(double pointInterval)
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

    public final native JsoErrorbar pointIntervalUnit(String pointIntervalUnit)
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

    public final native JsoErrorbar pointPadding(double pointPadding)
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

    public final native JsoErrorbar pointPlacementAsString(String pointPlacementAsString)
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

    public final native JsoErrorbar pointPlacementAsNumber(double pointPlacementAsNumber)
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

    public final native JsoErrorbar pointRange(double pointRange)
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

    public final native JsoErrorbar pointStart(double pointStart)
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

    public final native JsoErrorbar pointWidth(double pointWidth)
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

    public final native JsoErrorbar selected(boolean selected)
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

    public final native JsoErrorbar states(States states)
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

    public final native JsoErrorbar stemColor(String stemColor)
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

    public final native JsoErrorbar stemDashStyle(String stemDashStyle)
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

    public final native JsoErrorbar stemWidth(double stemWidth)
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

    public final native JsoErrorbar stickyTracking(boolean stickyTracking)
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

    public final native JsoErrorbar tooltip(Tooltip tooltip)
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

    public final native JsoErrorbar turboThreshold(double turboThreshold)
        throws RuntimeException /*-{
        this["turboThreshold"] = turboThreshold;
        return this;
    }-*/
    ;

    public final native boolean visible()
        throws RuntimeException /*-{
        return this["visible"] = (this["visible"] || true);
    }-*/
    ;

    public final native JsoErrorbar visible(boolean visible)
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

    public final native JsoErrorbar whiskerColor(String whiskerColor)
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

    public final native JsoErrorbar whiskerLengthAsNumber(double whiskerLengthAsNumber)
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

    public final native JsoErrorbar whiskerLengthAsString(String whiskerLengthAsString)
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

    public final native JsoErrorbar whiskerWidth(double whiskerWidth)
        throws RuntimeException /*-{
        this["whiskerWidth"] = whiskerWidth;
        return this;
    }-*/
    ;

    public final native String zoneAxis()
        throws RuntimeException /*-{
        return this["zoneAxis"] = (this["zoneAxis"] || "y");
    }-*/
    ;

    public final native JsoErrorbar zoneAxis(String zoneAxis)
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

    public final native JsoErrorbar zones(ArrayNumber zones)
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

    public final native JsoErrorbar setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoErrorbar setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
