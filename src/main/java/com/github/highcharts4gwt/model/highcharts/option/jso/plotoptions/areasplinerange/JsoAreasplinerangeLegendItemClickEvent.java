
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickEvent;
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
