
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Waterfall;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoColumn;

public class JsoWaterfall
    extends JsoColumn
    implements Waterfall
{


    protected JsoWaterfall() {
    }

    public final native void addWaterfallAfterAnimateHandler(WaterfallAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallAfterAnimateHandler::onWaterfallAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addWaterfallCheckboxClickHandler(WaterfallCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallCheckboxClickHandler::onWaterfallCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addWaterfallClickHandler(WaterfallClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallClickHandler::onWaterfallClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addWaterfallHideHandler(WaterfallHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallHideHandler::onWaterfallHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addWaterfallLegendItemClickHandler(WaterfallLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallLegendItemClickHandler::onWaterfallLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addWaterfallMouseOutHandler(WaterfallMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOutHandler::onWaterfallMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addWaterfallMouseOverHandler(WaterfallMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOverHandler::onWaterfallMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addWaterfallShowHandler(WaterfallShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallShowHandler::onWaterfallShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/waterfall/WaterfallShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "#333333");
    }-*/
    ;

    public final native JsoWaterfall lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native String upColor()
        throws RuntimeException /*-{
        return this["upColor"] = (this["upColor"] || "");
    }-*/
    ;

    public final native JsoWaterfall upColor(String upColor)
        throws RuntimeException /*-{
        this["upColor"] = upColor;
        return this;
    }-*/
    ;

}
