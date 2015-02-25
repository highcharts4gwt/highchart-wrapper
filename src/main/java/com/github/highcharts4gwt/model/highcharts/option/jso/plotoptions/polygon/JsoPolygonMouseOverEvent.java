
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.polygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPolygonMouseOverEvent
    extends NativeEvent
    implements PolygonMouseOverEvent
{


    protected JsoPolygonMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
