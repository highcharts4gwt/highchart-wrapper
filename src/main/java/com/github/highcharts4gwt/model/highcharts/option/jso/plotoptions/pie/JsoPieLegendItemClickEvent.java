
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPieLegendItemClickEvent
    extends NativeEvent
    implements PieLegendItemClickEvent
{


    protected JsoPieLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
