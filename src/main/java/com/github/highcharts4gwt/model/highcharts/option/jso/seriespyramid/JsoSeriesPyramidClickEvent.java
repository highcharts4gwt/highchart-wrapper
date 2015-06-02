
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPyramidClickEvent
    extends NativeEvent
    implements SeriesPyramidClickEvent
{


    protected JsoSeriesPyramidClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
