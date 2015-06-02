
package com.github.highcharts4gwt.model.highcharts.option.jso.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesWaterfallCheckboxClickEvent
    extends NativeEvent
    implements SeriesWaterfallCheckboxClickEvent
{


    protected JsoSeriesWaterfallCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
