
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.columnrange;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeCheckboxClickEvent;

public class JsoColumnrangeCheckboxClickEvent
    extends NativeEvent
    implements ColumnrangeCheckboxClickEvent
{


    protected JsoColumnrangeCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
