
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.Areasplinerange;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoAreasplinerange
    extends JavaScriptObject
    implements Areasplinerange
{


    protected JsoAreasplinerange() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoAreasplinerange allowPointSelect(boolean allowPointSelect)
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

    public final native JsoAreasplinerange animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoAreasplinerange color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native boolean connectNulls()
        throws RuntimeException /*-{
        return this["connectNulls"] = (this["connectNulls"] || false);
    }-*/
    ;

    public final native JsoAreasplinerange connectNulls(boolean connectNulls)
        throws RuntimeException /*-{
        this["connectNulls"] = connectNulls;
        return this;
    }-*/
    ;

    public final native double cropThreshold()
        throws RuntimeException /*-{
        return this["cropThreshold"] = (this["cropThreshold"] || 300.0);
    }-*/
    ;

    public final native JsoAreasplinerange cropThreshold(double cropThreshold)
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

    public final native JsoAreasplinerange cursor(String cursor)
        throws RuntimeException /*-{
        this["cursor"] = cursor;
        return this;
    }-*/
    ;

    public final native String dashStyle()
        throws RuntimeException /*-{
        return this["dashStyle"] = (this["dashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoAreasplinerange dashStyle(String dashStyle)
        throws RuntimeException /*-{
        this["dashStyle"] = dashStyle;
        return this;
    }-*/
    ;

    public final native DataLabels dataLabels()
        throws RuntimeException /*-{
        return this["dataLabels"] = (this["dataLabels"] || {});
    }-*/
    ;

    public final native JsoAreasplinerange dataLabels(DataLabels dataLabels)
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

    public final native JsoAreasplinerange enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addAreasplinerangeAfterAnimateHandler(AreasplinerangeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateHandler::onAreasplinerangeAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeCheckboxClickHandler(AreasplinerangeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeCheckboxClickHandler::onAreasplinerangeCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeClickHandler(AreasplinerangeClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeClickHandler::onAreasplinerangeClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeHideHandler(AreasplinerangeHideHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeHideHandler::onAreasplinerangeHide(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeLegendItemClickHandler(AreasplinerangeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickHandler::onAreasplinerangeLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeMouseOutHandler(AreasplinerangeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeMouseOutHandler::onAreasplinerangeMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeMouseOverHandler(AreasplinerangeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeMouseOverHandler::onAreasplinerangeMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeShowHandler(AreasplinerangeShowHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeShowHandler::onAreasplinerangeShow(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/areasplinerange/AreasplinerangeShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "null");
    }-*/
    ;

    public final native JsoAreasplinerange fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native double fillOpacity()
        throws RuntimeException /*-{
        return this["fillOpacity"] = (this["fillOpacity"] || 0.75);
    }-*/
    ;

    public final native JsoAreasplinerange fillOpacity(double fillOpacity)
        throws RuntimeException /*-{
        this["fillOpacity"] = fillOpacity;
        return this;
    }-*/
    ;

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "null");
    }-*/
    ;

    public final native JsoAreasplinerange lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoAreasplinerange lineWidth(double lineWidth)
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

    public final native JsoAreasplinerange linkedTo(String linkedTo)
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

    public final native JsoAreasplinerange negativeColor(String negativeColor)
        throws RuntimeException /*-{
        this["negativeColor"] = negativeColor;
        return this;
    }-*/
    ;

    public final native String negativeFillColor()
        throws RuntimeException /*-{
        return this["negativeFillColor"] = (this["negativeFillColor"] || "");
    }-*/
    ;

    public final native JsoAreasplinerange negativeFillColor(String negativeFillColor)
        throws RuntimeException /*-{
        this["negativeFillColor"] = negativeFillColor;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoAreasplinerange point(Point point)
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

    public final native JsoAreasplinerange pointInterval(double pointInterval)
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

    public final native JsoAreasplinerange pointIntervalUnit(String pointIntervalUnit)
        throws RuntimeException /*-{
        this["pointIntervalUnit"] = pointIntervalUnit;
        return this;
    }-*/
    ;

    public final native String pointPlacementAsString()
        throws RuntimeException /*-{
        return this["pointPlacement"] = (this["pointPlacement"] || "null");
    }-*/
    ;

    public final native JsoAreasplinerange pointPlacementAsString(String pointPlacementAsString)
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

    public final native JsoAreasplinerange pointPlacementAsNumber(double pointPlacementAsNumber)
        throws RuntimeException /*-{
        this["pointPlacement"] = pointPlacementAsNumber;
        return this;
    }-*/
    ;

    public final native double pointStart()
        throws RuntimeException /*-{
        return this["pointStart"] = (this["pointStart"] || 0.0);
    }-*/
    ;

    public final native JsoAreasplinerange pointStart(double pointStart)
        throws RuntimeException /*-{
        this["pointStart"] = pointStart;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoAreasplinerange selected(boolean selected)
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

    public final native JsoAreasplinerange shadowAsBoolean(boolean shadowAsBoolean)
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

    public final native JsoAreasplinerange shadowAsJsonString(String shadowAsJsonString)
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

    public final native JsoAreasplinerange showCheckbox(boolean showCheckbox)
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

    public final native JsoAreasplinerange showInLegend(boolean showInLegend)
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

    public final native JsoAreasplinerange states(States states)
        throws RuntimeException /*-{
        this["states"] = states;
        return this;
    }-*/
    ;

    public final native String step()
        throws RuntimeException /*-{
        return this["step"] = (this["step"] || "false");
    }-*/
    ;

    public final native JsoAreasplinerange step(String step)
        throws RuntimeException /*-{
        this["step"] = step;
        return this;
    }-*/
    ;

    public final native boolean stickyTracking()
        throws RuntimeException /*-{
        return this["stickyTracking"] = (this["stickyTracking"] || true);
    }-*/
    ;

    public final native JsoAreasplinerange stickyTracking(boolean stickyTracking)
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

    public final native JsoAreasplinerange tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native boolean trackByArea()
        throws RuntimeException /*-{
        return this["trackByArea"] = (this["trackByArea"] || true);
    }-*/
    ;

    public final native JsoAreasplinerange trackByArea(boolean trackByArea)
        throws RuntimeException /*-{
        this["trackByArea"] = trackByArea;
        return this;
    }-*/
    ;

    public final native double turboThreshold()
        throws RuntimeException /*-{
        return this["turboThreshold"] = (this["turboThreshold"] || 1000.0);
    }-*/
    ;

    public final native JsoAreasplinerange turboThreshold(double turboThreshold)
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

    public final native JsoAreasplinerange visible(boolean visible)
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

    public final native JsoAreasplinerange zoneAxis(String zoneAxis)
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

    public final native JsoAreasplinerange zones(ArrayNumber zones)
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

    public final native JsoAreasplinerange setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
