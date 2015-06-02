
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPyramidShowEvent
    extends NativeEvent
    implements SeriesPyramidShowEvent
{


    protected JsoSeriesPyramidShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
