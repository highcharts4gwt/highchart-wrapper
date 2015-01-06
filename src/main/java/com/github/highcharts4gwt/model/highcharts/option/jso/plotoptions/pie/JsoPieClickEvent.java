
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPieClickEvent
    extends NativeEvent
    implements PieClickEvent
{


    protected JsoPieClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
