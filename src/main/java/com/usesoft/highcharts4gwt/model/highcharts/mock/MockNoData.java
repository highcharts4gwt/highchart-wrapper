
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.highcharts.api.NoData;

public class MockNoData
    implements NoData
{

    private String attr;
    private String position;

    public String attr() {
        return attr;
    }

    public MockNoData attr(String attr) {
        this.attr = attr;
        return this;
    }

    public String position() {
        return position;
    }

    public MockNoData position(String position) {
        this.position = position;
        return this;
    }

}
