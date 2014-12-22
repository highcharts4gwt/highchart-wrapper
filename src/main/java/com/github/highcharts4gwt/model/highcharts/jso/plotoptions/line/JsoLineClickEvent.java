
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoLineClickEvent
    extends NativeEvent
    implements LineClickEvent
{


    protected JsoLineClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
