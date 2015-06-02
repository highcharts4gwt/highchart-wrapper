
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreaCheckboxClickEvent
    extends NativeEvent
    implements SeriesAreaCheckboxClickEvent
{


    protected JsoSeriesAreaCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
