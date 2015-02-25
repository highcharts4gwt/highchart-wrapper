
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAddSeriesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAfterPrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartBeforePrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrilldownHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrillupHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartLoadHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartRedrawHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartSelectionHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.Options3d;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ResetZoomButton;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoChart
    extends JavaScriptObject
    implements Chart
{


    protected JsoChart() {
    }

    public final native boolean alignTicks()
        throws RuntimeException /*-{
        return this["alignTicks"] = (this["alignTicks"] || true);
    }-*/
    ;

    public final native JsoChart alignTicks(boolean alignTicks)
        throws RuntimeException /*-{
        this["alignTicks"] = alignTicks;
        return this;
    }-*/
    ;

    public final native boolean animationAsBoolean()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoChart animationAsBoolean(boolean animationAsBoolean)
        throws RuntimeException /*-{
        this["animation"] = animationAsBoolean;
        return this;
    }-*/
    ;

    public final native String animationAsJsonString()
        throws RuntimeException /*-{
        this["animation"] = (this["animation"] || JSON.parse('true'));
        return JSON.stringify(this["animation"]);
    }-*/
    ;

    public final native JsoChart animationAsJsonString(String animationAsJsonString)
        throws RuntimeException /*-{
        this["animation"] = JSON.parse(animationAsJsonString);
        return this;
    }-*/
    ;

    public final native String backgroundColor()
        throws RuntimeException /*-{
        return this["backgroundColor"] = (this["backgroundColor"] || "#FFFFFF");
    }-*/
    ;

    public final native JsoChart backgroundColor(String backgroundColor)
        throws RuntimeException /*-{
        this["backgroundColor"] = backgroundColor;
        return this;
    }-*/
    ;

    public final native String borderColor()
        throws RuntimeException /*-{
        return this["borderColor"] = (this["borderColor"] || "#4572A7");
    }-*/
    ;

    public final native JsoChart borderColor(String borderColor)
        throws RuntimeException /*-{
        this["borderColor"] = borderColor;
        return this;
    }-*/
    ;

    public final native double borderRadius()
        throws RuntimeException /*-{
        return this["borderRadius"] = (this["borderRadius"] || 0.0);
    }-*/
    ;

    public final native JsoChart borderRadius(double borderRadius)
        throws RuntimeException /*-{
        this["borderRadius"] = borderRadius;
        return this;
    }-*/
    ;

    public final native double borderWidth()
        throws RuntimeException /*-{
        return this["borderWidth"] = (this["borderWidth"] || 0.0);
    }-*/
    ;

    public final native JsoChart borderWidth(double borderWidth)
        throws RuntimeException /*-{
        this["borderWidth"] = borderWidth;
        return this;
    }-*/
    ;

    public final native String className()
        throws RuntimeException /*-{
        return this["className"] = (this["className"] || "null");
    }-*/
    ;

    public final native JsoChart className(String className)
        throws RuntimeException /*-{
        this["className"] = className;
        return this;
    }-*/
    ;

    public final native String defaultSeriesType()
        throws RuntimeException /*-{
        return this["defaultSeriesType"] = (this["defaultSeriesType"] || "line");
    }-*/
    ;

    public final native JsoChart defaultSeriesType(String defaultSeriesType)
        throws RuntimeException /*-{
        this["defaultSeriesType"] = defaultSeriesType;
        return this;
    }-*/
    ;

    public final native void addChartAddSeriesHandler(ChartAddSeriesHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    addSeries: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAddSeriesHandler::onChartAddSeries(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartAddSeriesEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartAfterPrintHandler(ChartAfterPrintHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterPrint: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAfterPrintHandler::onChartAfterPrint(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartAfterPrintEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartBeforePrintHandler(ChartBeforePrintHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    beforePrint: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartBeforePrintHandler::onChartBeforePrint(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartBeforePrintEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartClickHandler(ChartClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartClickHandler::onChartClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartDrilldownHandler(ChartDrilldownHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    drilldown: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrilldownHandler::onChartDrilldown(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartDrilldownEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartDrillupHandler(ChartDrillupHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    drillup: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrillupHandler::onChartDrillup(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartDrillupEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartLoadHandler(ChartLoadHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    load: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartLoadHandler::onChartLoad(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartLoadEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartRedrawHandler(ChartRedrawHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    redraw: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartRedrawHandler::onChartRedraw(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartRedrawEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addChartSelectionHandler(ChartSelectionHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    selection: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartSelectionHandler::onChartSelection(Lcom/github/highcharts4gwt/model/highcharts/option/api/chart/ChartSelectionEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double height()
        throws RuntimeException /*-{
        return this["height"] = (this["height"] || null);
    }-*/
    ;

    public final native JsoChart height(double height)
        throws RuntimeException /*-{
        this["height"] = height;
        return this;
    }-*/
    ;

    public final native boolean ignoreHiddenSeries()
        throws RuntimeException /*-{
        return this["ignoreHiddenSeries"] = (this["ignoreHiddenSeries"] || true);
    }-*/
    ;

    public final native JsoChart ignoreHiddenSeries(boolean ignoreHiddenSeries)
        throws RuntimeException /*-{
        this["ignoreHiddenSeries"] = ignoreHiddenSeries;
        return this;
    }-*/
    ;

    public final native boolean inverted()
        throws RuntimeException /*-{
        return this["inverted"] = (this["inverted"] || false);
    }-*/
    ;

    public final native JsoChart inverted(boolean inverted)
        throws RuntimeException /*-{
        this["inverted"] = inverted;
        return this;
    }-*/
    ;

    public final native ArrayNumber margin()
        throws RuntimeException /*-{
        return this["margin"] = (this["margin"] || []);
    }-*/
    ;

    public final native JsoChart margin(ArrayNumber margin)
        throws RuntimeException /*-{
        this["margin"] = margin;
        return this;
    }-*/
    ;

    public final native double marginBottom()
        throws RuntimeException /*-{
        return this["marginBottom"] = (this["marginBottom"] || null);
    }-*/
    ;

    public final native JsoChart marginBottom(double marginBottom)
        throws RuntimeException /*-{
        this["marginBottom"] = marginBottom;
        return this;
    }-*/
    ;

    public final native double marginLeft()
        throws RuntimeException /*-{
        return this["marginLeft"] = (this["marginLeft"] || null);
    }-*/
    ;

    public final native JsoChart marginLeft(double marginLeft)
        throws RuntimeException /*-{
        this["marginLeft"] = marginLeft;
        return this;
    }-*/
    ;

    public final native double marginRight()
        throws RuntimeException /*-{
        return this["marginRight"] = (this["marginRight"] || null);
    }-*/
    ;

    public final native JsoChart marginRight(double marginRight)
        throws RuntimeException /*-{
        this["marginRight"] = marginRight;
        return this;
    }-*/
    ;

    public final native double marginTop()
        throws RuntimeException /*-{
        return this["marginTop"] = (this["marginTop"] || null);
    }-*/
    ;

    public final native JsoChart marginTop(double marginTop)
        throws RuntimeException /*-{
        this["marginTop"] = marginTop;
        return this;
    }-*/
    ;

    public final native Options3d options3d()
        throws RuntimeException /*-{
        return this["options3d"] = (this["options3d"] || {});
    }-*/
    ;

    public final native JsoChart options3d(Options3d options3d)
        throws RuntimeException /*-{
        this["options3d"] = options3d;
        return this;
    }-*/
    ;

    public final native String panKey()
        throws RuntimeException /*-{
        return this["panKey"] = (this["panKey"] || "");
    }-*/
    ;

    public final native JsoChart panKey(String panKey)
        throws RuntimeException /*-{
        this["panKey"] = panKey;
        return this;
    }-*/
    ;

    public final native boolean panning()
        throws RuntimeException /*-{
        return this["panning"] = (this["panning"] || false);
    }-*/
    ;

    public final native JsoChart panning(boolean panning)
        throws RuntimeException /*-{
        this["panning"] = panning;
        return this;
    }-*/
    ;

    public final native String pinchType()
        throws RuntimeException /*-{
        return this["pinchType"] = (this["pinchType"] || "null");
    }-*/
    ;

    public final native JsoChart pinchType(String pinchType)
        throws RuntimeException /*-{
        this["pinchType"] = pinchType;
        return this;
    }-*/
    ;

    public final native String plotBackgroundColor()
        throws RuntimeException /*-{
        return this["plotBackgroundColor"] = (this["plotBackgroundColor"] || "null");
    }-*/
    ;

    public final native JsoChart plotBackgroundColor(String plotBackgroundColor)
        throws RuntimeException /*-{
        this["plotBackgroundColor"] = plotBackgroundColor;
        return this;
    }-*/
    ;

    public final native String plotBackgroundImage()
        throws RuntimeException /*-{
        return this["plotBackgroundImage"] = (this["plotBackgroundImage"] || "null");
    }-*/
    ;

    public final native JsoChart plotBackgroundImage(String plotBackgroundImage)
        throws RuntimeException /*-{
        this["plotBackgroundImage"] = plotBackgroundImage;
        return this;
    }-*/
    ;

    public final native String plotBorderColor()
        throws RuntimeException /*-{
        return this["plotBorderColor"] = (this["plotBorderColor"] || "#C0C0C0");
    }-*/
    ;

    public final native JsoChart plotBorderColor(String plotBorderColor)
        throws RuntimeException /*-{
        this["plotBorderColor"] = plotBorderColor;
        return this;
    }-*/
    ;

    public final native double plotBorderWidth()
        throws RuntimeException /*-{
        return this["plotBorderWidth"] = (this["plotBorderWidth"] || 0.0);
    }-*/
    ;

    public final native JsoChart plotBorderWidth(double plotBorderWidth)
        throws RuntimeException /*-{
        this["plotBorderWidth"] = plotBorderWidth;
        return this;
    }-*/
    ;

    public final native boolean plotShadowAsBoolean()
        throws RuntimeException /*-{
        return this["plotShadow"] = (this["plotShadow"] || false);
    }-*/
    ;

    public final native JsoChart plotShadowAsBoolean(boolean plotShadowAsBoolean)
        throws RuntimeException /*-{
        this["plotShadow"] = plotShadowAsBoolean;
        return this;
    }-*/
    ;

    public final native String plotShadowAsJsonString()
        throws RuntimeException /*-{
        this["plotShadow"] = (this["plotShadow"] || JSON.parse('false'));
        return JSON.stringify(this["plotShadow"]);
    }-*/
    ;

    public final native JsoChart plotShadowAsJsonString(String plotShadowAsJsonString)
        throws RuntimeException /*-{
        this["plotShadow"] = JSON.parse(plotShadowAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean polar()
        throws RuntimeException /*-{
        return this["polar"] = (this["polar"] || false);
    }-*/
    ;

    public final native JsoChart polar(boolean polar)
        throws RuntimeException /*-{
        this["polar"] = polar;
        return this;
    }-*/
    ;

    public final native boolean reflow()
        throws RuntimeException /*-{
        return this["reflow"] = (this["reflow"] || true);
    }-*/
    ;

    public final native JsoChart reflow(boolean reflow)
        throws RuntimeException /*-{
        this["reflow"] = reflow;
        return this;
    }-*/
    ;

    public final native String renderToAsString()
        throws RuntimeException /*-{
        return this["renderTo"] = (this["renderTo"] || "null");
    }-*/
    ;

    public final native JsoChart renderToAsString(String renderToAsString)
        throws RuntimeException /*-{
        this["renderTo"] = renderToAsString;
        return this;
    }-*/
    ;

    public final native String renderToAsJsonString()
        throws RuntimeException /*-{
        this["renderTo"] = (this["renderTo"] || {});
        return JSON.stringify(this["renderTo"]);
    }-*/
    ;

    public final native JsoChart renderToAsJsonString(String renderToAsJsonString)
        throws RuntimeException /*-{
        this["renderTo"] = JSON.parse(renderToAsJsonString);
        return this;
    }-*/
    ;

    public final native ResetZoomButton resetZoomButton()
        throws RuntimeException /*-{
        return this["resetZoomButton"] = (this["resetZoomButton"] || {});
    }-*/
    ;

    public final native JsoChart resetZoomButton(ResetZoomButton resetZoomButton)
        throws RuntimeException /*-{
        this["resetZoomButton"] = resetZoomButton;
        return this;
    }-*/
    ;

    public final native String selectionMarkerFill()
        throws RuntimeException /*-{
        return this["selectionMarkerFill"] = (this["selectionMarkerFill"] || "rgba(69,114,167,0.25)");
    }-*/
    ;

    public final native JsoChart selectionMarkerFill(String selectionMarkerFill)
        throws RuntimeException /*-{
        this["selectionMarkerFill"] = selectionMarkerFill;
        return this;
    }-*/
    ;

    public final native boolean shadowAsBoolean()
        throws RuntimeException /*-{
        return this["shadow"] = (this["shadow"] || false);
    }-*/
    ;

    public final native JsoChart shadowAsBoolean(boolean shadowAsBoolean)
        throws RuntimeException /*-{
        this["shadow"] = shadowAsBoolean;
        return this;
    }-*/
    ;

    public final native String shadowAsJsonString()
        throws RuntimeException /*-{
        this["shadow"] = (this["shadow"] || JSON.parse('false'));
        return JSON.stringify(this["shadow"]);
    }-*/
    ;

    public final native JsoChart shadowAsJsonString(String shadowAsJsonString)
        throws RuntimeException /*-{
        this["shadow"] = JSON.parse(shadowAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean showAxes()
        throws RuntimeException /*-{
        return this["showAxes"] = (this["showAxes"] || false);
    }-*/
    ;

    public final native JsoChart showAxes(boolean showAxes)
        throws RuntimeException /*-{
        this["showAxes"] = showAxes;
        return this;
    }-*/
    ;

    public final native ArrayNumber spacing()
        throws RuntimeException /*-{
        return this["spacing"] = (this["spacing"] || [10, 10, 15, 10]);
    }-*/
    ;

    public final native JsoChart spacing(ArrayNumber spacing)
        throws RuntimeException /*-{
        this["spacing"] = spacing;
        return this;
    }-*/
    ;

    public final native double spacingBottom()
        throws RuntimeException /*-{
        return this["spacingBottom"] = (this["spacingBottom"] || 15.0);
    }-*/
    ;

    public final native JsoChart spacingBottom(double spacingBottom)
        throws RuntimeException /*-{
        this["spacingBottom"] = spacingBottom;
        return this;
    }-*/
    ;

    public final native double spacingLeft()
        throws RuntimeException /*-{
        return this["spacingLeft"] = (this["spacingLeft"] || 10.0);
    }-*/
    ;

    public final native JsoChart spacingLeft(double spacingLeft)
        throws RuntimeException /*-{
        this["spacingLeft"] = spacingLeft;
        return this;
    }-*/
    ;

    public final native double spacingRight()
        throws RuntimeException /*-{
        return this["spacingRight"] = (this["spacingRight"] || 10.0);
    }-*/
    ;

    public final native JsoChart spacingRight(double spacingRight)
        throws RuntimeException /*-{
        this["spacingRight"] = spacingRight;
        return this;
    }-*/
    ;

    public final native double spacingTop()
        throws RuntimeException /*-{
        return this["spacingTop"] = (this["spacingTop"] || 10.0);
    }-*/
    ;

    public final native JsoChart spacingTop(double spacingTop)
        throws RuntimeException /*-{
        this["spacingTop"] = spacingTop;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{"fontFamily":"\"Lucida Grande\", \"Lucida Sans Unicode\", Verdana, Arial, Helvetica, sans-serif","fontSize":"12px"}'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoChart style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native String type()
        throws RuntimeException /*-{
        return this["type"] = (this["type"] || "line");
    }-*/
    ;

    public final native JsoChart type(String type)
        throws RuntimeException /*-{
        this["type"] = type;
        return this;
    }-*/
    ;

    public final native double width()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || null);
    }-*/
    ;

    public final native JsoChart width(double width)
        throws RuntimeException /*-{
        this["width"] = width;
        return this;
    }-*/
    ;

    public final native String zoomType()
        throws RuntimeException /*-{
        return this["zoomType"] = (this["zoomType"] || "null");
    }-*/
    ;

    public final native JsoChart zoomType(String zoomType)
        throws RuntimeException /*-{
        this["zoomType"] = zoomType;
        return this;
    }-*/
    ;

}
