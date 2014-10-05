
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.Drilldown;
import com.usesoft.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;

public class MockDrilldown
    implements Drilldown
{

    private DrillUpButton drillUpButton;

    public DrillUpButton drillUpButton() {
        return drillUpButton;
    }

    public MockDrilldown drillUpButton(DrillUpButton drillUpButton) {
        this.drillUpButton = drillUpButton;
        return this;
    }

}
