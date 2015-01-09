
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoErrorbarCheckboxClickEvent
    extends NativeEvent
    implements ErrorbarCheckboxClickEvent
{


    protected JsoErrorbarCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
