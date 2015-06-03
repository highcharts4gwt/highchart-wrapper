
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.YAxis;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.AfterBreaksHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.AfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PointBreakHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.SetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.StackLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Title;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>The Y axis or value axis. Normally this is the vertical axis, though if the 
 * 	chart is inverted this is the horizontal axis. In case of multiple axes, the yAxis
 * 	node is an array of configuration objects.</p>
 * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
 * 	access to the axis.</p>
 * 
 */
public class JsoYAxis
    extends JavaScriptObject
    implements YAxis
{


    protected JsoYAxis() {
    }

    public final native boolean allowDecimals()
        throws RuntimeException /*-{
        return this["allowDecimals"] = (this["allowDecimals"] || true);
    }-*/
    ;

    public final native JsoYAxis allowDecimals(boolean allowDecimals)
        throws RuntimeException /*-{
        this["allowDecimals"] = allowDecimals;
        return this;
    }-*/
    ;

    public final native String alternateGridColor()
        throws RuntimeException /*-{
        return this["alternateGridColor"] = (this["alternateGridColor"] || "null");
    }-*/
    ;

    public final native JsoYAxis alternateGridColor(String alternateGridColor)
        throws RuntimeException /*-{
        this["alternateGridColor"] = alternateGridColor;
        return this;
    }-*/
    ;

    public final native ArrayNumber breaks()
        throws RuntimeException /*-{
        return this["breaks"] = (this["breaks"] || []);
    }-*/
    ;

    public final native JsoYAxis breaks(ArrayNumber breaks)
        throws RuntimeException /*-{
        this["breaks"] = breaks;
        return this;
    }-*/
    ;

    public final native ArrayString categories()
        throws RuntimeException /*-{
        return this["categories"] = (this["categories"] || []);
    }-*/
    ;

    public final native JsoYAxis categories(ArrayString categories)
        throws RuntimeException /*-{
        this["categories"] = categories;
        return this;
    }-*/
    ;

    public final native double ceiling()
        throws RuntimeException /*-{
        return this["ceiling"] = (this["ceiling"] || '');
    }-*/
    ;

    public final native JsoYAxis ceiling(double ceiling)
        throws RuntimeException /*-{
        this["ceiling"] = ceiling;
        return this;
    }-*/
    ;

    public final native String dateTimeLabelFormats()
        throws RuntimeException /*-{
        this["dateTimeLabelFormats"] = (this["dateTimeLabelFormats"] || {});
        return JSON.stringify(this["dateTimeLabelFormats"]);
    }-*/
    ;

    public final native JsoYAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString)
        throws RuntimeException /*-{
        this["dateTimeLabelFormats"] = JSON.parse(dateTimeLabelFormatsAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean endOnTick()
        throws RuntimeException /*-{
        return this["endOnTick"] = (this["endOnTick"] || true);
    }-*/
    ;

    public final native JsoYAxis endOnTick(boolean endOnTick)
        throws RuntimeException /*-{
        this["endOnTick"] = endOnTick;
        return this;
    }-*/
    ;

    public final native void addAfterBreaksHandler(AfterBreaksHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterBreaks: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.yaxis.AfterBreaksHandler::onAfterBreaks(Lcom/github/highcharts4gwt/model/highcharts/option/api/yaxis/AfterBreaksEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAfterSetExtremesHandler(AfterSetExtremesHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterSetExtremes: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.yaxis.AfterSetExtremesHandler::onAfterSetExtremes(Lcom/github/highcharts4gwt/model/highcharts/option/api/yaxis/AfterSetExtremesEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addPointBreakHandler(PointBreakHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    pointBreak: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PointBreakHandler::onPointBreak(Lcom/github/highcharts4gwt/model/highcharts/option/api/yaxis/PointBreakEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSetExtremesHandler(SetExtremesHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    setExtremes: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.yaxis.SetExtremesHandler::onSetExtremes(Lcom/github/highcharts4gwt/model/highcharts/option/api/yaxis/SetExtremesEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double floor()
        throws RuntimeException /*-{
        return this["floor"] = (this["floor"] || null);
    }-*/
    ;

    public final native JsoYAxis floor(double floor)
        throws RuntimeException /*-{
        this["floor"] = floor;
        return this;
    }-*/
    ;

    public final native String gridLineColor()
        throws RuntimeException /*-{
        return this["gridLineColor"] = (this["gridLineColor"] || "#D8D8D8");
    }-*/
    ;

    public final native JsoYAxis gridLineColor(String gridLineColor)
        throws RuntimeException /*-{
        this["gridLineColor"] = gridLineColor;
        return this;
    }-*/
    ;

    public final native String gridLineDashStyle()
        throws RuntimeException /*-{
        return this["gridLineDashStyle"] = (this["gridLineDashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoYAxis gridLineDashStyle(String gridLineDashStyle)
        throws RuntimeException /*-{
        this["gridLineDashStyle"] = gridLineDashStyle;
        return this;
    }-*/
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

    public final native double gridLineWidth()
        throws RuntimeException /*-{
        return this["gridLineWidth"] = (this["gridLineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoYAxis gridLineWidth(double gridLineWidth)
        throws RuntimeException /*-{
        this["gridLineWidth"] = gridLineWidth;
        return this;
    }-*/
    ;

    public final native double gridZIndex()
        throws RuntimeException /*-{
        return this["gridZIndex"] = (this["gridZIndex"] || 1.0);
    }-*/
    ;

    public final native JsoYAxis gridZIndex(double gridZIndex)
        throws RuntimeException /*-{
        this["gridZIndex"] = gridZIndex;
        return this;
    }-*/
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "null");
    }-*/
    ;

    public final native JsoYAxis id(String id)
        throws RuntimeException /*-{
        this["id"] = id;
        return this;
    }-*/
    ;

    public final native Labels labels()
        throws RuntimeException /*-{
        return this["labels"] = (this["labels"] || {});
    }-*/
    ;

    public final native JsoYAxis labels(Labels labels)
        throws RuntimeException /*-{
        this["labels"] = labels;
        return this;
    }-*/
    ;

    public final native String lineColor()
        throws RuntimeException /*-{
        return this["lineColor"] = (this["lineColor"] || "#C0D0E0");
    }-*/
    ;

    public final native JsoYAxis lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 0.0);
    }-*/
    ;

    public final native JsoYAxis lineWidth(double lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native double linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || null);
    }-*/
    ;

    public final native JsoYAxis linkedTo(double linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native double max()
        throws RuntimeException /*-{
        return this["max"] = (this["max"] || null);
    }-*/
    ;

    public final native JsoYAxis max(double max)
        throws RuntimeException /*-{
        this["max"] = max;
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

    public final native double maxPadding()
        throws RuntimeException /*-{
        return this["maxPadding"] = (this["maxPadding"] || 0.05);
    }-*/
    ;

    public final native JsoYAxis maxPadding(double maxPadding)
        throws RuntimeException /*-{
        this["maxPadding"] = maxPadding;
        return this;
    }-*/
    ;

    public final native double maxZoom()
        throws RuntimeException /*-{
        return this["maxZoom"] = (this["maxZoom"] || null);
    }-*/
    ;

    public final native JsoYAxis maxZoom(double maxZoom)
        throws RuntimeException /*-{
        this["maxZoom"] = maxZoom;
        return this;
    }-*/
    ;

    public final native double min()
        throws RuntimeException /*-{
        return this["min"] = (this["min"] || null);
    }-*/
    ;

    public final native JsoYAxis min(double min)
        throws RuntimeException /*-{
        this["min"] = min;
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

    public final native double minPadding()
        throws RuntimeException /*-{
        return this["minPadding"] = (this["minPadding"] || 0.05);
    }-*/
    ;

    public final native JsoYAxis minPadding(double minPadding)
        throws RuntimeException /*-{
        this["minPadding"] = minPadding;
        return this;
    }-*/
    ;

    public final native double minRange()
        throws RuntimeException /*-{
        return this["minRange"] = (this["minRange"] || null);
    }-*/
    ;

    public final native JsoYAxis minRange(double minRange)
        throws RuntimeException /*-{
        this["minRange"] = minRange;
        return this;
    }-*/
    ;

    public final native double minTickInterval()
        throws RuntimeException /*-{
        return this["minTickInterval"] = (this["minTickInterval"] || null);
    }-*/
    ;

    public final native JsoYAxis minTickInterval(double minTickInterval)
        throws RuntimeException /*-{
        this["minTickInterval"] = minTickInterval;
        return this;
    }-*/
    ;

    public final native String minorGridLineColor()
        throws RuntimeException /*-{
        return this["minorGridLineColor"] = (this["minorGridLineColor"] || "#E0E0E0");
    }-*/
    ;

    public final native JsoYAxis minorGridLineColor(String minorGridLineColor)
        throws RuntimeException /*-{
        this["minorGridLineColor"] = minorGridLineColor;
        return this;
    }-*/
    ;

    public final native String minorGridLineDashStyle()
        throws RuntimeException /*-{
        return this["minorGridLineDashStyle"] = (this["minorGridLineDashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoYAxis minorGridLineDashStyle(String minorGridLineDashStyle)
        throws RuntimeException /*-{
        this["minorGridLineDashStyle"] = minorGridLineDashStyle;
        return this;
    }-*/
    ;

    public final native double minorGridLineWidth()
        throws RuntimeException /*-{
        return this["minorGridLineWidth"] = (this["minorGridLineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoYAxis minorGridLineWidth(double minorGridLineWidth)
        throws RuntimeException /*-{
        this["minorGridLineWidth"] = minorGridLineWidth;
        return this;
    }-*/
    ;

    public final native String minorTickColor()
        throws RuntimeException /*-{
        return this["minorTickColor"] = (this["minorTickColor"] || "#A0A0A0");
    }-*/
    ;

    public final native JsoYAxis minorTickColor(String minorTickColor)
        throws RuntimeException /*-{
        this["minorTickColor"] = minorTickColor;
        return this;
    }-*/
    ;

    public final native String minorTickIntervalAsString()
        throws RuntimeException /*-{
        return this["minorTickInterval"] = (this["minorTickInterval"] || "null");
    }-*/
    ;

    public final native JsoYAxis minorTickIntervalAsString(String minorTickIntervalAsString)
        throws RuntimeException /*-{
        this["minorTickInterval"] = minorTickIntervalAsString;
        return this;
    }-*/
    ;

    public final native double minorTickIntervalAsNumber()
        throws RuntimeException /*-{
        return this["minorTickInterval"] = (this["minorTickInterval"] || null);
    }-*/
    ;

    public final native JsoYAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber)
        throws RuntimeException /*-{
        this["minorTickInterval"] = minorTickIntervalAsNumber;
        return this;
    }-*/
    ;

    public final native double minorTickLength()
        throws RuntimeException /*-{
        return this["minorTickLength"] = (this["minorTickLength"] || 2.0);
    }-*/
    ;

    public final native JsoYAxis minorTickLength(double minorTickLength)
        throws RuntimeException /*-{
        this["minorTickLength"] = minorTickLength;
        return this;
    }-*/
    ;

    public final native String minorTickPosition()
        throws RuntimeException /*-{
        return this["minorTickPosition"] = (this["minorTickPosition"] || "outside");
    }-*/
    ;

    public final native JsoYAxis minorTickPosition(String minorTickPosition)
        throws RuntimeException /*-{
        this["minorTickPosition"] = minorTickPosition;
        return this;
    }-*/
    ;

    public final native double minorTickWidth()
        throws RuntimeException /*-{
        return this["minorTickWidth"] = (this["minorTickWidth"] || 0.0);
    }-*/
    ;

    public final native JsoYAxis minorTickWidth(double minorTickWidth)
        throws RuntimeException /*-{
        this["minorTickWidth"] = minorTickWidth;
        return this;
    }-*/
    ;

    public final native double offset()
        throws RuntimeException /*-{
        return this["offset"] = (this["offset"] || 0.0);
    }-*/
    ;

    public final native JsoYAxis offset(double offset)
        throws RuntimeException /*-{
        this["offset"] = offset;
        return this;
    }-*/
    ;

    public final native boolean opposite()
        throws RuntimeException /*-{
        return this["opposite"] = (this["opposite"] || false);
    }-*/
    ;

    public final native JsoYAxis opposite(boolean opposite)
        throws RuntimeException /*-{
        this["opposite"] = opposite;
        return this;
    }-*/
    ;

    public final native com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands()
        throws RuntimeException /*-{
        return this["plotBands"] = (this["plotBands"] || []);
    }-*/
    ;

    public final native JsoYAxis plotBands(com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands)
        throws RuntimeException /*-{
        this["plotBands"] = plotBands;
        return this;
    }-*/
    ;

    public final native com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines()
        throws RuntimeException /*-{
        return this["plotLines"] = (this["plotLines"] || []);
    }-*/
    ;

    public final native JsoYAxis plotLines(com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines)
        throws RuntimeException /*-{
        this["plotLines"] = plotLines;
        return this;
    }-*/
    ;

    public final native boolean reversed()
        throws RuntimeException /*-{
        return this["reversed"] = (this["reversed"] || false);
    }-*/
    ;

    public final native JsoYAxis reversed(boolean reversed)
        throws RuntimeException /*-{
        this["reversed"] = reversed;
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

    public final native boolean showEmpty()
        throws RuntimeException /*-{
        return this["showEmpty"] = (this["showEmpty"] || true);
    }-*/
    ;

    public final native JsoYAxis showEmpty(boolean showEmpty)
        throws RuntimeException /*-{
        this["showEmpty"] = showEmpty;
        return this;
    }-*/
    ;

    public final native boolean showFirstLabel()
        throws RuntimeException /*-{
        return this["showFirstLabel"] = (this["showFirstLabel"] || true);
    }-*/
    ;

    public final native JsoYAxis showFirstLabel(boolean showFirstLabel)
        throws RuntimeException /*-{
        this["showFirstLabel"] = showFirstLabel;
        return this;
    }-*/
    ;

    public final native boolean showLastLabel()
        throws RuntimeException /*-{
        return this["showLastLabel"] = (this["showLastLabel"] || true);
    }-*/
    ;

    public final native JsoYAxis showLastLabel(boolean showLastLabel)
        throws RuntimeException /*-{
        this["showLastLabel"] = showLastLabel;
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

    public final native double startOfWeek()
        throws RuntimeException /*-{
        return this["startOfWeek"] = (this["startOfWeek"] || 1.0);
    }-*/
    ;

    public final native JsoYAxis startOfWeek(double startOfWeek)
        throws RuntimeException /*-{
        this["startOfWeek"] = startOfWeek;
        return this;
    }-*/
    ;

    public final native boolean startOnTick()
        throws RuntimeException /*-{
        return this["startOnTick"] = (this["startOnTick"] || true);
    }-*/
    ;

    public final native JsoYAxis startOnTick(boolean startOnTick)
        throws RuntimeException /*-{
        this["startOnTick"] = startOnTick;
        return this;
    }-*/
    ;

    public final native double tickAmount()
        throws RuntimeException /*-{
        return this["tickAmount"] = (this["tickAmount"] || null);
    }-*/
    ;

    public final native JsoYAxis tickAmount(double tickAmount)
        throws RuntimeException /*-{
        this["tickAmount"] = tickAmount;
        return this;
    }-*/
    ;

    public final native String tickColor()
        throws RuntimeException /*-{
        return this["tickColor"] = (this["tickColor"] || "#C0D0E0");
    }-*/
    ;

    public final native JsoYAxis tickColor(String tickColor)
        throws RuntimeException /*-{
        this["tickColor"] = tickColor;
        return this;
    }-*/
    ;

    public final native double tickInterval()
        throws RuntimeException /*-{
        return this["tickInterval"] = (this["tickInterval"] || null);
    }-*/
    ;

    public final native JsoYAxis tickInterval(double tickInterval)
        throws RuntimeException /*-{
        this["tickInterval"] = tickInterval;
        return this;
    }-*/
    ;

    public final native double tickLength()
        throws RuntimeException /*-{
        return this["tickLength"] = (this["tickLength"] || 10.0);
    }-*/
    ;

    public final native JsoYAxis tickLength(double tickLength)
        throws RuntimeException /*-{
        this["tickLength"] = tickLength;
        return this;
    }-*/
    ;

    public final native double tickPixelInterval()
        throws RuntimeException /*-{
        return this["tickPixelInterval"] = (this["tickPixelInterval"] || null);
    }-*/
    ;

    public final native JsoYAxis tickPixelInterval(double tickPixelInterval)
        throws RuntimeException /*-{
        this["tickPixelInterval"] = tickPixelInterval;
        return this;
    }-*/
    ;

    public final native String tickPosition()
        throws RuntimeException /*-{
        return this["tickPosition"] = (this["tickPosition"] || "outside");
    }-*/
    ;

    public final native JsoYAxis tickPosition(String tickPosition)
        throws RuntimeException /*-{
        this["tickPosition"] = tickPosition;
        return this;
    }-*/
    ;

    public final native ArrayNumber tickPositions()
        throws RuntimeException /*-{
        return this["tickPositions"] = (this["tickPositions"] || []);
    }-*/
    ;

    public final native JsoYAxis tickPositions(ArrayNumber tickPositions)
        throws RuntimeException /*-{
        this["tickPositions"] = tickPositions;
        return this;
    }-*/
    ;

    public final native double tickWidth()
        throws RuntimeException /*-{
        return this["tickWidth"] = (this["tickWidth"] || 0.0);
    }-*/
    ;

    public final native JsoYAxis tickWidth(double tickWidth)
        throws RuntimeException /*-{
        this["tickWidth"] = tickWidth;
        return this;
    }-*/
    ;

    public final native String tickmarkPlacement()
        throws RuntimeException /*-{
        return this["tickmarkPlacement"] = (this["tickmarkPlacement"] || "null");
    }-*/
    ;

    public final native JsoYAxis tickmarkPlacement(String tickmarkPlacement)
        throws RuntimeException /*-{
        this["tickmarkPlacement"] = tickmarkPlacement;
        return this;
    }-*/
    ;

    public final native Title title()
        throws RuntimeException /*-{
        return this["title"] = (this["title"] || {});
    }-*/
    ;

    public final native JsoYAxis title(Title title)
        throws RuntimeException /*-{
        this["title"] = title;
        return this;
    }-*/
    ;

    public final native String type()
        throws RuntimeException /*-{
        return this["type"] = (this["type"] || "linear");
    }-*/
    ;

    public final native JsoYAxis type(String type)
        throws RuntimeException /*-{
        this["type"] = type;
        return this;
    }-*/
    ;

    public final native ArrayNumber units()
        throws RuntimeException /*-{
        return this["units"] = (this["units"] || []);
    }-*/
    ;

    public final native JsoYAxis units(ArrayNumber units)
        throws RuntimeException /*-{
        this["units"] = units;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoYAxis setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoYAxis setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
