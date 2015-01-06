
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeLegendItemClickEvent
    extends NativeEvent
    implements ColumnrangeLegendItemClickEvent
{


    protected JsoColumnrangeLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
