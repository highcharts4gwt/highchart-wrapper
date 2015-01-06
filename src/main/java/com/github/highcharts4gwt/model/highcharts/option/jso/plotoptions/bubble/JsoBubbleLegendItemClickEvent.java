
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBubbleLegendItemClickEvent
    extends NativeEvent
    implements BubbleLegendItemClickEvent
{


    protected JsoBubbleLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
