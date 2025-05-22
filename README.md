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

### Specialized Prompts (Coming Soon)

- **arc42 Chapter Generator** - Step-by-step creation of arc42 documentation
- **Quality Scenarios Builder** - Create testable quality requirements
- **Risk Assessment Matrix** - Systematic risk identification and mitigation
- **Technical Debt Tracker** - Document and prioritize technical debt
- **Stakeholder Analysis** - Identify and analyze project stakeholders

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
🤖 Let's create your Architecture Communication Canvas! 

First, let's understand the value proposition of your system.
What are the system's major objectives? What value does it deliver to customers?

👤 We're building an e-commerce platform that enables small businesses to sell online...

🤖 Great! Now let's identify your key stakeholders.
Who are your most important customers and contributors?
```

The result is a comprehensive one-page architecture overview in AsciiDoc format.

### Architecture Decision Record Example

The ADR prompt guides you through a structured decision-making process:

1. **Problem Context**: What needs to be decided?
2. **Alternatives Evaluation**: Using Pugh Matrix for objective comparison
3. **Decision Rationale**: Clear justification based on evaluation
4. **Consequences**: Both positive effects and risks

## 🛠 Integration Tips

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

## 🤝 Contributing

We welcome contributions! Please:

1. **Test Your Prompts**: Ensure they work across different LLMs
2. **Follow Structure**: Use similar format to existing prompts
3. **Add Examples**: Include sample outputs
4. **Document Usage**: Explain when and how to use the prompt

## 📄 License

These prompts are available under Creative Commons Attribution-ShareAlike 4.0 International License, following the arc42 licensing approach.

## 🔗 Related Resources

- [arc42 Template](https://arc42.org)
- [docToolchain](https://doctoolchain.org)
- [Architecture Communication Canvas by Gernot Starke](https://canvas.arc42.org)
- [PlantUML](https://plantuml.com) for diagrams
- [Kroki](https://kroki.io) for diagram generation

---

*These prompts are maintained by the docToolchain community. For questions or suggestions, please open an issue or contribute directly.*
