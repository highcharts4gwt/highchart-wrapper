
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAfterAnimateEvent
    extends NativeEvent
    implements SeriesAfterAnimateEvent
{


    protected JsoSeriesAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
