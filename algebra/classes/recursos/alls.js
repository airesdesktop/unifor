// Algumas funções que acabei precisando...
// não coloquei em '../classes/BasicOperations.js' porque achei que
// poderia ficar muito bagunçado.

export class Math {
    
// método range, porque senti falta de algumas coisas no javascript
    *range(start, end, steps = 1) {
        for (let i = start; i < end; i += steps) {
            yield i;
        }
    }

// método template, para fazer uma matriz zerada
// (útil na hora de transpor)
    template(rows, columns, valor) {
    // variáveis
        let matriz = [];
        let vector = [];

    // inserindo valores em linha (vetor)
        for (const i of this.range(0, rows)) {
            for (const j of this.range(0, columns)) {
                vector.push(valor)
            }   

        // inserindo linha (vetor) final na matriz
        // e zerando vector depois
            matriz.push(vector)
            vector = [];
        }

    // retornando resultado
        return matriz;
    }
}