
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Bubble;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleShowHandler;
import com.github.highcharts4gwt.model.highcharts.jso.plotoptions.JsoScatter;

public class JsoBubble
    extends JsoScatter
    implements Bubble
{


    protected JsoBubble() {
    }

    public final native boolean displayNegative()
        throws RuntimeException /*-{
        return this["displayNegative"] = (this["displayNegative"] || true);
    }-*/
    ;

    public final native JsoBubble displayNegative(boolean displayNegative)
        throws RuntimeException /*-{
        this["displayNegative"] = displayNegative;
        return this;
    }-*/
    ;

    public final native void addBubbleAfterAnimateHandler(BubbleAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleAfterAnimateHandler::onBubbleAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleCheckboxClickHandler(BubbleCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickHandler::onBubbleCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleClickHandler(BubbleClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleClickHandler::onBubbleClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleHideHandler(BubbleHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleHideHandler::onBubbleHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleLegendItemClickHandler(BubbleLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleLegendItemClickHandler::onBubbleLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleMouseOutHandler(BubbleMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOutHandler::onBubbleMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleMouseOverHandler(BubbleMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOverHandler::onBubbleMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleShowHandler(BubbleShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleShowHandler::onBubbleShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String maxSize()
        throws RuntimeException /*-{
        return this["maxSize"] = (this["maxSize"] || "20%");
    }-*/
    ;

    public final native JsoBubble maxSize(String maxSize)
        throws RuntimeException /*-{
        this["maxSize"] = maxSize;
        return this;
    }-*/
    ;

    public final native String minSize()
        throws RuntimeException /*-{
        return this["minSize"] = (this["minSize"] || "8");
    }-*/
    ;

    public final native JsoBubble minSize(String minSize)
        throws RuntimeException /*-{
        this["minSize"] = minSize;
        return this;
    }-*/
    ;

    public final native String sizeBy()
        throws RuntimeException /*-{
        return this["sizeBy"] = (this["sizeBy"] || "area");
    }-*/
    ;

    public final native JsoBubble sizeBy(String sizeBy)
        throws RuntimeException /*-{
        this["sizeBy"] = sizeBy;
        return this;
    }-*/
    ;

    public final native double zMax()
        throws RuntimeException /*-{
        return this["zMax"] = (this["zMax"] || null);
    }-*/
    ;

    public final native JsoBubble zMax(double zMax)
        throws RuntimeException /*-{
        this["zMax"] = zMax;
        return this;
    }-*/
    ;

    public final native double zMin()
        throws RuntimeException /*-{
        return this["zMin"] = (this["zMin"] || null);
    }-*/
    ;

    public final native JsoBubble zMin(double zMin)
        throws RuntimeException /*-{
        this["zMin"] = zMin;
        return this;
    }-*/
    ;

    public final native double zThreshold()
        throws RuntimeException /*-{
        return this["zThreshold"] = (this["zThreshold"] || 0.0);
    }-*/
    ;

    public final native JsoBubble zThreshold(double zThreshold)
        throws RuntimeException /*-{
        this["zThreshold"] = zThreshold;
        return this;
    }-*/
    ;

}
