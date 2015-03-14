
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Treemap;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Level;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapShowHandler;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * The size of the point shape is determined by its value relative to its siblings values.
 * Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
 * 
 */
public class JsoTreemap
    extends JavaScriptObject
    implements Treemap
{


    protected JsoTreemap() {
    }

    public final native boolean allowDrillToNode()
        throws RuntimeException /*-{
        return this["allowDrillToNode"] = (this["allowDrillToNode"] || false);
    }-*/
    ;

    public final native JsoTreemap allowDrillToNode(boolean allowDrillToNode)
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

    public final native JsoTreemap allowPointSelect(boolean allowPointSelect)
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

    public final native JsoTreemap alternateStartingDirection(boolean alternateStartingDirection)
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

    public final native JsoTreemap animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native double borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || null);
    }-*/
    ;

    public final native JsoTreemap borderColor(double borderColor)
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

    public final native JsoTreemap borderWidth(double borderWidth)
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

    public final native JsoTreemap color(String color)
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

    public final native JsoTreemap colorByPoint(boolean colorByPoint)
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

    public final native JsoTreemap colors(ArrayString colors)
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

    public final native JsoTreemap cropThreshold(double cropThreshold)
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

    public final native JsoTreemap cursor(String cursor)
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

    public final native JsoTreemap dataLabels(DataLabels dataLabels)
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

    public final native JsoTreemap enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addTreemapAfterAnimateHandler(TreemapAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapAfterAnimateHandler::onTreemapAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addTreemapCheckboxClickHandler(TreemapCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapCheckboxClickHandler::onTreemapCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addTreemapClickHandler(TreemapClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapClickHandler::onTreemapClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addTreemapHideHandler(TreemapHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapHideHandler::onTreemapHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addTreemapLegendItemClickHandler(TreemapLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapLegendItemClickHandler::onTreemapLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addTreemapMouseOutHandler(TreemapMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOutHandler::onTreemapMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addTreemapMouseOverHandler(TreemapMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOverHandler::onTreemapMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addTreemapShowHandler(TreemapShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapShowHandler::onTreemapShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/treemap/TreemapShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native boolean interactByLeaf()
        throws RuntimeException /*-{
        return this["interactByLeaf"] = (this["interactByLeaf"] || false);
    }-*/
    ;

    public final native JsoTreemap interactByLeaf(boolean interactByLeaf)
        throws RuntimeException /*-{
        this["interactByLeaf"] = interactByLeaf;
        return this;
    }-*/
    ;

    public final native String layoutAlgorithm()
        throws RuntimeException /*-{
        return this["layoutAlgorithm"] = (this["layoutAlgorithm"] || "sliceAndDice");
    }-*/
    ;

    public final native JsoTreemap layoutAlgorithm(String layoutAlgorithm)
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

    public final native JsoTreemap layoutStartingDirection(String layoutStartingDirection)
        throws RuntimeException /*-{
        this["layoutStartingDirection"] = layoutStartingDirection;
        return this;
    }-*/
    ;

    public final native boolean levelIsConstant()
        throws RuntimeException /*-{
        return this["levelIsConstant"] = (this["levelIsConstant"] || true);
    }-*/
    ;

    public final native JsoTreemap levelIsConstant(boolean levelIsConstant)
        throws RuntimeException /*-{
        this["levelIsConstant"] = levelIsConstant;
        return this;
    }-*/
    ;

    public final native Array<Level> levels()
        throws RuntimeException /*-{
        return this["levels"] = (this["levels"] || []);
    }-*/
    ;

    public final native JsoTreemap levels(Array<Level> levels)
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

    public final native JsoTreemap linkedTo(String linkedTo)
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

    public final native JsoTreemap point(Point point)
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

    public final native JsoTreemap selected(boolean selected)
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

    public final native JsoTreemap shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoTreemap shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoTreemap showCheckbox(boolean showCheckbox)
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

    public final native JsoTreemap showInLegend(boolean showInLegend)
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

    public final native JsoTreemap states(States states)
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

    public final native JsoTreemap stickyTracking(boolean stickyTracking)
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

    public final native JsoTreemap tooltip(Tooltip tooltip)
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

    public final native JsoTreemap turboThreshold(double turboThreshold)
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

    public final native JsoTreemap visible(boolean visible)
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

    public final native JsoTreemap zoneAxis(String zoneAxis)
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

    public final native JsoTreemap zones(ArrayNumber zones)
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

    public final native JsoTreemap setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoTreemap setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + valueToBeEvaluated + ')');
        return this;
    }-*/
    ;

}
