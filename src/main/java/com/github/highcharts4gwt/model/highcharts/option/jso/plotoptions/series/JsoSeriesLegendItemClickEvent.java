
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesLegendItemClickEvent
    extends NativeEvent
    implements SeriesLegendItemClickEvent
{


    protected JsoSeriesLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
