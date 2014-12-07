
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.column;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnCheckboxClickEvent;

public class JsoColumnCheckboxClickEvent
    extends NativeEvent
    implements ColumnCheckboxClickEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
