
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Column;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * 
 * 
 */
public class JsoColumn
    extends JavaScriptObject
    implements Column
{


    protected JsoColumn() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoColumn allowPointSelect(boolean allowPointSelect)
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

    public final native JsoColumn animation(boolean animation)
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

    public final native JsoColumn borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderRadius()
        throws RuntimeException /*-{
        return this["borderRadius"] = (this["borderRadius"] || 0.0);
    }-*/
    ;

    public final native JsoColumn borderRadius(double borderRadius)
        throws RuntimeException /*-{
        this["borderRadius"] = borderRadius;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 1.0);
    }-*/
    ;

    public final native JsoColumn borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoColumn color(String color)
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

    public final native JsoColumn colorByPoint(boolean colorByPoint)
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

    public final native JsoColumn colors(ArrayString colors)
        throws RuntimeException /*-{
        this["colors"] = colors;
        return this;
    }-*/
    ;

    public final native double cropThreshold()
        throws RuntimeException /*-{
        return this["cropThreshold"] = (this["cropThreshold"] || 50.0);
    }-*/
    ;

    public final native JsoColumn cropThreshold(double cropThreshold)
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

    public final native JsoColumn cursor(String cursor)
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

    public final native JsoColumn dataLabels(DataLabels dataLabels)
        throws RuntimeException /*-{
        this["dataLabels"] = dataLabels;
        return this;
    }-*/
    ;

    public final native double depth()
        throws RuntimeException /*-{
        return this["depth"] = (this["depth"] || 25.0);
    }-*/
    ;

    public final native JsoColumn depth(double depth)
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

    public final native JsoColumn edgeColor(String edgeColor)
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

    public final native JsoColumn edgeWidth(double edgeWidth)
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

    public final native JsoColumn enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addColumnAfterAnimateHandler(ColumnAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnAfterAnimateHandler::onColumnAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnCheckboxClickHandler(ColumnCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnCheckboxClickHandler::onColumnCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnClickHandler(ColumnClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnClickHandler::onColumnClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnHideHandler(ColumnHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnHideHandler::onColumnHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnLegendItemClickHandler(ColumnLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnLegendItemClickHandler::onColumnLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnMouseOutHandler(ColumnMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnMouseOutHandler::onColumnMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnMouseOverHandler(ColumnMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnMouseOverHandler::onColumnMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnShowHandler(ColumnShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnShowHandler::onColumnShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/column/ColumnShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double groupPadding()
        throws RuntimeException /*-{
        return this["groupPadding"] = (this["groupPadding"] || 0.2);
    }-*/
    ;

    public final native JsoColumn groupPadding(double groupPadding)
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

    public final native JsoColumn groupZPadding(double groupZPadding)
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

    public final native JsoColumn grouping(boolean grouping)
        throws RuntimeException /*-{
        this["grouping"] = grouping;
        return this;
    }-*/
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || "");
    }-*/
    ;

    public final native JsoColumn linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native double minPointLength()
        throws RuntimeException /*-{
        return this["minPointLength"] = (this["minPointLength"] || 0.0);
    }-*/
    ;

    public final native JsoColumn minPointLength(double minPointLength)
        throws RuntimeException /*-{
        this["minPointLength"] = minPointLength;
        return this;
    }-*/
    ;

    public final native String negativeColor()
        throws RuntimeException /*-{
        return this["negativeColor"] = (this["negativeColor"] || "null");
    }-*/
    ;

    public final native JsoColumn negativeColor(String negativeColor)
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

    public final native JsoColumn point(Point point)
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

    public final native JsoColumn pointInterval(double pointInterval)
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

    public final native JsoColumn pointIntervalUnit(String pointIntervalUnit)
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

    public final native JsoColumn pointPadding(double pointPadding)
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

    public final native JsoColumn pointPlacementAsString(String pointPlacementAsString)
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

    public final native JsoColumn pointPlacementAsNumber(double pointPlacementAsNumber)
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

    public final native JsoColumn pointRange(double pointRange)
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

    public final native JsoColumn pointStart(double pointStart)
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

    public final native JsoColumn pointWidth(double pointWidth)
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

    public final native JsoColumn selected(boolean selected)
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

    public final native JsoColumn shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoColumn shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoColumn showCheckbox(boolean showCheckbox)
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

    public final native JsoColumn showInLegend(boolean showInLegend)
        throws RuntimeException /*-{
        this["showInLegend"] = showInLegend;
        return this;
    }-*/
    ;

    public final native String stacking()
        throws RuntimeException /*-{
        return this["stacking"] = (this["stacking"] || "null");
    }-*/
    ;

    public final native JsoColumn stacking(String stacking)
        throws RuntimeException /*-{
        this["stacking"] = stacking;
        return this;
    }-*/
    ;

    public final native States states()
        throws RuntimeException /*-{
        return this["states"] = (this["states"] || {});
    }-*/
    ;

    public final native JsoColumn states(States states)
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

    public final native JsoColumn stickyTracking(boolean stickyTracking)
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

    public final native JsoColumn threshold(double threshold)
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

    public final native JsoColumn tooltip(Tooltip tooltip)
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

    public final native JsoColumn turboThreshold(double turboThreshold)
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

    public final native JsoColumn visible(boolean visible)
        throws RuntimeException /*-{
        this["visible"] = visible;
        return this;
    }-*/
    ;

    public final native String zoneAxis()
        throws RuntimeException /*-{
        return this["zoneAxis"] = (this["zoneAxis"] || "y");
    }-*/
    ;

    public final native JsoColumn zoneAxis(String zoneAxis)
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

    public final native JsoColumn zones(ArrayNumber zones)
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

    public final native JsoColumn setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
