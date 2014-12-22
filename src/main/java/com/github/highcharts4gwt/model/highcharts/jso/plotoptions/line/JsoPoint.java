
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointUpdateHandler;
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointClickHandler::onPointClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/line/point/PointClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointMouseOutHandler::onPointMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/line/point/PointMouseOutEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointMouseOverHandler::onPointMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/line/point/PointMouseOverEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointRemoveHandler::onPointRemove(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/line/point/PointRemoveEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointSelectHandler::onPointSelect(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/line/point/PointSelectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointUnselectHandler::onPointUnselect(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/line/point/PointUnselectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointUpdateHandler::onPointUpdate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/line/point/PointUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
