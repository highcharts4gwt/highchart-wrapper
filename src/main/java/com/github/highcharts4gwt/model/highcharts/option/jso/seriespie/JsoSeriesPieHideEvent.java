
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPieHideEvent
    extends NativeEvent
    implements SeriesPieHideEvent
{


    protected JsoSeriesPieHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
