
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarLegendItemClickEvent
    extends NativeEvent
    implements SeriesErrorbarLegendItemClickEvent
{


    protected JsoSeriesErrorbarLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
