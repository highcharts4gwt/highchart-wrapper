
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesTreemap;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Level;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A <code>treemap</code> series. If the <a href="#series<treemap>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
 * 
 * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.treemap">plotOptions.treemap</a>.</p>
 * 
 */
public class JsoSeriesTreemap
    extends JavaScriptObject
    implements SeriesTreemap
{


    protected JsoSeriesTreemap() {
    }

    public final native boolean allowDrillToNode()
        throws RuntimeException /*-{
        return this["allowDrillToNode"] = (this["allowDrillToNode"] || false);
    }-*/
    ;

    public final native JsoSeriesTreemap allowDrillToNode(boolean allowDrillToNode)
        throws RuntimeException /*-{
        this["allowDrillToNode"] = allowDrillToNode;
        return this;
    }-*/
    ;

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoSeriesTreemap allowPointSelect(boolean allowPointSelect)
        throws RuntimeException /*-{
        this["allowPointSelect"] = allowPointSelect;
        return this;
    }-*/
    ;

    public final native boolean alternateStartingDirection()
        throws RuntimeException /*-{
        return this["alternateStartingDirection"] = (this["alternateStartingDirection"] || false);
    }-*/
    ;

    public final native JsoSeriesTreemap alternateStartingDirection(boolean alternateStartingDirection)
        throws RuntimeException /*-{
        this["alternateStartingDirection"] = alternateStartingDirection;
        return this;
    }-*/
    ;

    public final native boolean animation()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoSeriesTreemap animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "#E0E0E0");
    }-*/
    ;

    public final native JsoSeriesTreemap borderColor(String borderColor)
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

    public final native JsoSeriesTreemap borderWidth(double borderWidth)
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

    public final native JsoSeriesTreemap color(String color)
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

    public final native JsoSeriesTreemap colorByPoint(boolean colorByPoint)
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

    public final native JsoSeriesTreemap colors(ArrayString colors)
        throws RuntimeException /*-{
        this["colors"] = colors;
        return this;
    }-*/
    ;

    public final native double cropThreshold()
        throws RuntimeException /*-{
        return this["cropThreshold"] = (this["cropThreshold"] || 300.0);
    }-*/
    ;

    public final native JsoSeriesTreemap cropThreshold(double cropThreshold)
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

    public final native JsoSeriesTreemap cursor(String cursor)
        throws RuntimeException /*-{
        this["cursor"] = cursor;
        return this;
    }-*/
    ;

    public final native com.github.highcharts4gwt.model.array.api.Array<Data> dataAsArrayObject()
        throws RuntimeException /*-{
        return this["data"] = (this["data"] || []);
    }-*/
    ;

    public final native JsoSeriesTreemap dataAsArrayObject(com.github.highcharts4gwt.model.array.api.Array<Data> dataAsArrayObject)
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

    public final native JsoSeriesTreemap dataAsArrayNumber(ArrayNumber dataAsArrayNumber)
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

    public final native JsoSeriesTreemap dataLabels(DataLabels dataLabels)
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

    public final native JsoSeriesTreemap enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addSeriesTreemapAfterAnimateHandler(SeriesTreemapAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapAfterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapAfterAnimateHandler::onSeriesTreemapAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesTreemapCheckboxClickHandler(SeriesTreemapCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapCheckboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapCheckboxClickHandler::onSeriesTreemapCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesTreemapClickHandler(SeriesTreemapClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapClickHandler::onSeriesTreemapClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesTreemapHideHandler(SeriesTreemapHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapHide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapHideHandler::onSeriesTreemapHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesTreemapLegendItemClickHandler(SeriesTreemapLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapLegendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapLegendItemClickHandler::onSeriesTreemapLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesTreemapMouseOutHandler(SeriesTreemapMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapMouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOutHandler::onSeriesTreemapMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesTreemapMouseOverHandler(SeriesTreemapMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapMouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOverHandler::onSeriesTreemapMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSeriesTreemapShowHandler(SeriesTreemapShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    treemapShow: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapShowHandler::onSeriesTreemapShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriestreemap/SeriesTreemapShowEvent;)(
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

    public final native JsoSeriesTreemap id(String id)
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

    public final native JsoSeriesTreemap index(double index)
        throws RuntimeException /*-{
        this["index"] = index;
        return this;
    }-*/
    ;

    public final native boolean interactByLeaf()
        throws RuntimeException /*-{
        return this["interactByLeaf"] = (this["interactByLeaf"] || false);
    }-*/
    ;

    public final native JsoSeriesTreemap interactByLeaf(boolean interactByLeaf)
        throws RuntimeException /*-{
        this["interactByLeaf"] = interactByLeaf;
        return this;
    }-*/
    ;

    public final native ArrayString keys()
        throws RuntimeException /*-{
        return this["keys"] = (this["keys"] || []);
    }-*/
    ;

    public final native JsoSeriesTreemap keys(ArrayString keys)
        throws RuntimeException /*-{
        this["keys"] = keys;
        return this;
    }-*/
    ;

    public final native String layoutAlgorithm()
        throws RuntimeException /*-{
        return this["layoutAlgorithm"] = (this["layoutAlgorithm"] || "sliceAndDice");
    }-*/
    ;

    public final native JsoSeriesTreemap layoutAlgorithm(String layoutAlgorithm)
        throws RuntimeException /*-{
        this["layoutAlgorithm"] = layoutAlgorithm;
        return this;
    }-*/
    ;

    public final native String layoutStartingDirection()
        throws RuntimeException /*-{
        return this["layoutStartingDirection"] = (this["layoutStartingDirection"] || "vertical");
    }-*/
    ;

    public final native JsoSeriesTreemap layoutStartingDirection(String layoutStartingDirection)
        throws RuntimeException /*-{
        this["layoutStartingDirection"] = layoutStartingDirection;
        return this;
    }-*/
    ;

    public final native double legendIndex()
        throws RuntimeException /*-{
        return this["legendIndex"] = (this["legendIndex"] || null);
    }-*/
    ;

    public final native JsoSeriesTreemap legendIndex(double legendIndex)
        throws RuntimeException /*-{
        this["legendIndex"] = legendIndex;
        return this;
    }-*/
    ;

    public final native boolean levelIsConstant()
        throws RuntimeException /*-{
        return this["levelIsConstant"] = (this["levelIsConstant"] || true);
    }-*/
    ;

    public final native JsoSeriesTreemap levelIsConstant(boolean levelIsConstant)
        throws RuntimeException /*-{
        this["levelIsConstant"] = levelIsConstant;
        return this;
    }-*/
    ;

    public final native com.github.highcharts4gwt.model.array.api.Array<Level> levels()
        throws RuntimeException /*-{
        return this["levels"] = (this["levels"] || []);
    }-*/
    ;

    public final native JsoSeriesTreemap levels(com.github.highcharts4gwt.model.array.api.Array<Level> levels)
        throws RuntimeException /*-{
        this["levels"] = levels;
        return this;
    }-*/
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || "");
    }-*/
    ;

    public final native JsoSeriesTreemap linkedTo(String linkedTo)
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

    public final native JsoSeriesTreemap name(String name)
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

    public final native JsoSeriesTreemap point(Point point)
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

    public final native JsoSeriesTreemap selected(boolean selected)
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

    public final native JsoSeriesTreemap shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoSeriesTreemap shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoSeriesTreemap showCheckbox(boolean showCheckbox)
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

    public final native JsoSeriesTreemap showInLegend(boolean showInLegend)
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

    public final native JsoSeriesTreemap states(States states)
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

    public final native JsoSeriesTreemap stickyTracking(boolean stickyTracking)
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

    public final native JsoSeriesTreemap tooltip(Tooltip tooltip)
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

    public final native JsoSeriesTreemap turboThreshold(double turboThreshold)
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

    public final native JsoSeriesTreemap type(String type)
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

    public final native JsoSeriesTreemap visible(boolean visible)
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

    public final native JsoSeriesTreemap xAxisAsNumber(double xAxisAsNumber)
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

    public final native JsoSeriesTreemap xAxisAsString(String xAxisAsString)
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

    public final native JsoSeriesTreemap yAxisAsNumber(double yAxisAsNumber)
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

    public final native JsoSeriesTreemap yAxisAsString(String yAxisAsString)
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

    public final native JsoSeriesTreemap zIndex(double zIndex)
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

    public final native JsoSeriesTreemap zoneAxis(String zoneAxis)
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

    public final native JsoSeriesTreemap zones(ArrayNumber zones)
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

    public final native JsoSeriesTreemap setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoSeriesTreemap setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
