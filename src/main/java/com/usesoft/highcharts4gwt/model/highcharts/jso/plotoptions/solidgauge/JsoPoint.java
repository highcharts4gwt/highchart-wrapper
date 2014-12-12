
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.solidgauge;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.Point;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointRemoveHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointSelectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointUnselectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointUpdateHandler;

public class JsoPoint
    extends JavaScriptObject
    implements Point
{


    protected JsoPoint() {
    }

    public final native void addPointClickHandler(PointClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointClickHandler::onPointClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/point/PointClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPointMouseOutHandler(PointMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointMouseOutHandler::onPointMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/point/PointMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPointMouseOverHandler(PointMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointMouseOverHandler::onPointMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/point/PointMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPointRemoveHandler(PointRemoveHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    remove: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointRemoveHandler::onPointRemove(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/point/PointRemoveEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPointSelectHandler(PointSelectHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    select: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointSelectHandler::onPointSelect(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/point/PointSelectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPointUnselectHandler(PointUnselectHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    unselect: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointUnselectHandler::onPointUnselect(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/point/PointUnselectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPointUpdateHandler(PointUpdateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    update: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.point.PointUpdateHandler::onPointUpdate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/point/PointUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
