
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelCheckboxClickEvent
    extends NativeEvent
    implements FunnelCheckboxClickEvent
{


    protected JsoFunnelCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
