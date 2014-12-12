
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.pie;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverEvent;

public class JsoPieMouseOverEvent
    extends NativeEvent
    implements PieMouseOverEvent
{


    protected JsoPieMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
