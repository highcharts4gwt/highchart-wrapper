
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Bar;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoColumn;

public class JsoBar
    extends JsoColumn
    implements Bar
{


    protected JsoBar() {
    }

    public final native void addBarAfterAnimateHandler(BarAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarAfterAnimateHandler::onBarAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBarCheckboxClickHandler(BarCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarCheckboxClickHandler::onBarCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBarClickHandler(BarClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarClickHandler::onBarClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBarHideHandler(BarHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarHideHandler::onBarHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBarLegendItemClickHandler(BarLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarLegendItemClickHandler::onBarLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBarMouseOutHandler(BarMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOutHandler::onBarMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBarMouseOverHandler(BarMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOverHandler::onBarMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBarShowHandler(BarShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarShowHandler::onBarShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/bar/BarShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
