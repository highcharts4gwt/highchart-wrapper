
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSplineCheckboxClickEvent
    extends NativeEvent
    implements SplineCheckboxClickEvent
{


    protected JsoSplineCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
