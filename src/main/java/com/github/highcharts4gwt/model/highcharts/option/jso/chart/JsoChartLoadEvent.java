
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartLoadEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartLoadEvent
    extends NativeEvent
    implements ChartLoadEvent
{


    protected JsoChartLoadEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
