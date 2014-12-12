
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;
import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Pie;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoPie
    extends JsoSeries
    implements Pie
{


    protected JsoPie() {
    }

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoPie borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 1.0);
    }-*/
    ;

    public final native JsoPie borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native ArrayString centerAsArrayString()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || [null, null]);
    }-*/
    ;

    public final native JsoPie centerAsArrayString(ArrayString centerAsArrayString)
        throws RuntimeException /*-{
        this["center"] = centerAsArrayString;
        return this;
    }-*/
    ;

    public final native ArrayNumber centerAsArrayNumber()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || [null, null]);
    }-*/
    ;

    public final native JsoPie centerAsArrayNumber(ArrayNumber centerAsArrayNumber)
        throws RuntimeException /*-{
        this["center"] = centerAsArrayNumber;
        return this;
    }-*/
    ;

    public final native ArrayString colors()
        throws RuntimeException /*-{
        return this["colors"] = (this["colors"] || []);
    }-*/
    ;

    public final native JsoPie colors(ArrayString colors)
        throws RuntimeException /*-{
        this["colors"] = colors;
        return this;
    }-*/
    ;

    public final native double depth()
        throws RuntimeException /*-{
        return this["depth"] = (this["depth"] || 0.0);
    }-*/
    ;

    public final native JsoPie depth(double depth)
        throws RuntimeException /*-{
        this["depth"] = depth;
        return this;
    }-*/
    ;

    public final native double endAngle()
        throws RuntimeException /*-{
        return this["endAngle"] = (this["endAngle"] || null);
    }-*/
    ;

    public final native JsoPie endAngle(double endAngle)
        throws RuntimeException /*-{
        this["endAngle"] = endAngle;
        return this;
    }-*/
    ;

    public final native void addPieAfterAnimateHandler(PieAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieAfterAnimateHandler::onPieAfterAnimate(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPieCheckboxClickHandler(PieCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieCheckboxClickHandler::onPieCheckboxClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPieClickHandler(PieClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieClickHandler::onPieClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPieHideHandler(PieHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieHideHandler::onPieHide(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPieLegendItemClickHandler(PieLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieLegendItemClickHandler::onPieLegendItemClick(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPieMouseOutHandler(PieMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOutHandler::onPieMouseOut(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPieMouseOverHandler(PieMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverHandler::onPieMouseOver(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPieShowHandler(PieShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowHandler::onPieShow(Lcom/usesoft/highcharts4gwt/model/highcharts/api/plotoptions/pie/PieShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native boolean ignoreHiddenPoint()
        throws RuntimeException /*-{
        return this["ignoreHiddenPoint"] = (this["ignoreHiddenPoint"] || true);
    }-*/
    ;

    public final native JsoPie ignoreHiddenPoint(boolean ignoreHiddenPoint)
        throws RuntimeException /*-{
        this["ignoreHiddenPoint"] = ignoreHiddenPoint;
        return this;
    }-*/
    ;

    public final native String innerSizeAsString()
        throws RuntimeException /*-{
        return this["innerSize"] = (this["innerSize"] || "0");
    }-*/
    ;

    public final native JsoPie innerSizeAsString(String innerSizeAsString)
        throws RuntimeException /*-{
        this["innerSize"] = innerSizeAsString;
        return this;
    }-*/
    ;

    public final native double innerSizeAsNumber()
        throws RuntimeException /*-{
        return this["innerSize"] = (this["innerSize"] || 0.0);
    }-*/
    ;

    public final native JsoPie innerSizeAsNumber(double innerSizeAsNumber)
        throws RuntimeException /*-{
        this["innerSize"] = innerSizeAsNumber;
        return this;
    }-*/
    ;

    public final native double minSize()
        throws RuntimeException /*-{
        return this["minSize"] = (this["minSize"] || 80.0);
    }-*/
    ;

    public final native JsoPie minSize(double minSize)
        throws RuntimeException /*-{
        this["minSize"] = minSize;
        return this;
    }-*/
    ;

    public final native String sizeAsString()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || "");
    }-*/
    ;

    public final native JsoPie sizeAsString(String sizeAsString)
        throws RuntimeException /*-{
        this["size"] = sizeAsString;
        return this;
    }-*/
    ;

    public final native double sizeAsNumber()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || '');
    }-*/
    ;

    public final native JsoPie sizeAsNumber(double sizeAsNumber)
        throws RuntimeException /*-{
        this["size"] = sizeAsNumber;
        return this;
    }-*/
    ;

    public final native double slicedOffset()
        throws RuntimeException /*-{
        return this["slicedOffset"] = (this["slicedOffset"] || 10.0);
    }-*/
    ;

    public final native JsoPie slicedOffset(double slicedOffset)
        throws RuntimeException /*-{
        this["slicedOffset"] = slicedOffset;
        return this;
    }-*/
    ;

    public final native double startAngle()
        throws RuntimeException /*-{
        return this["startAngle"] = (this["startAngle"] || 0.0);
    }-*/
    ;

    public final native JsoPie startAngle(double startAngle)
        throws RuntimeException /*-{
        this["startAngle"] = startAngle;
        return this;
    }-*/
    ;

}
