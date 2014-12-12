
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Line;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoLine
    extends JsoSeries
    implements Line
{


    protected JsoLine() {
    }

    public final native void addLineAfterAnimateHandler(LineAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineAfterAnimateHandler::onLineAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLineCheckboxClickHandler(LineCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickHandler::onLineCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLineClickHandler(LineClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineClickHandler::onLineClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLineHideHandler(LineHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineHideHandler::onLineHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLineLegendItemClickHandler(LineLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickHandler::onLineLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLineMouseOutHandler(LineMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOutHandler::onLineMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLineMouseOverHandler(LineMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOverHandler::onLineMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addLineShowHandler(LineShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineShowHandler::onLineShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/line/LineShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String step()
        throws RuntimeException /*-{
        return this["step"] = (this["step"] || "false");
    }-*/
    ;

    public final native JsoLine step(String step)
        throws RuntimeException /*-{
        this["step"] = step;
        return this;
    }-*/
    ;

}
