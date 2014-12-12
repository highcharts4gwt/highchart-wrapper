
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Areaspline;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoArea;

public class JsoAreaspline
    extends JsoArea
    implements Areaspline
{


    protected JsoAreaspline() {
    }

    public final native void addAreasplineAfterAnimateHandler(AreasplineAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineAfterAnimateHandler::onAreasplineAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplineCheckboxClickHandler(AreasplineCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineCheckboxClickHandler::onAreasplineCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplineClickHandler(AreasplineClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineClickHandler::onAreasplineClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplineHideHandler(AreasplineHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineHideHandler::onAreasplineHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplineLegendItemClickHandler(AreasplineLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineLegendItemClickHandler::onAreasplineLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplineMouseOutHandler(AreasplineMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOutHandler::onAreasplineMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplineMouseOverHandler(AreasplineMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOverHandler::onAreasplineMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplineShowHandler(AreasplineShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineShowHandler::onAreasplineShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/areaspline/AreasplineShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
