
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBoxplotCheckboxClickEvent
    extends NativeEvent
    implements BoxplotCheckboxClickEvent
{


    protected JsoBoxplotCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
