
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.AfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAfterAnimateEvent
    extends NativeEvent
    implements AfterAnimateEvent
{


    protected JsoAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
