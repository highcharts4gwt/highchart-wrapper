
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.columnrange;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeClickEvent;

public class JsoColumnrangeClickEvent
    extends NativeEvent
    implements ColumnrangeClickEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
