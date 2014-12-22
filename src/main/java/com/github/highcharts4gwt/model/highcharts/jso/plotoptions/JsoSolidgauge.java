
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Solidgauge;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.jso.plotoptions.JsoGauge;

public class JsoSolidgauge
    extends JsoGauge
    implements Solidgauge
{


    protected JsoSolidgauge() {
    }

    public final native void addSolidgaugeAfterAnimateHandler(SolidgaugeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeAfterAnimateHandler::onSolidgaugeAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSolidgaugeCheckboxClickHandler(SolidgaugeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeCheckboxClickHandler::onSolidgaugeCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSolidgaugeClickHandler(SolidgaugeClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeClickHandler::onSolidgaugeClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSolidgaugeHideHandler(SolidgaugeHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeHideHandler::onSolidgaugeHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSolidgaugeLegendItemClickHandler(SolidgaugeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeLegendItemClickHandler::onSolidgaugeLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSolidgaugeMouseOutHandler(SolidgaugeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOutHandler::onSolidgaugeMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSolidgaugeMouseOverHandler(SolidgaugeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOverHandler::onSolidgaugeMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSolidgaugeShowHandler(SolidgaugeShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeShowHandler::onSolidgaugeShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/solidgauge/SolidgaugeShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
