
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidHideEvent
    extends NativeEvent
    implements PyramidHideEvent
{


    protected JsoPyramidHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
