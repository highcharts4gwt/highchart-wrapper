
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.area;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaAfterAnimateEvent;

public class JsoAreaAfterAnimateEvent
    extends NativeEvent
    implements AreaAfterAnimateEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
