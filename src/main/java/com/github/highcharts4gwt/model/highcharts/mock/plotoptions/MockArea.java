
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaShowHandler;
import com.github.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockArea
    extends MockSeries
    implements Area
{

    private String fillColor;
    private double fillOpacity;
    private String lineColor;
    private String negativeFillColor;
    private String step;
    private boolean trackByArea;

    public void addAreaAfterAnimateHandler(AreaAfterAnimateHandler handler) {
    }

    public void addAreaCheckboxClickHandler(AreaCheckboxClickHandler handler) {
    }

    public void addAreaClickHandler(AreaClickHandler handler) {
    }

    public void addAreaHideHandler(AreaHideHandler handler) {
    }

    public void addAreaLegendItemClickHandler(AreaLegendItemClickHandler handler) {
    }

    public void addAreaMouseOutHandler(AreaMouseOutHandler handler) {
    }

    public void addAreaMouseOverHandler(AreaMouseOverHandler handler) {
    }

    public void addAreaShowHandler(AreaShowHandler handler) {
    }

    public String fillColor() {
        return fillColor;
    }

    public MockArea fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double fillOpacity() {
        return fillOpacity;
    }

    public MockArea fillOpacity(double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockArea lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockArea negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public String step() {
        return step;
    }

    public MockArea step(String step) {
        this.step = step;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockArea trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

}
