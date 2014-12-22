
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointUpdateHandler;
import com.google.gwt.core.client.JavaScriptObject;

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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointClickHandler::onPointClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/point/PointClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointMouseOutHandler::onPointMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/point/PointMouseOutEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointMouseOverHandler::onPointMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/point/PointMouseOverEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointRemoveHandler::onPointRemove(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/point/PointRemoveEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointSelectHandler::onPointSelect(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/point/PointSelectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointUnselectHandler::onPointUnselect(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/point/PointUnselectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.point.PointUpdateHandler::onPointUpdate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/point/PointUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
