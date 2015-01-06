
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Boxplot;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoBoxplot
    extends JavaScriptObject
    implements Boxplot
{


    protected JsoBoxplot() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoBoxplot allowPointSelect(boolean allowPointSelect)
        throws RuntimeException /*-{
        this["allowPointSelect"] = allowPointSelect;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoBoxplot color(String color)
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

    public final native JsoBoxplot colorByPoint(boolean colorByPoint)
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

    public final native JsoBoxplot colors(ArrayString colors)
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

    public final native JsoBoxplot cursor(String cursor)
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

    public final native JsoBoxplot depth(double depth)
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

    public final native JsoBoxplot edgeColor(String edgeColor)
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

    public final native JsoBoxplot edgeWidth(double edgeWidth)
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

    public final native JsoBoxplot enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addBoxplotAfterAnimateHandler(BoxplotAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotAfterAnimateHandler::onBoxplotAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotCheckboxClickHandler(BoxplotCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotCheckboxClickHandler::onBoxplotCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotClickHandler(BoxplotClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotClickHandler::onBoxplotClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotHideHandler(BoxplotHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotHideHandler::onBoxplotHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotLegendItemClickHandler(BoxplotLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotLegendItemClickHandler::onBoxplotLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotMouseOutHandler(BoxplotMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOutHandler::onBoxplotMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotMouseOverHandler(BoxplotMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOverHandler::onBoxplotMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotShowHandler(BoxplotShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotShowHandler::onBoxplotShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/boxplot/BoxplotShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoBoxplot fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native double groupPadding()
        throws RuntimeException /*-{
        return this["groupPadding"] = (this["groupPadding"] || 0.2);
    }-*/
    ;

    public final native JsoBoxplot groupPadding(double groupPadding)
        throws RuntimeException /*-{
        this["groupPadding"] = groupPadding;
        return this;
    }-*/
    ;

    public final native double groupZPadding()
        throws RuntimeException /*-{
        return this["groupZPadding"] = (this["groupZPadding"] || 1.0);
    }-*/
    ;

    public final native JsoBoxplot groupZPadding(double groupZPadding)
        throws RuntimeException /*-{
        this["groupZPadding"] = groupZPadding;
        return this;
    }-*/
    ;

    public final native boolean grouping()
        throws RuntimeException /*-{
        return this["grouping"] = (this["grouping"] || true);
    }-*/
    ;

    public final native JsoBoxplot grouping(boolean grouping)
        throws RuntimeException /*-{
        this["grouping"] = grouping;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoBoxplot lineWidth(double lineWidth)
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

    public final native JsoBoxplot linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native String medianColor()
        throws RuntimeException /*-{
        return this["medianColor"] = (this["medianColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot medianColor(String medianColor)
        throws RuntimeException /*-{
        this["medianColor"] = medianColor;
        return this;
    }-*/
    ;

    public final native double medianWidth()
        throws RuntimeException /*-{
        return this["medianWidth"] = (this["medianWidth"] || 2.0);
    }-*/
    ;

    public final native JsoBoxplot medianWidth(double medianWidth)
        throws RuntimeException /*-{
        this["medianWidth"] = medianWidth;
        return this;
    }-*/
    ;

    public final native String negativeColor()
        throws RuntimeException /*-{
        return this["negativeColor"] = (this["negativeColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot negativeColor(String negativeColor)
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

    public final native JsoBoxplot point(Point point)
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

    public final native JsoBoxplot pointInterval(double pointInterval)
        throws RuntimeException /*-{
        this["pointInterval"] = pointInterval;
        return this;
    }-*/
    ;

    public final native double pointPadding()
        throws RuntimeException /*-{
        return this["pointPadding"] = (this["pointPadding"] || 0.1);
    }-*/
    ;

    public final native JsoBoxplot pointPadding(double pointPadding)
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

    public final native JsoBoxplot pointPlacementAsString(String pointPlacementAsString)
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

    public final native JsoBoxplot pointPlacementAsNumber(double pointPlacementAsNumber)
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

    public final native JsoBoxplot pointRange(double pointRange)
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

    public final native JsoBoxplot pointStart(double pointStart)
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

    public final native JsoBoxplot pointWidth(double pointWidth)
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

    public final native JsoBoxplot selected(boolean selected)
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

    public final native JsoBoxplot showCheckbox(boolean showCheckbox)
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

    public final native JsoBoxplot showInLegend(boolean showInLegend)
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

    public final native JsoBoxplot states(States states)
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

    public final native JsoBoxplot stemColor(String stemColor)
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

    public final native JsoBoxplot stemDashStyle(String stemDashStyle)
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

    public final native JsoBoxplot stemWidth(double stemWidth)
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

    public final native JsoBoxplot stickyTracking(boolean stickyTracking)
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

    public final native JsoBoxplot tooltip(Tooltip tooltip)
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

    public final native JsoBoxplot turboThreshold(double turboThreshold)
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

    public final native JsoBoxplot visible(boolean visible)
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

    public final native JsoBoxplot whiskerColor(String whiskerColor)
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

    public final native JsoBoxplot whiskerLengthAsNumber(double whiskerLengthAsNumber)
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

    public final native JsoBoxplot whiskerLengthAsString(String whiskerLengthAsString)
        throws RuntimeException /*-{
        this["whiskerLength"] = whiskerLengthAsString;
        return this;
    }-*/
    ;

    public final native double whiskerWidth()
        throws RuntimeException /*-{
        return this["whiskerWidth"] = (this["whiskerWidth"] || 2.0);
    }-*/
    ;

    public final native JsoBoxplot whiskerWidth(double whiskerWidth)
        throws RuntimeException /*-{
        this["whiskerWidth"] = whiskerWidth;
        return this;
    }-*/
    ;

}
