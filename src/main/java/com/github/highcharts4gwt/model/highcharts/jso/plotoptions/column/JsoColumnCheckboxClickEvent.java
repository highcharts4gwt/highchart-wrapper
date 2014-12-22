
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnCheckboxClickEvent
    extends NativeEvent
    implements ColumnCheckboxClickEvent
{


    protected JsoColumnCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
