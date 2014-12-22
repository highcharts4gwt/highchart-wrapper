
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSolidgaugeLegendItemClickEvent
    extends NativeEvent
    implements SolidgaugeLegendItemClickEvent
{


    protected JsoSolidgaugeLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
