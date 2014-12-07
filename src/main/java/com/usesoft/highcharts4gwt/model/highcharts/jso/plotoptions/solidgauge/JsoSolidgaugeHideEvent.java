
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.solidgauge;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeHideEvent;

public class JsoSolidgaugeHideEvent
    extends NativeEvent
    implements SolidgaugeHideEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}