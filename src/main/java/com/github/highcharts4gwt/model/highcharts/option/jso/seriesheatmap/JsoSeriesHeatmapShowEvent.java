
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapShowEvent
    extends NativeEvent
    implements SeriesHeatmapShowEvent
{


    protected JsoSeriesHeatmapShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
