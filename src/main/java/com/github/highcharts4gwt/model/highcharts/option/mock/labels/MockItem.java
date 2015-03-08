
package com.github.highcharts4gwt.model.highcharts.option.mock.labels;

import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;


/**
 * A HTML label that can be positioned anywhere in the chart area.
 * 
 */
public class MockItem
    implements Item
{

    private String html;
    private String style;
    private String genericField;

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

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockItem setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
