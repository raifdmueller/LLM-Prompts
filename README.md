# LLM Prompts for Architecture Documentation

A collection of carefully crafted prompts to help with software architecture documentation using arc42, docToolchain, and related methodologies. These prompts are designed to work with various LLMs (Claude, ChatGPT, etc.) to streamline architecture documentation workflows.

## 🎯 What's This About?

Creating good architecture documentation is challenging. These prompts help you:
- Structure your architecture thinking systematically
- Generate consistent, high-quality documentation
- Follow established methodologies like arc42
- Create visual diagrams and decision records
- Maintain documentation as living artifacts

## 📋 Available Prompts

### Core Architecture Tools

| Prompt | Description | Output Format |
|--------|-------------|---------------|
| [Architecture Communication Canvas](Architecture-Communication-Canvas.md) | Creates a visual canvas summarizing key architecture aspects in one page | AsciiDoc with HTML table |
| [Architecture Decision Record](Architecture-Decision-Record.md) | Structured approach to documenting architecture decisions with Pugh Matrix evaluation | AsciiDoc document |

### Comprehensive Documentation Tools

| Prompt | Description | Output Format |
|--------|-------------|---------------|
| [arc42 Chapter Generator](arc42-Chapter-Generator.md) | Step-by-step creation of complete arc42 documentation with quality-driven approach | Multiple AsciiDoc files |
| [Quality Scenarios Builder](Quality-Scenarios-Builder.md) | Create testable, specific quality requirements using structured scenarios | AsciiDoc quality scenarios |

### Risk and Debt Management

| Prompt | Description | Output Format |
|--------|-------------|---------------|
| [Risk Assessment Matrix](Risk-Assessment-Matrix.md) | Systematic identification and assessment of architecture risks with mitigation strategies | AsciiDoc risk register |
| [Technical Debt Tracker](Technical-Debt-Tracker.md) | Comprehensive technical debt identification, prioritization, and management | AsciiDoc debt register |

### Specialized Prompts

| Prompt | Description | Output Format |
|--------|-------------|---------------|
| [Stakeholder Analysis](Stakeholder-Analysis.md) | Systematically identify and analyze project stakeholders with communication planning | AsciiDoc stakeholder register |
| [Context Diagram Generator](Context-Diagram-Generator.md) | Create comprehensive system context diagrams following C4 Model Level 1 principles | AsciiDoc with C4-PlantUML diagrams |
| [Solution Strategy Planner](Solution-Strategy-Planner.md) | Develop comprehensive solution strategies based on quality goals following arc42 Chapter 4 principles | AsciiDoc strategy document |

**Coming Soon:**
- **Deployment View Creator** - Design and document system deployment architectures

## 🚀 How to Use These Prompts

### 1. Copy & Paste Approach
Simply copy the prompt content and paste it into your preferred LLM interface.

### 2. Custom AI Assistant Setup
Use these prompts as system prompts to create specialized AI assistants for architecture work.

### 3. Integration with docToolchain
These prompts are designed to work seamlessly with [docToolchain](https://doctoolchain.org) workflows:
- Output is in AsciiDoc format
- Diagrams use PlantUML/Kroki
- Compatible with arc42 template structure

## 📖 Examples

### Architecture Communication Canvas Example

When you use the Architecture Communication Canvas prompt, you'll get an interactive session like this:

```
🔖 Let's create your Architecture Communication Canvas! 

First, let's understand the value proposition of your system.
What are the system's major objectives? What value does it deliver to customers?

👤 We're building an e-commerce platform that enables small businesses to sell online...

🔖 Great! Now let's identify your key stakeholders.
Who are your most important customers and contributors?
```

The result is a comprehensive one-page architecture overview in AsciiDoc format.

### Architecture Decision Record Example

The ADR prompt guides you through a structured decision-making process:

1. **Problem Context**: What needs to be decided?
2. **Alternatives Evaluation**: Using Pugh Matrix for objective comparison
3. **Decision Rationale**: Clear justification based on evaluation
4. **Consequences**: Both positive effects and risks

### Quality Scenarios Example

The Quality Scenarios Builder helps create testable requirements:

```
Scenario: Normal User Response Time
Quality Attribute: Performance
Context: Normal business operation with up to 500 concurrent users
Stimulus: User submits a search query
Response: System returns search results
Response Measure: 95% of queries return results within 200ms
Priority: High
```

## 🔗 Integration Tips

### With docToolchain
```bash
# Add generated AsciiDoc files to your docToolchain project
./dtcw generateHTML
./dtcw generatePDF
```

### With Confluence
The generated AsciiDoc can be published directly to Confluence using docToolchain:
```bash
./dtcw publishToConfluence
```

### With Version Control
- Store prompts as documentation templates in your repository
- Version control the generated architecture documents
- Use in CI/CD for automated documentation generation

### With Project Management
- Link architecture decisions to requirements
- Track technical debt in your issue tracking system
- Use risk assessments for project planning

## 🎨 Customization

These prompts are designed to be customizable:

1. **Modify Questions**: Adapt the guiding questions to your domain
2. **Adjust Output Format**: Change AsciiDoc styling or structure
3. **Add Custom Sections**: Include organization-specific requirements
4. **Integrate Tools**: Connect with your existing toolchain

## 📚 Background & Methodology

### arc42 Template
These prompts follow the [arc42 template](https://arc42.org) structure, which provides:
- Proven documentation structure
- Clear separation of concerns
- Stakeholder-oriented communication
- Pragmatic approach to architecture documentation

### Architecture Communication Canvas
Based on Gernot Starke's Architecture Communication Canvas, focusing on:
- Value proposition clarity
- Stakeholder identification
- Core functionality emphasis
- Risk and decision transparency

### Decision Making
Architecture Decision Records (ADRs) use:
- Pugh Matrix for objective evaluation
- Structured problem-solution mapping
- Consequence documentation
- Traceability of architectural reasoning

### Quality-Driven Architecture
Quality Scenarios provide:
- Testable quality requirements
- Objective success criteria
- Architecture decision guidance
- Validation frameworks

### Risk-Driven Development
Risk Assessment includes:
- Systematic risk identification
- Impact and probability evaluation
- Mitigation strategy development
- Continuous risk monitoring

## 🔄 Workflow Integration

### Recommended Usage Sequence

1. **Start with Architecture Communication Canvas** - Get the big picture
2. **Use arc42 Chapter Generator** - Create comprehensive documentation
3. **Build Quality Scenarios** - Define testable requirements
4. **Create Architecture Decision Records** - Document key decisions
5. **Assess Risks** - Identify and mitigate project risks
6. **Track Technical Debt** - Manage long-term code health

### Continuous Documentation

These prompts support:
- **Living Documentation**: Keep docs updated as code evolves
- **Iterative Refinement**: Improve documentation over multiple iterations
- **Team Collaboration**: Involve multiple stakeholders in documentation creation
- **Knowledge Transfer**: Maintain institutional knowledge

## 🤝 Contributing

We welcome contributions! Please:

1. **Test Your Prompts**: Ensure they work across different LLMs
2. **Follow Structure**: Use similar format to existing prompts
3. **Add Examples**: Include sample outputs
4. **Document Usage**: Explain when and how to use the prompt
5. **Consider Integration**: How does your prompt work with others?

### Contribution Ideas
- Domain-specific prompts (e.g., microservices, data architecture)
- Integration with specific tools (Jira, GitHub, etc.)
- Visualization enhancements
- Multilingual versions

## 📊 Metrics and Success

### Documentation Quality Metrics
- Completeness of architecture coverage
- Stakeholder understanding and feedback
- Decision traceability
- Risk mitigation effectiveness

### Process Improvement Metrics
- Time to create documentation
- Documentation maintenance effort
- Team adoption rate
- Knowledge transfer effectiveness

## 📄 License

These prompts are available under Creative Commons Attribution-ShareAlike 4.0 International License, following the arc42 licensing approach.

## 🔗 Related Resources

- [arc42 Template](https://arc42.org)
- [docToolchain](https://doctoolchain.org)
- [Architecture Communication Canvas by Gernot Starke](https://canvas.arc42.org)
- [PlantUML](https://plantuml.com) for diagrams
- [Kroki](https://kroki.io) for diagram generation
- [ADR GitHub Organization](https://adr.github.io/) for decision records

---

*These prompts are maintained by the docToolchain community. For questions or suggestions, please open an issue or contribute directly.*