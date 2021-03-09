// Karma configuration

module.exports = function(config) {
    config.set({
        basePath: '',
        frameworks: ['jasmine', 'karma-typescript', 'jasmine-matchers'],

        files: [
            { pattern: "test.ts" },
            { pattern: "src/**/*.ts" }
        ],
        client: {
            clearContext: false // leave Jasmine Spec Runner output visible in browser
        },
        preprocessors: {
            "src/**/*.ts": ["karma-typescript"]
        },

        reporters: ['progress', 'kjhtml'],
        port: 9876,
        colors: true,
        logLevel: config.LOG_INFO,
        autoWatch: true,
        browsers: ['Chrome'],
        singleRun: false,
        restartOnFileChange: false
    })
}
