
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Heatmap;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>The heatmap series type. This series type is available both in Highcharts and Highmaps.</p>
 * 
 * <p>The colors of each heat map point is usually determined by its value and controlled by settings on the <a href="#colorAxis">colorAxis</a>.</p>
 * 
 */
public class JsoHeatmap
    extends JavaScriptObject
    implements Heatmap
{


    protected JsoHeatmap() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoHeatmap allowPointSelect(boolean allowPointSelect)
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

    public final native JsoHeatmap animation(boolean animation)
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

    public final native JsoHeatmap borderColor(String borderColor)
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

    public final native JsoHeatmap borderRadius(double borderRadius)
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

    public final native JsoHeatmap borderWidth(double borderWidth)
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

    public final native JsoHeatmap color(String color)
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

    public final native JsoHeatmap colorByPoint(boolean colorByPoint)
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

    public final native JsoHeatmap colors(ArrayString colors)
        throws RuntimeException /*-{
        this["colors"] = colors;
        return this;
    }-*/
    ;

    public final native double colsize()
        throws RuntimeException /*-{
        return this["colsize"] = (this["colsize"] || 1.0);
    }-*/
    ;

    public final native JsoHeatmap colsize(double colsize)
        throws RuntimeException /*-{
        this["colsize"] = colsize;
        return this;
    }-*/
    ;

    public final native double cropThreshold()
        throws RuntimeException /*-{
        return this["cropThreshold"] = (this["cropThreshold"] || 50.0);
    }-*/
    ;

    public final native JsoHeatmap cropThreshold(double cropThreshold)
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

    public final native JsoHeatmap cursor(String cursor)
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

    public final native JsoHeatmap dataLabels(DataLabels dataLabels)
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

    public final native JsoHeatmap enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addHeatmapAfterAnimateHandler(HeatmapAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapAfterAnimateHandler::onHeatmapAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHeatmapCheckboxClickHandler(HeatmapCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapCheckboxClickHandler::onHeatmapCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHeatmapClickHandler(HeatmapClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapClickHandler::onHeatmapClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHeatmapHideHandler(HeatmapHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapHideHandler::onHeatmapHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHeatmapLegendItemClickHandler(HeatmapLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapLegendItemClickHandler::onHeatmapLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHeatmapMouseOutHandler(HeatmapMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOutHandler::onHeatmapMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHeatmapMouseOverHandler(HeatmapMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOverHandler::onHeatmapMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addHeatmapShowHandler(HeatmapShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapShowHandler::onHeatmapShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/heatmap/HeatmapShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || "");
    }-*/
    ;

    public final native JsoHeatmap linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoHeatmap point(Point point)
        throws RuntimeException /*-{
        this["point"] = point;
        return this;
    }-*/
    ;

    public final native double rowsize()
        throws RuntimeException /*-{
        return this["rowsize"] = (this["rowsize"] || 1.0);
    }-*/
    ;

    public final native JsoHeatmap rowsize(double rowsize)
        throws RuntimeException /*-{
        this["rowsize"] = rowsize;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoHeatmap selected(boolean selected)
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

    public final native JsoHeatmap shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoHeatmap shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoHeatmap showCheckbox(boolean showCheckbox)
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

    public final native JsoHeatmap showInLegend(boolean showInLegend)
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

    public final native JsoHeatmap states(States states)
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

    public final native JsoHeatmap stickyTracking(boolean stickyTracking)
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

    public final native JsoHeatmap tooltip(Tooltip tooltip)
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

    public final native JsoHeatmap turboThreshold(double turboThreshold)
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

    public final native JsoHeatmap visible(boolean visible)
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

    public final native JsoHeatmap zoneAxis(String zoneAxis)
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

    public final native JsoHeatmap zones(ArrayNumber zones)
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

    public final native JsoHeatmap setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
