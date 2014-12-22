
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnShowEvent
    extends NativeEvent
    implements ColumnShowEvent
{


    protected JsoColumnShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
