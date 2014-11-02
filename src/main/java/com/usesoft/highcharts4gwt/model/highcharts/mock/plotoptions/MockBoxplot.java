
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockColumn;

public class MockBoxplot
    extends MockColumn
    implements Boxplot
{

    private String fillColor;
    private String medianColor;
    private Number medianWidth;
    private String stemColor;
    private String stemDashStyle;
    private Number stemWidth;
    private String whiskerColor;
    private Number whiskerLengthAsNumber;
    private String whiskerLengthAsString;
    private Number whiskerWidth;

    public String fillColor() {
        return fillColor;
    }

    public MockBoxplot fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public String medianColor() {
        return medianColor;
    }

    public MockBoxplot medianColor(String medianColor) {
        this.medianColor = medianColor;
        return this;
    }

    public Number medianWidth() {
        return medianWidth;
    }

    public MockBoxplot medianWidth(Number medianWidth) {
        this.medianWidth = medianWidth;
        return this;
    }

    public String stemColor() {
        return stemColor;
    }

    public MockBoxplot stemColor(String stemColor) {
        this.stemColor = stemColor;
        return this;
    }

    public String stemDashStyle() {
        return stemDashStyle;
    }

    public MockBoxplot stemDashStyle(String stemDashStyle) {
        this.stemDashStyle = stemDashStyle;
        return this;
    }

    public Number stemWidth() {
        return stemWidth;
    }

    public MockBoxplot stemWidth(Number stemWidth) {
        this.stemWidth = stemWidth;
        return this;
    }

    public String whiskerColor() {
        return whiskerColor;
    }

    public MockBoxplot whiskerColor(String whiskerColor) {
        this.whiskerColor = whiskerColor;
        return this;
    }

    public Number whiskerLengthAsNumber() {
        return whiskerLengthAsNumber;
    }

    public MockBoxplot whiskerLengthAsNumber(Number whiskerLengthAsNumber) {
        this.whiskerLengthAsNumber = whiskerLengthAsNumber;
        return this;
    }

    public String whiskerLengthAsString() {
        return whiskerLengthAsString;
    }

    public MockBoxplot whiskerLengthAsString(String whiskerLengthAsString) {
        this.whiskerLengthAsString = whiskerLengthAsString;
        return this;
    }

    public Number whiskerWidth() {
        return whiskerWidth;
    }

    public MockBoxplot whiskerWidth(Number whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

}
