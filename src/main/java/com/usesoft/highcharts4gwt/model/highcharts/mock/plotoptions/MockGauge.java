
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Gauge;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Dial;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Pivot;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockGauge
    extends MockSeries
    implements Gauge
{

    private Dial dial;
    private Number overshoot;
    private Pivot pivot;
    private boolean wrap;

    public Dial dial() {
        return dial;
    }

    public MockGauge dial(Dial dial) {
        this.dial = dial;
        return this;
    }

    public Number overshoot() {
        return overshoot;
    }

    public MockGauge overshoot(Number overshoot) {
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
