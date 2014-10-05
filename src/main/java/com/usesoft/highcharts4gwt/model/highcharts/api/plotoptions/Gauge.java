
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Dial;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Pivot;

public interface Gauge
    extends Series
{


    Dial dial();

    Gauge dial(Dial dial);

    Number overshoot();

    Gauge overshoot(Number overshoot);

    Pivot pivot();

    Gauge pivot(Pivot pivot);

    boolean wrap();

    Gauge wrap(boolean wrap);

}
