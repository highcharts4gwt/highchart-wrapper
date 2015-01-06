
package com.github.highcharts4gwt.model.highcharts.option.mock.labels;

import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;

public class MockItem
    implements Item
{

    private String html;
    private String style;

    public String html() {
        return html;
    }

    public MockItem html(String html) {
        this.html = html;
        return this;
    }

    public String style() {
        return style;
    }

    public MockItem style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

}
