
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnMouseOverEvent
    extends NativeEvent
    implements ColumnMouseOverEvent
{


    protected JsoColumnMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
