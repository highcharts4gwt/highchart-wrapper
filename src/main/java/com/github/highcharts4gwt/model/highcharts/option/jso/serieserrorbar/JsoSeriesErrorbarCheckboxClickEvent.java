
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarCheckboxClickEvent
    extends NativeEvent
    implements SeriesErrorbarCheckboxClickEvent
{


    protected JsoSeriesErrorbarCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
