
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoArearangeShowEvent
    extends NativeEvent
    implements ArearangeShowEvent
{


    protected JsoArearangeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
