
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPieHideEvent
    extends NativeEvent
    implements PieHideEvent
{


    protected JsoPieHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
