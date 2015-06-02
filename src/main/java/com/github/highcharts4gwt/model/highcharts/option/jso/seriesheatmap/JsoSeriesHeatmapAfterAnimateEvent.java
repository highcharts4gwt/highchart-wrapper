
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapAfterAnimateEvent
    extends NativeEvent
    implements SeriesHeatmapAfterAnimateEvent
{


    protected JsoSeriesHeatmapAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
