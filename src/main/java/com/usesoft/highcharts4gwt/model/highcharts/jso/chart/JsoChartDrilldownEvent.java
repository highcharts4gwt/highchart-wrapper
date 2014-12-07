
package com.usesoft.highcharts4gwt.model.highcharts.jso.chart;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.ChartDrilldownEvent;

public class JsoChartDrilldownEvent
    extends NativeEvent
    implements ChartDrilldownEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
