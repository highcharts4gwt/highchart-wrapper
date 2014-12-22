
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoLineCheckboxClickEvent
    extends NativeEvent
    implements LineCheckboxClickEvent
{


    protected JsoLineCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
