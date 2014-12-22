
package com.github.highcharts4gwt.model.highcharts.mock.exporting;

import com.github.highcharts4gwt.model.highcharts.api.exporting.Buttons;
import com.github.highcharts4gwt.model.highcharts.api.exporting.buttons.ContextButton;

public class MockButtons
    implements Buttons
{

    private ContextButton contextButton;

    public ContextButton contextButton() {
        return contextButton;
    }

    public MockButtons contextButton(ContextButton contextButton) {
        this.contextButton = contextButton;
        return this;
    }

}
