
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarCheckboxClickEvent
    extends NativeEvent
    implements BarCheckboxClickEvent
{


    protected JsoBarCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
