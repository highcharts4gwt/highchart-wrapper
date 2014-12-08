
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.areasplinerange;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeHideEvent;

public class JsoAreasplinerangeHideEvent
    extends NativeEvent
    implements AreasplinerangeHideEvent
{


    protected JsoAreasplinerangeHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
