
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrilldownEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartDrilldownEvent
    extends NativeEvent
    implements ChartDrilldownEvent
{


    protected JsoChartDrilldownEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
