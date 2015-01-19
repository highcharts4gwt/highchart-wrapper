
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAddSeriesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartAddSeriesEvent
    extends NativeEvent
    implements ChartAddSeriesEvent
{


    protected JsoChartAddSeriesEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
