/*
 * docToolchain Configuration
 * 
 * This configuration file is used to configure docToolchain for the LLM-Prompts project.
 * It defines the structure, output formats, and various settings for generating documentation.
 */

// Output path for generated documents
outputPath = 'build/docs'

// Path where docToolchain will search for input files
inputPath = 'src/docs'

// Main AsciiDoc file that includes all other files
mainConfigFile = 'docToolchainConfig.groovy'

// Files to process and output formats
inputFiles = [
    [file: 'index.adoc', formats: ['html','pdf']],
]

// Directories containing images
imageDirs = ["${inputPath}/images"]

// AsciiDoc attributes - these can be used in your documents
asciidoctorConfigFile = [
    'source-highlighter': 'highlight.js',
    'toc': 'left',
    'toclevels': '3',
    'sectnums': '',
    'icons': 'font',
    'imagesdir': 'images'
]

// Site generation configuration for generateSite
site = [
    // Site-specific configuration for better documentation website
    name: 'LLM Prompts for Software Architecture',
    description: 'A comprehensive collection of LLM prompts for software architecture documentation',
    baseUrl: 'https://raifdmueller.github.io/LLM-Prompts/',
    author: 'docToolchain Community',
    
    // Theme and styling
    theme: 'default',
    
    // Navigation and structure
    navigation: [
        [title: 'Home', url: '/'],
        [title: 'Prompts', url: '/prompts/'],
        [title: 'About', url: '/about/']
    ]
]

// Microsite configuration (used by generateSite)
microsite = [
    // Enable microsite generation
    enabled: true,
    
    // Microsite-specific settings
    siteName: 'LLM Architecture Prompts',
    siteDescription: 'Professional LLM prompts for software architecture documentation',
    baseUrl: 'https://raifdmueller.github.io/LLM-Prompts/',
    
    // Output directory for microsite
    outputDir: 'build/microsite'
]

confluence = [
    // Confluence configuration (if needed later)
    // baseUrl: 'https://yourcompany.atlassian.net',
    // spaceKey: 'SPACE',
    // username: System.getenv('CONFLUENCE_USERNAME'),
    // password: System.getenv('CONFLUENCE_API_TOKEN')
]

// GitHub Pages configuration
githubPages = [
    // Enable for GitHub Pages deployment
    enabled: true,
    branch: 'gh-pages',
    folder: 'build/microsite'
]

// PDF configuration
pdfTheme = 'basic'

// Task dependencies and settings
taskGroups = [
    'doctoolchain': [
        'generateSite',
        'generatePDF'
    ]
]

// Additional PlantUML configuration for diagrams
plantuml = [
    // PlantUML settings if needed
    format: 'svg'
]

// Kroki configuration for diagram generation
kroki = [
    // Use kroki.io service for diagram generation
    serverUrl: 'https://kroki.io'
]
