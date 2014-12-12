
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoColumn;

public class JsoBoxplot
    extends JsoColumn
    implements Boxplot
{


    protected JsoBoxplot() {
    }

    public final native void addBoxplotAfterAnimateHandler(BoxplotAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotAfterAnimateHandler::onBoxplotAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotCheckboxClickHandler(BoxplotCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotCheckboxClickHandler::onBoxplotCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotClickHandler(BoxplotClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotClickHandler::onBoxplotClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotHideHandler(BoxplotHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotHideHandler::onBoxplotHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotLegendItemClickHandler(BoxplotLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotLegendItemClickHandler::onBoxplotLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotMouseOutHandler(BoxplotMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOutHandler::onBoxplotMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotMouseOverHandler(BoxplotMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOverHandler::onBoxplotMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBoxplotShowHandler(BoxplotShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotShowHandler::onBoxplotShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/boxplot/BoxplotShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String fillColor()
        throws RuntimeException /*-{
        return this["fillColor"] = (this["fillColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoBoxplot fillColor(String fillColor)
        throws RuntimeException /*-{
        this["fillColor"] = fillColor;
        return this;
    }-*/
    ;

    public final native String medianColor()
        throws RuntimeException /*-{
        return this["medianColor"] = (this["medianColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot medianColor(String medianColor)
        throws RuntimeException /*-{
        this["medianColor"] = medianColor;
        return this;
    }-*/
    ;

    public final native double medianWidth()
        throws RuntimeException /*-{
        return this["medianWidth"] = (this["medianWidth"] || 2.0);
    }-*/
    ;

    public final native JsoBoxplot medianWidth(double medianWidth)
        throws RuntimeException /*-{
        this["medianWidth"] = medianWidth;
        return this;
    }-*/
    ;

    public final native String stemColor()
        throws RuntimeException /*-{
        return this["stemColor"] = (this["stemColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot stemColor(String stemColor)
        throws RuntimeException /*-{
        this["stemColor"] = stemColor;
        return this;
    }-*/
    ;

    public final native String stemDashStyle()
        throws RuntimeException /*-{
        return this["stemDashStyle"] = (this["stemDashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoBoxplot stemDashStyle(String stemDashStyle)
        throws RuntimeException /*-{
        this["stemDashStyle"] = stemDashStyle;
        return this;
    }-*/
    ;

    public final native double stemWidth()
        throws RuntimeException /*-{
        return this["stemWidth"] = (this["stemWidth"] || null);
    }-*/
    ;

    public final native JsoBoxplot stemWidth(double stemWidth)
        throws RuntimeException /*-{
        this["stemWidth"] = stemWidth;
        return this;
    }-*/
    ;

    public final native String whiskerColor()
        throws RuntimeException /*-{
        return this["whiskerColor"] = (this["whiskerColor"] || "null");
    }-*/
    ;

    public final native JsoBoxplot whiskerColor(String whiskerColor)
        throws RuntimeException /*-{
        this["whiskerColor"] = whiskerColor;
        return this;
    }-*/
    ;

    public final native double whiskerLengthAsNumber()
        throws RuntimeException /*-{
        return this["whiskerLength"] = (this["whiskerLength"] || null);
    }-*/
    ;

    public final native JsoBoxplot whiskerLengthAsNumber(double whiskerLengthAsNumber)
        throws RuntimeException /*-{
        this["whiskerLength"] = whiskerLengthAsNumber;
        return this;
    }-*/
    ;

    public final native String whiskerLengthAsString()
        throws RuntimeException /*-{
        return this["whiskerLength"] = (this["whiskerLength"] || "50%");
    }-*/
    ;

    public final native JsoBoxplot whiskerLengthAsString(String whiskerLengthAsString)
        throws RuntimeException /*-{
        this["whiskerLength"] = whiskerLengthAsString;
        return this;
    }-*/
    ;

    public final native double whiskerWidth()
        throws RuntimeException /*-{
        return this["whiskerWidth"] = (this["whiskerWidth"] || 2.0);
    }-*/
    ;

    public final native JsoBoxplot whiskerWidth(double whiskerWidth)
        throws RuntimeException /*-{
        this["whiskerWidth"] = whiskerWidth;
        return this;
    }-*/
    ;

}
