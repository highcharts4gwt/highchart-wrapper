
package com.usesoft.highcharts4gwt.model.highcharts.mock.chart;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.Options3d;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.Frame;

public class MockOptions3d
    implements Options3d
{

    private double alpha;
    private double beta;
    private double depth;
    private boolean enabled;
    private Frame frame;
    private double viewDistance;

    public double alpha() {
        return alpha;
    }

    public MockOptions3d alpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public double beta() {
        return beta;
    }

    public MockOptions3d beta(double beta) {
        this.beta = beta;
        return this;
    }

    public double depth() {
        return depth;
    }

    public MockOptions3d depth(double depth) {
        this.depth = depth;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockOptions3d enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Frame frame() {
        return frame;
    }

    public MockOptions3d frame(Frame frame) {
        this.frame = frame;
        return this;
    }

    public double viewDistance() {
        return viewDistance;
    }

    public MockOptions3d viewDistance(double viewDistance) {
        this.viewDistance = viewDistance;
        return this;
    }

}
