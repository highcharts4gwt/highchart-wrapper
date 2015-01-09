
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplineClickEvent
    extends NativeEvent
    implements AreasplineClickEvent
{


    protected JsoAreasplineClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
