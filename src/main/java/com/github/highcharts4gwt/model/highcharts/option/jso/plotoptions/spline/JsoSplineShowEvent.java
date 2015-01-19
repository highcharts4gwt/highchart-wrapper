
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSplineShowEvent
    extends NativeEvent
    implements SplineShowEvent
{


    protected JsoSplineShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
