
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnLegendItemClickEvent
    extends NativeEvent
    implements SeriesColumnLegendItemClickEvent
{


    protected JsoSeriesColumnLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
