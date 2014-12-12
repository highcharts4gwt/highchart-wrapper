
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Line;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineShowHandler;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockLine
    extends MockSeries
    implements Line
{

    private String step;

    public void addLineAfterAnimateHandler(LineAfterAnimateHandler handler) {
    }

    public void addLineCheckboxClickHandler(LineCheckboxClickHandler handler) {
    }

    public void addLineClickHandler(LineClickHandler handler) {
    }

    public void addLineHideHandler(LineHideHandler handler) {
    }

    public void addLineLegendItemClickHandler(LineLegendItemClickHandler handler) {
    }

    public void addLineMouseOutHandler(LineMouseOutHandler handler) {
    }

    public void addLineMouseOverHandler(LineMouseOverHandler handler) {
    }

    public void addLineShowHandler(LineShowHandler handler) {
    }

    public String step() {
        return step;
    }

    public MockLine step(String step) {
        this.step = step;
        return this;
    }

}
