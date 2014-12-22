
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotShowHandler;
import com.github.highcharts4gwt.model.highcharts.mock.plotoptions.MockColumn;

public class MockBoxplot
    extends MockColumn
    implements Boxplot
{

    private String fillColor;
    private String medianColor;
    private double medianWidth;
    private String stemColor;
    private String stemDashStyle;
    private double stemWidth;
    private String whiskerColor;
    private double whiskerLengthAsNumber;
    private String whiskerLengthAsString;
    private double whiskerWidth;

    public void addBoxplotAfterAnimateHandler(BoxplotAfterAnimateHandler handler) {
    }

    public void addBoxplotCheckboxClickHandler(BoxplotCheckboxClickHandler handler) {
    }

    public void addBoxplotClickHandler(BoxplotClickHandler handler) {
    }

    public void addBoxplotHideHandler(BoxplotHideHandler handler) {
    }

    public void addBoxplotLegendItemClickHandler(BoxplotLegendItemClickHandler handler) {
    }

    public void addBoxplotMouseOutHandler(BoxplotMouseOutHandler handler) {
    }

    public void addBoxplotMouseOverHandler(BoxplotMouseOverHandler handler) {
    }

    public void addBoxplotShowHandler(BoxplotShowHandler handler) {
    }

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

    public double medianWidth() {
        return medianWidth;
    }

    public MockBoxplot medianWidth(double medianWidth) {
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

    public double stemWidth() {
        return stemWidth;
    }

    public MockBoxplot stemWidth(double stemWidth) {
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

    public double whiskerLengthAsNumber() {
        return whiskerLengthAsNumber;
    }

    public MockBoxplot whiskerLengthAsNumber(double whiskerLengthAsNumber) {
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

    public double whiskerWidth() {
        return whiskerWidth;
    }

    public MockBoxplot whiskerWidth(double whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

}
