
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.series;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesClickEvent;

public class JsoSeriesClickEvent
    extends NativeEvent
    implements SeriesClickEvent
{


    protected JsoSeriesClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
