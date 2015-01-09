
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreaAfterAnimateEvent
    extends NativeEvent
    implements AreaAfterAnimateEvent
{


    protected JsoAreaAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
