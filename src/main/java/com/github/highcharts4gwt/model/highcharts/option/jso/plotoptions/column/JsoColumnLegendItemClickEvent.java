
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnLegendItemClickEvent
    extends NativeEvent
    implements ColumnLegendItemClickEvent
{


    protected JsoColumnLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
