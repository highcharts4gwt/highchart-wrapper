
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPyramidMouseOutEvent
    extends NativeEvent
    implements SeriesPyramidMouseOutEvent
{


    protected JsoSeriesPyramidMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
