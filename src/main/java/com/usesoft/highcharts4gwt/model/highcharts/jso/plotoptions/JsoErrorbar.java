
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Errorbar;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoBoxplot;

public class JsoErrorbar
    extends JsoBoxplot
    implements Errorbar
{


    protected JsoErrorbar() {
    }

    public final native void addErrorbarAfterAnimateHandler(ErrorbarAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler::onErrorbarAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addErrorbarCheckboxClickHandler(ErrorbarCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler::onErrorbarCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addErrorbarClickHandler(ErrorbarClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickHandler::onErrorbarClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addErrorbarHideHandler(ErrorbarHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideHandler::onErrorbarHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addErrorbarLegendItemClickHandler(ErrorbarLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler::onErrorbarLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addErrorbarMouseOutHandler(ErrorbarMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutHandler::onErrorbarMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addErrorbarMouseOverHandler(ErrorbarMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverHandler::onErrorbarMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addErrorbarShowHandler(ErrorbarShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowHandler::onErrorbarShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
