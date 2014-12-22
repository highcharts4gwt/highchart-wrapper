
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoErrorbarLegendItemClickEvent
    extends NativeEvent
    implements ErrorbarLegendItemClickEvent
{


    protected JsoErrorbarLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
