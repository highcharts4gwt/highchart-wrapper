
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

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
