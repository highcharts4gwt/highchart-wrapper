
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Pyramid;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidShowHandler;
import com.github.highcharts4gwt.model.highcharts.jso.plotoptions.JsoFunnel;

public class JsoPyramid
    extends JsoFunnel
    implements Pyramid
{


    protected JsoPyramid() {
    }

    public final native void addPyramidAfterAnimateHandler(PyramidAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidAfterAnimateHandler::onPyramidAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPyramidCheckboxClickHandler(PyramidCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidCheckboxClickHandler::onPyramidCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPyramidClickHandler(PyramidClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidClickHandler::onPyramidClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPyramidHideHandler(PyramidHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidHideHandler::onPyramidHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPyramidLegendItemClickHandler(PyramidLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidLegendItemClickHandler::onPyramidLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPyramidMouseOutHandler(PyramidMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOutHandler::onPyramidMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPyramidMouseOverHandler(PyramidMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOverHandler::onPyramidMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPyramidShowHandler(PyramidShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidShowHandler::onPyramidShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/pyramid/PyramidShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
