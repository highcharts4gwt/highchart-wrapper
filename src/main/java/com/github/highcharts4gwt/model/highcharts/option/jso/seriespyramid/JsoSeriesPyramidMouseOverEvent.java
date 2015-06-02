
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPyramidMouseOverEvent
    extends NativeEvent
    implements SeriesPyramidMouseOverEvent
{


    protected JsoSeriesPyramidMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
