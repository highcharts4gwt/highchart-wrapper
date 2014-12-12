
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Dial;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Pivot;

public interface Gauge
    extends Series
{


    Dial dial();

    Gauge dial(Dial dial);

    void addGaugeAfterAnimateHandler(GaugeAfterAnimateHandler gaugeAfterAnimateHandler);

    void addGaugeCheckboxClickHandler(GaugeCheckboxClickHandler gaugeCheckboxClickHandler);

    void addGaugeClickHandler(GaugeClickHandler gaugeClickHandler);

    void addGaugeHideHandler(GaugeHideHandler gaugeHideHandler);

    void addGaugeLegendItemClickHandler(GaugeLegendItemClickHandler gaugeLegendItemClickHandler);

    void addGaugeMouseOutHandler(GaugeMouseOutHandler gaugeMouseOutHandler);

    void addGaugeMouseOverHandler(GaugeMouseOverHandler gaugeMouseOverHandler);

    void addGaugeShowHandler(GaugeShowHandler gaugeShowHandler);

    double overshoot();

    Gauge overshoot(double overshoot);

    Pivot pivot();

    Gauge pivot(Pivot pivot);

    boolean wrap();

    Gauge wrap(boolean wrap);

}
