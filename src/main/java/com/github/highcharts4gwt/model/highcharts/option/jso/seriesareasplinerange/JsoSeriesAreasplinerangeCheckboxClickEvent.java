
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplinerangeCheckboxClickEvent
    extends NativeEvent
    implements SeriesAreasplinerangeCheckboxClickEvent
{


    protected JsoSeriesAreasplinerangeCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
