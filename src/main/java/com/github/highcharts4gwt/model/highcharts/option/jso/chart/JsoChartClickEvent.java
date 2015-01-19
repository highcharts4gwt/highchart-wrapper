
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartClickEvent
    extends NativeEvent
    implements ChartClickEvent
{


    protected JsoChartClickEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
