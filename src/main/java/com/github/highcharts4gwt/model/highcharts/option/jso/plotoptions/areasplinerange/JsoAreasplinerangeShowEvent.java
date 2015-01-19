
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplinerangeShowEvent
    extends NativeEvent
    implements AreasplinerangeShowEvent
{


    protected JsoAreasplinerangeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
