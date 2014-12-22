
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplineHideEvent
    extends NativeEvent
    implements AreasplineHideEvent
{


    protected JsoAreasplineHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
