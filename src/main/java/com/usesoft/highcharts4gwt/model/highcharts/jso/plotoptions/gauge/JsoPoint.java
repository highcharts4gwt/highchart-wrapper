
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.gauge;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Point;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointRemoveHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointSelectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointUnselectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointUpdateHandler;

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
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointClickHandler::onPointClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/point/PointClickEvent;)(
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
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointMouseOutHandler::onPointMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/point/PointMouseOutEvent;)(
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
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointMouseOverHandler::onPointMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/point/PointMouseOverEvent;)(
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
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointRemoveHandler::onPointRemove(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/point/PointRemoveEvent;)(
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
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointSelectHandler::onPointSelect(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/point/PointSelectEvent;)(
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
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointUnselectHandler::onPointUnselect(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/point/PointUnselectEvent;)(
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
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.point.PointUpdateHandler::onPointUpdate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/point/PointUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
