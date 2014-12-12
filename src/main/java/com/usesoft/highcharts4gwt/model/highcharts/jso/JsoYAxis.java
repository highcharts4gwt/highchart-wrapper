
package com.usesoft.highcharts4gwt.model.highcharts.jso;

import com.usesoft.highcharts4gwt.model.highcharts.api.YAxis;
import com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.StackLabels;
import com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.YAxisAfterSetExtremesHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.YAxisSetExtremesHandler;
import com.usesoft.highcharts4gwt.model.highcharts.jso.JsoXAxis;

public class JsoYAxis
    extends JsoXAxis
    implements YAxis
{


    protected JsoYAxis() {
    }

    public final native void addYAxisAfterSetExtremesHandler(YAxisAfterSetExtremesHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    axisAfterSetExtremes: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.YAxisAfterSetExtremesHandler::onYAxisAfterSetExtremes(Lcom/usesoft/highcharts4gwt/model/highcharts/api/yaxis/YAxisAfterSetExtremesEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addYAxisSetExtremesHandler(YAxisSetExtremesHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    axisSetExtremes: function(event) {
                        handler.@com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.YAxisSetExtremesHandler::onYAxisSetExtremes(Lcom/usesoft/highcharts4gwt/model/highcharts/api/yaxis/YAxisSetExtremesEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String gridLineInterpolation()
        throws RuntimeException /*-{
        return this["gridLineInterpolation"] = (this["gridLineInterpolation"] || "null");
    }-*/
    ;

    public final native JsoYAxis gridLineInterpolation(String gridLineInterpolation)
        throws RuntimeException /*-{
        this["gridLineInterpolation"] = gridLineInterpolation;
        return this;
    }-*/
    ;

    public final native String maxColor()
        throws RuntimeException /*-{
        return this["maxColor"] = (this["maxColor"] || "#102D4C");
    }-*/
    ;

    public final native JsoYAxis maxColor(String maxColor)
        throws RuntimeException /*-{
        this["maxColor"] = maxColor;
        return this;
    }-*/
    ;

    public final native String minColor()
        throws RuntimeException /*-{
        return this["minColor"] = (this["minColor"] || "#EFEFFF");
    }-*/
    ;

    public final native JsoYAxis minColor(String minColor)
        throws RuntimeException /*-{
        this["minColor"] = minColor;
        return this;
    }-*/
    ;

    public final native boolean reversedStacks()
        throws RuntimeException /*-{
        return this["reversedStacks"] = (this["reversedStacks"] || true);
    }-*/
    ;

    public final native JsoYAxis reversedStacks(boolean reversedStacks)
        throws RuntimeException /*-{
        this["reversedStacks"] = reversedStacks;
        return this;
    }-*/
    ;

    public final native StackLabels stackLabels()
        throws RuntimeException /*-{
        return this["stackLabels"] = (this["stackLabels"] || {});
    }-*/
    ;

    public final native JsoYAxis stackLabels(StackLabels stackLabels)
        throws RuntimeException /*-{
        this["stackLabels"] = stackLabels;
        return this;
    }-*/
    ;

}
