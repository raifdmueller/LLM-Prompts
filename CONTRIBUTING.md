# Contributing to LLM Architecture Prompts

🎉 Thank you for your interest in contributing! We welcome contributions from the community to make this resource even more valuable for software architects and development teams.

## 📋 Ways to Contribute

### 1. **New Prompts**
- Create prompts for specific domains (e.g., microservices, data architecture, cloud-native)
- Develop prompts for emerging methodologies
- Add prompts for specific tools integration

### 2. **Improve Existing Prompts**
- Enhance question clarity and effectiveness
- Add more comprehensive examples
- Improve output formatting

### 3. **Documentation**
- Add examples and use cases
- Improve installation and usage instructions
- Create video tutorials or walkthroughs

### 4. **Technical Improvements**
- Enhance the website design and usability
- Improve docToolchain integration
- Add automation and testing

## 🚀 Getting Started

### Prerequisites
- Git knowledge
- Basic understanding of AsciiDoc (for documentation)
- Familiarity with architecture documentation concepts
- Experience with LLMs (Claude, ChatGPT, etc.)

### Setup Development Environment

1. **Fork the repository**
   ```bash
   # Fork on GitHub, then clone your fork
   git clone https://github.com/YOUR_USERNAME/LLM-Prompts.git
   cd LLM-Prompts
   ```

2. **Install docToolchain** (for local development)
   ```bash
   ./dtcw local install doctoolchain
   ```

3. **Test the website generation**
   ```bash
   ./dtcw generateSite
   ```

4. **Create a new branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

## 📝 Prompt Development Guidelines

### Quality Standards

✅ **Do:**
- Test prompts with multiple LLMs (Claude, ChatGPT, etc.)
- Provide clear, specific instructions
- Include concrete examples
- Follow arc42 and docToolchain conventions
- Use consistent terminology
- Include validation criteria

❌ **Don't:**
- Create overly broad or vague prompts
- Assume specific LLM capabilities
- Forget to test the prompt thoroughly
- Include proprietary or sensitive information in examples

## 🔍 Testing Your Contributions

### Prompt Testing Checklist

- [ ] Prompt works with Claude Sonnet/Opus
- [ ] Prompt works with ChatGPT 4
- [ ] Output follows specified format
- [ ] Example produces expected results
- [ ] Instructions are clear and unambiguous
- [ ] Integration with docToolchain works
- [ ] AsciiDoc syntax is valid

### Documentation Testing

```bash
# Generate the website locally
./dtcw generateSite

# Validate AsciiDoc syntax
./dtcw generateHTML
```

## 🔄 Submission Process

### Pull Request Guidelines

1. **Create Descriptive PR Title**
   ```
   feat: Add microservices architecture prompt
   fix: Improve ADR template clarity
   docs: Add deployment examples
   ```

2. **Review Process**
   - All PRs require at least one review
   - Maintainers will test prompts with different LLMs
   - Documentation changes must generate correctly
   - Examples must be complete and working

## 🏆 Recognition

Contributors will be recognized in:
- CONTRIBUTORS.md file
- Release notes for significant contributions
- Special mentions for outstanding contributions

## 🤝 Community Standards

### Code of Conduct
We follow the [Contributor Covenant](https://www.contributor-covenant.org/):
- Be respectful and inclusive
- Welcome newcomers and help them learn
- Focus on constructive feedback
- Assume good intentions

### Communication Channels
- **GitHub Issues**: Bug reports, feature requests
- **GitHub Discussions**: General questions, ideas
- **Pull Requests**: Code review and discussion

---

**Thank you for contributing to making architecture documentation better for everyone!** 🚀

_Last updated: June 2025_