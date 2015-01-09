
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeMouseOverEvent
    extends NativeEvent
    implements ColumnrangeMouseOverEvent
{


    protected JsoColumnrangeMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
