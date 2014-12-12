
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Arearange;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoArea;

public class JsoArearange
    extends JsoArea
    implements Arearange
{


    protected JsoArearange() {
    }

    public final native void addArearangeAfterAnimateHandler(ArearangeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeAfterAnimateHandler::onArearangeAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addArearangeCheckboxClickHandler(ArearangeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeCheckboxClickHandler::onArearangeCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addArearangeClickHandler(ArearangeClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeClickHandler::onArearangeClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addArearangeHideHandler(ArearangeHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeHideHandler::onArearangeHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addArearangeLegendItemClickHandler(ArearangeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeLegendItemClickHandler::onArearangeLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addArearangeMouseOutHandler(ArearangeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOutHandler::onArearangeMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addArearangeMouseOverHandler(ArearangeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOverHandler::onArearangeMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addArearangeShowHandler(ArearangeShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeShowHandler::onArearangeShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/arearange/ArearangeShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
