
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnAfterAnimateEvent
    extends NativeEvent
    implements ColumnAfterAnimateEvent
{


    protected JsoColumnAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
