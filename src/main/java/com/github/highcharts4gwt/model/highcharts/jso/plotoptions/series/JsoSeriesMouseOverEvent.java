
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesMouseOverEvent
    extends NativeEvent
    implements SeriesMouseOverEvent
{


    protected JsoSeriesMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
