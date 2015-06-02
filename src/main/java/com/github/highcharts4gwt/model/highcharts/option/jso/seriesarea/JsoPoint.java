
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointUpdateHandler;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Properties for each single point
 * 
 */
public class JsoPoint
    extends JavaScriptObject
    implements Point
{


    protected JsoPoint() {
    }

    public final native void addPointClickHandler(PointClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointClickHandler::onPointClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/point/PointClickEvent;)(
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
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointMouseOutHandler::onPointMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/point/PointMouseOutEvent;)(
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
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointMouseOverHandler::onPointMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/point/PointMouseOverEvent;)(
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
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    remove: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointRemoveHandler::onPointRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/point/PointRemoveEvent;)(
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
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    select: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointSelectHandler::onPointSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/point/PointSelectEvent;)(
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
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    unselect: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointUnselectHandler::onPointUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/point/PointUnselectEvent;)(
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
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    update: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.point.PointUpdateHandler::onPointUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesarea/point/PointUpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoPoint setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoPoint setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
