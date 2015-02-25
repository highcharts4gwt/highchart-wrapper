
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.polygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPolygonAfterAnimateEvent
    extends NativeEvent
    implements PolygonAfterAnimateEvent
{


    protected JsoPolygonAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
