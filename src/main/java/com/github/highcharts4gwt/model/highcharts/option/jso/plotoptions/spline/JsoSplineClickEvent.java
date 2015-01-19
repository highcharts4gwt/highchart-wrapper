
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSplineClickEvent
    extends NativeEvent
    implements SplineClickEvent
{


    protected JsoSplineClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
