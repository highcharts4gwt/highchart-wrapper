
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSolidgaugeMouseOverEvent
    extends NativeEvent
    implements SolidgaugeMouseOverEvent
{


    protected JsoSolidgaugeMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
