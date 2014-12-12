
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Scatter;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoScatter
    extends JsoSeries
    implements Scatter
{


    protected JsoScatter() {
    }

    public final native void addScatterAfterAnimateHandler(ScatterAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterAfterAnimateHandler::onScatterAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addScatterCheckboxClickHandler(ScatterCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterCheckboxClickHandler::onScatterCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addScatterClickHandler(ScatterClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterClickHandler::onScatterClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addScatterHideHandler(ScatterHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterHideHandler::onScatterHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addScatterLegendItemClickHandler(ScatterLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterLegendItemClickHandler::onScatterLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addScatterMouseOutHandler(ScatterMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOutHandler::onScatterMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addScatterMouseOverHandler(ScatterMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOverHandler::onScatterMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addScatterShowHandler(ScatterShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterShowHandler::onScatterShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/scatter/ScatterShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
