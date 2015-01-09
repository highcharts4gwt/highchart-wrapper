
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSolidgaugeAfterAnimateEvent
    extends NativeEvent
    implements SolidgaugeAfterAnimateEvent
{


    protected JsoSolidgaugeAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
