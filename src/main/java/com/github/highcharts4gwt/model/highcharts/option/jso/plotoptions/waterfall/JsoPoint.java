
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.UpdateHandler;
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

    public final native void addClickHandler(ClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.ClickHandler::onClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/waterfall/point/ClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOutHandler(MouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.MouseOutHandler::onMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/waterfall/point/MouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOverHandler(MouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.MouseOverHandler::onMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/waterfall/point/MouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addRemoveHandler(RemoveHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    remove: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.RemoveHandler::onRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/waterfall/point/RemoveEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSelectHandler(SelectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    select: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.SelectHandler::onSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/waterfall/point/SelectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addUnselectHandler(UnselectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    unselect: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.UnselectHandler::onUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/waterfall/point/UnselectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addUpdateHandler(UpdateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    update: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.UpdateHandler::onUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/plotoptions/waterfall/point/UpdateEvent;)(
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
