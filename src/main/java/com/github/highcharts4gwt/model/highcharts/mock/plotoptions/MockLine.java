
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Line;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineShowHandler;
import com.github.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

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
