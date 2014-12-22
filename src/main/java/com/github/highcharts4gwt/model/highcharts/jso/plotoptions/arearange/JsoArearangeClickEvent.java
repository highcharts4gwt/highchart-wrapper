
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoArearangeClickEvent
    extends NativeEvent
    implements ArearangeClickEvent
{


    protected JsoArearangeClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
