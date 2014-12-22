
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Errorbar;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowHandler;
import com.github.highcharts4gwt.model.highcharts.jso.plotoptions.JsoBoxplot;

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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler::onErrorbarAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarAfterAnimateEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler::onErrorbarCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarCheckboxClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickHandler::onErrorbarClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideHandler::onErrorbarHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarHideEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler::onErrorbarLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarLegendItemClickEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutHandler::onErrorbarMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarMouseOutEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverHandler::onErrorbarMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarMouseOverEvent;)(
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
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowHandler::onErrorbarShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/errorbar/ErrorbarShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
