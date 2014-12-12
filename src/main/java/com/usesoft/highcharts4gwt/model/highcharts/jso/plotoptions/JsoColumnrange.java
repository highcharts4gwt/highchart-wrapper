
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Columnrange;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoColumn;

public class JsoColumnrange
    extends JsoColumn
    implements Columnrange
{


    protected JsoColumnrange() {
    }

    public final native void addColumnrangeAfterAnimateHandler(ColumnrangeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeAfterAnimateHandler::onColumnrangeAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnrangeCheckboxClickHandler(ColumnrangeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeCheckboxClickHandler::onColumnrangeCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnrangeClickHandler(ColumnrangeClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeClickHandler::onColumnrangeClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnrangeHideHandler(ColumnrangeHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeHideHandler::onColumnrangeHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnrangeLegendItemClickHandler(ColumnrangeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeLegendItemClickHandler::onColumnrangeLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnrangeMouseOutHandler(ColumnrangeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOutHandler::onColumnrangeMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnrangeMouseOverHandler(ColumnrangeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOverHandler::onColumnrangeMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addColumnrangeShowHandler(ColumnrangeShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeShowHandler::onColumnrangeShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/columnrange/ColumnrangeShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}
