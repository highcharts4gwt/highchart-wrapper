
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapCheckboxClickEvent
    extends NativeEvent
    implements SeriesTreemapCheckboxClickEvent
{


    protected JsoSeriesTreemapCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
