
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreaMouseOverEvent
    extends NativeEvent
    implements AreaMouseOverEvent
{


    protected JsoAreaMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
