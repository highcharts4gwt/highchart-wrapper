
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesClickEvent;
import com.google.gwt.dom.client.NativeEvent;

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
