
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Gauge;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Dial;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Pivot;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoGauge
    extends JsoSeries
    implements Gauge
{


    protected JsoGauge() {
    }

    public final native Dial dial()
        throws RuntimeException /*-{
        return this["dial"] = (this["dial"] || {});
    }-*/
    ;

    public final native JsoGauge dial(Dial dial)
        throws RuntimeException /*-{
        this["dial"] = dial;
        return this;
    }-*/
    ;

    public final native void addGaugeAfterAnimateHandler(GaugeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeAfterAnimateHandler::onGaugeAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addGaugeCheckboxClickHandler(GaugeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeCheckboxClickHandler::onGaugeCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addGaugeClickHandler(GaugeClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeClickHandler::onGaugeClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addGaugeHideHandler(GaugeHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeHideHandler::onGaugeHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addGaugeLegendItemClickHandler(GaugeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeLegendItemClickHandler::onGaugeLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addGaugeMouseOutHandler(GaugeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOutHandler::onGaugeMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addGaugeMouseOverHandler(GaugeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOverHandler::onGaugeMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addGaugeShowHandler(GaugeShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeShowHandler::onGaugeShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/gauge/GaugeShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double overshoot()
        throws RuntimeException /*-{
        return this["overshoot"] = (this["overshoot"] || 0.0);
    }-*/
    ;

    public final native JsoGauge overshoot(double overshoot)
        throws RuntimeException /*-{
        this["overshoot"] = overshoot;
        return this;
    }-*/
    ;

    public final native Pivot pivot()
        throws RuntimeException /*-{
        return this["pivot"] = (this["pivot"] || {});
    }-*/
    ;

    public final native JsoGauge pivot(Pivot pivot)
        throws RuntimeException /*-{
        this["pivot"] = pivot;
        return this;
    }-*/
    ;

    public final native boolean wrap()
        throws RuntimeException /*-{
        return this["wrap"] = (this["wrap"] || true);
    }-*/
    ;

    public final native JsoGauge wrap(boolean wrap)
        throws RuntimeException /*-{
        this["wrap"] = wrap;
        return this;
    }-*/
    ;

}
