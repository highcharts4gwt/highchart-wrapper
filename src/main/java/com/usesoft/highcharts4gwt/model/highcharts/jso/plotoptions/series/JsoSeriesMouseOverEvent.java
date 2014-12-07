
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.series;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesMouseOverEvent;

public class JsoSeriesMouseOverEvent
    extends NativeEvent
    implements SeriesMouseOverEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}