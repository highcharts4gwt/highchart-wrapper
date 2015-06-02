
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarShowEvent
    extends NativeEvent
    implements SeriesErrorbarShowEvent
{


    protected JsoSeriesErrorbarShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
