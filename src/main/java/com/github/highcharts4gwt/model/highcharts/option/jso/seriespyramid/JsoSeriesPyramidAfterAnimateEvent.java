
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPyramidAfterAnimateEvent
    extends NativeEvent
    implements SeriesPyramidAfterAnimateEvent
{


    protected JsoSeriesPyramidAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
