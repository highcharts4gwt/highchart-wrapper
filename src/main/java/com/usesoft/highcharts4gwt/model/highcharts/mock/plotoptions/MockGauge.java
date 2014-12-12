
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Gauge;
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
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockGauge
    extends MockSeries
    implements Gauge
{

    private Dial dial;
    private double overshoot;
    private Pivot pivot;
    private boolean wrap;

    public Dial dial() {
        return dial;
    }

    public MockGauge dial(Dial dial) {
        this.dial = dial;
        return this;
    }

    public void addGaugeAfterAnimateHandler(GaugeAfterAnimateHandler handler) {
    }

    public void addGaugeCheckboxClickHandler(GaugeCheckboxClickHandler handler) {
    }

    public void addGaugeClickHandler(GaugeClickHandler handler) {
    }

    public void addGaugeHideHandler(GaugeHideHandler handler) {
    }

    public void addGaugeLegendItemClickHandler(GaugeLegendItemClickHandler handler) {
    }

    public void addGaugeMouseOutHandler(GaugeMouseOutHandler handler) {
    }

    public void addGaugeMouseOverHandler(GaugeMouseOverHandler handler) {
    }

    public void addGaugeShowHandler(GaugeShowHandler handler) {
    }

    public double overshoot() {
        return overshoot;
    }

    public MockGauge overshoot(double overshoot) {
        this.overshoot = overshoot;
        return this;
    }

    public Pivot pivot() {
        return pivot;
    }

    public MockGauge pivot(Pivot pivot) {
        this.pivot = pivot;
        return this;
    }

    public boolean wrap() {
        return wrap;
    }

    public MockGauge wrap(boolean wrap) {
        this.wrap = wrap;
        return this;
    }

}
