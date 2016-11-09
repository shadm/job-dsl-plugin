package javaposse.jobdsl.dsl.helpers.publisher

import javaposse.jobdsl.dsl.Context

class CoverityPublisherContext implements Context {
    String instance
    String project
    String stream
    String id
    String language
    boolean failBuild
    boolean unstable
    boolean keepIntDir
    boolean skipFetchingDefects
    boolean hideChart
    boolean displayChart

    /**
     * @param instance Coverity Connect instance
     * @param project  Project
     * @param stream   Stream
     * @param language Language (defaults to 'ALL')
     * @param id       Do not use
     */
    void cimStream(String instance, String project, String stream, language='ALL', String id='') {
        this.instance = instance
        this.project = project
        this.stream = stream
        this.language = language
        this.id = id
    }

    /**
     * Fail the build if matching defects are found
     */
    void failBuild(boolean failBuild = true) {
        this.failBuild = failBuild
    }

    /**
     * Mark build as unstable if matching defects are found
     */
    void unstable(boolean unstable = true) {
        this.unstable = unstable
    }

    /**
     * Preserve the intermediate directory after each build
     */
    void keepIntDir(boolean keepIntDir = true) {
        this.keepIntDir = keepIntDir
    }

    /**
     * Do not fetch defects after the build
     */
    void skipFetchingDefects(boolean skipFetchingDefects = true) {
        this.skipFetchingDefects = skipFetchingDefects
    }

    /**
     * Hide the defects chart on the project page
     */
    void hideChart(boolean hideChart = true) {
        this.hideChart = hideChart
    }

    /**
     * Display defects on chart
     */
    void displayChart(boolean displayChart = true) {
        this.displayChart = displayChart
    }
}

