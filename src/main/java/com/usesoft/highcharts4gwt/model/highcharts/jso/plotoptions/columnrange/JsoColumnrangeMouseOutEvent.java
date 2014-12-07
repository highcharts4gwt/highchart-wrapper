
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.columnrange;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOutEvent;

public class JsoColumnrangeMouseOutEvent
    extends NativeEvent
    implements ColumnrangeMouseOutEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
