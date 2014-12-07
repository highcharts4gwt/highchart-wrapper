
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.errorbar;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideEvent;

public class JsoErrorbarHideEvent
    extends NativeEvent
    implements ErrorbarHideEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
