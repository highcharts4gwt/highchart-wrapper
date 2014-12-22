
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoErrorbarShowEvent
    extends NativeEvent
    implements ErrorbarShowEvent
{


    protected JsoErrorbarShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
