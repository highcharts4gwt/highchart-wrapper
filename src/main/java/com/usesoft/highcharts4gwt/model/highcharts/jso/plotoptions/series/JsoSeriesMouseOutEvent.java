
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.series;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesMouseOutEvent;

public class JsoSeriesMouseOutEvent
    extends NativeEvent
    implements SeriesMouseOutEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
