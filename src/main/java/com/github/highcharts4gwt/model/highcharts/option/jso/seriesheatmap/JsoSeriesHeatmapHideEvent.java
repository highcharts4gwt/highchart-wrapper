
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapHideEvent
    extends NativeEvent
    implements SeriesHeatmapHideEvent
{


    protected JsoSeriesHeatmapHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
