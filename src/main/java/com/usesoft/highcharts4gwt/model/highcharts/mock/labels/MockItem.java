
package com.usesoft.highcharts4gwt.model.highcharts.mock.labels;

import com.usesoft.highcharts4gwt.model.highcharts.api.labels.Item;

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
