
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnMouseOutEvent
    extends NativeEvent
    implements ColumnMouseOutEvent
{


    protected JsoColumnMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
