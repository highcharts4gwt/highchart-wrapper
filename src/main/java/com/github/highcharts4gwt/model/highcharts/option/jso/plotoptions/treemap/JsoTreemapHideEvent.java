
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoTreemapHideEvent
    extends NativeEvent
    implements TreemapHideEvent
{


    protected JsoTreemapHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
