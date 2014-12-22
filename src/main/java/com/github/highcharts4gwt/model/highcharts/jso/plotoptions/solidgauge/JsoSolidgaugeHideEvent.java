
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSolidgaugeHideEvent
    extends NativeEvent
    implements SolidgaugeHideEvent
{


    protected JsoSolidgaugeHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
