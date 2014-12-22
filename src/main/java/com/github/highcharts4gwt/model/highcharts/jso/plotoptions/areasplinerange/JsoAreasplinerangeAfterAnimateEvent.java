
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplinerangeAfterAnimateEvent
    extends NativeEvent
    implements AreasplinerangeAfterAnimateEvent
{


    protected JsoAreasplinerangeAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
