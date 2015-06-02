
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapLegendItemClickEvent
    extends NativeEvent
    implements SeriesHeatmapLegendItemClickEvent
{


    protected JsoSeriesHeatmapLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
