
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplinerangeLegendItemClickEvent
    extends NativeEvent
    implements AreasplinerangeLegendItemClickEvent
{


    protected JsoAreasplinerangeLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
