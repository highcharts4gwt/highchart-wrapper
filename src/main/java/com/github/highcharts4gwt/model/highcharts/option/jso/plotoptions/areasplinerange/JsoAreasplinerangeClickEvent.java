
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplinerangeClickEvent
    extends NativeEvent
    implements AreasplinerangeClickEvent
{


    protected JsoAreasplinerangeClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
