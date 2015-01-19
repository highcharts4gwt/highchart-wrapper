
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartRedrawEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartRedrawEvent
    extends NativeEvent
    implements ChartRedrawEvent
{


    protected JsoChartRedrawEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
