
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.ShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoShowEvent
    extends NativeEvent
    implements ShowEvent
{


    protected JsoShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
