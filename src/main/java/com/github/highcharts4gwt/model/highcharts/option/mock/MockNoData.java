
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.NoData;

public class MockNoData
    implements NoData
{

    private String attr;
    private String position;
    private String style;
    private String genericField;

    public String attr() {
        return attr;
    }

    public MockNoData attr(String attrAsJsonString) {
        this.attr = attrAsJsonString;
        return this;
    }

    public String position() {
        return position;
    }

    public MockNoData position(String positionAsJsonString) {
        this.position = positionAsJsonString;
        return this;
    }

    public String style() {
        return style;
    }

    public MockNoData style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockNoData setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
