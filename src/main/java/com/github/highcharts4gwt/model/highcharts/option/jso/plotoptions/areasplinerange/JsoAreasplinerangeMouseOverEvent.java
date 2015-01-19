
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplinerangeMouseOverEvent
    extends NativeEvent
    implements AreasplinerangeMouseOverEvent
{


    protected JsoAreasplinerangeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
