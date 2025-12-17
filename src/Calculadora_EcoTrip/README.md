# Calculadora EcoTrip

Calculadora semântica em HTML5 para estimar emissões de CO₂ por transporte e consumo de energia residencial. Frontend construído com HTML/CSS/JavaScript; o repositório também contém código Java para outros recursos do projeto.

## Principais características
- Formulário semântico HTML5 (acessível)
- Convenção BEM para classes CSS
- `datalist` dinâmico (vazio inicialmente; preenchido por JavaScript)
- Resultados com `aria-live` para leitores de tela

## Tecnologias
- HTML5, CSS (arquivo em `css/style.css`)
- JavaScript (scripts para cálculo e populamento do `datalist`)
- Java (módulos complementares — dependendo do repositório)

## Estrutura (resumida)
- `src/Calculadora_EcoTrip/` — arquivos da calculadora web
    - `index.html` — interface principal
    - `css/style.css` — estilos (referenciado em `index.html`)
    - `js/` — scripts (populam o `datalist` e realizam cálculos)
- Outros módulos Java/JavaScript conforme o repositório

## Como executar (frontend)
1. Abra `src/Calculadora_EcoTrip/index.html` em um navegador moderno.
2. Caso utilize servidor local:
    - Com VS Code: use extensão Live Server ou
    - Com Python: `python -m http.server` na pasta `src/Calculadora_EcoTrip`
3. O `datalist` é carregado dinamicamente pelo JavaScript; verifique `js/` para lógica de preenchimento.

## Como executar (Java)
- Se houver módulo Java:
    - Abra o projeto no IntelliJ IDEA (versão utilizada: IntelliJ IDEA 2025.2.5).
    - Importe como projeto Maven/Gradle, se aplicável, e execute a configuração/ponto de entrada específico.
- Siga instruções no arquivo de build do próprio módulo (por exemplo, `pom.xml` ou `build.gradle`) quando presentes.

## Configuração de fatores de emissão
- Os fatores de emissão (kg CO₂ / unidade) devem ser definidos no JavaScript conforme fontes locais (IPCC, inventário nacional, etc.).
- Valores exemplo devem ficar documentados em `src/Calculadora_EcoTrip/README.md` ou comentados no script.

## Contribuição
- Abra uma issue para discutir mudanças.
- Fork & pull request com pequeno resumo das alterações.
- Mantenha convenção BEM e acessibilidade nos novos elementos.

## Arquivos importantes
- `src/Calculadora_EcoTrip/index.html`
- `src/Calculadora_EcoTrip/css/style.css`
- `src/Calculadora_EcoTrip/js/` (scripts)
- `src/Calculadora_EcoTrip/README.md` (este arquivo)

## Licença
- Adicionar arquivo de licença (`LICENSE`) conforme a escolha do mantenedor (ex.: MIT).

## Créditos
Desenvolvido por ONestoGamer / Ernesto Silva (créditos no rodapé de `index.html`).
