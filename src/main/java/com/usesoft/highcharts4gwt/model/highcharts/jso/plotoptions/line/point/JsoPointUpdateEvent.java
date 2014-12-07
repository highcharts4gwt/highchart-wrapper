
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.line.point;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointUpdateEvent;

public class JsoPointUpdateEvent
    extends NativeEvent
    implements PointUpdateEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
