
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Heatmap;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapShowHandler;
import com.github.highcharts4gwt.model.highcharts.jso.plotoptions.JsoColumn;

public class JsoHeatmap
    extends JsoColumn
    implements Heatmap
{


    protected JsoHeatmap() {
    }

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

    public final native void addHeatmapAfterAnimateHandler(HeatmapAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapAfterAnimateHandler::onHeatmapAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapAfterAnimateEvent;)(
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
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickHandler::onHeatmapCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapCheckboxClickEvent;)(
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
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapClickHandler::onHeatmapClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapClickEvent;)(
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
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapHideHandler::onHeatmapHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapHideEvent;)(
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
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapLegendItemClickHandler::onHeatmapLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapLegendItemClickEvent;)(
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
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOutHandler::onHeatmapMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapMouseOutEvent;)(
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
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOverHandler::onHeatmapMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapMouseOverEvent;)(
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
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapShowHandler::onHeatmapShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/heatmap/HeatmapShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
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

}
