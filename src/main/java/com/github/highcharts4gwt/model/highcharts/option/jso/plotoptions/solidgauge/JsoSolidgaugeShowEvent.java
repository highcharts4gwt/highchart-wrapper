
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSolidgaugeShowEvent
    extends NativeEvent
    implements SolidgaugeShowEvent
{


    protected JsoSolidgaugeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
