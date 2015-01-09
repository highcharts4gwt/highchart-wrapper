
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisSetExtremesHandler;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoXAxis
    extends JavaScriptObject
    implements XAxis
{


    protected JsoXAxis() {
    }

    public final native boolean allowDecimals()
        throws RuntimeException /*-{
        return this["allowDecimals"] = (this["allowDecimals"] || true);
    }-*/
    ;

    public final native JsoXAxis allowDecimals(boolean allowDecimals)
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

    public final native JsoXAxis alternateGridColor(String alternateGridColor)
        throws RuntimeException /*-{
        this["alternateGridColor"] = alternateGridColor;
        return this;
    }-*/
    ;

    public final native ArrayString categories()
        throws RuntimeException /*-{
        return this["categories"] = (this["categories"] || []);
    }-*/
    ;

    public final native JsoXAxis categories(ArrayString categories)
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

    public final native JsoXAxis ceiling(double ceiling)
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

    public final native JsoXAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString)
        throws RuntimeException /*-{
        this["dateTimeLabelFormats"] = JSON.parse(dateTimeLabelFormatsAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean endOnTick()
        throws RuntimeException /*-{
        return this["endOnTick"] = (this["endOnTick"] || false);
    }-*/
    ;

    public final native JsoXAxis endOnTick(boolean endOnTick)
        throws RuntimeException /*-{
        this["endOnTick"] = endOnTick;
        return this;
    }-*/
    ;

    public final native void addXAxisAfterSetExtremesHandler(XAxisAfterSetExtremesHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    axisAfterSetExtremes: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisAfterSetExtremesHandler::onXAxisAfterSetExtremes(Lcom/github/highcharts4gwt/model/highcharts/option/api/xaxis/XAxisAfterSetExtremesEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addXAxisSetExtremesHandler(XAxisSetExtremesHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    axisSetExtremes: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisSetExtremesHandler::onXAxisSetExtremes(Lcom/github/highcharts4gwt/model/highcharts/option/api/xaxis/XAxisSetExtremesEvent;)(
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

    public final native JsoXAxis floor(double floor)
        throws RuntimeException /*-{
        this["floor"] = floor;
        return this;
    }-*/
    ;

    public final native String gridLineColor()
        throws RuntimeException /*-{
        return this["gridLineColor"] = (this["gridLineColor"] || "#C0C0C0");
    }-*/
    ;

    public final native JsoXAxis gridLineColor(String gridLineColor)
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

    public final native JsoXAxis gridLineDashStyle(String gridLineDashStyle)
        throws RuntimeException /*-{
        this["gridLineDashStyle"] = gridLineDashStyle;
        return this;
    }-*/
    ;

    public final native double gridLineWidth()
        throws RuntimeException /*-{
        return this["gridLineWidth"] = (this["gridLineWidth"] || 0.0);
    }-*/
    ;

    public final native JsoXAxis gridLineWidth(double gridLineWidth)
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

    public final native JsoXAxis gridZIndex(double gridZIndex)
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

    public final native JsoXAxis id(String id)
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

    public final native JsoXAxis labels(Labels labels)
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

    public final native JsoXAxis lineColor(String lineColor)
        throws RuntimeException /*-{
        this["lineColor"] = lineColor;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 1.0);
    }-*/
    ;

    public final native JsoXAxis lineWidth(double lineWidth)
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

    public final native JsoXAxis linkedTo(double linkedTo)
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

    public final native JsoXAxis max(double max)
        throws RuntimeException /*-{
        this["max"] = max;
        return this;
    }-*/
    ;

    public final native double maxPadding()
        throws RuntimeException /*-{
        return this["maxPadding"] = (this["maxPadding"] || 0.01);
    }-*/
    ;

    public final native JsoXAxis maxPadding(double maxPadding)
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

    public final native JsoXAxis maxZoom(double maxZoom)
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

    public final native JsoXAxis min(double min)
        throws RuntimeException /*-{
        this["min"] = min;
        return this;
    }-*/
    ;

    public final native double minPadding()
        throws RuntimeException /*-{
        return this["minPadding"] = (this["minPadding"] || 0.01);
    }-*/
    ;

    public final native JsoXAxis minPadding(double minPadding)
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

    public final native JsoXAxis minRange(double minRange)
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

    public final native JsoXAxis minTickInterval(double minTickInterval)
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

    public final native JsoXAxis minorGridLineColor(String minorGridLineColor)
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

    public final native JsoXAxis minorGridLineDashStyle(String minorGridLineDashStyle)
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

    public final native JsoXAxis minorGridLineWidth(double minorGridLineWidth)
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

    public final native JsoXAxis minorTickColor(String minorTickColor)
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

    public final native JsoXAxis minorTickIntervalAsString(String minorTickIntervalAsString)
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

    public final native JsoXAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber)
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

    public final native JsoXAxis minorTickLength(double minorTickLength)
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

    public final native JsoXAxis minorTickPosition(String minorTickPosition)
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

    public final native JsoXAxis minorTickWidth(double minorTickWidth)
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

    public final native JsoXAxis offset(double offset)
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

    public final native JsoXAxis opposite(boolean opposite)
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

    public final native JsoXAxis plotBands(com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands)
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

    public final native JsoXAxis plotLines(com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines)
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

    public final native JsoXAxis reversed(boolean reversed)
        throws RuntimeException /*-{
        this["reversed"] = reversed;
        return this;
    }-*/
    ;

    public final native boolean showEmpty()
        throws RuntimeException /*-{
        return this["showEmpty"] = (this["showEmpty"] || true);
    }-*/
    ;

    public final native JsoXAxis showEmpty(boolean showEmpty)
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

    public final native JsoXAxis showFirstLabel(boolean showFirstLabel)
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

    public final native JsoXAxis showLastLabel(boolean showLastLabel)
        throws RuntimeException /*-{
        this["showLastLabel"] = showLastLabel;
        return this;
    }-*/
    ;

    public final native double startOfWeek()
        throws RuntimeException /*-{
        return this["startOfWeek"] = (this["startOfWeek"] || 1.0);
    }-*/
    ;

    public final native JsoXAxis startOfWeek(double startOfWeek)
        throws RuntimeException /*-{
        this["startOfWeek"] = startOfWeek;
        return this;
    }-*/
    ;

    public final native boolean startOnTick()
        throws RuntimeException /*-{
        return this["startOnTick"] = (this["startOnTick"] || false);
    }-*/
    ;

    public final native JsoXAxis startOnTick(boolean startOnTick)
        throws RuntimeException /*-{
        this["startOnTick"] = startOnTick;
        return this;
    }-*/
    ;

    public final native String tickColor()
        throws RuntimeException /*-{
        return this["tickColor"] = (this["tickColor"] || "#C0D0E0");
    }-*/
    ;

    public final native JsoXAxis tickColor(String tickColor)
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

    public final native JsoXAxis tickInterval(double tickInterval)
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

    public final native JsoXAxis tickLength(double tickLength)
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

    public final native JsoXAxis tickPixelInterval(double tickPixelInterval)
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

    public final native JsoXAxis tickPosition(String tickPosition)
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

    public final native JsoXAxis tickPositions(ArrayNumber tickPositions)
        throws RuntimeException /*-{
        this["tickPositions"] = tickPositions;
        return this;
    }-*/
    ;

    public final native double tickWidth()
        throws RuntimeException /*-{
        return this["tickWidth"] = (this["tickWidth"] || 1.0);
    }-*/
    ;

    public final native JsoXAxis tickWidth(double tickWidth)
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

    public final native JsoXAxis tickmarkPlacement(String tickmarkPlacement)
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

    public final native JsoXAxis title(Title title)
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

    public final native JsoXAxis type(String type)
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

    public final native JsoXAxis units(ArrayNumber units)
        throws RuntimeException /*-{
        this["units"] = units;
        return this;
    }-*/
    ;

}
