
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoErrorbarAfterAnimateEvent
    extends NativeEvent
    implements ErrorbarAfterAnimateEvent
{


    protected JsoErrorbarAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
