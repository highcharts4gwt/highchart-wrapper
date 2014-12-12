
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoArea
    extends JsoSeries
    implements Area
{


    protected JsoArea() {
    }

    public final native void addAreaAfterAnimateHandler(AreaAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaAfterAnimateHandler::onAreaAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreaCheckboxClickHandler(AreaCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaCheckboxClickHandler::onAreaCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreaClickHandler(AreaClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaClickHandler::onAreaClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreaHideHandler(AreaHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaHideHandler::onAreaHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreaLegendItemClickHandler(AreaLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaLegendItemClickHandler::onAreaLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreaMouseOutHandler(AreaMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOutHandler::onAreaMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreaMouseOverHandler(AreaMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOverHandler::onAreaMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreaShowHandler(AreaShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaShowHandler::onAreaShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/area/AreaShowEvent;)(
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

    public final native JsoArea fillColor(String fillColor)
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

    public final native JsoArea fillOpacity(double fillOpacity)
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

    public final native JsoArea lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native String negativeFillColor()
        throws RuntimeException /*-{
        return this["negativeFillColor"] = (this["negativeFillColor"] || "");
    }-*/
    ;

    public final native JsoArea negativeFillColor(String negativeFillColor)
        throws RuntimeException /*-{
        this["negativeFillColor"] = negativeFillColor;
        return this;
    }-*/
    ;

    public final native String step()
        throws RuntimeException /*-{
        return this["step"] = (this["step"] || "false");
    }-*/
    ;

    public final native JsoArea step(String step)
        throws RuntimeException /*-{
        this["step"] = step;
        return this;
    }-*/
    ;

    public final native boolean trackByArea()
        throws RuntimeException /*-{
        return this["trackByArea"] = (this["trackByArea"] || false);
    }-*/
    ;

    public final native JsoArea trackByArea(boolean trackByArea)
        throws RuntimeException /*-{
        this["trackByArea"] = trackByArea;
        return this;
    }-*/
    ;

}
