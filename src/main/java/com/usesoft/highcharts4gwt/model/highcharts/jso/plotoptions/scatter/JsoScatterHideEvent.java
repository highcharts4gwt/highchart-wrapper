
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.scatter;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterHideEvent;

public class JsoScatterHideEvent
    extends NativeEvent
    implements ScatterHideEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}