
package com.github.highcharts4gwt.model.highcharts.option.jso.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesWaterfallLegendItemClickEvent
    extends NativeEvent
    implements SeriesWaterfallLegendItemClickEvent
{


    protected JsoSeriesWaterfallLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
