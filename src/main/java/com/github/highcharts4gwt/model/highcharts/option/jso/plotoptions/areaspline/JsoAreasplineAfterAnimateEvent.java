
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplineAfterAnimateEvent
    extends NativeEvent
    implements AreasplineAfterAnimateEvent
{


    protected JsoAreasplineAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
