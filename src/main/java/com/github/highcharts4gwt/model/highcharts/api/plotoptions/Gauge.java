
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Dial;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Pivot;

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
