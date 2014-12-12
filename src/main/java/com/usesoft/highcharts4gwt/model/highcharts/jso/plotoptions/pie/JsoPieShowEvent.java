
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.pie;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowEvent;

public class JsoPieShowEvent
    extends NativeEvent
    implements PieShowEvent
{


    protected JsoPieShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
