
package com.usesoft.highcharts4gwt.model.highcharts.mock.legend;

import com.usesoft.highcharts4gwt.model.highcharts.api.legend.Navigation;

public class MockNavigation
    implements Navigation
{

    private Number arrowSize;
    private String style;

    public Number arrowSize() {
        return arrowSize;
    }

    public MockNavigation arrowSize(Number arrowSize) {
        this.arrowSize = arrowSize;
        return this;
    }

    public String style() {
        return style;
    }

    public MockNavigation style(String style) {
        this.style = style;
        return this;
    }

}
