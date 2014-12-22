
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointUpdateHandler;
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointClickHandler::onPointClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/scatter/point/PointClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointMouseOutHandler::onPointMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/scatter/point/PointMouseOutEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointMouseOverHandler::onPointMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/scatter/point/PointMouseOverEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointRemoveHandler::onPointRemove(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/scatter/point/PointRemoveEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointSelectHandler::onPointSelect(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/scatter/point/PointSelectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointUnselectHandler::onPointUnselect(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/scatter/point/PointUnselectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.point.PointUpdateHandler::onPointUpdate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/scatter/point/PointUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
