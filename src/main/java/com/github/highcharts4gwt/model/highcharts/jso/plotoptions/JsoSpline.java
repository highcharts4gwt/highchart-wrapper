
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Spline;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineShowHandler;
import com.github.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoSpline
    extends JsoSeries
    implements Spline
{


    protected JsoSpline() {
    }

    public final native void addSplineAfterAnimateHandler(SplineAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineAfterAnimateHandler::onSplineAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSplineCheckboxClickHandler(SplineCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineCheckboxClickHandler::onSplineCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSplineClickHandler(SplineClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineClickHandler::onSplineClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSplineHideHandler(SplineHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineHideHandler::onSplineHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSplineLegendItemClickHandler(SplineLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineLegendItemClickHandler::onSplineLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSplineMouseOutHandler(SplineMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOutHandler::onSplineMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSplineMouseOverHandler(SplineMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOverHandler::onSplineMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSplineShowHandler(SplineShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineShowHandler::onSplineShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/spline/SplineShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
