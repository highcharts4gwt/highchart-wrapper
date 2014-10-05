
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Gauge;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Dial;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Pivot;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoSeries;

public class JsoGauge
    extends JsoSeries
    implements Gauge
{


    protected JsoGauge() {
    }

    public final native Dial dial()
        throws RuntimeException /*-{
        return this["dial"] = (this["dial"] || );
    }-*/
    ;

    public final native JsoGauge dial(Dial dial)
        throws RuntimeException /*-{
        this["dial"] = dial;
        return this;
    }-*/
    ;

    public final native Number overshoot()
        throws RuntimeException /*-{
        return this["overshoot"] = (this["overshoot"] || 0.0);
    }-*/
    ;

    public final native JsoGauge overshoot(Number overshoot)
        throws RuntimeException /*-{
        this["overshoot"] = overshoot;
        return this;
    }-*/
    ;

    public final native Pivot pivot()
        throws RuntimeException /*-{
        return this["pivot"] = (this["pivot"] || );
    }-*/
    ;

    public final native JsoGauge pivot(Pivot pivot)
        throws RuntimeException /*-{
        this["pivot"] = pivot;
        return this;
    }-*/
    ;

    public final native boolean wrap()
        throws RuntimeException /*-{
        return this["wrap"] = (this["wrap"] || true);
    }-*/
    ;

    public final native JsoGauge wrap(boolean wrap)
        throws RuntimeException /*-{
        this["wrap"] = wrap;
        return this;
    }-*/
    ;

}
