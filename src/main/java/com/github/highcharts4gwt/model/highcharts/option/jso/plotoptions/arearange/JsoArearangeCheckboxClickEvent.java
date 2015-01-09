
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoArearangeCheckboxClickEvent
    extends NativeEvent
    implements ArearangeCheckboxClickEvent
{


    protected JsoArearangeCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
