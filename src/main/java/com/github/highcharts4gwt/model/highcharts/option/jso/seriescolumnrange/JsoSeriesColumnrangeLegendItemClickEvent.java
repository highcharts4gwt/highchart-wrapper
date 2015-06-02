
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeLegendItemClickEvent
    extends NativeEvent
    implements SeriesColumnrangeLegendItemClickEvent
{


    protected JsoSeriesColumnrangeLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
