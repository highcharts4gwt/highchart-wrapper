
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Funnel;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockPie;

public class MockFunnel
    extends MockPie
    implements Funnel
{

    private Number heightAsNumber;
    private String heightAsString;
    private Number neckHeightAsNumber;
    private String neckHeightAsString;
    private Number neckWidthAsNumber;
    private String neckWidthAsString;
    private boolean reversed;
    private Number widthAsNumber;
    private String widthAsString;

    public Number heightAsNumber() {
        return heightAsNumber;
    }

    public MockFunnel heightAsNumber(Number heightAsNumber) {
        this.heightAsNumber = heightAsNumber;
        return this;
    }

    public String heightAsString() {
        return heightAsString;
    }

    public MockFunnel heightAsString(String heightAsString) {
        this.heightAsString = heightAsString;
        return this;
    }

    public Number neckHeightAsNumber() {
        return neckHeightAsNumber;
    }

    public MockFunnel neckHeightAsNumber(Number neckHeightAsNumber) {
        this.neckHeightAsNumber = neckHeightAsNumber;
        return this;
    }

    public String neckHeightAsString() {
        return neckHeightAsString;
    }

    public MockFunnel neckHeightAsString(String neckHeightAsString) {
        this.neckHeightAsString = neckHeightAsString;
        return this;
    }

    public Number neckWidthAsNumber() {
        return neckWidthAsNumber;
    }

    public MockFunnel neckWidthAsNumber(Number neckWidthAsNumber) {
        this.neckWidthAsNumber = neckWidthAsNumber;
        return this;
    }

    public String neckWidthAsString() {
        return neckWidthAsString;
    }

    public MockFunnel neckWidthAsString(String neckWidthAsString) {
        this.neckWidthAsString = neckWidthAsString;
        return this;
    }

    public boolean reversed() {
        return reversed;
    }

    public MockFunnel reversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Number widthAsNumber() {
        return widthAsNumber;
    }

    public MockFunnel widthAsNumber(Number widthAsNumber) {
        this.widthAsNumber = widthAsNumber;
        return this;
    }

    public String widthAsString() {
        return widthAsString;
    }

    public MockFunnel widthAsString(String widthAsString) {
        this.widthAsString = widthAsString;
        return this;
    }

}
