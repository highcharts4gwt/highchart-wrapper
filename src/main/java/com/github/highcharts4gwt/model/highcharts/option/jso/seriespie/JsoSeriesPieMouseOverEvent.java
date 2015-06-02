
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPieMouseOverEvent
    extends NativeEvent
    implements SeriesPieMouseOverEvent
{


    protected JsoSeriesPieMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
