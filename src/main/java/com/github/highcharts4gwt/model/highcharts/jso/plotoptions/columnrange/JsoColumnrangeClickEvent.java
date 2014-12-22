
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeClickEvent
    extends NativeEvent
    implements ColumnrangeClickEvent
{


    protected JsoColumnrangeClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
