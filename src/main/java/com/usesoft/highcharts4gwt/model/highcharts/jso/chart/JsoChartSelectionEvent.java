
package com.usesoft.highcharts4gwt.model.highcharts.jso.chart;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.ChartSelectionEvent;

public class JsoChartSelectionEvent
    extends NativeEvent
    implements ChartSelectionEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
