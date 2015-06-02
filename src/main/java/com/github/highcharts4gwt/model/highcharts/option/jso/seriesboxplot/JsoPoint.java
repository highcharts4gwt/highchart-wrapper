
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointUpdateHandler;
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointClickHandler::onPointClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/point/PointClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointMouseOutHandler::onPointMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/point/PointMouseOutEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointMouseOverHandler::onPointMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/point/PointMouseOverEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointRemoveHandler::onPointRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/point/PointRemoveEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointSelectHandler::onPointSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/point/PointSelectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointUnselectHandler::onPointUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/point/PointUnselectEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.point.PointUpdateHandler::onPointUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesboxplot/point/PointUpdateEvent;)(
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
