
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartBeforePrintEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartBeforePrintEvent
    extends NativeEvent
    implements ChartBeforePrintEvent
{


    protected JsoChartBeforePrintEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
