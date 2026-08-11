# Product of Array Except Self (LeetCode 238 / NeetCode 150)

- **Linguagem:** Java
- **Dificuldade:** Médio
- **Complexidade de Tempo:** O(n)
- **Complexidade de Espaço:** O(1)

## 🎥 Vídeo Explicativo
Assista à explicação detalhada e ao teste ao vivo no YouTube:  
👉 **[Assistir no Canal Susana Codifica](https://www.youtube.com/@susanacodifica)**

## 💡 Ideia Central
Em vez de utilizar a operação de divisão (que é proibida pelo enunciado e quebra com zeros no array) ou força bruta $O(n^2)$, utilizamos o conceito de **Prefixo x Sufixo**.

1. **Passo 1 (Esquerda -> Direita):** Guardamos no array de resultado o produto de todos os elementos anteriores à posição atual (prefixo).
2. **Passo 2 (Direita -> Esquerda):** Multiplicamos o valor retido pelo produto de todos os elementos à direita (sufixo).
