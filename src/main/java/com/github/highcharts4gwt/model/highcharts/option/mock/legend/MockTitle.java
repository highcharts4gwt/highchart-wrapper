
package com.github.highcharts4gwt.model.highcharts.option.mock.legend;

import com.github.highcharts4gwt.model.highcharts.option.api.legend.Title;

public class MockTitle
    implements Title
{

    private String style;
    private String text;

    public String style() {
        return style;
    }

    public MockTitle style(String styleAsJsonString) {
        this.style = styleAsJsonString;
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
