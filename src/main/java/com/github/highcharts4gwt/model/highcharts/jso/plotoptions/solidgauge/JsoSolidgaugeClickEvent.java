
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSolidgaugeClickEvent
    extends NativeEvent
    implements SolidgaugeClickEvent
{


    protected JsoSolidgaugeClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
