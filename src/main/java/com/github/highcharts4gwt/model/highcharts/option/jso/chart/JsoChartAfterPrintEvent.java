
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAfterPrintEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartAfterPrintEvent
    extends NativeEvent
    implements ChartAfterPrintEvent
{


    protected JsoChartAfterPrintEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
