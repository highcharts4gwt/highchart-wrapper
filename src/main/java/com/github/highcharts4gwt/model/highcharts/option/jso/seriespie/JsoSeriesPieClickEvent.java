
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPieClickEvent
    extends NativeEvent
    implements SeriesPieClickEvent
{


    protected JsoSeriesPieClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
