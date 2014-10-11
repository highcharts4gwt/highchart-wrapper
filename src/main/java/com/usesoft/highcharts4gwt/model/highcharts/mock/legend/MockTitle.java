
package com.usesoft.highcharts4gwt.model.highcharts.mock.legend;

import com.usesoft.highcharts4gwt.model.highcharts.api.legend.Title;

public class MockTitle
    implements Title
{

    private String style;
    private String text;

    public String style() {
        return style;
    }

    public MockTitle style(String style) {
        this.style = style;
        return this;
    }

    public String text() {
        return text;
    }

    public MockTitle text(String text) {
        this.text = text;
        return this;
    }

}
